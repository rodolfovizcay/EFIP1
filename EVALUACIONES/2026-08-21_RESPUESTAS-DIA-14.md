# Respuestas modelo — Evaluación Día 14

**No atribuir estas respuestas al estudiante.**

---

# 1. División y conquista

Divide un problema en subproblemas, los resuelve y combina el resultado. En ambos algoritmos, el caso base es una sección de tamaño 0 o 1.

# 2. Mergesort

```text
[6,3,8,5] | [2,7,4,1]
[6,3] [8,5] | [2,7] [4,1]
[6] [3] [8] [5] | [2] [7] [4] [1]

[3,6] [5,8] | [2,7] [1,4]
[3,5,6,8] | [1,2,4,7]
[1,2,3,4,5,6,7,8]
```

# 3. Quicksort conceptual con pivote 6

```text
menores → [3,5,2,4,1]
pivote  → [6]
mayores → [8,7]
final   → [1,2,3,4,5,6,7,8]
```

Los estados internos dependen del esquema de partición; la respuesta debe declarar la estrategia.

# 4. Comparación

- Mergesort: `O(n log n)` en mejor/promedio/peor; auxiliar `O(n)`; estable en la versión habitual.
- Quicksort: promedio esperado `O(n log n)` y peor `O(n²)`; puede trabajar in-place con pila recursiva; no garantiza estabilidad.

# 5. Bloque

- `DECLARE`: variables, constantes y objetos locales.
- `BEGIN`: sentencias ejecutables.
- `EXCEPTION`: tratamiento de errores.
- `END`: final del bloque.

# 6. Procedimiento y función

El procedimiento realiza una acción, por ejemplo asignar un trabajo. La función devuelve un valor, por ejemplo la cantidad de pendientes de un sector.

# 7. Cursor

```text
DECLARE → OPEN → FETCH repetido → CLOSE
```

El bucle permite recuperar y procesar cada fila hasta detectar el final.

# 8. Trigger

Evento: `INSERT`, `UPDATE` o `DELETE`. Momento: `BEFORE` o `AFTER`. `FOR EACH ROW` ejecuta el cuerpo por cada fila afectada. Beneficio: historial automático. Riesgo: lógica implícita difícil de detectar o duplicada.

# 9. Integración

Un algoritmo estable conserva el orden de registro entre prioridades iguales. La asignación cambia estado dentro de una transacción y el trigger registra el historial en la misma operación. Así, la presentación local y el estado central mantienen reglas coherentes, aunque estabilidad y atomicidad resuelven problemas diferentes.
