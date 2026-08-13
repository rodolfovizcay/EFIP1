# Evaluación EFIP I — Día 8
## Modelo de análisis + Colas + Transmisión

**Fecha:** 13/08/2026  
**Modalidad:** sin apuntes  
**Tiempo máximo escrito:** 50 minutos  
**Puntaje escrito:** 8 puntos  
**Defensa oral:** 2 puntos  
**Total:** 10 puntos

---

# Instrucciones

- Responder con terminología de los materiales.
- Diferenciar concepto, ejemplo y justificación.
- Declarar supuestos cuando la solución no esté determinada.
- Conservar respuestas originales después de entregar.
- Mostrar cálculos y unidades.
- No convertir responsabilidades de análisis en tecnología definitiva sin justificar.

---

# Parte A — Modelo de análisis — 2,5 puntos

## 1. Propósito y artefactos — 0,7 puntos

Definí el **propósito del análisis** y diferenciá:

```text
Modelo de casos de uso:
Modelo de análisis:
```

Después nombrá y explicá brevemente los cinco artefactos principales:

```text
Modelo de análisis
Clase de análisis
Realización de caso de uso–análisis
Paquete de análisis
Vista/Descripción de arquitectura del análisis
```

---

## 2. Interfaz, entidad y control — 0,8 puntos

Definí y diferenciá:

```text
Clase de interfaz:
Clase de entidad:
Clase de control:
```

Clasificá y justificá:

```text
FormularioCrearOT
ControlCrearOT
OrdenTrabajo
Sector
APIRecepcionEjecucion
```

Indicá al menos dos responsabilidades de cada estereotipo.

---

## 3. Realización y colaboración — 1,0 punto

Para el caso:

> Un Operario registra la ejecución de una OT desde una aplicación móvil.

Escribí una realización textual usando:

```text
<<interfaz>> AppRegistrarEjecucion
<<control>> ControlRegistrarEjecucion
<<entidad>> OrdenTrabajo
<<entidad>> EjecucionOT
```

Debe incluir:

- actor;
- cuatro objetos;
- al menos cinco mensajes/responsabilidades;
- flujo normal;
- un alternativo por falta de conexión.

Después explicá:

1. por qué el actor inicia enviando un mensaje a un objeto de interfaz;
2. por qué los mensajes de análisis no son todavía métodos Java definitivos;
3. qué diferencia existe entre colaboración y secuencia detallada de diseño.

---

# Parte B — Colas — 2,5 puntos

## 4. Concepto y operaciones — 0,7 puntos

Definí:

```text
Cola:
FIFO:
Frente:
Final:
encolar:
desencolar:
cabecera:
esVacia:
longitud:
```

Después diferenciá `cabecera()` y `desencolar()`.

---

## 5. Simulación — 0,9 puntos

Partiendo de una cola vacía:

```text
encolar(A)
encolar(B)
encolar(C)
cabecera()
desencolar()
encolar(D)
desencolar()
encolar(E)
```

Completá:

| Paso | Operación | Devuelve | Cola | Frente | Final |
|---:|---|---|---|---|---|
| 0 | inicio | — | `[]` | — | — |
| 1 | `encolar(A)` | | | | |
| 2 | `encolar(B)` | | | | |
| 3 | `encolar(C)` | | | | |
| 4 | `cabecera()` | | | | |
| 5 | `desencolar()` | | | | |
| 6 | `encolar(D)` | | | | |
| 7 | `desencolar()` | | | | |
| 8 | `encolar(E)` | | | | |

Indicá expresamente el frente y el final al terminar.

---

## 6. Implementaciones y elección — 0,9 puntos

Compará Cola con vector y Cola con lista enlazada según:

- representación de frente/final;
- capacidad;
- memoria;
- encolar/desencolar;
- riesgos;
- criterio de elección.

Después explicá:

