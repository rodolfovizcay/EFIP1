# Ficha — Ordenación por inserción y Shellsort

**Fecha:** 20/08/2026
**Estado:** material preparado

---

# 1. Conceptos previos

Ordenar significa reorganizar elementos según una clave y un orden definido.

```text
entrada:  30, 10, 20, 50, 40, 20
salida:   10, 20, 20, 30, 40, 50
criterio: valor ascendente
```

Aspectos para comparar algoritmos:

- tiempo en mejor, promedio y peor caso;
- memoria adicional;
- estabilidad;
- comportamiento con datos ya o casi ordenados;
- tamaño de la entrada;
- secuencia de incrementos, en Shellsort.

**Estable** significa que dos elementos con igual clave conservan su orden relativo original.

---

# 2. Inserción directa

## Idea

Recorre desde el segundo elemento. En cada posición `i`, toma una clave y la inserta en el lugar correcto dentro del tramo izquierdo, que ya está ordenado.

```text
ordenado | pendiente
[0..i-1] | [i..n-1]
```

## Pseudocódigo

```text
para i desde 1 hasta n-1
    clave = a[i]
    j = i - 1

    mientras j >= 0 y a[j] > clave
        a[j + 1] = a[j]
        j = j - 1

    a[j + 1] = clave
```

## Traza

```text
inicio  [30, 10, 20, 50, 40, 20]
i=1     [10, 30, 20, 50, 40, 20]
i=2     [10, 20, 30, 50, 40, 20]
i=3     [10, 20, 30, 50, 40, 20]
i=4     [10, 20, 30, 40, 50, 20]
i=5     [10, 20, 20, 30, 40, 50]
```

## Complejidad y propiedades

| Aspecto | Inserción directa |
|---|---|
| mejor caso | `O(n)` |
| promedio | `O(n²)` |
| peor caso | `O(n²)` |
| memoria adicional | `O(1)` |
| estable | sí, si se desplaza solo con `>` |
| favorable | entradas pequeñas o parcialmente ordenadas |

No confundir acceso `O(1)` al arreglo con costo total del ordenamiento: puede haber una cantidad cuadrática de comparaciones/desplazamientos.

---

# 3. Shellsort

## Idea

Generaliza inserción. Primero ordena grupos de elementos separados por un `gap`; reduce ese salto hasta llegar a `1`.

```text
n = 6
gaps por mitades: 3, 1
```

Con `gap = 3`, se relacionan conceptualmente:

```text
índices 0,3
índices 1,4
índices 2,5
```

Después, `gap = 1` ejecuta una inserción sobre un arreglo más ordenado.

## Pseudocódigo

```text
para gap = n/2; gap > 0; gap = gap/2
    para i desde gap hasta n-1
        temporal = a[i]
        j = i

        mientras j >= gap y a[j-gap] > temporal
            a[j] = a[j-gap]
            j = j-gap

        a[j] = temporal
```

## Traza por pasada

Para el vector del ejemplo:

```text
inicio  [30, 10, 20, 50, 40, 20]
gap=3   [30, 10, 20, 50, 40, 20]
gap=1   [10, 20, 20, 30, 40, 50]
```

La primera pasada no cambia este caso particular; sigue siendo válida. Para apreciar el salto, usar también:

```text
inicio  [50, 40, 30, 20, 10, 0]
gap=3   [20, 10, 0, 50, 40, 30]
gap=1   [0, 10, 20, 30, 40, 50]
```

## Complejidad y propiedades

- usa memoria adicional `O(1)` en la versión sobre arreglo;
- normalmente no es estable porque los saltos pueden cambiar el orden relativo de iguales;
- suele mejorar a inserción para entradas moderadas al reducir desplazamientos largos;
- su tiempo depende fuertemente de la secuencia de incrementos;
- para la secuencia académica de mitades, el material trabaja un peor caso cuadrático;
- no debe etiquetarse universalmente como `O(n log n)`.

---

# 4. Comparación

| Criterio | Inserción | Shellsort |
|---|---|---|
| movimiento inicial | posiciones contiguas | saltos grandes y luego pequeños |
| concepto central | prefijo ordenado | inserción con incrementos decrecientes |
| pasada final | no aplica | `gap = 1` |
| estabilidad habitual | sí | no |
| memoria adicional | `O(1)` | `O(1)` |
| entrada casi ordenada | muy favorable | favorable, con sobrecosto de pasadas |
| complejidad | mejor `O(n)`, peor `O(n²)` | depende de gaps; esquema estudiado con peor cuadrático |

---

# 5. Preguntas de defensa

1. ¿Qué invariante mantiene inserción antes de procesar `i`?
2. ¿Por qué guardar la clave antes de desplazar?
3. ¿Qué ocurre si la condición usa `>=` en vez de `>` con elementos iguales?
4. ¿Qué representa `gap`?
5. ¿Por qué `gap = 1` es indispensable en la secuencia estudiada?
6. ¿Por qué no existe una única complejidad de Shellsort sin indicar gaps?
7. ¿Qué algoritmo elegirías para diez elementos casi ordenados y por qué?

---

# 6. Errores frecuentes

- empezar inserción en `i = 0` sin necesidad;
- sobrescribir la clave antes de guardarla;
- desplazar hacia el lado incorrecto;
- olvidar escribir la clave en `j + 1`;
- reducir `gap` a cero antes de ejecutar la pasada `1`;
- comparar `a[j - 1]` en Shellsort en vez de `a[j - gap]`;
- afirmar que Shellsort es siempre estable;
- confundir “una operación de acceso” con el costo de ordenar todo el arreglo.
