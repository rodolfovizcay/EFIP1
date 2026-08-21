# Resumen guiado — Día 14

## Mergesort

```text
divide en mitades
→ caso base
→ ordena recursivamente
→ mezcla
```

- tiempo: `O(n log n)`;
- memoria auxiliar: `O(n)`;
- estable en la implementación habitual.

## Quicksort

```text
elige pivote
→ particiona
→ recursión izquierda/derecha
```

- promedio esperado: `O(n log n)`;
- peor caso: `O(n²)`;
- estabilidad no garantizada;
- el resultado intermedio depende del pivote y la partición.

## SQL procedimental

```text
procedimiento → acción
función       → devuelve valor
cursor        → recorre filas
trigger       → reacciona a evento
```

Cursor:

```text
DECLARE → OPEN → FETCH → CLOSE
```

Trigger:

```text
BEFORE/AFTER + INSERT/UPDATE/DELETE + FOR EACH ROW
```

## Defensa breve

> Mergesort y Quicksort aplican divide y vencerás, pero Mergesort divide en mitades y luego mezcla usando memoria auxiliar, mientras Quicksort particiona alrededor de un pivote. En base de datos, un procedimiento ejecuta una acción, una función devuelve un valor, un cursor recorre filas y un trigger responde automáticamente a un evento. En SIGO, la ordenación estable puede conservar el orden entre prioridades iguales y una transacción con historial protege el cambio central.
