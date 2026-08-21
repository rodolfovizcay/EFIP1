# Día 14 — Mergesort, Quicksort y SQL procedimental

**Fecha:** 21/08/2026
**Duración núcleo:** 5,5 horas
**Estado:** **CERRADO Y APROBADO CON RECUPERACIÓN SELECTIVA**
**Corrección técnica:** **9,80/10,00**
**Nota académica:** **8,0/10 — resolución asistida**

---

# 1. Propósito

La jornada trabaja dos formas de automatizar procesamiento:

```text
algoritmo recursivo → divide y ordena datos
programa almacenado → ejecuta lógica próxima a los datos
```

El objetivo no es memorizar código, sino poder justificar divisiones, casos base, efectos y costos.

---

# 2. Cronograma

| Bloque | Duración | Producto |
|---|---:|---|
| Recuperación inicial | 20 min | 12 respuestas |
| M1 — Mergesort | 45 min | árbol de división + mezclas |
| M1 — Quicksort | 45 min | particiones con pivote |
| Pausa | 10–15 min | — |
| M2 — comparación | 20 min | tabla de algoritmos |
| M2 — SQL procedimental | 80 min | bloque, rutina, cursor y trigger |
| Cierre de mañana | 20 min | explicación oral |
| Pausa larga | 45–60 min | — |
| T1 — aplicación | 50 min | Java + SQL + caso SIGO |
| T2 — evaluación | 50 min | evidencia de 10 puntos |

Los bloques de trabajo suman `330 minutos = 5,5 horas`. Las pausas no se cuentan dentro del núcleo.

Si falta tiempo, se conserva la traza de ambos algoritmos, procedimiento/función, cursor, trigger y evaluación. Las ampliaciones quedan para recuperación.

---

# 3. Recuperación inicial

Usar `TARJETAS/2026-08-21_RECUPERACION-INICIAL-DIA-14.md`.

Reglas:

1. responder sin apuntes;
2. no corregir durante la ejecución;
3. comparar con la clave al terminar;
4. registrar errores reales, no dudas hipotéticas.

---

# 4. Mergesort

## 4.1 Idea

Mergesort aplica «divide y vencerás»:

1. divide el arreglo en dos mitades;
2. ordena recursivamente cada mitad;
3. mezcla las dos mitades ya ordenadas.

Caso base:

```text
subarreglo de 0 o 1 elemento → ya está ordenado
```

## 4.2 Traza

Arreglo:

```text
[38, 27, 43, 3, 9, 82, 10, 5]
```

División:

```text
[38,27,43,3] | [9,82,10,5]
[38,27] [43,3] | [9,82] [10,5]
[38] [27] [43] [3] | [9] [82] [10] [5]
```

Mezcla:

```text
[27,38] [3,43] | [9,82] [5,10]
[3,27,38,43] | [5,9,10,82]
[3,5,9,10,27,38,43,82]
```

## 4.3 Propiedades

- tiempo en mejor, promedio y peor caso: `O(n log n)`;
- memoria auxiliar típica: `O(n)`;
- recursión: profundidad `O(log n)`;
- estabilidad: sí, si al empatar se toma primero el elemento de la mitad izquierda.

No es correcto afirmar que trabaja siempre con memoria `O(1)`.

---

# 5. Quicksort

## 5.1 Idea

Quicksort:

1. elige un pivote;
2. particiona los valores respecto del pivote;
3. ordena recursivamente las particiones;
4. termina cuando cada partición tiene 0 o 1 elemento.

La implementación debe declarar qué método de partición y qué pivote utiliza. Sin esa información, una traza puede producir estados intermedios distintos y seguir siendo correcta.

## 5.2 Traza conceptual

Arreglo:

```text
[7, 4, 2, 9, 12, 5, 10, 11]
```

Con pivote conceptual `7`:

```text
menores → [4,2,5]
pivote  → [7]
mayores → [9,12,10,11]
```

Aplicando recursión:

```text
[2,4,5] + [7] + [9,10,11,12]
→ [2,4,5,7,9,10,11,12]
```

## 5.3 Propiedades

- mejor/promedio esperado: `O(n log n)`;
- peor caso: `O(n²)` cuando las particiones quedan muy desequilibradas;
- memoria: depende de la implementación; una versión in-place usa principalmente la pila recursiva;
- estabilidad: no se garantiza en la versión habitual;
- el pivote no «ordena solo»: permite separar el problema.

---

# 6. Comparación

