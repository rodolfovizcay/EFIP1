# Resultados — Evaluación Día 11

## Java complementario + Listas avanzadas + SQL

**Fecha:** 18/08/2026<br>
**Estado:** **APROBADO**<br>
**Resultado:** **9,2/10**<br>
**Recuperación oral posterior:** completada, sin alterar la nota original

---

# 1. Resultado por parte

| Parte | Máximo | Obtenido |
|---|---:|---:|
| A — Java | 3,00 | **2,50** |
| B — Listas avanzadas | 3,00 | **2,80** |
| C — SQL | 3,00 | **2,90** |
| D — Integración y SOLID | 1,00 | **1,00** |
| **Total** | **10,00** | **9,20** |

---

# 2. Corrección detallada

## Parte A — Java — 2,50/3,00

| Consigna | Máximo | Obtenido | Observación |
|---|---:|---:|---|
| Arreglo y `ArrayList` | 0,50 | 0,45 | Tamaño, índices, tipos y desplazamiento correctos; faltó precisar acceso fuera de rango y costo amortizado al crecer. |
| Igualdad | 0,75 | 0,70 | `==`, `equals()` y contrato con `hashCode()` comprendidos; la identidad por `id` requirió recuperación previa. |
| Excepciones | 1,25 | 0,85 | Flujo general correcto; se generalizó indebidamente la obligación de `throws` y el fallo de unchecked. |
| JVM | 0,50 | 0,50 | Recorrido, JVM por plataforma y límites de portabilidad correctamente explicados. |

## Parte B — Listas avanzadas — 2,80/3,00

| Consigna | Máximo | Obtenido | Observación |
|---|---:|---:|---|
| Comparación | 1,00 | 0,85 | Enlaces, finales, ventajas y riesgos correctos; la lista ordenada permite corte temprano, pero una lista enlazada sigue teniendo búsqueda `O(n)` en el peor caso. |
| Enlaces dobles | 1,00 | 1,00 | Cuatro asignaciones correctas y orden seguro. |
| Circular e iterador | 1,00 | 0,95 | Condición de vuelta, `hasNext()`, `next()` y `remove()` correctos; faltó nombrar `ConcurrentModificationException`. |

## Parte C — SQL — 2,90/3,00

| Consigna | Máximo | Obtenido | Observación |
|---|---:|---:|---|
| Familias | 0,75 | 0,75 | DDL, DML, TCL y DCL correctamente clasificadas. |
| Consulta | 0,75 | 0,75 | Proyección, filtro y orden múltiple correctos. |
| Cambios seguros | 1,50 | 1,40 | `INSERT`, verificaciones, `UPDATE` y `DELETE` correctos; omitir `WHERE` afecta todas las filas y la recuperabilidad depende de transacción o respaldo. |

## Parte D — Integración y SOLID — 1,00/1,00

- SRP aplicado a la separación de validación, persistencia, sincronización y menú.
- DIP aplicado mediante dependencia de `IRepositorio` y no de PostgreSQL concreto.
- Validación en Java justificada por detección temprana.
- Restricciones de base justificadas por integridad ante cualquier vía de ingreso.

---

# 3. Evidencia previa a la evaluación

| Actividad | Resultado observado |
|---|---:|
| Recuperación inicial | **11/12** |
| Arreglo frente a `ArrayList` | **4/4** |
| Igualdad, recuperación | **3/3** |
| Casos de compilación de excepciones | **4/4** |
| JVM | **3/4** |
| Flujo de excepción | **4/4** |
| Lista doble | **4/5**, luego complejidades **3/3** |
| Lista circular | **4/5**, luego recuperación **2/2** |
| Lista ordenada | **5/5** |
| Iterador | **6/6** |
| Familias SQL | **9/9** |
| Restricciones SQL | **5/5** |
| Caso integrador | **7/8** |
| SOLID | **5/5** |

Estos resultados son controles formativos y no se promedian nuevamente con la evaluación final.

---

# 4. Recuperación oral de excepciones

Después de informar la nota se solicitó una explicación oral de checked/unchecked y `throw`/`throws`.

La idea central fue recuperada. Se incorporaron dos precisiones finales:

```text
la obligación de capturar o declarar se aplica a checked
una unchecked solo interrumpe si ocurre y queda sin capturar
```

Estado: **comprendido, con recuperación espaciada recomendada**.

---

# 5. Fortalezas

1. SQL completo y seguro, con sintaxis ejecutable.
2. Enlaces de listas dobles y recorridos circulares.
3. Selección de estructuras y complejidades de recorridos.
4. JVM y límites reales de la portabilidad.
5. Aplicación concreta de SRP y DIP.
6. Validación complementaria entre aplicación y base de datos.

---

# 6. Puntos para retención

1. `throw` lanza; `throws` declara posible propagación.
2. Checked obliga a capturar o declarar; unchecked no impone esa obligación al compilador.
3. Dos objetos con el mismo identificador pueden ser iguales aunque sean instancias distintas.
4. Si `equals()` es verdadero, los `hashCode()` deben coincidir; la inversa no es obligatoria.
5. En una lista circular de un nodo, `siguiente` apunta al propio nodo.
6. Con las referencias ya disponibles, enlazar o desenlazar es `O(1)`; localizar el punto puede ser `O(n)`.
7. `UPDATE` o `DELETE` sin `WHERE` afecta todas las filas alcanzadas.

---

# 7. Decisión

El Día 11 queda **cerrado y aprobado** con **9,2/10**. La recuperación oral posterior mejora la precisión de excepciones, pero no modifica retroactivamente la nota.
