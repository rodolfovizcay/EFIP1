# Producto Día 9 — Normalización hasta 3FN
## Asignaciones de Órdenes de Trabajo

**Fecha:** 14/08/2026  
**Materia:** Base de Datos I  
**Producto del plan:** tabla normalizada

---

# 1. Objetivo

Normalizar una relación didáctica hasta 3FN, justificando:

- valores atómicos;
- grupos repetitivos;
- dependencias funcionales;
- dependencias parciales;
- dependencias transitivas;
- PK;
- FK;
- `UNIQUE`;
- anomalías evitadas.

---

# 2. Situación

Una cooperativa registra asignaciones de Operarios a Órdenes de Trabajo.

Se desea conservar:

- datos de la OT;
- Sector responsable;
- datos del Operario;
- varios teléfonos del Operario;
- fecha de asignación;
- estado de la asignación;
- historial de varias asignaciones de la misma pareja OT–Operario.

---

# 3. Relación inicial no normalizada

```text
ASIGNACION_OT_SIN_NORMALIZAR

id_ot
numero_ot
descripcion_ot
id_sector
nombre_sector
id_operario
nombre_operario
especialidad_operario
telefonos_operario
fecha_asignacion
estado_asignacion
```

Ejemplo:

| id_ot | numero_ot | descripcion_ot | id_sector | nombre_sector | id_operario | nombre_operario | especialidad | telefonos_operario | fecha_asignacion | estado |
|---:|---:|---|---:|---|---:|---|---|---|---|---|
| 10 | 1587 | Reparar red | 4 | Redes | 20 | Juan Pérez | Electricidad | `2245-111111, 2245-222222` | 2026-08-14 | ASIGNADA |
| 10 | 1587 | Reparar red | 4 | Redes | 21 | Ana López | Poda | `2245-333333` | 2026-08-14 | ASIGNADA |
| 11 | 1588 | Revisar poste | 4 | Redes | 20 | Juan Pérez | Electricidad | `2245-111111, 2245-222222` | 2026-08-15 | FINALIZADA |

---

# 4. Problemas iniciales

## Grupo repetitivo

```text
telefonos_operario
```

contiene varios valores en una sola celda.

## Redundancia

Se repiten:

```text
numero_ot
descripcion_ot
nombre_sector
nombre_operario
especialidad_operario
telefonos_operario
```

## Anomalía de modificación

Si `Redes` cambia de nombre, debe actualizarse en muchas filas. Si una queda sin modificar, aparecen valores inconsistentes.

## Anomalía de inserción

No puede registrarse fácilmente un Operario sin una asignación existente.

## Anomalía de borrado

Si se elimina la última asignación de un Operario, podrían perderse también su nombre, especialidad y teléfonos.

---

# 5. Clave y dependencias

Supuesto histórico:

> Una misma pareja OT–Operario puede asignarse varias veces en fechas distintas.

Clave candidata didáctica:

```text
(id_ot, id_operario, fecha_asignacion)
```

Dependencias funcionales:

```text
id_ot
→ numero_ot, descripcion_ot, id_sector, nombre_sector

id_operario
→ nombre_operario, especialidad_operario, telefonos_operario

id_sector
→ nombre_sector

(id_ot, id_operario, fecha_asignacion)
→ estado_asignacion
```

---

# 6. Primera forma normal — 1FN

## Regla

Una relación está en 1FN cuando todos los dominios contienen valores atómicos y no hay grupos repetitivos.

## Violación

```text
telefonos_operario = "2245-111111, 2245-222222"
```

No es atómico en el modelo planteado.

## Transformación

Se crea una relación separada:

```text
OPERARIO_TELEFONO_1FN

id_operario
telefono
```

Clave:

```text
PK(id_operario, telefono)
```

La relación principal conserva un único valor por celda:

```text
ASIGNACION_OT_1FN

id_ot
numero_ot
descripcion_ot
id_sector
nombre_sector
id_operario
nombre_operario
especialidad_operario
fecha_asignacion
estado_asignacion
```

Y:

```text
OPERARIO_TELEFONO_1FN

id_operario
telefono
```

## Resultado

```text
Valores atómicos ✅
Grupos repetitivos eliminados ✅
Dependencias parciales todavía presentes ⚠️
Dependencia transitiva todavía presente ⚠️
```

---

# 7. Segunda forma normal — 2FN

## Regla

Una relación está en 2FN si:

1. está en 1FN;
2. cada atributo no clave depende de la clave primaria completa.

La 2FN es relevante en relaciones con PK compuesta.

## PK de la relación principal

```text
(id_ot, id_operario, fecha_asignacion)
```

## Dependencias parciales detectadas

```text
id_ot
→ numero_ot, descripcion_ot, id_sector, nombre_sector
```

Estos atributos dependen solo de `id_ot`.

```text
id_operario
→ nombre_operario, especialidad_operario
```

