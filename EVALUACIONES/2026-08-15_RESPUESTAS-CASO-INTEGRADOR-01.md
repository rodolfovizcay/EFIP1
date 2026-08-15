# Respuestas — Caso integrador 1
## SIGO Móvil — Registrar ejecución de OT

**Fecha:** 15/08/2026  
**Inicio:**  
**Fin:**  
**Tiempo total:**  
**Apuntes utilizados en evaluación:** no

> Conservar las respuestas originales. Registrar correcciones en el cierre y en el documento de errores.

---

# Parte A — Problema, alcance y objetivos

## Problema


## Alcance incluido


## Alcance excluido


## Objetivo general


## Objetivos específicos

1.
2.
3.

---

# Parte B — Requisitos

## Requerimientos funcionales

```text
RF-01
RF-02
RF-03
RF-04
RF-05
RF-06
RF-07
RF-08
```

## Requerimientos no funcionales

```text
RNF-01
RNF-02
RNF-03
RNF-04
RNF-05
```

## Reglas de negocio

```text
RN-01
RN-02
RN-03
RN-04
RN-05
RN-06
```

## Calidad de un RF

```text
RF seleccionado:
Correcto:
Consistente:
Completo:
Realista:
Necesario:
Verificable:
Rastreable:
```

---

# Parte C — Casos de uso

## Actores

```text
Actor 1:
Justificación:

Actor 2:
Justificación:

Actor/sistema externo:
Justificación:
```

## Casos de uso

1.
2.
3.
4.
5.
6.

## Relaciones

```text
include:
extend:
generalización:
```

## Registrar ejecución de OT

```text
Actor principal:
Objetivo:
Resultado de valor:
Disparador:
Precondiciones:
Postcondiciones de éxito:
Postcondiciones de fallo:
```

### Flujo principal

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
A6.
```

### Excepción por estado inválido

```text
E1.
E2.
E3.
```

### Alternativo por medición opcional

```text
M1.
M2.
M3.
```

---

# Parte D — Modelo de análisis

## Clasificación

| Elemento | Estereotipo | Justificación |
|---|---|---|
| AppRegistrarEjecucion | | |
| ControlRegistrarEjecucion | | |
| OrdenTrabajo | | |
| EjecucionOT | | |
| SolicitudPendiente | | |
| Operario | | |

## Responsabilidades

```text
Interfaz:
Control:
Entidades:
```

## Colaboración normal

```text
1.
2.
3.
4.
5.
6.
```

## Alternativo de análisis sin conexión

```text
A1.
A2.
A3.
A4.
```

## Responsabilidad vs. método definitivo


---

# Parte E — Modelo de diseño

## Elementos

| Elemento | Responsabilidad de diseño |
|---|---|
| AppEjecucion | |
| EjecucionService | |
| OrdenTrabajoRepository | |
| EjecucionRepository | |
| ColaSincronizacion | |
| Sincronizador | |
| ServicioNotificaciones | |

## Secuencia normal

```text
1.
2.
3.
4.
5.
6.
7.
8.
9.
10.
```

## Alternativo `alt [sin conexión]`

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

## Participante, línea de vida, mensaje y foco

```text
Participante:
Línea de vida:
Mensaje:
Foco de control:
```

## Estados de la OT

```text
[PENDIENTE]

[DESPACHADA]

[EN_EJECUCION]

[FINALIZADA]

[ANULADA]
```

```text
Estado:
Evento:
Transición:
Condición:
Acción:
```

---

# Parte F — POO y Java

## OrdenTrabajo

```text
Atributos:
Constructor:
Métodos controlados:
```

## EjecucionOT

```text
Atributos:
Constructor:
Métodos:
```

## SolicitudSincronizacion

```text
Atributos:
Estados:
Métodos:
```

## Conceptos

```text
Abstracción:
Encapsulamiento:
Herencia:
Sobrescritura:
Polimorfismo:
Clase abstracta:
Interfaz:
```

## Código

```java
// Auditable

// CanalNotificacion

// NotificacionEmail

// NotificacionMovil

