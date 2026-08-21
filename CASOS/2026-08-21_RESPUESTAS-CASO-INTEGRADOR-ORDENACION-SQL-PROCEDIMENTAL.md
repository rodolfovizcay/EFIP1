# Respuestas modelo — Caso de ordenación y SQL procedimental

**No atribuir al estudiante.**

## Parte A

Orden estable por prioridad:

```text
[B(1), G(1), C(2), E(2), A(3), D(3), H(4), F(5)]
```

Se conserva:

- `B` antes que `G`;
- `C` antes que `E`;
- `A` antes que `D`.

La estabilidad es relevante si el orden de registro funciona como segundo criterio implícito. Quicksort habitual puede alterar ese orden, por lo que debería agregarse un comparador explícito por prioridad y fecha/ID o elegir un algoritmo estable.

## Parte B

1. Procedimiento: asignar trabajo.
2. Función: contar pendientes.
3. Trigger: registrar cambio de estado.
4. `DECLARE → OPEN → FETCH repetido → CLOSE`.
5. Una sentencia por conjuntos reduce pasos, contexto y costo cuando todas las filas reciben el mismo tratamiento.
6. Si historial y cambio son una unidad, debe ejecutarse `ROLLBACK`.

## Parte C

Una decisión defendible:

```text
necesidad: mostrar trabajos aun sin conexión
alternativas: ordenar local / ordenar en servidor / combinar
decisión: combinar
justificación: servidor define el orden canónico y el teléfono puede reproducirlo sin red
consecuencia positiva: disponibilidad offline
consecuencia negativa segura: lógica duplicada de ordenación
riesgo: diferencias de criterio o versión
mitigación: comparador compartido/especificado y pruebas de contrato
```
