# Código Java — Mergesort y Quicksort

Archivo ejecutable:

```text
CODIGO/DemoDia14.java
```

Ejecución en modo de archivo fuente:

```bash
java CODIGO/DemoDia14.java
```

## Decisiones explícitas

- Mergesort reutiliza un único arreglo auxiliar de tamaño `n`.
- La comparación `<=` elige primero la mitad izquierda en caso de empate.
- Quicksort usa partición de Lomuto.
- El pivote de cada partición es el último elemento.
- La función `verificar` compara el resultado con un arreglo esperado.

## Preguntas de defensa

1. ¿Cuál es el caso base de cada algoritmo?
2. ¿Por qué Mergesort necesita `auxiliar`?
3. ¿Qué garantiza `mezclar` antes de comenzar?
4. ¿Qué representa `posicionPivote`?
5. ¿Por qué el peor caso de Quicksort puede ser cuadrático?
6. ¿Este Quicksort garantiza estabilidad?
7. ¿La ejecución preparatoria demuestra que el estudiante domina el código?

Respuesta a la última: no. Solo valida el material preparado.
