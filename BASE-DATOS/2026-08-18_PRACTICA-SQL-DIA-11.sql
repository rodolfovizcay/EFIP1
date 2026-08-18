-- Práctica transaccional del Día 11.
-- Compatible con SQLite y PostgreSQL para los elementos usados.
-- Las tablas son temporales y ROLLBACK revierte la práctica.

BEGIN;

CREATE TEMP TABLE sector (
    id_sector INTEGER PRIMARY KEY,
    nombre VARCHAR(60) NOT NULL UNIQUE
);

CREATE TEMP TABLE trabajo (
    id_trabajo INTEGER PRIMARY KEY,
    id_sector INTEGER NOT NULL,
    descripcion VARCHAR(120) NOT NULL,
    prioridad INTEGER NOT NULL CHECK (prioridad BETWEEN 1 AND 5),
    estado VARCHAR(20) NOT NULL,
    FOREIGN KEY (id_sector) REFERENCES sector(id_sector)
);

INSERT INTO sector (id_sector, nombre) VALUES
    (1, 'Internet'),
    (2, 'Energía');

INSERT INTO trabajo
    (id_trabajo, id_sector, descripcion, prioridad, estado)
VALUES
    (101, 1, 'Revisar enlace rural', 2, 'PENDIENTE'),
    (102, 1, 'Cambiar equipo', 1, 'PENDIENTE'),
    (103, 2, 'Verificar acometida', 3, 'ASIGNADO');

SELECT id_trabajo, descripcion, prioridad
FROM trabajo
WHERE estado = 'PENDIENTE'
ORDER BY prioridad, id_trabajo;

UPDATE trabajo
SET estado = 'ASIGNADO'
WHERE id_trabajo = 101;

DELETE FROM trabajo
WHERE id_trabajo = 102;

SELECT s.nombre AS sector,
       COUNT(*) AS cantidad_trabajos
FROM sector AS s
JOIN trabajo AS t ON t.id_sector = s.id_sector
GROUP BY s.nombre
ORDER BY s.nombre;

-- Ejercicios:
-- 1. Listar los trabajos del sector Internet.
-- 2. Cambiar la prioridad del trabajo 103 a 1 usando WHERE.
-- 3. Insertar un trabajo nuevo respetando PK, FK y CHECK.
-- 4. Explicar qué ocurriría si UPDATE o DELETE omitieran WHERE.
-- 5. Clasificar cada sentencia anterior como DDL, DML o TCL.

ROLLBACK;
