# Respuestas del estudiante — Evaluación Día 14

**Fecha:** 21/08/2026
**Condición real:** resolución asistida durante la jornada
**Integridad:** este archivo conserva la respuesta finalmente entregada; no equivale a evidencia autónoma.

---

# 1. División y conquista

Se definió la estrategia como dividir el problema en subproblemas, resolverlos y combinar sus resultados.

- Mergesort: dividir por mitades hasta subarreglos de un elemento y luego mezclar.
- Quicksort: elegir pivote, particionar y aplicar recursión sobre las particiones.
- Caso base indicado para Quicksort: porción de cero o un elemento.

# 2. Traza de Mergesort

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
menores       → [3,5,2,4,1]
pivote/iguales → [6]
mayores       → [8,7]
resultado     → [1,2,3,4,5,6,7,8]
```

# 4. Comparación

| Aspecto | Mergesort | Quicksort |
|---|---|---|
| Mejor | `O(n log n)` | `O(n log n)` |
| Promedio | `O(n log n)` | `O(n log n)` |
| Peor | `O(n log n)` | `O(n²)` |
| Memoria | `O(n)` | normalmente `O(log n)` por recursión en una versión in-place |
| Estabilidad | sí, tomando primero la izquierda al empatar | no, habitualmente |

La respuesta no explicitó que la pila recursiva de Quicksort puede crecer hasta `O(n)` en el peor caso.

# 5. Bloque procedimental

- `DECLARE`: declaraciones.
- `BEGIN`: sección ejecutable.
- `EXCEPTION`: tratamiento de excepciones.
- `END`: final del bloque.

Se identificó correctamente como estructura de PL/SQL de Oracle.

# 6. Procedimiento y función

- procedimiento: realiza una acción, por ejemplo asignar un trabajo;
- función: calcula y devuelve un valor, por ejemplo contar pendientes de un sector.

# 7. Cursor

```text
DECLARE → OPEN → FETCH repetido → CLOSE
```

Se explicó que `FETCH` obtiene una fila por vez y debe repetirse hasta terminar el conjunto.

# 8. Trigger

Se identificaron:

- eventos `INSERT`, `UPDATE` y `DELETE`;
- momentos `BEFORE` y `AFTER`;
- ejecución por fila mediante `FOR EACH ROW`;
- beneficio: automatización del historial;
- riesgo: lógica implícita y efectos secundarios difíciles de mantener.

# 9. Integración

Se relacionó:

```text
prioridades iguales
→ ordenamiento estable
→ conservación del orden original
→ asignación mediante UPDATE
→ registro de historial
→ COMMIT o ROLLBACK
```

La estabilidad protege el orden relativo; la atomicidad evita confirmar el cambio de estado sin su historial.

---

# Observación de autonomía

La respuesta final es técnicamente correcta, pero fue construida después de explicaciones, correcciones y ejercicios guiados. No se registra como dominio autónomo completo.