Estos atributos dependen solo de `id_operario`.

No dependen de toda la clave compuesta.

## Descomposición a 2FN

### ORDEN_TRABAJO_2FN

```text
id_ot PK
numero_ot UNIQUE
descripcion_ot
id_sector
nombre_sector
```

### OPERARIO_2FN

```text
id_operario PK
nombre_operario
especialidad_operario
```

### OPERARIO_TELEFONO_2FN

```text
id_operario FK → OPERARIO_2FN.id_operario
telefono
PK(id_operario, telefono)
```

### ASIGNACION_OT_2FN

```text
id_ot FK → ORDEN_TRABAJO_2FN.id_ot
id_operario FK → OPERARIO_2FN.id_operario
fecha_asignacion
estado_asignacion
PK(id_ot, id_operario, fecha_asignacion)
```

## Dependencia completa conservada

```text
(id_ot, id_operario, fecha_asignacion)
→ estado_asignacion
```

El estado describe esa ocurrencia concreta de asignación.

## Resultado

```text
1FN ✅
Dependencias parciales eliminadas ✅
Dependencia transitiva nombre_sector todavía presente ⚠️
```

---

# 8. Tercera forma normal — 3FN

## Regla

Una relación está en 3FN si:

1. está en 2FN;
2. ningún atributo no clave depende transitivamente de la PK.

## Dependencia transitiva detectada

En `ORDEN_TRABAJO_2FN`:

```text
id_ot → id_sector
id_sector → nombre_sector
```

Por lo tanto:

```text
id_ot → nombre_sector
```

indirectamente.

`nombre_sector` no debe permanecer en `ORDEN_TRABAJO`.

## Descomposición a 3FN

### SECTOR

```text
id_sector PK
nombre_sector UNIQUE
```

### ORDEN_TRABAJO

```text
id_ot PK
numero_ot UNIQUE
descripcion_ot
id_sector FK → SECTOR.id_sector
```

### OPERARIO

```text
id_operario PK
nombre_operario
especialidad_operario
```

### OPERARIO_TELEFONO

```text
id_operario FK → OPERARIO.id_operario
telefono
PK(id_operario, telefono)
```

### ASIGNACION_OT

```text
id_ot FK → ORDEN_TRABAJO.id_ot
id_operario FK → OPERARIO.id_operario
fecha_asignacion
estado_asignacion
PK(id_ot, id_operario, fecha_asignacion)
```

---

# 9. Modelo final en SQL didáctico

```sql
CREATE TABLE sector (
    id_sector       INTEGER PRIMARY KEY,
    nombre_sector   VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE orden_trabajo (
    id_ot           INTEGER PRIMARY KEY,
    numero_ot       INTEGER NOT NULL UNIQUE,
    descripcion_ot  VARCHAR(500) NOT NULL,
    id_sector       INTEGER NOT NULL,
    CONSTRAINT fk_ot_sector
        FOREIGN KEY (id_sector)
        REFERENCES sector(id_sector)
);

CREATE TABLE operario (
    id_operario          INTEGER PRIMARY KEY,
    nombre_operario      VARCHAR(150) NOT NULL,
    especialidad_operario VARCHAR(100) NOT NULL
);

CREATE TABLE operario_telefono (
    id_operario  INTEGER NOT NULL,
    telefono     VARCHAR(30) NOT NULL,
    PRIMARY KEY (id_operario, telefono),
    CONSTRAINT fk_telefono_operario
        FOREIGN KEY (id_operario)
        REFERENCES operario(id_operario)
);

CREATE TABLE asignacion_ot (
    id_ot              INTEGER NOT NULL,
    id_operario        INTEGER NOT NULL,
    fecha_asignacion   TIMESTAMP NOT NULL,
    estado_asignacion  VARCHAR(30) NOT NULL,
    PRIMARY KEY (id_ot, id_operario, fecha_asignacion),
    CONSTRAINT fk_asignacion_ot
        FOREIGN KEY (id_ot)
        REFERENCES orden_trabajo(id_ot),
    CONSTRAINT fk_asignacion_operario
        FOREIGN KEY (id_operario)
        REFERENCES operario(id_operario)
);
```

> La sintaxis concreta puede variar según el motor. El objetivo de este producto es la estructura relacional y sus dependencias.

---

# 10. Alternativa con `id_asignacion`

Puede utilizarse:

```text
id_asignacion PK
```

por ejemplo:

```sql
CREATE TABLE asignacion_ot (
    id_asignacion      INTEGER PRIMARY KEY,
    id_ot              INTEGER NOT NULL,
    id_operario        INTEGER NOT NULL,
    fecha_asignacion   TIMESTAMP NOT NULL,
    estado_asignacion  VARCHAR(30) NOT NULL,
    UNIQUE (id_ot, id_operario, fecha_asignacion)
);
```

Pero agregar el ID no reemplaza el análisis de dependencias.

