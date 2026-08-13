# Errores y recuperaciones — Día 8
## Modelo de análisis + Colas + Transmisión

**Fecha:** 13/08/2026  
**Resultado global:** 7,9/10 — APROBADO

---

# 1. Cambios de estado en errores anteriores

## E-011 — Selección de estructura

**Estado anterior:** corregido.  
**Estado Día 8:** **consolidado**.

Evidencia:

- Pila elegida para Deshacer por LIFO.
- Cola elegida para solicitudes por llegada mediante FIFO.
- Cola de prioridad propuesta cuando las urgentes deben adelantarse.
- Vector/lista elegidos según máximo conocido o volumen incierto.

Regla:

```text
Elegir estructura
→ según operación dominante, política de orden, restricciones y volumen esperado.
```

---

## E-032 — Completo frente a verificable

**Estado anterior:** abierto.  
**Estado Día 8:** **consolidado**.

Evidencia:

```text
Completo
→ contiene toda la información necesaria para comprender el requerimiento sin ambigüedad.

Verificable
→ puede comprobarse objetivamente mediante prueba, revisión o medición.
```

La diferencia fue correcta en la recuperación inicial y en la evaluación escrita.

---

## E-033 — Riesgo de vector frente a lista enlazada

**Estado anterior:** abierto.  
**Estado Día 8:** **consolidado**.

Evidencia escrita y oral:

```text
Vector
→ capacidad definida;
→ posible desbordamiento y espacios no reutilizados si los índices se gestionan mal.

Lista enlazada
→ tamaño variable;
→ limitada por memoria;
→ riesgo de pérdida/corrupción de referencias.
```

---

## E-036 — Notación de generalización UML

**Estado anterior:** abierto.  
**Estado Día 8:** **corregido**.

La dirección hijo → padre se mantuvo y la evaluación escribió:

```text
Hijo -|> Padre
```

Pendiente para consolidar:

```text
línea continua + triángulo vacío apuntando al padre
```

---

## E-037 — Instancia confundida con cantidad

**Estado anterior:** abierto.  
**Estado Día 8:** **corregido**.

La respuesta evolucionó desde “dato concreto/específico” hacia el concepto correcto.

Regla que debe automatizarse:

```text
Instancia
→ ocurrencia concreta de una entidad.
```

Ejemplo:

```text
Entidad: OPERARIO
Instancia: Operario 189 — Juan Pérez
```

---

## E-038 — Simbología de entidad débil y participación total

**Estado anterior:** abierto.  
**Estado Día 8:** **abierto**.

Evidencia:

- `Rectángulo doble = entidad débil` fue recuperado.
- `Línea doble = participación total` quedó omitido en la evaluación.

Regla:

```text
Rectángulo doble → entidad débil
Línea doble      → participación total
Elipse doble     → atributo multivaluado
```

---

## E-039 — Entidad asociativa frente a entidad débil

**Estado anterior:** abierto.  
**Estado Día 8:** **corregido**.

La recuperación inicial todavía mezcló ambos conceptos, pero la evaluación final los separó:

```text
Entidad/tabla asociativa
→ materializa una relación N:M en el modelo relacional.

Entidad débil
→ depende de otra entidad para identificarse o existir.
```

Pendiente: repetir sin analizar solamente la composición de la PK.

---

# 2. Errores nuevos del Día 8

## E-040 — Realización de análisis incompleta y caso desviado

- **Materia:** Análisis y Diseño.
- **Tema:** realización de caso de uso–análisis.
- **Respuesta/error:** el flujo escrito comenzó con “crear una OT”, aunque el caso era registrar una ejecución, y omitió el alternativo solicitado por falta de conexión.
- **Corrección:** la realización debe conservar el objetivo del caso y representar también el alternativo pedido.
- **Regla:**

```text
Caso: Registrar ejecución de OT
→ usar una OT existente;
→ crear/registrar EjecucionOT;
→ si no hay conexión, conservar la solicitud pendiente e informar al actor.
```

- **Estado:** **abierto**.

---

## E-041 — Contrato del TDA frente a implementación

- **Materia:** Algoritmos y Estructuras.
- **Tema:** qué cambia y qué permanece al implementar una Cola.
- **Respuesta/error:** respondió que debe controlarse el tamaño, sin distinguir contrato e implementación.
- **Corrección:**

```text
Permanece
→ interfaz y política FIFO.

Cambia
→ representación interna: vector/índices o nodos/referencias.
```

- **Estado:** **abierto**.

---

## E-042 — Pila/Cola y orden frente a trazabilidad

- **Materia:** Algoritmos y Estructuras.
- **Tema:** LIFO/FIFO y alcance de la Cola.
- **Respuesta/error:** en el escrito se describió a la Pila con orden FIFO; en la defensa se afirmó que la Cola garantiza trazabilidad.
- **Corrección:**

```text
Pila → LIFO.
Cola → FIFO.
FIFO preserva orden de procesamiento.
Trazabilidad requiere registros de identificador, fecha, estado, intentos y resultado.
```

