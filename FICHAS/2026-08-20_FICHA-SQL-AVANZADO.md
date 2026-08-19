# Ficha — SQL avanzado

**Fecha:** 20/08/2026
**Estado:** material preparado

---

# 1. Esquema de referencia

```text
SECTOR(
    id_sector PK,
    nombre UNIQUE
)

TRABAJO(
    id_trabajo PK,
    id_sector FK → SECTOR,
    descripcion,
    prioridad CHECK 1..5,
    estado
)
```

Alias recomendados:

```sql
FROM trabajo AS t
JOIN sector AS s ON s.id_sector = t.id_sector
```

---

# 2. JOIN

## INNER JOIN

Devuelve filas que cumplen la condición de reunión en ambas tablas.

```sql
SELECT t.id_trabajo, t.descripcion, s.nombre AS sector
FROM trabajo AS t
JOIN sector AS s ON s.id_sector = t.id_sector
ORDER BY t.id_trabajo;
```

## LEFT JOIN

Conserva todas las filas de la tabla izquierda, aunque no haya coincidencia derecha.

```sql
SELECT s.id_sector, s.nombre, COUNT(t.id_trabajo) AS cantidad
FROM sector AS s
LEFT JOIN trabajo AS t ON t.id_sector = s.id_sector
GROUP BY s.id_sector, s.nombre
ORDER BY s.id_sector;
```

Se usa `COUNT(t.id_trabajo)` y no `COUNT(*)` para que un sector sin trabajos cuente `0`, no la fila extendida con valores nulos.

## Error: producto cartesiano

```sql
SELECT *
FROM trabajo AS t, sector AS s;
```

Sin condición de reunión combina cada trabajo con cada sector. Si existen 5 trabajos y 3 sectores, produce 15 combinaciones aunque la mayoría no represente relaciones reales.

---

# 3. Funciones de grupo

Funciones frecuentes:

```text
COUNT → contar
SUM   → sumar
AVG   → promedio
MIN   → mínimo
MAX   → máximo
```

Ejemplo:

```sql
SELECT estado,
       COUNT(*) AS cantidad,
       AVG(prioridad) AS prioridad_promedio
FROM trabajo
GROUP BY estado
ORDER BY estado;
```

Sin `GROUP BY`, una función de grupo resume el conjunto completo seleccionado.

---

# 4. WHERE, GROUP BY y HAVING

```sql
SELECT s.nombre, COUNT(*) AS pendientes
FROM sector AS s
JOIN trabajo AS t ON t.id_sector = s.id_sector
WHERE t.estado = 'PENDIENTE'
GROUP BY s.id_sector, s.nombre
HAVING COUNT(*) >= 2
ORDER BY pendientes DESC, s.nombre;
```

| Cláusula | Función |
|---|---|
| `WHERE` | filtra filas antes de agrupar |
| `GROUP BY` | forma grupos por valores comunes |
| `HAVING` | filtra grupos ya calculados |
| `ORDER BY` | ordena el resultado final |

Regla:

```text
WHERE no reemplaza HAVING
HAVING no se usa para evitar un filtro simple de filas
```

---

# 5. Subconsultas

## Escalar

Devuelve un único valor.

```sql
SELECT id_trabajo, descripcion, prioridad
FROM trabajo
WHERE prioridad > (
    SELECT AVG(prioridad)
    FROM trabajo
)
ORDER BY prioridad DESC, id_trabajo;
```

## Lista con IN

```sql
SELECT id_trabajo, descripcion
FROM trabajo
WHERE id_sector IN (
    SELECT id_sector
    FROM sector
    WHERE nombre IN ('Redes', 'Soporte')
);
```

## Existencia correlacionada

```sql
SELECT s.id_sector, s.nombre
FROM sector AS s
WHERE EXISTS (
    SELECT 1
    FROM trabajo AS t
    WHERE t.id_sector = s.id_sector
      AND t.estado = 'PENDIENTE'
);
```

La subconsulta correlacionada usa una fila de la consulta externa (`s.id_sector`).

---

# 6. Orden conceptual de procesamiento

Para razonar, no para escribir:

```text
FROM / JOIN
→ WHERE
→ GROUP BY
→ HAVING
→ SELECT
→ ORDER BY
```

Esto explica por qué:

- `WHERE` no puede filtrar un `COUNT(*)` que todavía no se calculó;
- `HAVING` sí puede hacerlo luego de formar grupos;
- un alias del `SELECT` suele estar disponible para `ORDER BY`, pero no siempre para cláusulas anteriores.

---

# 7. TCL y cambios seguros

```sql
BEGIN;

UPDATE trabajo
SET estado = 'ASIGNADO'
WHERE id_trabajo = 101;

SELECT *
FROM trabajo
WHERE id_trabajo = 101;

ROLLBACK;
```

- `COMMIT`: confirma cambios de la transacción.
- `ROLLBACK`: deshace cambios no confirmados.
- `SAVEPOINT`: crea un punto intermedio cuando el motor lo admite.

La transacción no sustituye el `WHERE`: evita confirmar un error si se detecta a tiempo, pero una sentencia sin filtro sigue afectando todas las filas durante la transacción.

---

# 8. DCL

```sql
GRANT SELECT, INSERT, UPDATE ON trabajo TO operador_sigo;
REVOKE UPDATE ON trabajo FROM operador_sigo;
```

`GRANT` concede permisos y `REVOKE` los retira. La sintaxis exacta y la administración de usuarios/roles varían por motor.

---

# 9. Errores frecuentes

- olvidar `ON` o escribir una condición de reunión incorrecta;
- usar `COUNT(*)` con `LEFT JOIN` cuando se desea contar solo coincidencias;
- seleccionar columnas no agregadas sin agruparlas;
- escribir `WHERE COUNT(*) > 1`;
- confundir el orden de presentación con el orden lógico de evaluación;
- comparar `NULL` con `=` en vez de `IS NULL`;
- ejecutar cambios sin verificación ni transacción;
- asumir que una subconsulta siempre es más rápida o más lenta que un `JOIN` sin mirar plan y datos.
