# Caso integrador — Día 6
## Requisitos + Pila + Comunicación cliente-servidor

**Fecha:** 11/08/2026  
**Modalidad:** resolución escrita + defensa oral

---

# Situación

Una cooperativa utiliza una aplicación móvil para que los operarios consulten y modifiquen Órdenes de Trabajo.

Mientras una modificación todavía no fue confirmada, el operario debe poder deshacer la última acción realizada. Una vez confirmada, la acción queda registrada en el servidor y no puede deshacerse desde el historial temporal de esa sesión.

Las modificaciones posibles durante la sesión son:

- cambiar prioridad;
- cambiar fecha programada;
- agregar una observación;
- cambiar un dato de contacto.

La aplicación móvil se comunica con un servidor a través de una red TCP/IP.

---

# Parte A — Elicitación

## 1. Ambigüedades

Identificá al menos cinco preguntas que harías antes de especificar la solución.

Ejemplos de aspectos a investigar:

- qué significa confirmar;
- quién puede deshacer;
- cuántas acciones se conservan;
- qué ocurre si se pierde la conexión;
- qué modificaciones son reversibles;
- qué sucede si otro usuario modifica la misma OT.

### Respuesta

1.
2.
3.
4.
5.

---

# Parte B — Especificación

## 2. Requerimientos funcionales

Redactá cuatro RF con la forma:

```text
El sistema deberá + verbo + objeto + condición/resultado.
```

| Código | Requerimiento funcional | Criterio de aceptación |
|---|---|---|
| RF-01 | | |
| RF-02 | | |
| RF-03 | | |
| RF-04 | | |

## 3. Requerimientos no funcionales

Redactá cuatro RNF. Incluir al menos:

- rendimiento;
- seguridad;
- fiabilidad o disponibilidad;
- plataforma o interoperabilidad.

| Código | Categoría | Requerimiento | Verificación |
|---|---|---|---|
| RNF-01 | | | |
| RNF-02 | | | |
| RNF-03 | | | |
| RNF-04 | | | |

## 4. Reglas de negocio

Redactá tres reglas del dominio.

| Código | Regla |
|---|---|
| RN-01 | |
| RN-02 | |
| RN-03 | |

---

# Parte C — Validación

## 5. Calidad

Elegí dos requerimientos y verificá:

- correcto;
- consistente;
- completo;
- realista;
- necesario;
- verificable;
- rastreable.

| Propiedad | Requerimiento 1 | Requerimiento 2 |
|---|---|---|
| Correcto | | |
| Consistente | | |
| Completo | | |
| Realista | | |
| Necesario | | |
| Verificable | | |
| Rastreable | | |

## 6. Contradicción

Analizá esta situación:

```text
R1: El sistema permitirá deshacer cualquier modificación de la sesión.
R2: Una modificación confirmada no puede deshacerse desde la sesión.
```

¿Son consistentes? Redactá una versión corregida.

### Respuesta


---

# Parte D — Pila

## 7. Justificación

Explicá por qué una pila puede representar el historial de acciones no confirmadas.

### Respuesta


## 8. Simulación

Partir de pila vacía:

```text
push(Cambiar prioridad)
push(Cambiar fecha)
push(Agregar observación)
peek()
pop()
push(Cambiar contacto)
pop()
pop()
```

Completar:

| Paso | Operación | Elemento devuelto | Estado de la pila | Cima |
|---:|---|---|---|---|
| 0 | inicio | — | `[]` | — |
| 1 | `push(Cambiar prioridad)` | — | | |
| 2 | `push(Cambiar fecha)` | — | | |
| 3 | `push(Agregar observación)` | — | | |
| 4 | `peek()` | | | |
| 5 | `pop()` | | | |
| 6 | `push(Cambiar contacto)` | — | | |
| 7 | `pop()` | | | |
| 8 | `pop()` | | | |

## 9. Implementación

Compará vector y lista enlazada para esta situación.

| Criterio | Vector | Lista enlazada |
|---|---|---|
| Capacidad | | |
| Memoria | | |
| Cima | | |
| Riesgo | | |
| Ventaja | | |

Elegí una implementación y justificá.

### Decisión


### Justificación


---

# Parte E — Comunicación

## 10. OSI

Explicá el recorrido de `Confirmar modificación` por las siete capas OSI.

| Capa | Función en el caso |
|---|---|
| Aplicación | |
| Presentación | |
| Sesión | |
| Transporte | |
| Red | |
| Enlace | |
| Física | |

## 11. TCP/IP

Completá:

| TCP/IP | Función en el caso | Capas OSI relacionadas |
|---|---|---|
| Aplicación | | |
| Transporte | | |
| Internet | | |
| Acceso a la red | | |
| Física | | |

## 12. Encapsulamiento

Ordená y explicá:

```text
bits
trama
paquete
datos
segmento
```

### Orden del emisor


### Orden del receptor


## 13. PDU

Definí:

```text
PDU =
SDU =
PCI =
```

Explicá qué información de control podría agregarse durante la solicitud.

### Respuesta


## 14. Direccionamiento

Explicá qué identifica:

```text
MAC =
IP =
Puerto =
```

---

# Parte F — Integración final

## 15. Cadena completa

Explicá en 15–20 líneas:

```text
Necesidad del operario
→ elicitación
→ RF/RNF/reglas
→ validación
→ TDA Pila
→ implementación
→ solicitud móvil
→ OSI/TCP-IP
→ encapsulamiento/PDU
→ servidor
→ respuesta
```

### Respuesta


---

# Defensa oral

Responder durante 6–8 minutos:

> Explique cómo una necesidad del usuario se transforma en un requerimiento verificable, cómo una pila permite deshacer la última acción no confirmada y cómo esa acción confirmada viaja desde el móvil hasta el servidor mediante OSI/TCP-IP.

## Criterios

- precisión conceptual;
- terminología académica;
- justificación de la pila;
- correspondencia OSI–TCP/IP;
- PDU correcta;
- claridad y orden.
