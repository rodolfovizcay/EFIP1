# Código de apoyo — Inserción y Shellsort en Java

**Fecha:** 20/08/2026
**Archivo:** `CODIGO/DemoDia13.java`
**Estado:** ejemplo preparado; no constituye evidencia del estudiante

---

# 1. Ejecutar

Con Java que admita modo de archivo fuente:

```bash
java CODIGO/DemoDia13.java
```

O con compilación separada:

```bash
javac CODIGO/DemoDia13.java
java -cp CODIGO DemoDia13
```

Salida esperada:

```text
Original:   [30, 10, 20, 50, 40, 20]
Inserción:  [10, 20, 20, 30, 40, 50]
Shellsort:  [10, 20, 20, 30, 40, 50]
Verificado: ambos resultados están ordenados
```

---

# 2. Inserción: lectura línea por línea

```java
for (int i = 1; i < datos.length; i++) {
    int clave = datos[i];
    int j = i - 1;

    while (j >= 0 && datos[j] > clave) {
        datos[j + 1] = datos[j];
        j--;
    }

    datos[j + 1] = clave;
}
```

- `i = 1`: un solo elemento ya forma un tramo ordenado.
- `clave`: evita perder el elemento que se insertará.
- `datos[j] > clave`: desplaza los mayores y conserva estabilidad entre iguales.
- `datos[j + 1] = clave`: ocupa el hueco final.

Invariante:

```text
al comenzar cada vuelta de i, datos[0..i-1] está ordenado
```

---

# 3. Shellsort: lectura línea por línea

```java
for (int gap = datos.length / 2; gap > 0; gap /= 2) {
    for (int i = gap; i < datos.length; i++) {
        int temporal = datos[i];
        int j = i;

        while (j >= gap && datos[j - gap] > temporal) {
            datos[j] = datos[j - gap];
            j -= gap;
        }

        datos[j] = temporal;
    }
}
```

Es una inserción por saltos:

- compara con `j - gap`, no con `j - 1`;
- desplaza dentro del mismo grupo de separación;
- reduce el salto por mitades;
- termina con `gap = 1`.

---

# 4. Verificación incluida

`estaOrdenado` comprueba que cada par consecutivo cumpla:

```text
datos[i-1] <= datos[i]
```

Si no se cumple, `verificar` lanza `IllegalStateException`. Esta comprobación confirma una propiedad general del resultado, pero no reemplaza pruebas con casos variados, duplicados, vacío, un elemento, ya ordenado e inverso.

---

# 5. Actividades

1. Predecir la salida antes de ejecutar.
2. Agregar impresión después de cada vuelta de inserción.
3. Agregar impresión al terminar cada `gap` de Shellsort.
4. Probar `[]`, `[7]`, `[1,2,3]`, `[3,2,1]` y `[2,1,2,1]`.
5. Diseñar casos con resultado esperado antes de correrlos.
6. Explicar por qué `Arrays.sort` sería apropiado en producción, pero no sustituye el aprendizaje de los algoritmos.