Si se conservaran en esta tabla:

```text
nombre_operario
nombre_sector
descripcion_ot
```

seguiría existiendo redundancia y dependencias indebidas aunque hubiera `id_asignacion`.

---

# 11. Reconstrucción del hecho

La asignación completa puede consultarse uniendo:

```text
ASIGNACION_OT
→ ORDEN_TRABAJO
→ SECTOR
→ OPERARIO
→ OPERARIO_TELEFONO
```

Ejemplo conceptual:

```sql
SELECT
    a.fecha_asignacion,
    a.estado_asignacion,
    ot.numero_ot,
    ot.descripcion_ot,
    s.nombre_sector,
    o.nombre_operario,
    o.especialidad_operario,
    t.telefono
FROM asignacion_ot AS a
JOIN orden_trabajo AS ot
    ON ot.id_ot = a.id_ot
JOIN sector AS s
    ON s.id_sector = ot.id_sector
JOIN operario AS o
    ON o.id_operario = a.id_operario
LEFT JOIN operario_telefono AS t
    ON t.id_operario = o.id_operario;
```

La normalización no impide obtener la información conjunta; la reconstruye mediante relaciones.

---

# 12. Anomalías después de normalizar

## Inserción

Se puede registrar un Operario sin crear una asignación.

## Modificación

El nombre del Sector se actualiza una sola vez en `SECTOR`.

## Borrado

Eliminar una asignación no elimina automáticamente los datos conceptuales del Operario o de la OT.

---

# 13. Dependencias finales

```text
id_sector
→ nombre_sector

id_ot
→ numero_ot, descripcion_ot, id_sector

id_operario
→ nombre_operario, especialidad_operario

(id_operario, telefono)
→ identifica un teléfono asociado

(id_ot, id_operario, fecha_asignacion)
→ estado_asignacion
```

---

# 14. Resumen de formas normales

| Forma | Condición | Problema eliminado |
|---|---|---|
| 1FN | Valores atómicos, sin grupos repetitivos | Múltiples valores por celda |
| 2FN | 1FN + dependencia de la PK completa | Dependencias parciales |
| 3FN | 2FN + sin dependencia transitiva | Dependencias entre no claves |

---

# 15. Preguntas de control

1. ¿Por qué `telefonos_operario` viola 1FN?
2. ¿Qué relación se creó para resolverlo?
3. ¿Cuál era la PK compuesta inicial?
4. ¿Qué atributos dependían solo de `id_ot`?
5. ¿Qué atributos dependían solo de `id_operario`?
6. ¿Por qué eran dependencias parciales?
7. ¿Qué tablas se crearon para lograr 2FN?
8. ¿Qué dependencia transitiva quedó en `ORDEN_TRABAJO_2FN`?
9. ¿Por qué se creó `SECTOR`?
10. ¿Qué significa `numero_ot UNIQUE`?
11. ¿Por qué la PK de asignación incluye fecha en este ejemplo?
12. ¿Un `id_asignacion` normaliza automáticamente la tabla?
13. ¿Qué anomalía de modificación se evita?
14. ¿Cómo se reconstruye la información completa?
15. ¿En qué forma normal queda el modelo final?

---

# 16. Ejercicio alternativo

Partir de:

```text
VENTA
PK(id_venta, id_producto)

fecha_venta
id_cliente
nombre_cliente
id_producto
nombre_producto
precio_producto
cantidad
```

Identificar:

- dependencias parciales;
- dependencias transitivas;
- tablas finales en 3FN.

No resolver antes de intentar durante diez minutos.

---

# 17. Errores frecuentes

| Error | Corrección |
|---|---|
| Una tabla con PK ya está en 1FN | Debe haber atomicidad y no repetitivos |
| 2FN elimina valores nulos | Elimina dependencias parciales |
| 3FN elimina todas las FK | Las FK siguen representando relaciones |
| Dependencia parcial = atributo opcional | Depende de parte de PK compuesta |
| Dependencia transitiva = relación N:M | Son conceptos diferentes |
| Más tablas siempre es mejor | Descomponer solo con justificación |
| ID artificial soluciona redundancia | Analizar dependencias funcionales |
| Normalizar impide consultar junto | Se utilizan JOIN |

---

# 18. Defensa oral modelo

> La relación inicial no estaba en 1FN porque `telefonos_operario` contenía varios valores. Se creó `OPERARIO_TELEFONO`. La PK compuesta de la asignación era `(id_ot,id_operario,fecha_asignacion)`, pero los datos de OT dependían solo de `id_ot` y los del Operario solo de `id_operario`; eran dependencias parciales, por lo que se separaron para alcanzar 2FN. Luego se detectó que `id_ot` determinaba `id_sector` y `id_sector` determinaba `nombre_sector`, una dependencia transitiva. Al separar `SECTOR`, el modelo alcanzó 3FN.
