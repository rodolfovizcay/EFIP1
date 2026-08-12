# Ficha de estudio — DER y pasaje inicial a tablas

**Fecha:** 12/08/2026  
**Materia:** Base de Datos I

---

## Definición

El Diagrama Entidad–Relación representa gráficamente la estructura lógica general de los datos.

```text
DER
= entidades
+ atributos
+ relaciones
+ cardinalidades
+ participación
```

No es todavía el esquema SQL definitivo, pero sirve como base para construirlo.

---

## Entidad

Una entidad es una cosa, objeto, clase o categoría distinguible del dominio.

```text
Concreta: OPERARIO, SECTOR, VEHICULO
Abstracta: ASIGNACION, ALQUILER, VIAJE
```

### Instancia

```text
Entidad: OPERARIO
Instancia: Operario 145 — Ana Pérez
```

### No confundir

```text
OPERARIO = entidad
nombre   = atributo
```

---

## Atributo

Propiedad que describe una entidad o relación.

```text
ORDEN_TRABAJO
- id_ot
- numero
- descripcion
- estado
- prioridad
```

### Identificador

Atributo o conjunto de atributos que distingue instancias.

Al pasar a tablas, puede convertirse en clave candidata/primaria según la decisión del diseño.

---

## Relación

Asociación entre entidades.

Nombrar preferentemente con un verbo:

```text
SECTOR contiene ORDEN_TRABAJO
USUARIO crea ORDEN_TRABAJO
OPERARIO participa en ORDEN_TRABAJO
```

Una relación puede tener atributos propios:

```text
ASIGNACION
- fecha_asignacion
- estado_asignacion
```

---

## Simbología del material

| Símbolo | Significado |
|---|---|
| Rectángulo | Entidad |
| Elipse | Atributo |
| Rombo | Relación |
| Línea | Conexión |
| Elipse doble | Atributo multivaluado |
| Elipse discontinua | Atributo derivado |
| Línea doble | Participación total |
| Rectángulo doble | Entidad débil |
| Triángulo `ES` | Generalización/especialización |

En Markdown se usa una representación textual, pero debe conocerse la simbología gráfica.

---

## Cardinalidad

Indica cuántas instancias pueden participar en una relación.

### Máxima

```text
1:1
1:N
N:M
```

### Mínima y máxima

```text
0..1
1..1
0..N
1..N
```

La cardinalidad expresa una regla del modelo, no la cantidad actual de filas.

---

## Relación 1:1

```text
A 1 ───── 1 B
```

Cada instancia se relaciona, según el modelo, con una como máximo del otro lado.

Al pasar a tablas, decidir dónde colocar la FK según:

- participación total u opcional;
- dependencia;
- obligatoriedad;
- semántica del dominio;
- necesidad de evitar nulos o duplicación.

No aplicar una regla automática sin analizar.

---

## Relación 1:N

```text
SECTOR 1 ───── N ORDEN_TRABAJO
```

Interpretación:

- un sector puede contener muchas OT;
- cada OT pertenece a un sector en este modelo.

### Pasaje

La PK del lado 1 se incorpora como FK del lado N.

```text
SECTOR(
    id_sector PK,
    nombre
)

ORDEN_TRABAJO(
    id_ot PK,
    numero UNIQUE,
    descripcion,
    estado,
    prioridad,
    id_sector FK → SECTOR.id_sector
)
```

---

## Relación N:M

```text
ORDEN_TRABAJO N ───── M OPERARIO
```

Interpretación:

- una OT puede tener varios operarios;
- un operario puede participar en varias OT.

### Pasaje

Crear tabla asociativa:

```text
ASIGNACION_OT(
    id_ot FK → ORDEN_TRABAJO.id_ot,
    id_operario FK → OPERARIO.id_operario,
    fecha_asignacion,
    estado_asignacion,
    PK(id_ot, id_operario)
)
```

La PK concreta depende del dominio. Si puede existir más de una asignación histórica para la misma pareja OT–operario, se necesita distinguir cada ocurrencia mediante otro identificador o dato temporal adecuado.

---

## Entidad fuerte

Posee identificación propia.

```text
ORDEN_TRABAJO(id_ot)
```

Simbología: rectángulo simple.

Pasaje:

```text
Entidad fuerte → tabla
Identificador  → PK
Atributos      → columnas
```

---

## Entidad débil

Depende de otra entidad para su identificación o existencia en el modelo.

Ejemplo conceptual:

```text
DETALLE_OT depende de ORDEN_TRABAJO
```

Simbología: rectángulo doble.

Pasaje general:

- incluir la clave de la entidad propietaria;
- incluir la identificación parcial;
- formar la clave según el modelo.

No toda tabla hija es automáticamente una entidad débil.

---

## Atributo multivaluado

El material lo representa con elipse doble.

Ejemplo:

```text
PERSONA puede tener varios TELEFONOS
```

No guardar arbitrariamente varios valores en una sola columna relacional. Evaluar una entidad/tabla relacionada:

```text
PERSONA(
    id_persona PK,
    nombre
)

TELEFONO_PERSONA(
    id_persona FK,
    telefono,
    PK(id_persona, telefono)
)
```

