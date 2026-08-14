# Evaluación EFIP I — Día 9
## Diseño + Abstracción/Polimorfismo + Normalización

**Fecha:** 14/08/2026  
**Modalidad:** sin apuntes  
**Tiempo máximo escrito:** 50 minutos  
**Puntaje escrito:** 8 puntos  
**Defensa oral:** 2 puntos  
**Total:** 10 puntos

---

# Instrucciones

- Responder con terminología de los materiales.
- Diferenciar análisis, diseño e implementación.
- Declarar supuestos tecnológicos.
- Mostrar dependencias funcionales y claves.
- Conservar respuestas originales después de entregar.
- En Java, respetar sintaxis estructural, `extends`, `implements` y visibilidad.
- No declarar que una tabla está normalizada solo porque tiene un ID.

---

# Parte A — Modelo de diseño — 2,5 puntos

## 1. Propósito y artefactos — 0,7 puntos

Definí el propósito del diseño y diferenciá:

```text
Modelo de análisis:
Modelo de diseño:
Implementación:
```

Nombrá y explicá brevemente seis artefactos:

```text
Modelo de diseño
Clase de diseño
Realización de caso de uso–diseño
Subsistema de diseño
Interfaz
Descripción de arquitectura
```

Indicá dos restricciones o RNF que el diseño debe considerar y que el análisis puede mantener más abstractos.

---

## 2. Secuencia y estados — 0,9 puntos

### a. Diagrama de secuencia

Definí:

```text
Participante:
Línea de vida:
Mensaje:
Foco de control:
Eje horizontal:
Eje vertical:
```

Después ordená temporalmente:

```text
A. Servicio solicita guardar la ejecución.
B. Operario carga los datos.
C. Repositorio devuelve la OT.
D. App envía la solicitud al Servicio.
E. Servicio consulta la OT.
F. App informa el resultado al Operario.
G. Servicio crea EjecucionOT.
```

Escribí:

```text
1 →
2 →
3 →
4 →
5 →
6 →
7 →
```

### b. Diagrama de estados

Definí:

```text
Estado:
Evento:
Transición:
Acción:
```

Construí un diagrama textual usando:

```text
PENDIENTE
DESPACHADA
EN_EJECUCION
FINALIZADA
ANULADA
```

Debe incluir al menos cuatro eventos y una condición.

---

## 3. Realización, subsistemas e interfaces — 0,9 puntos

Para `Registrar ejecución de OT`:

1. escribí un flujo normal de al menos seis mensajes;
2. escribí un alternativo por falta de conexión;
3. mantené el objetivo exacto del caso;
4. proponé tres subsistemas;
5. definí una interfaz proporcionada por uno de ellos.

Después explicá:

- qué decisión pertenece al diseño y no estaba obligatoriamente en análisis;
- por qué una interfaz separa contrato e implementación;
- por qué FIFO no garantiza trazabilidad por sí solo.

---

# Parte B — Abstracción y Polimorfismo — 2,5 puntos

## 4. Abstracción, clase y método abstractos — 0,8 puntos

Definí y diferenciá:

```text
Abstracción:
Encapsulamiento:
Clase abstracta:
Método abstracto:
```

Explicá:

- por qué una clase abstracta no se instancia;
- si puede tener constructor;
- qué debe hacer una subclase concreta con los métodos abstractos;
- qué palabra reservada se utiliza.

Corregí:

```java
public class CanalNotificacion {
    public void abstract enviar(String mensaje) {
    }
}
```

---

## 5. Clase abstracta vs. interfaz — 0,8 puntos

Compará:

| Criterio | Clase abstracta | Interfaz |
|---|---|---|
| Propósito | | |
| Constructor | | |
| Estado de instancia | | |
| Métodos | | |
| Palabra de relación | | |
| Cantidad que una clase puede usar | | |

Después decidí y justificá:

```text
CanalNotificacion
→ ¿clase abstracta o interfaz?

Auditable
→ ¿clase abstracta o interfaz?
```

Incluí `extends` e `implements` en la explicación.

---

## 6. Polimorfismo y código — 0,9 puntos

Escribí código breve con:

```text
CanalNotificacion abstracta
NotificacionEmail
NotificacionMovil
Auditable
```

Debe contener:

- atributo común `destinatario`;
- constructor de la abstracta;
- método abstracto `enviar(String mensaje)`;
- `toString()` sobrescrito;
- dos subclases con `@Override`;
- interfaz `Auditable`;
- `implements`;
- una colección `List<CanalNotificacion>`;
- un bucle que invoque `enviar` polimórficamente.

Después explicá:

```text
Tipo de referencia:
Tipo real:
Misma llamada:
Respuesta diferente:
```

---