1. qué cambia y qué permanece desde la perspectiva del TDA;
2. por qué una Cola es adecuada para solicitudes atendidas por llegada;
3. por qué una Pila produciría otro orden;
4. qué pasaría si las solicitudes urgentes debieran adelantarse.

---

# Parte C — Información, señales y transmisión — 2,5 puntos

## 7. Información y cálculos — 0,8 puntos

Explicá la relación entre probabilidad, incertidumbre e información.

Completá:

```text
I(E) =
Unidad =
```

Calculá:

### a.

```text
P(E)=1/8
I(E)=?
```

### b.

```text
m=400 símbolos/s
H=2,5 bits/símbolo
R=m·H
```

Diferenciá:

```text
bits
bits/símbolo
bits/segundo
```

---

## 8. Señales y muestreo — 0,9 puntos

Definí y diferenciá:

```text
Señal analógica:
Señal digital:
Amplitud:
Período:
Frecuencia:
Muestreo:
```

Completá:

```text
f =
T =
fs mínima =
```

Calculá:

### a.

```text
T=0,002 s
f=?
```

### b.

```text
fmax=8 kHz
fs mínima=?
```

Explicá qué ocurre, según el material, si aumenta la frecuencia de muestreo.

---

## 9. Formas de transmisión — 0,8 puntos

Definí y diferenciá:

```text
Serie:
Paralela:
Asíncrona:
Síncrona:
```

Completá:

```text
Asíncrona = ______ + carácter + ______
Síncrona  = ______ + bloque + ______
```

Clasificá:

1. Se envía un bit después de otro.
2. Se envían ocho bits por líneas simultáneas.
3. Cada carácter tiene `start` y `stop`.
4. Los datos forman un bloque delimitado.

Finalmente explicá por qué una transmisión puede ser al mismo tiempo **serie y asíncrona**.

---

# Parte D — Integración y recuperación — 0,5 puntos

## 10. Integración — 0,3 puntos

Para esta necesidad:

> Varias ejecuciones de OT llegan desde móviles y deben procesarse por orden de llegada. Una ejecución puede incluir una medición analógica de sensor.

Relacioná:

```text
RF:
Caso de uso:
Clase de interfaz:
Clase de control:
Clases de entidad:
Colaboración:
Estructura de datos:
Regla FIFO:
Señal original:
Muestreo:
Forma de transmisión declarada:
Caso de prueba:
```

Explicá por qué:

- la Cola no pertenece automáticamente al modelo de análisis como detalle tecnológico;
- puede aparecer como decisión de implementación para satisfacer la regla FIFO;
- la medición debe transformarse antes de viajar como datos digitales.

---

## 11. Recuperación espaciada — 0,2 puntos

Completá:

```text
Generalización UML =

Instancia =

Rectángulo doble =

Línea doble =

Entidad asociativa =

Entidad débil =

Requerimiento completo =

Requerimiento verificable =

toString() =

Relación N:M conceptual =

Tabla asociativa =
```

---

# Defensa oral — 2 puntos

Responder durante 8–10 minutos:

> Explique cómo el caso `Registrar ejecución de OT` pasa del modelo de casos de uso al modelo de análisis. Clasifique y justifique clases de interfaz, control y entidad, y describa una colaboración. Luego explique por qué las solicitudes pendientes pueden organizarse mediante una Cola FIFO, comparando vector y lista enlazada. Finalmente, explique cómo se mide la información, cómo una señal analógica se muestrea y cómo se diferencian transmisión serie/paralela y síncrona/asíncrona.

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
- Vista externa/interna diferenciadas.
- Interfaz/control/entidad correctamente clasificadas.
- Simulación FIFO correcta.
- Cola y Pila diferenciadas.
- Cálculos con unidades.
- `fs mínima = 2·fmax`.
- Serie/paralela diferenciadas.
- Síncrona/asíncrona diferenciadas.
- Defensa integrada entre análisis, estructura y transmisión.
