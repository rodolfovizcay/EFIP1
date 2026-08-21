-- Día 14 — Práctica de SQL procedimental
-- Dialecto: MySQL 8
-- Este archivo es material preparado; ejecutarlo durante la preparación
-- no constituye evidencia del estudiante.

CREATE TABLE IF NOT EXISTS sector (
    id_sector INT PRIMARY KEY,
    nombre VARCHAR(80) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS trabajo (
    id_trabajo INT PRIMARY KEY,
    id_sector INT NOT NULL,
    descripcion VARCHAR(200) NOT NULL,
    prioridad INT NOT NULL,
    estado VARCHAR(20) NOT NULL DEFAULT 'PENDIENTE',
    fecha_vencimiento DATE,
    CONSTRAINT ck_trabajo_prioridad CHECK (prioridad BETWEEN 1 AND 5),
    CONSTRAINT fk_trabajo_sector
        FOREIGN KEY (id_sector) REFERENCES sector(id_sector)
);

CREATE TABLE IF NOT EXISTS historial_trabajo (
    id_historial BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_trabajo INT NOT NULL,
    estado_anterior VARCHAR(20) NOT NULL,
    estado_nuevo VARCHAR(20) NOT NULL,
    fecha TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_historial_trabajo
        FOREIGN KEY (id_trabajo) REFERENCES trabajo(id_trabajo)
);

DELIMITER //

DROP TRIGGER IF EXISTS trg_trabajo_historial_estado//

CREATE TRIGGER trg_trabajo_historial_estado
AFTER UPDATE ON trabajo
FOR EACH ROW
BEGIN
    IF NOT (OLD.estado <=> NEW.estado) THEN
        INSERT INTO historial_trabajo (
            id_trabajo,
            estado_anterior,
            estado_nuevo
        )
        VALUES (
            NEW.id_trabajo,
            OLD.estado,
            NEW.estado
        );
    END IF;
END//

DROP PROCEDURE IF EXISTS asignar_trabajo//

CREATE PROCEDURE asignar_trabajo(IN p_id_trabajo INT)
BEGIN
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
        RESIGNAL;
    END;

    START TRANSACTION;

    UPDATE trabajo
    SET estado = 'ASIGNADO'
    WHERE id_trabajo = p_id_trabajo
      AND estado = 'PENDIENTE';

    IF ROW_COUNT() <> 1 THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Trabajo inexistente o no pendiente';
    END IF;

    COMMIT;
END//

DROP FUNCTION IF EXISTS cantidad_pendientes_sector//

CREATE FUNCTION cantidad_pendientes_sector(p_id_sector INT)
RETURNS INT
READS SQL DATA
BEGIN
    DECLARE v_cantidad INT;

    SELECT COUNT(*)
    INTO v_cantidad
    FROM trabajo
    WHERE id_sector = p_id_sector
      AND estado = 'PENDIENTE';

    RETURN v_cantidad;
END//

DROP PROCEDURE IF EXISTS marcar_vencidos//

CREATE PROCEDURE marcar_vencidos()
BEGIN
    DECLARE v_fin BOOLEAN DEFAULT FALSE;
    DECLARE v_id_trabajo INT;

    DECLARE c_vencidos CURSOR FOR
        SELECT id_trabajo
        FROM trabajo
        WHERE estado = 'PENDIENTE'
          AND fecha_vencimiento < CURRENT_DATE;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET v_fin = TRUE;

    OPEN c_vencidos;

    recorrer: LOOP
        FETCH c_vencidos INTO v_id_trabajo;

        IF v_fin THEN
            LEAVE recorrer;
        END IF;

        UPDATE trabajo
        SET estado = 'VENCIDO'
        WHERE id_trabajo = v_id_trabajo;
    END LOOP;

    CLOSE c_vencidos;
END//

DELIMITER ;

-- Ejercicios:
-- 1. Explicar por qué el trigger participa de la misma transacción del UPDATE.
-- 2. Indicar qué devuelve cantidad_pendientes_sector.
-- 3. Ordenar DECLARE, OPEN, FETCH y CLOSE.
-- 4. Proponer una versión por conjuntos de marcar_vencidos.
-- 5. Justificar cuándo la versión por conjuntos es preferible al cursor.
