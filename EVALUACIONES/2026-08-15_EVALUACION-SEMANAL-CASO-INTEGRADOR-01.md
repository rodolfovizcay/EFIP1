# Evaluación semanal — Caso integrador 1
## SIGO Móvil — Registrar ejecución de OT

**Fecha:** 15/08/2026  
**Puntaje total:** 100 puntos  
**Aprobación orientativa:** 70/100  
**Modalidad:** resolución escrita + defensa oral

---

# 1. Instrucciones

- Resolver sin apuntes la instancia evaluativa.
- Conservar las respuestas originales.
- Mostrar fórmula, desarrollo y unidad en cálculos.
- Declarar supuestos tecnológicos o de cardinalidad.
- No convertir automáticamente una regla en una tecnología concreta.
- No confundir una clase de análisis con una tabla.
- No confundir una PK artificial con normalización.
- No corregir silenciosamente después de entregar.

---

# 2. Distribución

| Área | Puntaje |
|---|---:|
| Análisis y Diseño | 20 |
| POO | 20 |
| Estructuras | 15 |
| Base de Datos | 15 |
| Comunicaciones | 15 |
| Escritura y defensa | 15 |
| **Total** | **100** |

Para aprobar no debe omitirse por completo ninguna de las cinco materias.

---

# Parte A — Análisis y Diseño — 20 puntos

## A1. Problema, objetivos y alcance — 3 puntos

Redactar:

```text
Problema:
Objetivo general:
Dos objetivos específicos:
Incluido:
Excluido:
```

## A2. Requisitos — 5 puntos

Escribir:

- cuatro RF;
- tres RNF de categorías distintas;
- tres reglas de negocio.

Elegir un RF y demostrar que es completo y verificable.

## A3. Casos de uso — 4 puntos

1. Identificar actores.
2. Proponer al menos cuatro casos de uso.
3. Aplicar justificadamente un `include` o `extend`.
4. Definir resultado de valor de `Registrar ejecución de OT`.

## A4. Análisis y diseño — 8 puntos

### a. Modelo de análisis — 3 puntos

Clasificar:

```text
AppRegistrarEjecucion
ControlRegistrarEjecucion
OrdenTrabajo
EjecucionOT
SolicitudPendiente
```

Construir una colaboración normal y un alternativo sin conexión.

### b. Modelo de diseño — 3 puntos

Utilizar:

```text
AppEjecucion
EjecucionService
OrdenTrabajoRepository
EjecucionRepository
ColaSincronizacion
Sincronizador
```

Ordenar una secuencia de al menos ocho mensajes.

### c. Estados — 2 puntos

Representar estados, eventos y transiciones de la OT.

---

# Parte B — POO — 20 puntos

## B1. Diseño de clases — 4 puntos

Proponer atributos privados, constructor y métodos controlados para:

```text
OrdenTrabajo
EjecucionOT
SolicitudSincronizacion
```

## B2. Abstracción e interfaz — 5 puntos

Diferenciar:

```text
abstracción
encapsulamiento
clase abstracta
método abstracto
interfaz
```

Explicar por qué `CanalNotificacion` es abstracta y `Auditable` es interfaz.

## B3. Código Java — 7 puntos

Escribir:

```text
CanalNotificacion
NotificacionEmail
NotificacionMovil
Auditable
```

Debe incluir:

- constructor protegido;
- estado encapsulado;
- método abstracto `enviar`;
- `extends`;
- `implements`;
- `@Override`;
- validación correcta de `String`;
- `toString()` con valores reales.

## B4. Polimorfismo — 4 puntos

Explicar y demostrar con:

```java
List<CanalNotificacion> canales
```

la misma llamada `enviar()` con objetos concretos diferentes.

---

# Parte C — Estructuras — 15 puntos

## C1. Elección — 5 puntos

Justificar:

```text
Pila para deshacer
Cola para pendientes
```

Diferenciar LIFO y FIFO.

## C2. Simulación — 4 puntos

### Pila

```text
push(PRIORIDAD)
push(FECHA)
push(OBSERVACION)
pop()
```

### Cola

```text
encolar(EJ-01)
encolar(EJ-02)
encolar(EJ-03)
cabecera()
desencolar()
encolar(EJ-04)
```

Indicar valores devueltos y estado final.

## C3. Implementación del TDA — 3 puntos

