# Respuestas del estudiante — Evaluación Día 9
## Diseño + Abstracción/Polimorfismo + Normalización

**Fecha:** 14/08/2026  
**Inicio:**  
**Fin:**  
**Tiempo total:**  
**Apuntes utilizados:** no

> No reemplazar respuestas después de corregir. Registrar correcciones en resultados, cierre y errores/recuperaciones.

---

# Parte A — Modelo de diseño

## 1. Propósito y artefactos

### Propósito del diseño


### Modelo de análisis


### Modelo de diseño


### Implementación


### Artefactos

| Artefacto | Definición |
|---|---|
| Modelo de diseño | |
| Clase de diseño | |
| Realización de caso de uso–diseño | |
| Subsistema de diseño | |
| Interfaz | |
| Descripción de arquitectura | |

### RNF/restricciones consideradas

1.
2.

---

## 2. Secuencia y estados

### Conceptos de secuencia

```text
Participante =
Línea de vida =
Mensaje =
Foco de control =
Eje horizontal =
Eje vertical =
```

### Orden temporal

```text
1 →
2 →
3 →
4 →
5 →
6 →
7 →
```

### Conceptos de estados

```text
Estado =
Evento =
Transición =
Acción =
```

### Diagrama textual de estados

```text

```

### Condición utilizada


---

## 3. Realización, subsistemas e interfaces

### Flujo normal

```text
1.
2.
3.
4.
5.
6.
7.
8.
```

### Alternativo sin conexión

```text
A1.
A2.
A3.
A4.
A5.
```

### Objetivo mantenido


### Subsistemas

| Subsistema | Contenido/responsabilidad |
|---|---|
| | |
| | |
| | |

### Interfaz proporcionada

```text
Nombre:
Operaciones:
```

### Decisión de diseño


### Contrato vs. implementación


### FIFO vs. trazabilidad


---

# Parte B — Abstracción y Polimorfismo

## 4. Abstracción, clase y método abstractos

```text
Abstracción =
Encapsulamiento =
Clase abstracta =
Método abstracto =
```

### Instanciación


### Constructor


### Obligación de subclase concreta


### Palabra reservada


### Código corregido

```java

```

---

## 5. Clase abstracta vs. interfaz

| Criterio | Clase abstracta | Interfaz |
|---|---|---|
| Propósito | | |
| Constructor | | |
| Estado de instancia | | |
| Métodos | | |
| Palabra de relación | | |
| Cantidad | | |

### `CanalNotificacion`


### `Auditable`


### `extends`


### `implements`


---

## 6. Polimorfismo y código

### Clase abstracta

```java

```

### Interfaz

```java

```

### `NotificacionEmail`

```java

```

### `NotificacionMovil`

```java

```

### Colección y bucle polimórfico

```java

```

### Explicación

```text
Tipo de referencia =
Tipo real =
Misma llamada =
Respuesta diferente =
```

### `toString()`


---

# Parte C — Normalización

## 7. Propósito, anomalías y 1FN

### Normalización


### Anomalía de inserción


### Anomalía de modificación


### Anomalía de borrado


### Violación de 1FN


### Transformación

```text
OPERARIO(
)

OPERARIO_TELEFONO(
)
```

### PK/FK


---

## 8. Segunda forma normal

### Dependencia parcial


### Dependencias parciales identificadas

```text
id_ot →

id_operario →
```

### Por qué no está en 2FN


### Descomposición a 2FN

```text
ORDEN_TRABAJO_2FN(
)

OPERARIO_2FN(
)

ASIGNACION_OT_2FN(
)
```

### PK/FK


---

## 9. Tercera forma normal

### Dependencia transitiva


### Dependencia del ejemplo

```text
id_ot →
id_sector →
```

### Descomposición

```text
SECTOR(
)

ORDEN_TRABAJO(
)

OPERARIO(
)

OPERARIO_TELEFONO(
)

ASIGNACION_OT(
)
```

### PK


### FK


### `UNIQUE`


### ID artificial


---

# Parte D — Integración y recuperación

## 10. Integración

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

### Impacto transversal de regla de negocio


---

## 11. Recuperación espaciada

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

# Defensa oral

## Esquema antes de hablar

```text
Análisis vs. diseño:
Artefactos:
Secuencia:
Estados:
Subsistemas/interfaces:
Abstracción:
Abstracta:
Interfaz:
Polimorfismo:
1FN:
2FN:
3FN:
Integración:
Recuperación:
```

## Transcripción o puntos principales


---

# Autoevaluación previa a la corrección

| Criterio | 0 | 1 | 2 | 3 |
|---|:---:|:---:|:---:|:---:|
| Comprensión conceptual | [ ] | [ ] | [ ] | [ ] |
| Terminología académica | [ ] | [ ] | [ ] | [ ] |
| Aplicación práctica | [ ] | [ ] | [ ] | [ ] |
| Código Java | [ ] | [ ] | [ ] | [ ] |
| Normalización/dependencias | [ ] | [ ] | [ ] | [ ] |
| Integración | [ ] | [ ] | [ ] | [ ] |

## Dudas detectadas

1.
2.
3.
4.
5.

## Errores que no deben borrarse

1.
2.
3.
4.
5.
