# Errores y recuperaciones — Día 14

**Fecha:** 21/08/2026

## Pasaron de corregidos a consolidados

| Código | Tema | Evidencia |
|---|---|---|
| E-005 | Complejidades de ordenación | recuperación inicial correcta sobre mejor/peor caso de inserción y dependencia de gaps |
| E-065 | Bucle L2 frente a routing | redundancia, broadcast, STP y TTL diferenciados en recuperación espaciada |
| E-066 | Excepción esperada | se indicó correctamente que la prueba pasa si ocurre la excepción esperada |
| E-067 | Shellsort por subsecuencias | recorrido hacia atrás `6→4→2→0` explicado correctamente |

## Nuevos errores corregidos

| Código | Tema | Error observado | Regla corregida |
|---|---|---|---|
| E-068 | Caso base de Mergesort | se ubicó el caso base en el nivel con pares | el caso base es una porción de tamaño 0 o 1; en la traza de ocho elementos se alcanza en el nivel 3 |
| E-069 | Complejidad de Mergesort | se justificó el trabajo `O(n)` por nivel mediante la memoria de la mezcla final | por nivel se procesan en conjunto `n` elementos; la memoria auxiliar `O(n)` es un costo espacial diferente |
| E-070 | Caso base de Quicksort | se propuso detener con dos o tres elementos | el caso base habitual es una partición de tamaño 0 o 1 |
| E-071 | Quicksort: profundidad, tiempo y memoria | se confundió el costo temporal con la profundidad y se atribuyó la memoria recursiva a Mergesort | equilibrado: profundidad `O(log n)` y tiempo `O(n log n)`; peor: profundidad/pila `O(n)` y tiempo `O(n²)` |
| E-072 | Procedimiento y retorno | se respondió que devuelve obligatoriamente si tiene parámetro `OUT` | un procedimiento no tiene como contrato obligatorio devolver un valor; puede comunicar resultados mediante `OUT` o conjuntos, según el dialecto |
| E-073 | `READS SQL DATA` | se interpretó como permiso de lectura | declara la característica de acceso a datos de la función; los permisos se administran con privilegios como `GRANT` |

## Abiertos conservados

```text
E-016 — Java completo
E-039 — asociativa frente a débil
E-045 — digitalización, política y supuestos
E-050 — modelo relacional final
```

## Criterio de cierre

La jornada se aprueba con `8,0/10`. Los seis errores nuevos quedan corregidos, no consolidados, porque la recuperación fue guiada y la evaluación final fue asistida.
