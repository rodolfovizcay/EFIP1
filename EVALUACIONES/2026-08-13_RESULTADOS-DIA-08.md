# Resultados de evaluación — Día 8
## Modelo de análisis + Colas + Transmisión

**Fecha:** 13/08/2026  
**Materias principales:** Análisis y Diseño + Algoritmos/Estructuras + Comunicaciones  
**Modalidad:** evaluación escrita + defensa oral integrada

---

## Resultado general

| Instancia | Resultado |
|---|---:|
| Evaluación escrita | **6,30/8,00 = 7,9/10** |
| Defensa oral | **1,60/2,00 = 8,0/10** |
| **Resultado global** | **7,90/10 → 7,9/10** |

**Estado: APROBADO**

> La nota corresponde a una evaluación integrada de tres materias. No debe copiarse como nota completa e independiente de cada asignatura.

---

# 1. Evaluación escrita — 6,30/8,00

| Pregunta | Tema | Máximo | Obtenido |
|---:|---|---:|---:|
| 1 | Propósito y artefactos del análisis | 0,70 | **0,62** |
| 2 | Interfaz, control y entidad | 0,80 | **0,70** |
| 3 | Realización y colaboración | 1,00 | **0,78** |
| 4 | Cola y operaciones | 0,70 | **0,66** |
| 5 | Simulación FIFO | 0,90 | **0,90** |
| 6 | Implementaciones y elección | 0,90 | **0,66** |
| 7 | Información y cálculos | 0,80 | **0,34** |
| 8 | Señales y muestreo | 0,90 | **0,49** |
| 9 | Formas de transmisión | 0,80 | **0,74** |
| 10 | Integración | 0,30 | **0,23** |
| 11 | Recuperación espaciada | 0,20 | **0,18** |
| **Total** | | **8,00** | **6,30** |

Por bloques:

| Bloque | Máximo | Obtenido |
|---|---:|---:|
| Modelo de análisis | 2,50 | **2,10** |
| Colas | 2,50 | **2,22** |
| Transmisión | 2,50 | **1,57** |
| Integración/recuperación | 0,50 | **0,41** |

---

# 2. Modelo de análisis — 2,10/2,50

## Aciertos

- Diferenció el modelo de casos de uso como vista externa y el modelo de análisis como vista interna conceptual.
- Nombró los cinco artefactos principales del análisis.
- Clasificó correctamente:

```text
FormularioCrearOT      → <<interfaz>>
ControlCrearOT         → <<control>>
OrdenTrabajo           → <<entidad>>
Sector                 → <<entidad>>
APIRecepcionEjecucion  → <<interfaz>>
```

- Distribuyó responsabilidades entre interfaz, control y entidad.
- Construyó una colaboración coherente entre Operario, interfaz, control y entidades.
- Explicó que los mensajes de análisis todavía no son métodos Java definitivos.
- Diferenció colaboración conceptual y secuencia detallada de diseño.

## Ajustes

### Propósito del análisis

Forma esperada:

> Refinar y estructurar los requisitos para comprender internamente el sistema mediante objetos conceptuales, responsabilidades y colaboraciones, sirviendo como base para el diseño.

### Vista de arquitectura del análisis

No es todavía el diseño tecnológico completo. Reúne los paquetes, dependencias, clases y realizaciones conceptuales más significativos para la arquitectura.

### Entidad de análisis

La respuesta la relacionó directamente con persistencia. Debe formularse así:

```text
<<entidad>>
→ representa un concepto importante y relativamente duradero del dominio;
→ conoce información y comportamiento propios;
→ no equivale automáticamente a tabla ni a persistencia física.
```

### Realización incompleta

La consigna pedía un alternativo por falta de conexión y no fue escrito en la evaluación.

Ejemplo:

```text
A1. La interfaz detecta falta de conexión.
A2. La ejecución queda pendiente de envío.
A3. La interfaz informa al Operario.
A4. Al recuperarse la conexión, la solicitud se procesa según la regla definida.
```

Además, el primer mensaje mencionó “crear una OT”, aunque el caso evaluado era registrar la ejecución de una OT existente.

---

# 3. Colas — 2,22/2,50

## Aciertos

- Cola definida como TDA lineal restrictivo FIFO.
- Frente, final, encolar, desencolar, cabecera, `esVacia` y `longitud` correctamente explicados.
- Diferencia `cabecera()`/`desencolar()` correcta.
- Simulación FIFO perfecta.