| Algoritmo | Mejor | Promedio | Peor | Auxiliar | Estable |
|---|---:|---:|---:|---:|---|
| Inserción | `O(n)` | `O(n²)` | `O(n²)` | `O(1)` | sí |
| Shellsort | depende de gaps | depende de gaps | puede ser `O(n²)` | `O(1)` | no |
| Mergesort | `O(n log n)` | `O(n log n)` | `O(n log n)` | `O(n)` | sí, implementación habitual |
| Quicksort | `O(n log n)` | `O(n log n)` esperado | `O(n²)` | pila recursiva | no, habitual |

Decisión:

- datos pequeños o casi ordenados → inserción puede ser razonable;
- tiempo predecible y estabilidad → Mergesort;
- buena localidad y rapidez promedio en arreglo → Quicksort;
- memoria auxiliar lineal prohibida → evitar Mergesort clásico.

---

# 7. SQL procedimental

Los ejemplos de práctica usan sintaxis MySQL 8. No se debe mezclarla sin aclaración con PL/SQL de Oracle.

## 7.1 Bloque

PL/SQL organiza un bloque en:

```text
DECLARE   → declaraciones
BEGIN     → sentencias ejecutables
EXCEPTION → tratamiento de errores
END       → cierre
```

MySQL también usa bloques `BEGIN ... END` en programas almacenados, pero su sintaxis de variables y errores es diferente.

## 7.2 Procedimiento y función

| Objeto | Propósito |
|---|---|
| procedimiento | realizar una acción; puede recibir parámetros y modificar datos |
| función | calcular y devolver un valor |

Una función no es simplemente «un procedimiento más corto». Su contrato principal es devolver un resultado y suele tener restricciones adicionales.

## 7.3 Cursor

Un cursor permite procesar fila por fila el resultado de un `SELECT` con múltiples filas.

```text
DECLARE → OPEN → FETCH repetido → CLOSE
```

No debe usarse si una única sentencia SQL por conjuntos resuelve el problema con claridad y eficiencia.

## 7.4 Trigger

Un trigger:

- está asociado a una tabla;
- se activa ante `INSERT`, `UPDATE` o `DELETE`;
- puede ejecutarse `BEFORE` o `AFTER`;
- en MySQL suele actuar `FOR EACH ROW`.

Riesgo: introduce lógica implícita. Debe documentarse y evitar duplicar reglas que ya se controlan en otro nivel sin una decisión explícita.

---

# 8. Actividades

## M1 — Algoritmos

1. Trazar Mergesort sobre `[6, 3, 8, 5, 2, 7, 4, 1]`.
2. Trazar la primera partición de Quicksort sobre el mismo arreglo con pivote `6`.
3. Explicar por qué Mergesort necesita mezclar.
4. Construir un caso que lleve Quicksort a particiones desequilibradas.

## M2 — SQL procedimental

Para SIGO:

1. diseñar un procedimiento que asigne un trabajo;
2. diseñar una función que cuente pendientes de un sector;
3. ordenar los pasos de un cursor que recorra trabajos vencidos;
4. diseñar un trigger que rechace prioridades fuera de `1..5`;
5. justificar qué regla conviene resolver con restricción `CHECK` y cuál requiere historial.

## T1 — Integración

Resolver `CASOS/2026-08-21_CASO-INTEGRADOR-ORDENACION-SQL-PROCEDIMENTAL.md` y ejecutar `CODIGO/DemoDia14.java`.

---

# 9. Criterios de avance

Se avanza al Día 15 si:

- ambas trazas terminan correctamente;
- se distingue pivote de punto medio;
- se justifica `O(n)` auxiliar de Mergesort;
- se explica el peor caso de Quicksort;
- se diferencian procedimiento, función, cursor y trigger;
- la evaluación alcanza al menos `7/10`.

Una respuesta asistida puede ser técnicamente correcta, pero no se registra como dominio autónomo.

---

# 10. Cierre real de la jornada

## Evidencia obtenida

- recuperación inicial: `11/12` respuestas correctas o aceptables; Ethernet/STP quedó parcial;
- Mergesort: división, mezclas, estabilidad y complejidad trabajadas;
- Quicksort: partición completa, recursión, casos de complejidad y pila trabajados;
- SQL procedimental: procedimiento, función, cursor y trigger explicados;
- caso SIGO: orden estable, trabajo offline, sincronización, transacción e historial integrados;
- evaluación final: corrección técnica `9,80/10,00`;
- nota académica: `8,0/10` por resolución asistida.

## Límites

- no hubo evidencia documentada de ejecución autónoma de `DemoDia14.java`;
- no hubo evidencia documentada de ejecución del script MySQL;
- la respuesta final omitió la pila `O(n)` de Quicksort en el peor caso;
- casos base, costo por nivel y algunas características SQL requirieron corrección guiada.

## Decisión

```text
Día 14 = cerrado
Estado = aprobado con recuperación selectiva
Avance al Día 15 = habilitado
Dominio autónomo completo = no demostrado
```