// prueba polimórfica
```

## Validación de String


## `toString()`

```java
@Override
public String toString() {
    
}
```

## Explicación polimórfica

```text
Tipo de referencia:
Objetos concretos:
Misma llamada:
Implementaciones ejecutadas:
Papel de la sobrescritura:
```

---

# Parte G — Estructuras

## Pila para deshacer

| Paso | Operación | Pila | Cima |
|---:|---|---|---|
| 0 | inicio | `[]` | — |
| 1 | Cambiar prioridad | | |
| 2 | Cambiar fecha | | |
| 3 | Agregar observación | | |
| 4 | Cambiar teléfono | | |
| 5 | Deshacer | | |
| 6 | Deshacer | | |

```text
Justificación LIFO:
Qué ocurre al confirmar:
```

## Cola para pendientes

| Paso | Operación | Devuelve | Cola | Frente | Final |
|---:|---|---|---|---|---|
| 0 | inicio | — | `[]` | — | — |
| 1 | `encolar(EJ-01)` | | | | |
| 2 | `encolar(EJ-02)` | | | | |
| 3 | `encolar(EJ-03)` | | | | |
| 4 | `cabecera()` | | | | |
| 5 | `desencolar()` | | | | |
| 6 | `encolar(EJ-04)` | | | | |
| 7 | `desencolar()` | | | | |

## Vector vs. lista

| Criterio | Vector | Lista enlazada |
|---|---|---|
| Frente/final | | |
| Capacidad | | |
| Memoria | | |
| Riesgo | | |
| Elección | | |

```text
Permanece en el TDA:
Cambia en la implementación:
```

## FIFO vs. trazabilidad


---

# Parte H — DER y relaciones

## Entidades

```text
SECTOR
ORDEN_TRABAJO
OPERARIO
OPERARIO_TELEFONO
ASIGNACION_OT
EJECUCION_OT
SOLICITUD_SINCRONIZACION
```

## Relaciones y cardinalidades

```text
SECTOR → ORDEN_TRABAJO:
ORDEN_TRABAJO → SECTOR:
ORDEN_TRABAJO ↔ OPERARIO:
ORDEN_TRABAJO → EJECUCION_OT:
EJECUCION_OT → SOLICITUD_SINCRONIZACION:
OPERARIO → OPERARIO_TELEFONO:
```

## Participación y supuestos


## Relaciones finales

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

EJECUCION_OT(
)

SOLICITUD_SINCRONIZACION(
)
```

## PK, FK y UNIQUE


## Fuerte, débil y asociativa


---

# Parte I — Normalización

## Relación inicial

```text
REGISTRO_EJECUCION_COMPLETO
```

## 1FN

```text
Violación:
Transformación:
```

## Dependencias funcionales

```text
id_ot →
id_operario →
id_sector →
clave completa de asignación →
```

## 2FN

```text
Dependencias parciales:
Descomposición:
```

## 3FN

```text
Dependencia transitiva:
Descomposición:
```

## Anomalías

```text
Inserción:
Modificación:
Borrado:
```

## ID artificial


---

# Parte J — Comunicaciones

## Arquitectura

```text
App móvil
→
Red de acceso
→
Switch/router
→
WAN/Internet
→
Servidor/API
→
Base de datos
```

## Recorrido TCP/IP

```text
Aplicación:
Transporte:
Internet/Red:
Acceso/Enlace:
Física:
```

## Unidades

```text
Datos:
Segmento:
Paquete:
Trama:
Bits:
```

## Direccionamiento

```text
Puerto:
IP:
MAC:
```

## Switch, router y servidor


## PDU

```text
PDU=
SDU=
PCI=
```

## Información

```text
P(E)=1/16
I(E)=
Desarrollo:
Unidad:
```

## Frecuencia

```text
T=0,002 s
f=
Desarrollo:
Unidad:
```

## Muestreo

```text
fmax=4 kHz
fs mínima=
Desarrollo:
Unidad:
```

## Clasificaciones y supuesto

```text
Analógica/digital:
Serie/paralela:
Síncrona/asíncrona:
Guiada/no guiada:
Supuesto elegido:
Justificación:
```

---

# Parte K — Casos de prueba

| ID | Precondición | Datos | Acción | Resultado esperado | RF/RN |
|---|---|---|---|---|---|
| CP-01 | | | | | |
| CP-02 | | | | | |
| CP-03 | | | | | |
| CP-04 | | | | | |
| CP-05 | | | | | |
| CP-06 | | | | | |
| CP-07 | | | | | |
| CP-08 | | | | | |

---

# Defensa oral

## Esquema

```text
Problema:
Requisitos:
Casos de uso:
Análisis:
Diseño:
POO:
Estructuras:
Datos:
Comunicaciones:
Pruebas:
```

## Transcripción o puntos principales


---

# Autoevaluación previa

| Criterio | 0 | 1 | 2 | 3 |
|---|:---:|:---:|:---:|:---:|
| Terminología | [ ] | [ ] | [ ] | [ ] |
| Integración | [ ] | [ ] | [ ] | [ ] |
| Java | [ ] | [ ] | [ ] | [ ] |
| Estructuras | [ ] | [ ] | [ ] | [ ] |
| Normalización | [ ] | [ ] | [ ] | [ ] |
| Comunicaciones | [ ] | [ ] | [ ] | [ ] |
| Defensa | [ ] | [ ] | [ ] | [ ] |

## Errores que no deben borrarse

1.
2.
3.
4.
5.
6.
