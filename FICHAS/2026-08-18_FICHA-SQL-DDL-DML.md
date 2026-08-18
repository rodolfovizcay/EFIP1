# Ficha — SQL: DDL, DML y operaciones básicas

**Día:** 11 — 18/08/2026

---

# 1. SQL

SQL es declarativo o no procedimental: se expresa el resultado o cambio deseado; el motor decide el procedimiento de ejecución.

---

# 2. Familias

| Familia | Propósito | Sentencias principales |
|---|---|---|
| DDL | definir estructuras | `CREATE`, `ALTER`, `DROP`, `TRUNCATE` |
| DML | consultar y modificar filas | `SELECT`, `INSERT`, `UPDATE`, `DELETE` |
| TCL | controlar transacciones | `COMMIT`, `ROLLBACK`, `SAVEPOINT` |
| DCL | administrar permisos | `GRANT`, `REVOKE` |

El núcleo evaluado hoy es DDL/DML. TCL aparece como vista previa segura; DCL permanece pendiente.

---

# 3. SELECT

```sql
SELECT columna_1, columna_2
FROM tabla
WHERE condicion;
```

```text
SELECT → qué columnas o expresiones mostrar
FROM   → de qué tablas obtenerlas
WHERE  → qué filas conservar
```

Orden lógico simplificado:

```text
FROM → WHERE → SELECT → ORDER BY
```

---

# 4. INSERT

```sql
INSERT INTO trabajo (id_trabajo, descripcion, estado)
VALUES (101, 'Revisar enlace', 'PENDIENTE');
```

Nombrar columnas hace la sentencia más clara y resistente a cambios de orden.

---

# 5. UPDATE

```sql
UPDATE trabajo
SET estado = 'ASIGNADO'
WHERE id_trabajo = 101;
```

Sin `WHERE`, se actualizan todas las filas.

---

# 6. DELETE

```sql
DELETE FROM trabajo
WHERE id_trabajo = 101;
```

`DELETE` elimina filas; `DROP TABLE` elimina la estructura y sus datos.

---

# 7. Regla de seguridad

```sql
-- 1. Verificar objetivo
SELECT *
FROM trabajo
WHERE id_trabajo = 101;

-- 2. Reutilizar exactamente el filtro
UPDATE trabajo
SET estado = 'ASIGNADO'
WHERE id_trabajo = 101;
```

Para prácticas, usar una transacción y finalizar con `ROLLBACK` hasta verificar el resultado.

---

# 8. Errores frecuentes

- confundir DDL con DML;
- omitir `FROM`;
- creer que `WHERE` elige columnas;
- ejecutar `UPDATE`/`DELETE` sin filtro;
- confundir `DELETE` con `DROP`;
- escribir valores de texto sin comillas simples;
- no respetar PK, FK, `NOT NULL`, `UNIQUE` o `CHECK`.
