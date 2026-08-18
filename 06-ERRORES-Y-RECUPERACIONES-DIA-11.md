# Errores y recuperaciones — Día 11

**Fecha:** 18/08/2026<br>
**Evaluación:** **9,2/10**<br>
**Recuperación oral final:** completada

## Cambios de estado

| Código | Error o brecha previa | Evidencia del Día 11 | Estado |
|---|---|---|---|
| E-008 | DCL/TCL sin retención | `COMMIT`=TCL y `GRANT`=DCL correctos en práctica y evaluación | consolidado |
| E-018 | dinámica confundida con tipo de elemento | tamaño variable y objetos/wrappers explicados nuevamente | consolidado |
| E-046 | `==` frente a contenido de `String` | referencias y contenido diferenciados en actividades y evaluación | consolidado |
| E-056 | igualdad de objetos reducida a misma instancia | identidad de `Trabajo` definida por `id`; contrato con `hashCode()` recuperado | corregido |
| E-057 | `throws` entendido como obligación universal; unchecked como fallo seguro | obligación limitada a checked; unchecked depende de que ocurra y no se capture | corregido |
| E-058 | inserción/eliminación con referencias conocidas considerada `O(n)` | enlaces directos `O(1)`; búsqueda previa `O(n)` | corregido |
| E-059 | nodo único circular apuntando a `null` | `nodo.siguiente = nodo` | corregido |

## Reglas de recuperación

```text
== en objetos = misma referencia
equals() = igualdad lógica definida por la clase
equals(a,b) verdadero → mismo hashCode
mismo hashCode ↛ equals() verdadero
```

```text
throw nuevaExcepcion;       → lanza ahora
metodo() throws Excepcion   → declara posible propagación
checked                     → capturar o declarar
unchecked                   → sin obligación de compilación
```

```text
doble con referencias conocidas → actualizar enlaces O(1)
circular de un nodo              → siguiente apunta al mismo nodo
recorrer n elementos             → O(n)
```

```text
UPDATE/DELETE sin WHERE → todas las filas alcanzadas
ROLLBACK                → revierte cambios no confirmados de la transacción
```

## Seguimiento

- E-056, E-057, E-058 y E-059 requieren una recuperación espaciada.
- E-016 permanece abierto porque falta escribir y ejecutar un programa Java autónomo completo.
- E-005 permanece abierto porque la evaluación no cubrió algoritmos de ordenación.
