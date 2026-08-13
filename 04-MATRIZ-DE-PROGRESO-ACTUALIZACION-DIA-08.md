# Matriz de progreso — actualización al cierre del Día 8

**Fecha:** 13/08/2026  
**Resultado global:** 7,9/10 — APROBADO

Estados:

- `NI` = No iniciado
- `EA` = En aprendizaje
- `C` = Comprendido
- `A` = Aplicado
- `DO` = Defendible oralmente

> `DO` se propone solo para núcleos efectivamente defendidos durante la exposición oral, no para la totalidad de la asignatura.

---

# 1. Análisis y Diseño

| Tema | Estado previo | Estado Día 8 | Evidencia |
|---|---|---|---|
| Propósito del análisis | NI | **A/DO** | Refinamiento y estructuración interna de requisitos |
| Casos de uso vs. modelo de análisis | NI/EA | **DO** | Vista externa frente a vista interna defendida |
| Modelo de análisis | NI | **A** | Objetos conceptuales, responsabilidades y colaboración |
| Artefactos del análisis | NI | **C/A** | Cinco artefactos nombrados y explicados con ajustes |
| Clase de interfaz | NI | **DO** | App/formulario/API como frontera del actor |
| Clase de control | NI | **DO** | Coordinación del flujo y validaciones |
| Clase de entidad | NI/EA | **DO** | OT y EjecucionOT como conceptos del dominio; persistencia no automática |
| Responsabilidades | NI/EA | **A** | Recibir/mostrar, coordinar, conocer/aplicar reglas |
| Realización de caso de uso–análisis | NI | **A** | Flujo normal aplicado; alternativo de conexión faltó en escrito |
| Colaboración | NI | **A/DO** | Actor→Interfaz→Control→Entidades→respuesta |
| Mensajes de análisis | NI | **A** | Responsabilidades conceptuales, no métodos definitivos |
| Colaboración vs. secuencia de diseño | NI | **C/A** | Secuencia agrega detalle temporal y tecnológico |
| Paquete de análisis | NI | **C** | Agrupación de artefactos en unidades manejables |
| Vista de arquitectura del análisis | NI | **C** | Concepto comprendido; evitó diseño tecnológico en oral |
| Generalización UML | EA | **C** | Dirección hijo→padre recuperada; triángulo vacío pendiente de automatizar |
| Completo vs. verificable | A con error previo | **A / consolidado** | Correcto en recuperación y evaluación |

---

# 2. Algoritmos y Estructuras

| Tema | Estado previo | Estado Día 8 | Evidencia |
|---|---|---|---|
| Cola | C diagnóstico | **DO** | TDA lineal restrictivo definido y defendido |
| FIFO | C diagnóstico | **DO** | Primero en entrar, primero en salir |
| Frente/final | NI/EA | **A** | Extremos de extracción/inserción aplicados |
| Encolar/desencolar/cabecera | NI/EA | **A** | Operaciones correctamente diferenciadas |
| `esVacia` y `longitud` | NI/EA | **A** | Definiciones correctas |
| Simulación de Cola | NI | **A** | Ejercicio completo sin errores |
| Cola con vector | NI | **A/DO** | Índices, capacidad, reutilización y desbordamiento |
| Cola con lista enlazada | NI | **A/DO** | Cabecera/final, nodos, memoria y referencias |
| Comparación de implementaciones | NI | **A/DO** | Vector/lista comparados en escrito y oral |
| TDA: interfaz vs. implementación | A histórico | **EA** | En oral se recuperó; escrito no respondió el núcleo |
| Pila vs. Cola | C/A | **A** | Ejercicios previos correctos; error LIFO/FIFO en evaluación |
| Selección de estructura | corregido | **Consolidado** | Pila, Cola y Cola de prioridad elegidas según política |
| Riesgo vector/lista | abierto | **Consolidado** | Capacidad fija vs. memoria/referencias |
| Cola de prioridad | NI/EA | **C/A** | Identificada para solicitudes urgentes |
| FIFO vs. trazabilidad | NI | **EA** | Oral confundió orden con trazabilidad |

---

# 3. Comunicaciones