```text
Cola final   = [C,D,E]
Frente final = C
Final final  = E
```

- Vector y lista enlazada comparados en índices/referencias, capacidad, memoria y riesgos.
- Cola elegida correctamente para solicitudes por orden de llegada.
- Cola de prioridad identificada cuando una solicitud urgente debe adelantarse.

## Ajustes

### Contrato del TDA

La pregunta “qué cambia y qué permanece” no fue respondida correctamente.

```text
Permanece:
→ interfaz y política FIFO;
→ encolar, desencolar, cabecera, esVacia y longitud.

Cambia:
→ representación interna mediante vector/índices o nodos/referencias.
```

### Pila y Cola

En una respuesta escrita se describió la Pila con política FIFO. La corrección es:

```text
Pila → LIFO → último en entrar, primero en salir.
Cola → FIFO → primero en entrar, primero en salir.
```

### Vector

No es correcto afirmar que un vector no tiene buenos motivos de uso sin ser circular. Puede resultar apropiado con un máximo conocido, memoria contigua y una gestión correcta de índices.

### Trazabilidad

Durante la defensa se atribuyó a FIFO la garantía de trazabilidad.

```text
FIFO
→ preserva orden de procesamiento.

Trazabilidad
→ requiere identificadores, fechas, estados, intentos y resultados registrados.
```

---

# 4. Transmisión — 1,57/2,50

Fue el bloque con mayor pérdida de puntaje.

## Aciertos

- Comprendió la relación general entre menor probabilidad y mayor información.
- Resolvió correctamente los resultados numéricos simples.
- Calculó correctamente:

```text
T=0,002 s → f=500 Hz
fmax=8 kHz → fs mínima=16 k muestras/s
```

- Diferenció transmisión serie/paralela.
- Diferenció transmisión asíncrona/síncrona.
- Clasificó correctamente los cuatro ejemplos.

## Errores y correcciones

### Probabilidad, incertidumbre e información

Durante la defensa apareció una contradicción inicial. Regla correcta:

```text
Mayor probabilidad
→ menor incertidumbre
→ menor información.

Menor probabilidad
→ mayor incertidumbre
→ mayor información.
```

### Fórmula de información

Faltó escribir:

```text
I(E) = log₂(1/P(E))
Unidad = bits
```

Para `P(E)=1/8`:

```text
I(E)=log₂(8)=3 bits
```

### Tasa de información

```text
R = m·H
R = 400 símbolos/s × 2,5 bits/símbolo
R = 1000 bits/s
```

### Unidades

```text
bits
→ cantidad de información.

bits/símbolo
→ información media por símbolo; unidad de entropía.

bits/segundo
→ tasa de información por unidad de tiempo.
```

### Parámetros de señal

```text
Amplitud
→ magnitud o nivel de la señal.

Período T
→ tiempo de un ciclo, en segundos.

Frecuencia f
→ ciclos por segundo, en hertz.

f=1/T
T=1/f
```

La amplitud no equivale simplemente a potencia y la frecuencia no es “el ciclo en que se envían bits”.

### Muestreo

```text
Muestreo
→ tomar valores de una señal continua en instantes determinados.

fs mínima = 2·fmax
```

Al aumentar `fs`:

- aumenta la cantidad de muestras;
- mejora la representación temporal dentro del alcance del material;
- aumenta el volumen de datos y los recursos/ancho de banda necesarios.

### Digitalización y transmisión analógica

No es universalmente cierto que transmitir una señal analógica la corrompa. La medición se transforma cuando el sistema necesita procesarla, almacenarla o enviarla como datos digitales.

```text
señal analógica
→ muestreo
→ cuantificación/codificación según la solución
→ datos digitales
```

### Decisión de envío

`I(E)` no decide por sí sola si un mensaje debe enviarse. La fórmula mide información según probabilidad; la política del sistema decide qué se transmite.

---

# 5. Integración y recuperación — 0,41/0,50

## Aciertos

- RF y caso de uso identificados.
- Interfaz, control y entidades relacionados.
- Cola seleccionada para la regla FIFO.
- Señal analógica y fórmula de muestreo incluidas.
- El modelo de análisis se mantuvo conceptual y separado de la implementación.
- Generalización, instancia, rectángulo doble, asociativa/débil, completo/verificable, `toString` y N:M/tabla asociativa fueron recuperados casi por completo.

## Ajustes

- La entidad debe llamarse `EjecucionOT`, no `EJECUTAR OT`.
- La colaboración debía describirse con mensajes concretos.
- La transmisión asíncrona debía declararse como supuesto y justificarse.
- Faltó completar:

