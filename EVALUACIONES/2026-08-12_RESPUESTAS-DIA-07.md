# Respuestas del estudiante — Evaluación Día 7

**Fecha:** 12/08/2026  
**Inicio:**  
**Fin:**  
**Tiempo total:**  
**Apuntes utilizados:** no

> No reemplazar silenciosamente las respuestas después de corregir. Registrar ajustes en resultados, cierre y errores/recuperaciones.

---

# Parte A — Casos de uso

## 1. Actor, caso de uso y límite

### Actor


### Caso de uso


### Resultado de valor


### Límite del sistema


### Asociación


### Corrección de nombres

```text
Pantalla OT →
Botón Guardar →
Tabla OrdenTrabajo →
```

---

## 2. `include`, `extend` y generalización

### `include`


### Dirección


### `extend`


### Dirección


### Generalización


### Análisis de propuestas

```text
Crear OT <<include>> Validar datos obligatorios:

Adjuntar fotografía <<extend>> Registrar ejecución:

Encargado --|> UsuarioSistema:
```

---

## 3. Caso de uso detallado

### Identificación

```text
Nombre:
Actor principal:
Objetivo:
Resultado de valor:
Disparador:
```

### Precondiciones

1.
2.

### Flujo principal

| Paso | Actor | Sistema |
|---:|---|---|
| 1 | | |
| 2 | | |
| 3 | | |
| 4 | | |
| 5 | | |
| 6 | | |
| 7 | | |

### Flujo alternativo


### Excepción


### Postcondiciones de éxito

1.
2.

### Postcondición de fallo


---

# Parte B — Herencia y Java

## 4. Conceptos

### Herencia


### Superclase


### Subclase


### Especialización


### Reutilización


### Relación “es un”


### Análisis

```text
Operario es un UsuarioSistema:

OrdenTrabajo es un Sector:
```

---

## 5. `extends`, `this`, `super` y `static`

### `extends`


### `this`


### `super`


### `super(...)`


### `static`


### Ejemplos

```text
Dato estático:
Dato de instancia:
```

### Código corregido

```java
// Corregir aquí sin consultar.
```

---

## 6. Jerarquía Java

```java
// UsuarioSistema
```

```java
// Encargado
```

```java
// Operario
```

### Sobrescritura


### Sobrecarga


### Clase `Object`


---

# Parte C — DER

## 7. Conceptos y simbología

| Concepto | Respuesta |
|---|---|
| DER | |
| Entidad | |
| Instancia | |
| Atributo | |
| Relación | |
| Cardinalidad | |
| Entidad fuerte | |
| Entidad débil | |

### Simbología

| Símbolo | Significado |
|---|---|
| Rectángulo | |
| Elipse | |
| Rombo | |
| Elipse doble | |
| Elipse discontinua | |
| Rectángulo doble | |
| Línea doble | |

---

## 8. Modelado y cardinalidades

### Entidades

```text
SECTOR:

ORDEN_TRABAJO:

OPERARIO:

RELACIÓN/ASIGNACIÓN:
```

### DER textual

```text

```

### Cardinalidades mínimas y máximas


### Atributos de asignación


### Justificación de `fecha_asignacion`


---

## 9. Pasaje inicial a tablas

```text
SECTOR(
)

ORDEN_TRABAJO(
)

OPERARIO(
)

ASIGNACION_OT(
)
```

### PK


### FK


### `UNIQUE`


### Reglas generales

```text
Entidad fuerte →
Relación 1:N →
Relación N:M →
Entidad débil →
```

### Cambio: un operario vigente sin historial


---

# Parte D — Integración y recuperación

## 10. Integración

```text
RF:
Caso de uso:
Actor:
Clase/método:
Entidad/tabla:
Relación/cardinalidad:
Caso de prueba:
```

### Caso de uso vs. método


### Clase vs. tabla


---

## 11. Recuperación espaciada

```text
Constructor Java =

PDU =

Requerimiento completo =

Requerimiento verificable =

Red/Internet forma =

Enlace/Acceso forma =

Física transmite =

peek() =

pop() =
```

---

# Defensa oral

## Esquema antes de hablar

```text
Necesidad:
Actores:
Casos de uso:
include:
extend:
Flujos/postcondiciones:
Jerarquía Java:
super/static/sobrescritura:
Entidades:
Cardinalidades:
Pasaje a tablas:
Supuestos:
Integración:
```

## Transcripción o puntos principales


---

# Autoevaluación previa a la corrección

| Criterio | 0 | 1 | 2 | 3 |
|---|:---:|:---:|:---:|:---:|
| Comprensión conceptual | [ ] | [ ] | [ ] | [ ] |
| Terminología académica | [ ] | [ ] | [ ] | [ ] |
| Aplicación práctica | [ ] | [ ] | [ ] | [ ] |
| Claridad y orden | [ ] | [ ] | [ ] | [ ] |

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
