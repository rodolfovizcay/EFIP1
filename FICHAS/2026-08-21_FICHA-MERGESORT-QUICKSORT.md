# Ficha — Mergesort y Quicksort

## Núcleo común

```text
divide y vencerás
→ dividir
→ resolver subproblemas
→ terminar en caso base
```

## Mergesort

```text
divide en mitades
→ ordena cada mitad
→ mezcla mitades ordenadas
```

- caso base: tamaño `0` o `1`;
- tiempo: `O(n log n)` en los tres casos principales;
- memoria auxiliar clásica: `O(n)`;
- estable si el empate favorece a la mitad izquierda;
- resultado intermedio clave: dos mitades ordenadas antes de mezclar.

## Quicksort

```text
elige pivote
→ particiona
→ ordena partición izquierda
→ ordena partición derecha
```

- caso base: partición de tamaño `0` o `1`;
- promedio esperado: `O(n log n)`;
- peor caso: `O(n²)`;
- usualmente no estable;
- la selección de pivote influye en el equilibrio;
- una traza debe declarar pivote y esquema de partición.

## Diferencias críticas

| Pregunta | Mergesort | Quicksort |
|---|---|---|
| Operación central | mezcla | partición |
| Peor caso | `O(n log n)` | `O(n²)` |
| Memoria | auxiliar lineal | pila y, según versión, sin arreglo auxiliar |
| Estabilidad habitual | sí | no |
| Sensibilidad al pivote | no usa | alta |

## Errores a evitar

- confundir punto medio con pivote;
- afirmar que Mergesort usa `O(1)` de memoria;
- afirmar que Quicksort siempre es `O(n log n)`;
- omitir el caso base;
- llamar «mezcla» a la partición;
- dar una traza de Quicksort sin indicar la estrategia.
