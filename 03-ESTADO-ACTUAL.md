# Estado actual — EFIP I

**Fecha académica registrada:** 13 de agosto de 2026  
**Jornada:** Día 8 — Modelo de análisis + Colas + Transmisión — CERRADO  
**Resultado global:** **7,9/10 — APROBADO**  
**Próxima acción:** Día 9 — Diseño + Abstracción/Polimorfismo + Normalización.

---

## Resultado del Día 8

| Instancia | Resultado |
|---|---:|
| Modelo de análisis | 2,10/2,50 |
| Colas | 2,22/2,50 |
| Transmisión | 1,57/2,50 |
| Integración/recuperación | 0,41/0,50 |
| Evaluación escrita | 6,30/8,00 = 7,9/10 |
| Defensa oral | 1,60/2,00 = 8,0/10 |
| **Global** | **7,90/10** |

> La nota es integrada y no equivale a un examen completo independiente de cada materia.

---

## Estado por materia

| Materia | Diagnóstico Día 1 | Estado actual |
|---|---:|---|
| Análisis y Diseño | 4,75 | PUD y Requerimientos defendibles; casos de uso aplicados; modelo de análisis defendido en su núcleo |
| POO | 5,5 | Fundamentos y herencia aplicados; abstracción/polimorfismo pendientes |
| Algoritmos y Estructuras | 7,0 | Pila/LIFO y Cola/FIFO aplicadas; comparación vector/lista defendida |
| Base de Datos | 6,0 | Modelo relacional y claves defendibles; DER aplicado con simbología pendiente |
| Comunicaciones | 4,75 | OSI/TCP-IP defendible; Transmisión aplicada con fórmulas y unidades en recuperación |

---

## Avances confirmados del Día 8

### Modelo de análisis

- vista externa de casos de uso frente a vista interna conceptual;
- propósito y artefactos del análisis;
- clases `<<interfaz>>`, `<<control>>` y `<<entidad>>`;
- responsabilidades conceptuales;
- realización y colaboración;
- mensajes de análisis frente a métodos definitivos;
- colaboración frente a secuencia de diseño.

### Colas

- Cola como TDA FIFO;
- frente, final y operaciones;
- simulación sin errores;
- Cola con vector y lista enlazada;
- comparación de capacidad, memoria y riesgos;
- Pila frente a Cola;
- Cola de prioridad;
- selección según política de orden.

### Transmisión

- probabilidad, incertidumbre e información;
- cálculos simples de información y tasa;
- señales analógicas/digitales;
- período, frecuencia y muestreo;
- regla `fs≥2·fmax`;
- serie/paralela;
- asíncrona/síncrona;
- integración con una medición de sensor.

---

## Recuperaciones consolidadas

- `E-011` — selección de estructura.
- `E-032` — completo frente a verificable.
- `E-033` — riesgo de vector frente a lista enlazada.
- N:M conceptual frente a tabla asociativa, dentro del núcleo trabajado.

Corregidos, pendientes de consolidación:

- `E-036` — generalización UML.
- `E-037` — instancia.
- `E-039` — asociativa frente a débil.

Continúa abierto:

- `E-038` — línea doble = participación total.

---

## Pendientes prioritarios

### Análisis y Diseño

1. Realización con alternativo por falta de conexión.
2. Mantener el objetivo exacto del caso durante la colaboración.
3. Generalización UML con triángulo vacío.
4. Asociación, agregación, composición y dependencia.
5. Modelo de diseño.

### POO / Java

6. Implementar `toString()` cuando se solicita.
7. `Object`, `equals` y `hashCode`.
8. Abstracción, interfaces y polimorfismo.

### Estructuras

9. Contrato del TDA frente a implementación.
10. Pila=LIFO y Cola=FIFO bajo presión.
11. Orden FIFO frente a trazabilidad.
12. Complejidades de ordenación.

### Base de Datos

13. Instancia como ocurrencia concreta.
14. Línea doble = participación total.
15. Asociativa frente a débil.
16. `UNIQUE`, historial, DCL/TCL y normalización.

### Comunicaciones

17. `I(E)=log₂(1/P(E))` y unidad bits.
18. bits, bits/símbolo y bits/segundo.
19. Amplitud, período y frecuencia.
20. `f=1/T`, `T=1/f`.
21. Definición de muestreo y efecto de aumentar `fs`.
22. Digitalización, transmisión analógica y supuestos de protocolo.

---

## Estado de errores

| Estado | Cantidad |
|---|---:|
| Consolidado | **29** |
| Corregido | **5** |
| Abierto | **11** |
| **Total** | **45** |

Nuevos errores del Día 8:

```text
E-040 — realización de análisis incompleta/caso desviado
E-041 — contrato TDA frente a implementación
E-042 — Pila/Cola y orden frente a trazabilidad
E-043 — información: relación, fórmula y unidades
E-044 — parámetros de señal, fórmulas y muestreo
E-045 — digitalización, política de envío y supuestos
```

---

## Tarjetas de recuperación

```text
TARJETAS/2026-08-13_TARJETAS-RECUPERACION-ERRORES-DIA-08.md
```

El mazo contiene tarjetas de análisis, TDA/Pila/Cola, información y unidades, señales, muestreo, transmisión y errores todavía activos del Día 7.

---

## Evidencia principal

- `EVALUACIONES/2026-08-13_RESPUESTAS-DIA-08.md`
- `EVALUACIONES/2026-08-13_RESULTADOS-DIA-08.md`
- `04-MATRIZ-DE-PROGRESO-ACTUALIZACION-DIA-08.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-08.md`
- `RESUMENES/2026-08-13_CIERRE-DIA-08.md`
- `RESUMENES/2026-08-13_ESTADO-ACUMULADO-DIAS-01-A-08.md`
- `TARJETAS/2026-08-13_TARJETAS-RECUPERACION-ERRORES-DIA-08.md`

---

## Próxima jornada

**Día 9 — 14/08/2026: Diseño + Abstracción/Polimorfismo + Normalización**

La recuperación inicial debe priorizar fórmulas/unidades de información, parámetros de señal, contrato TDA/implementación, Pila/Cola, trazabilidad, realización con alternativo y simbología DER.
