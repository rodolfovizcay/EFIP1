# Respuestas del estudiante — Evaluación Día 13

**Fecha:** 20/08/2026

Este documento preserva una síntesis de la evidencia entregada y se mantiene separado del solucionario `2026-08-20_RESPUESTAS-DIA-13.md`. La resolución fue asistida; por lo tanto, no constituye evidencia de dominio completamente autónomo.

## Parte A — Pruebas

- diferenció verificación/validación y pruebas estáticas/dinámicas;
- definió caso, procedimiento y componente de prueba;
- diseñó casos de frontera `1` y `0` con precondición, entrada y resultado;
- clasificó unidad, integración, sistema y aceptación;
- diferenció caja negra y caja blanca;
- explicó los datos necesarios para reproducir un defecto y que una falla no revela automáticamente su causa.

## Parte B — Ordenamiento

Trazó inserción sobre `[30,10,20,50,40]`:

```text
i=1 → [10,30,20,50,40]
i=2 → [10,20,30,50,40]
i=3 → [10,20,30,50,40]
i=4 → [10,20,30,40,50]
```

Trazó Shellsort sobre `[50,40,30,20,10,0]`:

```text
gap=3 → [20,10,0,50,40,30]
gap=1 → [0,10,20,30,40,50]
```

Explicó estabilidad, memoria `O(1)`, mejor/peor caso y dependencia de la secuencia de gaps.

## Parte C — SQL

Escribió correctamente:

- `INNER JOIN` de trabajo con sector;
- agregación de pendientes por sector con `WHERE`, `GROUP BY`, `HAVING` y orden;
- subconsulta escalar contra `AVG(prioridad)`;
- transacción `BEGIN → UPDATE 101 → SELECT → ROLLBACK`;
- definiciones de atomicidad y durabilidad.

## Parte D — Decisión y seguridad

- eligió SQLite para el teléfono y PostgreSQL para el servidor central;
- identificó la desincronización como riesgo;
- clasificó Base64 como encoding, SHA-256 como hashing y AES como cifrado;
- distinguió finalidad, reversibilidad y uso de clave.

## Defensa oral

Relacionó requisito, prueba, algoritmo local, consultas centrales, ACID y selección de motores con apoyo durante la preparación y evaluación.