| Tema | Estado previo | Estado Día 8 | Evidencia |
|---|---|---|---|
| Medida de información | NI | **EA/C** | Idea general comprendida; fórmula/unidad omitidas |
| Probabilidad/incertidumbre | NI | **C** | Relación general correcta, contradicción oral inicial |
| Fórmula `I(E)` | NI | **EA** | Resultado numérico correcto; fórmula no automatizada |
| Unidad bit | NI | **EA** | Unidad omitida en evaluación |
| Entropía `H` | NI | **EA** | Usada en tasa; definición/unidad incompleta |
| Tasa de información `R` | NI | **C/A** | Cálculo correcto, unidad omitida |
| bits / bits-símbolo / bits-segundo | NI | **EA** | Diferenciación casi no respondida |
| Señal analógica | NI | **A** | Continua; aplicada a sensor |
| Señal digital | NI | **A** | Niveles discretos; precisión terminológica pendiente |
| Amplitud | NI | **EA** | Confundida con potencia |
| Período | NI | **C/A** | Cálculo correcto; definición breve/imprecisa |
| Frecuencia | NI | **C/A** | Cálculo correcto; definición imprecisa |
| `f=1/T`, `T=1/f` | NI | **EA/A** | Aplicadas en práctica; omitidas como fórmulas en evaluación |
| Muestreo | NI | **A** | Cálculos correctos; definición pendiente |
| `fs≥2·fmax` | NI | **A** | Cálculos correctos en práctica y evaluación |
| Efecto de aumentar `fs` | NI | **C** | Mayor volumen identificado; representación/recursos incompletos |
| Serie/paralela | NI | **A** | Diferenciadas y clasificadas correctamente |
| Síncrona/asíncrona | A | **A/DO parcial** | Escrita correctamente; oral no desarrolló por completo |
| Combinación de categorías | NI | **A** | Digital+serie+asíncrona+guiada comprendida |
| Digitalización de medición | NI | **EA** | Motivo formulado de manera universal incorrecta |
| Supuestos de protocolo | NI | **EA/C** | Necesidad de declarar supuesto explicada durante práctica |

---

# 4. Recuperaciones del Día 7

| Tema | Estado previo | Estado Día 8 | Evidencia |
|---|---|---|---|
| Generalización UML | Abierto | **Corregido** | `Hijo -|> Padre`; triángulo vacío pendiente |
| Instancia | Abierto | **Corregido** | Dato/ocurrencia concreta, precisión pendiente |
| Rectángulo doble/línea doble | Abierto | **Abierto** | Rectángulo correcto; línea doble omitida |
| Asociativa frente a débil | Abierto | **Corregido** | Diferencia final correcta |
| Completo/verificable | Abierto | **Consolidado** | Correcto en dos instancias del día |
| `toString()` | Pendiente | **C** | Heredado de `Object`, representación textual |
| N:M/tabla asociativa | A con error | **A / consolidado conceptual** | Regla DER frente a implementación relacional |
| Riesgo vector/lista | Abierto | **Consolidado** | Escrito + defensa correctos |

---

# 5. Resultado del Día 8

| Instancia | Resultado |
|---|---:|
| Modelo de análisis | **2,10/2,50** |
| Colas | **2,22/2,50** |
| Transmisión | **1,57/2,50** |
| Integración/recuperación | **0,41/0,50** |
| Evaluación escrita | **6,30/8,00 = 7,9/10** |
| Defensa oral | **1,60/2,00 = 8,0/10** |
| **Global** | **7,90/10** |

**Estado: APROBADO**

---

# 6. Pendientes prioritarios

1. Realización de análisis con alternativo por falta de conexión.
2. Contrato del TDA frente a implementación.
3. Pila=LIFO y Cola=FIFO bajo presión.
4. FIFO frente a trazabilidad.
5. `I(E)=log₂(1/P(E))` y unidad bits.
6. bits, bits/símbolo y bits/segundo.
7. Probabilidad alta → menor incertidumbre/información.
8. Amplitud, período y frecuencia.
9. `f=1/T`, `T=1/f`.
10. Definición de muestreo y efecto de aumentar `fs`.
11. Digitalización frente a transmisión analógica.
12. Declaración de supuestos de protocolo.
13. Línea doble = participación total.
14. Generalización UML con triángulo vacío.
