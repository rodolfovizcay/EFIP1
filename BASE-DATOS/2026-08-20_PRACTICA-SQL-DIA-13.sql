-- Día 13 — SQL avanzado
-- Dialecto objetivo: PostgreSQL; el núcleo también es compatible con SQL común.
-- El bloque prepara datos de práctica y termina con ROLLBACK para no persistirlos.

BEGIN;

CREATE TABLE sector_dia13 (
    id_sector INTEGER PRIMARY KEY,
    nombre VARCHAR(80) NOT NULL UNIQUE
);

CREATE TABLE trabajo_dia13 (
    id_trabajo INTEGER PRIMARY KEY,
    id_sector INTEGER NOT NULL,
    descripcion VARCHAR(120) NOT NULL,
    prioridad INTEGER NOT NULL CHECK (prioridad BETWEEN 1 AND 5),
    estado VARCHAR(20) NOT NULL,
    FOREIGN KEY (id_sector) REFERENCES sector_dia13(id_sector)
);

INSERT INTO sector_dia13 (id_sector, nombre) VALUES
    (1, 'Redes'),
    (2, 'Soporte'),
    (3, 'Infraestructura'),
    (4, 'Sin trabajos');

INSERT INTO trabajo_dia13
    (id_trabajo, id_sector, descripcion, prioridad, estado)
VALUES
    (101, 1, 'Revisar enlace', 1, 'PENDIENTE'),
    (102, 1, 'Cambiar módem', 2, 'PENDIENTE'),
    (103, 2, 'Instalar aplicación', 3, 'ASIGNADO'),
    (104, 2, 'Revisar teléfono', 2, 'PENDIENTE'),
    (105, 3, 'Controlar servidor', 5, 'FINALIZADO'),
    (106, 1, 'Medir interferencia', 4, 'ASIGNADO');

-- 1. INNER JOIN: cada trabajo con el nombre de su sector.
SELECT t.id_trabajo,
       t.descripcion,
       s.nombre AS sector,
       t.estado
FROM trabajo_dia13 AS t
JOIN sector_dia13 AS s ON s.id_sector = t.id_sector
ORDER BY t.id_trabajo;

-- 2. LEFT JOIN: incluye el sector que no tiene trabajos.
SELECT s.id_sector,
       s.nombre,
       COUNT(t.id_trabajo) AS cantidad_trabajos
FROM sector_dia13 AS s
LEFT JOIN trabajo_dia13 AS t ON t.id_sector = s.id_sector
GROUP BY s.id_sector, s.nombre
ORDER BY s.id_sector;

-- 3. Funciones de grupo por estado.
SELECT estado,
       COUNT(*) AS cantidad,
       MIN(prioridad) AS prioridad_minima,
       MAX(prioridad) AS prioridad_maxima,
       AVG(prioridad) AS prioridad_promedio
FROM trabajo_dia13
GROUP BY estado
ORDER BY estado;

-- 4. WHERE filtra filas y HAVING filtra grupos.
SELECT s.id_sector,
       s.nombre,
       COUNT(*) AS pendientes
FROM sector_dia13 AS s
JOIN trabajo_dia13 AS t ON t.id_sector = s.id_sector
WHERE t.estado = 'PENDIENTE'
GROUP BY s.id_sector, s.nombre
HAVING COUNT(*) >= 2
ORDER BY pendientes DESC, s.id_sector;

-- 5. Subconsulta escalar: prioridad superior al promedio global.
SELECT id_trabajo, descripcion, prioridad
FROM trabajo_dia13
WHERE prioridad > (
    SELECT AVG(prioridad)
    FROM trabajo_dia13
)
ORDER BY prioridad DESC, id_trabajo;

-- 6. Subconsulta con EXISTS: sectores con trabajos pendientes.
SELECT s.id_sector, s.nombre
FROM sector_dia13 AS s
WHERE EXISTS (
    SELECT 1
    FROM trabajo_dia13 AS t
    WHERE t.id_sector = s.id_sector
      AND t.estado = 'PENDIENTE'
)
ORDER BY s.id_sector;

-- 7. Cambio seguro dentro de una transacción.
SELECT *
FROM trabajo_dia13
WHERE id_trabajo = 101;

UPDATE trabajo_dia13
SET estado = 'ASIGNADO'
WHERE id_trabajo = 101;

SELECT *
FROM trabajo_dia13
WHERE id_trabajo = 101;

-- La práctica no deja objetos ni datos persistidos.
ROLLBACK;

-- DCL de referencia para PostgreSQL; requiere que el rol exista.
-- GRANT SELECT, INSERT, UPDATE ON trabajo TO operador_sigo;
-- REVOKE UPDATE ON trabajo FROM operador_sigo;