Comparar vector y lista enlazada. Explicar qué permanece y qué cambia.

## C4. FIFO y trazabilidad — 3 puntos

Explicar por qué FIFO no garantiza por sí sola la trazabilidad y proponer datos mínimos de auditoría.

---

# Parte D — Base de Datos — 15 puntos

## D1. DER — 5 puntos

Modelar:

```text
SECTOR
ORDEN_TRABAJO
OPERARIO
OPERARIO_TELEFONO
ASIGNACION_OT
EJECUCION_OT
SOLICITUD_SINCRONIZACION
```

Indicar relaciones, cardinalidades y participación mínima/máxima.

## D2. Pasaje a relaciones — 3 puntos

Marcar PK, FK y `UNIQUE`.

## D3. Normalización — 7 puntos

Partir de `REGISTRO_EJECUCION_COMPLETO` y justificar:

```text
1FN
2FN
3FN
```

Identificar:

- grupo repetitivo;
- dependencia parcial;
- dependencia transitiva;
- anomalía de modificación;
- motivo por el que un ID artificial no normaliza automáticamente.

---

# Parte E — Comunicaciones — 15 puntos

## E1. Arquitectura TCP/IP — 5 puntos

Explicar el recorrido móvil-servidor incluyendo:

```text
Aplicación
datos
Transporte/puertos
segmento
Internet/IP
paquete
Acceso/MAC
trama
Física/bits
```

## E2. Nodos y encapsulamiento — 3 puntos

Diferenciar switch, router y servidor destino. Completar:

```text
PDU=SDU+PCI
```

## E3. Información y señales — 4 puntos

Resolver:

```text
P(E)=1/16
I(E)=?

T=0,002 s
f=?

fmax=4 kHz
fs mínima=?
```

## E4. Clasificación — 3 puntos

Diferenciar:

```text
analógica/digital
serie/paralela
síncrona/asíncrona
guiada/no guiada
```

Elegir una combinación para el caso y declarar el supuesto.

---

# Parte F — Escritura y defensa — 15 puntos

## F1. Escritura — 5 puntos

| Criterio | Puntaje |
|---|---:|
| Orden y legibilidad | 1 |
| Terminología académica | 2 |
| Diferencias conceptuales precisas | 1 |
| Supuestos y unidades | 1 |

## F2. Integración — 4 puntos

Explicar la cadena:

```text
Requisito
→ caso de uso
→ análisis
→ diseño
→ código/estructura
→ datos
→ comunicaciones
→ prueba
```

## F3. Defensa oral — 6 puntos

Defensa de 8–12 minutos.

| Criterio | Puntaje |
|---|---:|
| Precisión conceptual | 1,5 |
| Aplicación al caso | 1,5 |
| Integración de las cinco materias | 1,5 |
| Justificación de decisiones | 1 |
| Claridad y autocorrección | 0,5 |

---

# 3. Descuentos típicos

- cambiar el objetivo del caso: hasta `-2`;
- omitir alternativo sin conexión: hasta `-2`;
- usar `==` para contenido de `String`: hasta `-1`;
- `toString()` literal: hasta `-1`;
- confundir Pila y Cola: hasta `-2`;
- afirmar que FIFO garantiza trazabilidad: hasta `-1`;
- fórmula de información incorrecta: hasta `-2`;
- cálculos sin unidades: hasta `-1`;
- 2FN sin dependencia de clave completa: hasta `-2`;
- ID artificial presentado como normalización: hasta `-1`;
- no declarar supuesto tecnológico: hasta `-1`.

Los descuentos no deben duplicarse de manera injustificada sobre el mismo error.

---

# 4. Hoja de resultado

| Área | Máximo | Obtenido |
|---|---:|---:|
| Análisis y Diseño | 20 | |
| POO | 20 | |
| Estructuras | 15 | |
| Base de Datos | 15 | |
| Comunicaciones | 15 | |
| Escritura y defensa | 15 | |
| **Total** | **100** | |

```text
Resultado:
Estado:
Errores nuevos:
Errores recuperados:
Próxima recuperación:
```

---

# 5. Criterio de cierre

```text
70 o más
+
ninguna materia omitida
+
defensa realizada
+
corrección registrada
```

Si la evaluación se divide entre sábado y domingo, el resultado se registra únicamente después de completar la defensa.
