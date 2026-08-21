# Estado preparado — EFIP I — Día 14

**Fecha académica prevista:** 21/08/2026
**Jornada:** Mergesort/Quicksort + SQL procedimental
**Estado:** **PREPARADO — NO INICIADO**
**Día 13:** cerrado y aprobado con refuerzo pendiente — **8,0/10**

---

# 1. Regla de integridad académica

```text
material preparado ≠ contenido estudiado
respuesta modelo ≠ respuesta del estudiante
ejecución preparatoria ≠ evidencia autónoma
```

No se actualizan todavía:

- `03-ESTADO-ACTUAL.md`;
- `04-MATRIZ-DE-PROGRESO.md`;
- `05-REGISTRO-DIARIO.md`;
- `06-ERRORES-Y-RECUPERACIONES.md`;
- `99-MANIFIESTO-CIERRE.md`.

---

# 2. Decisión de alcance

El plan anterior reunía Mergesort, Quicksort, SQL procedimental y redes en una sola jornada. Ese alcance no es defendible en 5,5 horas con práctica y evaluación.

```text
21/08 → algoritmos recursivos + SQL procedimental
22/08 → redes + escrito del simulacro completo 1
23/08 → corrección + defensa + cierre de dos semanas intensivas
```

---

# 3. Objetivos verificables

Al finalizar el Día 14, el estudiante deberá poder:

1. explicar la estrategia «divide y vencerás»;
2. identificar caso base, división, recursión y combinación;
3. trazar Mergesort y justificar su memoria auxiliar;
4. trazar una partición de Quicksort declarando el pivote;
5. diferenciar mejor/promedio/peor caso;
6. comparar inserción, Shellsort, Mergesort y Quicksort;
7. reconocer las secciones de un bloque procedimental;
8. diferenciar procedimiento y función;
9. ordenar el ciclo `DECLARE → OPEN → FETCH → CLOSE`;
10. explicar evento, momento y granularidad de un trigger;
11. integrar ordenación, persistencia e historial en SIGO.

---

# 4. Estado de entrada

| Área | Evidencia disponible | Brecha del Día 14 |
|---|---|---|
| Estructuras | inserción y Shellsort resueltos con apoyo | Mergesort, Quicksort y autonomía en complejidades |
| Base de Datos | SQL avanzado, TCL y ACID aplicados con apoyo | bloques, rutinas, cursores y triggers |
| POO/Java | clases, excepciones y archivos comprendidos | ejecución autónoma de código recursivo |
| Comunicaciones | HDLC/PPP/Ethernet y bucles recuperados con apoyo | retención breve; desarrollo principal pasa al Día 15 |

Errores que reaparecen como control espaciado:

```text
E-005 — complejidades de ordenación
E-063 — HDLC/PPP/Ethernet
E-065 — bucle L2 frente a routing
E-066 — excepción esperada en una prueba negativa
E-067 — recorrido Shellsort por subsecuencias
```

---

# 5. Umbral inicial

```text
10–12 correctas → avanzar
7–9 correctas   → recuperación selectiva de 15 min
0–6 correctas   → recuperación dirigida de 25 min
```

Los errores E-005, E-066 y E-067 se corrigen antes de iniciar algoritmos recursivos si reaparecen.

---

# 6. Productos preparados

- guía ampliada del Día 14;
- recuperación inicial con clave;
- ficha comparativa Mergesort/Quicksort;
- ficha de SQL procedimental;
- demostración Java ejecutable;
- práctica MySQL 8;
- caso integrador SIGO;
- evaluación de 10 puntos y respuestas modelo;
- resumen guiado;
- plantilla de cierre;
- manifiesto de preparación.

---

# 7. Trazabilidad de fuentes

## Respaldado por los materiales

- Mergesort, recursividad, mezcla y complejidad `O(n log n)`;
- Quicksort, pivote, partición y análisis de complejidad;
- PL/SQL como lenguaje de bloques;
- procedimientos, funciones, control de flujo, cursores y triggers en MySQL.

## Complemento técnico delimitado

- estabilidad comparativa;
- costos auxiliares precisos;
- prueba automatizada mínima del código Java;
- aplicación de rutinas y triggers al caso SIGO.

---

# 8. Inicio

```text
Comenzar Día 14
```

La primera evidencia será la recuperación inicial respondida sin consultar la clave.