---

## Atributo derivado

Se calcula a partir de otros datos.

Simbología: elipse discontinua.

Ejemplo:

```text
edad derivada de fecha_nacimiento
```

Analizar si debe almacenarse o calcularse para evitar inconsistencias.

---

## Participación

```text
Total
→ toda instancia debe participar.

Parcial
→ algunas instancias pueden no participar.
```

En la simbología del material, la participación total se representa mediante línea doble.

Ejemplo:

```text
Toda ORDEN_TRABAJO debe pertenecer a un SECTOR.
```

---

## Generalización y especialización

```text
USUARIO
  △ ES
  ├── ENCARGADO
  └── OPERARIO
```

```text
Especialización
→ desde una entidad general hacia subgrupos.

Generalización
→ sintetizar entidades semejantes en una superior común.
```

El material utiliza un componente triangular etiquetado `ES`.

---

## Procedimiento para construir un DER

1. Leer el problema y declarar supuestos.
2. Identificar candidatos a entidades.
3. Eliminar candidatos que sean simples atributos o valores.
4. Definir atributos de cada entidad.
5. Elegir identificadores.
6. Identificar relaciones con verbos.
7. Establecer cardinalidad mínima y máxima.
8. Detectar relaciones con atributos propios.
9. Analizar entidades débiles.
10. Validar con reglas del dominio.
11. Pasar inicialmente a tablas.
12. Revisar PK y FK.

---

## Ejemplo integrado

```text
SECTOR 1 ───── N ORDEN_TRABAJO

ORDEN_TRABAJO N ───── M OPERARIO
                    ASIGNACION_OT
```

### Entidades

```text
SECTOR
- id_sector
- nombre

ORDEN_TRABAJO
- id_ot
- numero
- descripcion
- estado
- prioridad

OPERARIO
- id_operario
- nombre
- especialidad
```

### Relación asociativa

```text
ASIGNACION_OT
- id_ot
- id_operario
- fecha_asignacion
- estado_asignacion
```

### Supuestos

- cada OT pertenece a exactamente un sector;
- un sector puede tener cero o muchas OT;
- una OT puede asignarse a uno o varios operarios;
- un operario puede participar en muchas OT;
- la asignación tiene fecha y estado propios.

---

## Pasaje del ejemplo

```text
SECTOR(
    id_sector PK,
    nombre
)

ORDEN_TRABAJO(
    id_ot PK,
    numero UNIQUE,
    descripcion,
    estado,
    prioridad,
    id_sector FK
)

OPERARIO(
    id_operario PK,
    nombre,
    especialidad
)

ASIGNACION_OT(
    id_ot FK,
    id_operario FK,
    fecha_asignacion,
    estado_asignacion,
    PK(id_ot, id_operario)
)
```

---

## DER frente a modelo relacional

| DER | Modelo relacional inicial |
|---|---|
| Entidad fuerte | Tabla |
| Atributo simple | Columna |
| Identificador | Clave candidata/PK elegida |
| Relación 1:N | FK en lado N |
| Relación N:M | Tabla asociativa |
| Relación con atributos | Columnas en tabla asociativa o estructura resultante |
| Entidad débil | Tabla con clave propietaria + parcial |

No existe una equivalencia automática exacta para todos los casos; deben considerarse cardinalidad, participación y reglas.

---

## Errores frecuentes

| Error | Corrección |
|---|---|
| Cada sustantivo se vuelve tabla | Analizar identidad y responsabilidad |
| Cardinalidad = número actual de filas | Es una restricción del diseño |
| N:M con una sola FK | Crear tabla asociativa |
| FK colocada sin analizar | Revisar lados y participación |
| Varios valores en una columna | Evaluar entidad relacionada |
| Entidad débil = toda hija | Debe depender para identificación/existencia |
| Clase Java = tabla exactamente | Correspondencia parcial |
| Omitir supuestos | Declararlos antes de fijar cardinalidad |

---

## Respuesta oral modelo

> Un DER representa la estructura lógica de los datos mediante entidades, atributos, relaciones y cardinalidades. Una entidad es un objeto o concepto distinguible, un atributo la describe y una relación vincula entidades. Al pasar al modelo relacional, una entidad fuerte suele convertirse en tabla, una relación 1:N se representa llevando la clave del lado 1 como FK al lado N, y una relación N:M requiere una tabla asociativa con las claves de ambas entidades y los atributos propios de la relación.

---

## Control

- [ ] Puedo definir DER.
- [ ] Puedo diferenciar entidad, instancia y atributo.
- [ ] Puedo nombrar relaciones con verbos.
- [ ] Puedo explicar 1:1, 1:N y N:M.
- [ ] Puedo indicar cardinalidades mínimas y máximas.
- [ ] Puedo diferenciar entidad fuerte y débil.
- [ ] Puedo reconocer atributos multivaluados y derivados.
- [ ] Puedo pasar una entidad fuerte a tabla.
- [ ] Puedo colocar una FK en 1:N.
- [ ] Puedo crear una tabla asociativa para N:M.
- [ ] Puedo declarar supuestos antes de modelar.