- **Estado:** **abierto**.

---

## E-043 — Información: relación, fórmula y unidades

- **Materia:** Comunicaciones.
- **Tema:** probabilidad, incertidumbre e información.
- **Respuesta/error:** faltaron fórmula y unidad en el escrito; durante la defensa apareció la contradicción “mayor probabilidad, mayor incertidumbre”.
- **Corrección:**

```text
P ↑ → incertidumbre ↓ → información ↓
P ↓ → incertidumbre ↑ → información ↑

I(E)=log₂(1/P(E))
Unidad=bits
```

- **Estado:** **abierto**.

---

## E-044 — Parámetros de señal, fórmulas y muestreo

- **Materia:** Comunicaciones.
- **Tema:** amplitud, período, frecuencia y muestreo.
- **Respuesta/error:** amplitud se redujo a potencia; frecuencia se formuló como ciclo de envío de bits; faltaron `f=1/T`, `T=1/f` y la definición exacta de muestreo.
- **Corrección:**

```text
Amplitud → magnitud/nivel.
Período T → tiempo de un ciclo, segundos.
Frecuencia f → ciclos por segundo, Hz.
f=1/T
T=1/f
Muestreo → tomar valores de una señal continua en instantes determinados.
fs mínima=2·fmax
```

- **Estado:** **abierto**.

---

## E-045 — Digitalización, política de envío y supuestos de transmisión

- **Materia:** Comunicaciones.
- **Tema:** transformación y transmisión de una medición.
- **Respuesta/error:** se afirmó que una señal analógica se corrompería por el solo hecho de viajar analógicamente y se vinculó la cantidad de información con decidir automáticamente si enviar.
- **Corrección:**

```text
Una señal analógica puede transmitirse analógicamente.
Se digitaliza cuando el sistema necesita representarla, procesarla, almacenarla o enviarla como datos digitales.
I(E) mide información; una política del sistema decide qué transmitir.
Síncrona/asíncrona debe declararse como supuesto cuando el protocolo no está especificado.
```

- **Estado:** **abierto**.

---

# 3. Ajustes sin nuevo código

## Entidad de análisis

No debe definirse únicamente como persistencia:

```text
<<entidad>>
→ concepto relativamente duradero del dominio;
→ información y comportamiento propios;
→ no equivale automáticamente a tabla.
```

## Vector

Evitar afirmaciones absolutas como “sin circular no hay motivo para usar vector”. Puede ser adecuado si existe un máximo conocido y se gestionan correctamente los índices.

## Términos de operaciones

Preferir:

```text
cabecera() → devuelve/consulta
```

en lugar de “muestra”, porque el TDA no presupone una pantalla.

---

# 4. Estado del Día 8

| Tema | Estado al cierre |
|---|---|
| Casos de uso vs. modelo de análisis | Defendible oralmente en el alcance trabajado |
| Interfaz/control/entidad | Defendible oralmente |
| Realización y colaboración | Aplicado; alternativo pendiente |
| Cola/FIFO | Defendible oralmente |
| Simulación de Cola | Aplicado sin errores |
| Vector/lista para Cola | Defendible oralmente con precisión pendiente |
| TDA: contrato/implementación | Abierto |
| Pila vs. Cola | Aplicado; error bajo presión pendiente |
| Información e incertidumbre | Comprendido; recuperación obligatoria |
| Fórmula/unidades de información | Abierto |
| Señales analógicas/digitales | Aplicado |
| Amplitud/período/frecuencia | Abierto en definición |
| Muestreo | Aplicado en cálculo; definición pendiente |
| Serie/paralela | Aplicado |
| Síncrona/asíncrona | Aplicado |

---

# 5. Estado canónico propuesto

Después del Día 8:

| Estado | Cantidad |
|---|---:|
| Consolidado | **29** |
| Corregido | **5** |
| Abierto | **11** |
| **Total** | **45** |

Cambios:

```text
Consolidados: E-011, E-032, E-033
Corregidos:   E-036, E-037, E-039
Abierto:      E-038
Nuevos:       E-040 a E-045
```

---

# 6. Recuperación recomendada para Día 9

1. Realización de análisis con flujo alternativo.
2. Contrato del TDA frente a implementación.
3. Pila=LIFO; Cola=FIFO.
4. FIFO frente a trazabilidad.
5. Probabilidad/incertidumbre/información.
6. `I(E)=log₂(1/P(E))` y unidades.
7. Amplitud, período y frecuencia.
8. `f=1/T`, `T=1/f`.
9. Muestreo y `fs mínima=2·fmax`.
10. Digitalización, transmisión analógica y supuestos.
11. Línea doble = participación total.
12. Repetir asociativa/débil e instancia.

---

# 7. Evidencia

- `EVALUACIONES/2026-08-13_RESPUESTAS-DIA-08.md`
- `EVALUACIONES/2026-08-13_RESULTADOS-DIA-08.md`
- defensa oral del Día 8;
- `TARJETAS/2026-08-13_TARJETAS-RECUPERACION-ERRORES-DIA-08.md`.
