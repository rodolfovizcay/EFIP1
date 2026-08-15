# Estado actual — EFIP I

**Fecha académica registrada:** 15 de agosto de 2026  
**Etapa:** Semana intensiva 1 — 10/08 al 15/08/2026  
**Estado semanal:** **CERRADA POR EVIDENCIA ACUMULADA**  
**Nivel semanal:** **ALTO / APROBADO**  
**Indicador cuantitativo:** **8,6/10**  
**Día 9:** **EN PAUSA — evaluación y defensa específicas pendientes**

> El indicador 8,6/10 es el promedio de las cuatro evaluaciones cerradas de la semana: Día 5 = 9,0; Día 6 = 9,2; Día 7 = 8,3; Día 8 = 7,9. No es una nueva nota de examen semanal ni reemplaza la evaluación pendiente del Día 9.

---

## Decisión de cierre semanal

La evaluación semanal de 100 puntos no se realizó por decisión del estudiante. El nivel semanal se determina mediante:

- cuatro evaluaciones integradas ya corregidas y cerradas;
- defensas orales de los Días 5, 6, 7 y 8;
- progreso parcial documentado del Día 9;
- resolución guiada del Caso integrador 1;
- recuperaciones realizadas durante la semana;
- capacidad de integrar las cinco materias en una explicación oral.

El cierre semanal es académico y documental, pero no crea una calificación formal adicional.

---

## Resultados cerrados utilizados

| Jornada | Resultado |
|---|---:|
| Día 5 — PUD + POO + modelo relacional | 9,0/10 |
| Día 6 — Requisitos + Pilas + OSI/TCP-IP | 9,2/10 |
| Día 7 — Casos de uso + Herencia + DER | 8,3/10 |
| Día 8 — Modelo de análisis + Colas + Transmisión | 7,9/10 |
| **Promedio de evidencia cerrada** | **8,6/10** |

No se incorpora una nota del Día 9 porque su caso integrador, evaluación escrita y defensa específica todavía están pendientes.

---

## Nivel semanal por materia

| Materia | Nivel semanal | Evidencia principal | Precisión pendiente |
|---|---|---|---|
| Análisis y Diseño | **Alto — Aplicado y parcialmente defendible** | PUD, requisitos, casos de uso, análisis, diseño inicial y caso integrado | relaciones UML, secuencia/estados y precisión de alternativos |
| POO | **Medio-alto — Aplicado** | encapsulamiento, herencia, abstracción, clase abstracta, interfaz y polimorfismo | completitud Java, validación de `String`, `toString()`, excepciones |
| Estructuras | **Alto — Aplicado y defendible en Pila/Cola** | TDA, Pila LIFO, Cola FIFO, vector/lista y selección por política | FIFO vs. trazabilidad y algoritmos de ordenación |
| Base de Datos | **Medio-alto — Aplicado** | modelo relacional, claves, DER, N:M, 1FN, 2FN y 3FN | asociativa/débil, claves históricas, `UNIQUE`, DCL/TCL |
| Comunicaciones | **Medio-alto — Aplicado** | OSI/TCP-IP, encapsulamiento, PDU, switch/router, información, frecuencia y muestreo | supuestos de transmisión, definiciones/unidades y nivel físico avanzado |
| Integración | **Alto — Aplicado oralmente** | cadena requisito→caso→análisis→diseño→POO/estructuras→datos→comunicaciones | practicar una defensa completa de 8–12 minutos |

---

## Avances de la semana

### Análisis y Diseño

- PUD dirigido por casos de uso, centrado en la arquitectura e iterativo/incremental;
- fases y flujos diferenciados;
- Ingeniería de Requerimientos;
- RF, RNF y reglas de negocio;
- calidad de requisitos;
- actores, casos, `include`, `extend` y generalización;
- precondiciones, flujos y postcondiciones;
- modelo de análisis e interfaz/control/entidad;
- introducción al modelo de diseño, servicios, repositorios y secuencias.

### POO

- objeto, estado, comportamiento e identidad;
- encapsulamiento;
- constructores, `this`, `super` y `static`;
- herencia, sobrecarga y sobrescritura;
- abstracción y clase abstracta;
- interfaz y `implements`;
- polimorfismo mediante un tipo común;
- `toString()` y validación de `String` en recuperación.

### Estructuras

- TDA e independencia de implementación;
- Pila LIFO para deshacer;
- Cola FIFO para solicitudes pendientes;
- operaciones y simulaciones;
- vector frente a lista enlazada;
- Cola de prioridad;
- elección por política y operación dominante.

### Base de Datos

- modelo relacional y claves;
- DER y cardinalidades;
- relaciones 1:N y N:M;
- tabla asociativa;
- entidades fuertes y débiles;
- pasaje a relaciones;
- 1FN, 2FN y 3FN;
- dependencias parciales y transitivas;
- ID artificial frente a normalización.

### Comunicaciones

- sistema de comunicaciones;
- OSI y TCP/IP;
- encapsulamiento y desencapsulamiento;
- PDU, SDU y PCI;
- MAC, IP y puerto;
- switch y router;
- información e incertidumbre;
- `I(E)=log₂(1/P(E))`;
- período, frecuencia y muestreo;
- serie/paralela y síncrona/asíncrona.

---

## Caso integrador 1

**Estado:** práctica guiada completada; evaluación formal de 100 puntos no realizada.

Se trabajaron:

- problema, objetivos, RF, RNF y reglas;
- actores, casos de uso y relaciones;
- flujo principal y alternativo sin conexión;
- modelo de análisis y diseño;
- Pila, Cola y trazabilidad;
- POO y polimorfismo;
- DER, claves y normalización;
- arquitectura TCP/IP y cálculos;
- integración oral de las cinco materias.

No se asigna una nota al Caso integrador 1.

---

## Pendientes prioritarios

1. Completar la evaluación y defensa específicas del Día 9.
2. Escribir Java completo con `isBlank`, validación que detenga el flujo, `@Override` y `toString()` real.
3. Automatizar la diferencia entidad asociativa/entidad débil.
4. Consolidar secuencia sin conexión: `cabecera → envío → confirmación → trazabilidad → desencolar`.
5. Practicar claves y cardinalidades de `EJECUCION_OT` y `SOLICITUD_PENDIENTE`.
6. Declarar supuestos tecnológicos coherentes en Comunicaciones.
7. Profundizar relaciones UML, DCL/TCL y algoritmos de ordenación.

---

## Próxima acción

**Domingo 16/08/2026 — recuperación opcional**

```text
Recuperar EFIP — 2026-08-16 — completar Día 9
```

También es válido tomar descanso completo. El cierre semanal ya está realizado y no depende de rendir el examen semanal de 100 puntos.