# Parte C — Normalización — 2,5 puntos

## 7. Propósito, anomalías y 1FN — 0,7 puntos

Definí normalización y explicá:

```text
Anomalía de inserción:
Anomalía de modificación:
Anomalía de borrado:
```

Dada:

```text
OPERARIO
id_operario
nombre
telefonos = "2245-111111, 2245-222222"
```

Respondé:

1. ¿por qué no está en 1FN?;
2. ¿cómo la transformarías?;
3. marcá PK y FK de la nueva relación.

---

## 8. Segunda forma normal — 0,8 puntos

Relación:

```text
ASIGNACION_OT_AMPLIADA
PK(id_ot, id_operario, fecha_asignacion)

numero_ot
descripcion_ot
id_sector
nombre_sector
nombre_operario
especialidad_operario
estado_asignacion
```

Dependencias conocidas:

```text
id_ot → numero_ot, descripcion_ot, id_sector, nombre_sector
id_operario → nombre_operario, especialidad_operario
(id_ot,id_operario,fecha_asignacion) → estado_asignacion
```

Respondé:

1. ¿qué es una dependencia parcial?;
2. identificá las dependencias parciales;
3. explicá por qué la relación no está en 2FN;
4. descomponela en tablas de 2FN;
5. marcá PK y FK.

---

## 9. Tercera forma normal — 1 punto

En `ORDEN_TRABAJO_2FN` permanecen:

```text
id_ot PK
numero_ot
descripcion_ot
id_sector
nombre_sector
```

Y:

```text
id_ot → id_sector
id_sector → nombre_sector
```

Respondé:

1. ¿qué es una dependencia transitiva?;
2. explicá la dependencia del ejemplo;
3. descomponé para llegar a 3FN;
4. escribí el modelo final completo:
   - `SECTOR`;
   - `ORDEN_TRABAJO`;
   - `OPERARIO`;
   - `OPERARIO_TELEFONO`;
   - `ASIGNACION_OT`;
5. marcá PK, FK y `UNIQUE`;
6. explicá por qué agregar `id_asignacion` no normaliza automáticamente los demás atributos.

---

# Parte D — Integración y recuperación — 0,5 puntos

## 10. Integración — 0,3 puntos

Para esta necesidad:

> Un Operario registra una ejecución de OT. Si no hay conexión, queda pendiente. Al registrarse, se notifica por correo y móvil. Los datos de OT, Sector, Operario y Asignación no deben duplicarse.

Relacioná:

```text
Caso de uso:
Realización de análisis:
Realización de diseño:
Secuencia:
Estado/transición:
Clase abstracta:
Interfaz:
Comportamiento polimórfico:
Relaciones normalizadas:
Caso de prueba:
```

Explicá cómo una regla de negocio puede impactar diseño, código y datos.

---

## 11. Recuperación espaciada — 0,2 puntos

Completá:

```text
Línea doble DER =

Alternativo sin conexión =

TDA: permanece =
TDA: cambia =

Pila =
Cola =
Trazabilidad =

P ↑ → I __
P ↓ → I __
I(E) =
Unidad =

bits =
bits/símbolo =
bits/segundo =

A =
T =
f =
f =
T =
fs mínima =

¿Una señal analógica puede transmitirse? =
¿Quién decide qué enviar? =

toString() =
```

---

# Defensa oral — 2 puntos

Responder durante 8–10 minutos:

> Explique cómo `Registrar ejecución de OT` pasa del modelo de análisis al modelo de diseño. Describa una secuencia normal y un alternativo sin conexión, un diagrama de estados y la organización por subsistemas e interfaces. Luego compare clase abstracta e interfaz y explique el polimorfismo con canales de notificación. Finalmente, normalice una relación de asignaciones hasta 3FN, identificando valores no atómicos, dependencias parciales y dependencias transitivas.

## Rúbrica oral

| Criterio | Máximo |
|---|---:|
| Precisión conceptual | 0,50 |
| Terminología académica | 0,40 |
| Aplicación y justificación | 0,50 |
| Integración entre materias | 0,40 |
| Claridad y orden | 0,20 |
| **Total** | **2,00** |

---

# Criterio de aprobación

- Resultado global equivalente a 7/10 o más.
- Ningún bloque central omitido.
- Análisis/diseño/implementación diferenciados.
- Secuencia ordenada temporalmente.
- Estado/evento/transición diferenciados.
- Clase abstracta/interfaz diferenciadas.
- Polimorfismo real aplicado.
- `toString()` incluido.
- 1FN, 2FN y 3FN aplicadas en orden.
- Dependencias parciales/transitivas identificadas.
- PK, FK y `UNIQUE` marcados.
- Defensa integrada entre diseño, código y datos.