```text
Línea doble = participación total
```

---

# 6. Defensa oral — 1,60/2,00

| Criterio | Máximo | Obtenido |
|---|---:|---:|
| Precisión conceptual | 0,50 | **0,34** |
| Terminología académica | 0,40 | **0,31** |
| Aplicación y justificación | 0,50 | **0,43** |
| Integración entre materias | 0,40 | **0,36** |
| Claridad y orden | 0,20 | **0,16** |
| **Total** | **2,00** | **1,60** |

## Fortalezas de la defensa

- Explicó el pasaje de caso de uso a modelo de análisis.
- Clasificó interfaz, control y entidades.
- Expuso una colaboración completa.
- Incorporó falta de conectividad y Cola FIFO.
- Comparó vector y lista enlazada.
- Explicó qué permanece en el TDA y qué cambia en la implementación.
- Integró señal analógica, muestreo y transmisión.

## Ajustes de la defensa

- Contradicción inicial en probabilidad/incertidumbre/información.
- Faltó mencionar `I(E)=log₂(1/P(E))` y su unidad.
- Faltó desarrollar `f=1/T`, la regla de muestreo y las cuatro formas de transmisión.
- FIFO preserva orden, no trazabilidad por sí sola.
- La medida de información no determina automáticamente si el mensaje debe enviarse.

---

# 7. Avances confirmados

## Análisis y Diseño

- propósito del análisis;
- vista externa frente a vista interna;
- artefactos principales;
- clases de interfaz, control y entidad;
- responsabilidades conceptuales;
- realización de caso de uso–análisis;
- colaboración entre objetos;
- mensajes conceptuales frente a métodos definitivos.

## Algoritmos y Estructuras

- Cola y FIFO;
- frente y final;
- encolar, desencolar y cabecera;
- simulación;
- Cola con vector;
- Cola con lista enlazada;
- Pila frente a Cola;
- Cola de prioridad como extensión;
- selección según operación dominante.

## Comunicaciones

- probabilidad/incertidumbre/información en el núcleo conceptual;
- cálculos simples de información y tasa;
- señal analógica/digital;
- frecuencia y período;
- muestreo;
- serie/paralela;
- asíncrona/síncrona;
- integración con sensor de OT.

---

# 8. Recuperaciones del Día 7

| Tema | Resultado Día 8 |
|---|---|
| Generalización UML | **Corregido**; dirección y notación textual recuperadas, precisión gráfica pendiente |
| Instancia | **Corregido**; formulada como dato/ocurrencia concreta, automatización pendiente |
| Rectángulo doble/línea doble | **Abierto**; rectángulo recuperado, línea doble omitida en evaluación |
| Asociativa/débil | **Corregido**; diferencia final correcta, consolidación pendiente |
| Completo/verificable | **Consolidado**; correcto en recuperación y evaluación |
| `toString()` | Concepto recuperado; implementación Java sigue pendiente dentro de sintaxis/completitud |
| N:M/tabla asociativa | **Consolidado** en el núcleo conceptual |
| Riesgo vector/lista | **Consolidado** mediante Cola escrita y defensa |

---

# 9. Interpretación académica

Modelo de análisis y Colas quedaron en un nivel aplicado y defendible dentro del alcance evaluado. La simulación FIFO fue exacta y la selección de estructura estuvo bien justificada.

Transmisión quedó aplicada en clasificación y cálculos de frecuencia/muestreo, pero necesita recuperación dirigida de fórmulas, unidades y definiciones. La dificultad no estuvo en operar números, sino en expresar académicamente qué representa cada magnitud.

---

# 10. Recuperación obligatoria

1. `I(E)=log₂(1/P(E))`, unidad bits.
2. `bits`, `bits/símbolo`, `bits/segundo`.
3. Probabilidad alta → incertidumbre e información bajas.
4. Amplitud, período y frecuencia.
5. `f=1/T`, `T=1/f`.
6. Definición de muestreo y `fs mínima=2·fmax`.
7. Al aumentar `fs`: más muestras, datos y recursos.
8. TDA: permanece interfaz; cambia implementación.
9. Pila=LIFO; Cola=FIFO.
10. FIFO preserva orden; trazabilidad requiere registros.
11. Alternativo por falta de conexión.
12. Señal analógica puede transmitirse; digitalización depende del sistema.

---

## Decisión

**Día 8 APROBADO con 7,9/10.**
