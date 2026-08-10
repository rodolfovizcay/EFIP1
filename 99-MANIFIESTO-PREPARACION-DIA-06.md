# Manifiesto — Preparación del Día 6

**Fecha preparada:** 11/08/2026  
**Jornada:** Requisitos + Pilas + OSI/TCP-IP  
**Estado:** material listo para iniciar; jornada todavía no evaluada

---

## Archivos incluidos

1. `03-ESTADO-ACTUAL-PREPARADO-DIA-06.md`
2. `DIAS/2026-08-11_DIA-06_REQUISITOS-PILAS-OSI-TCPIP.md`
3. `RESUMENES/2026-08-11_RESUMEN-GUIADO-DIA-06.md`
4. `PLANTILLAS/2026-08-11_PLANTILLA-REQUERIMIENTOS.md`
5. `FICHAS/2026-08-11_FICHA-PILA.md`
6. `FICHAS/2026-08-11_TABLA-OSI-TCPIP.md`
7. `CASOS/2026-08-11_CASO-INTEGRADOR-REQUISITOS-PILA-COMUNICACION.md`
8. `EVALUACIONES/2026-08-11_EVALUACION-DIA-06.md`
9. `EVALUACIONES/2026-08-11_RESPUESTAS-DIA-06.md`
10. `RESUMENES/2026-08-11_CIERRE-DIA-06.md`
11. `99-MANIFIESTO-PREPARACION-DIA-06.md`

---

## Plan maestro respetado

### Mañana M1 — Análisis y Diseño

- ingeniería de requerimientos;
- elicitación, especificación y validación;
- RF y RNF;
- características de calidad.

### Mañana M2 — Estructuras

- pila;
- LIFO;
- vector y lista enlazada;
- operaciones.

### Cierre de mañana

- simulación de pila.

### Tarde T1 — Comunicaciones

- OSI;
- TCP/IP;
- comparación;
- encapsulamiento;
- PDU.

### Tarde T2

- preguntas orales;
- corrección;
- resumen.

### Productos

- plantilla de requerimientos;
- ficha de pila;
- tabla OSI–TCP/IP.

---

## Fuentes declaradas

- `02-PLAN-MAESTRO-HASTA-03-09.md`.
- `Analisis_y_Diseno_de_Software.md`.
- `Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md`.
- `COMUNICACIONES.md`.
- estado, matrices, resultados y errores acumulados hasta el Día 5.

---

## Decisiones de alcance

- Se conserva el foco exacto del plan para el 11/08.
- Se incorporan recuperaciones breves del Día 5.
- Se integra el caso `deshacer última modificación no confirmada` para conectar las tres materias.
- No se adelantan como bloques principales casos de uso detallados, herencia, colas, DER, normalización ni transmisión física.
- TCP/IP se presenta como arquitectura/pila según el material.
- PDU se expresa como `SDU + PCI` y como `datos + información de control`.
- La pila se trabaja como TDA con interfaz común e implementaciones vector/enlazada.
- Los archivos de evaluación y cierre permanecen sin nota ni estado inventado.

---

## Recuperaciones incorporadas

- TDA e interfaz independiente de implementación.
- Constructor Java.
- Fases frente a flujos del PUD.
- Iteración frente a ciclo completo.
- PDU frente a PUD.
- TCP/IP como arquitectura/pila.
- Síncrona frente a asíncrona.

---

## Validación documental

- [x] Estado preparado separado del estado canónico.
- [x] Guía operativa.
- [x] Resumen guiado.
- [x] Tres productos obligatorios del plan.
- [x] Caso integrado.
- [x] Evaluación escrita + oral.
- [x] Plantilla de respuestas.
- [x] Plantilla de cierre.
- [x] Fuentes declaradas.
- [x] Alcance de jornadas posteriores preservado.

---

## Regla de publicación

Este PR prepara la jornada. No modifica `03-ESTADO-ACTUAL.md`, la matriz canónica ni el registro acumulado porque todavía no existe evidencia de evaluación del Día 6.

Después de completar la jornada deberán agregarse:

- respuestas reales;
- resultados;
- errores y recuperaciones;
- matriz específica;
- cierre;
- actualización del estado canónico.

---

## Comando de inicio

> **Iniciar EFIP — 2026-08-11 — Día 6**
