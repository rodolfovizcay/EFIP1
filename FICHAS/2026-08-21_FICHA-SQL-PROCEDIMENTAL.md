# Ficha — SQL procedimental

## Bloques

PL/SQL:

```text
DECLARE
BEGIN
EXCEPTION
END
```

MySQL:

```text
DELIMITER //
CREATE PROCEDURE ...
BEGIN
    declaraciones;
    sentencias;
END//
DELIMITER ;
```

No mezclar dialectos en una misma respuesta sin aclararlo.

## Objetos

| Objeto | Función |
|---|---|
| procedimiento | ejecuta una acción |
| función | devuelve un valor |
| cursor | recorre filas de un resultado |
| trigger | reacciona automáticamente a un evento de tabla |

## Control de flujo MySQL

- `IF ... THEN ... ELSE ... END IF`;
- `CASE`;
- `LOOP`;
- `WHILE`;
- `REPEAT`;
- `LEAVE`;
- `ITERATE`.

## Cursor

```text
DECLARE cursor
DECLARE handler de fin
OPEN
LOOP
    FETCH
    comprobar fin
    procesar
END LOOP
CLOSE
```

Regla: primero buscar una solución por conjuntos. El cursor se justifica cuando realmente se necesita procesamiento fila por fila.

## Trigger

Dimensiones:

```text
momento → BEFORE / AFTER
evento  → INSERT / UPDATE / DELETE
alcance → FOR EACH ROW
```

Ejemplos razonables:

- validar una condición no expresable con una restricción simple;
- registrar historial de cambios;
- completar un dato derivado controlado.

Riesgos:

- comportamiento oculto;
- duplicación de reglas;
- dificultad de depuración;
- efectos inesperados en operaciones masivas.

## Decisión SIGO

- `CHECK (prioridad BETWEEN 1 AND 5)` es preferible para el dominio simple;
- un trigger puede registrar el cambio de estado en historial;
- un procedimiento puede coordinar asignación e historial dentro de una transacción;
- una función puede devolver la cantidad de pendientes.
