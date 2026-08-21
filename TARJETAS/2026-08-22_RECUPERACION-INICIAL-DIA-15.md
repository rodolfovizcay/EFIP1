# Recuperación inicial — Día 15

**Fecha:** 22/08/2026
**Uso:** control de retención del Día 14 y redes previas.

## Preguntas

1. ¿Cuál es la operación central de Mergesort?
2. ¿Cuál es el caso base?
3. ¿Qué memoria auxiliar usa el Mergesort clásico?
4. ¿Qué función cumple el pivote en Quicksort?
5. ¿Cuál es el peor caso temporal de Quicksort?
6. Diferenciá procedimiento y función.
7. Ordená `FETCH, OPEN, CLOSE, DECLARE`.
8. ¿Qué activa un trigger?
9. ¿Qué dirección aprende un switch?
10. ¿Qué dirección consulta para decidir la salida?
11. ¿Qué diferencia esencial existe entre bucle L2 y bucle de routing?
12. Si el servidor está en otra red, ¿a qué MAC se dirige la primera trama?

## Clave

1. Mezclar dos mitades ordenadas.
2. Subarreglo de tamaño 0 o 1.
3. `O(n)`.
4. Separar valores en particiones.
5. `O(n²)`.
6. Procedimiento ejecuta una acción; función devuelve un valor.
7. `DECLARE → OPEN → FETCH → CLOSE`.
8. Un evento `INSERT`, `UPDATE` o `DELETE` sobre la tabla asociada.
9. MAC de origen.
10. MAC de destino.
11. L2 repite tramas sin TTL; routing repite paquetes y el TTL termina descartándolos.
12. A la MAC de la puerta de enlace.

## Umbral

```text
10–12 → comenzar redes
7–9   → recuperar solo los errores
0–6   → 25 minutos de recuperación antes de subneteo
```
