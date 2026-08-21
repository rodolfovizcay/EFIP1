# Errores y recuperaciones — Día 13

**Fecha:** 20/08/2026

## Pasaron de abiertos a corregidos

| Código | Tema | Evidencia |
|---|---|---|
| E-005 | Complejidades de ordenación | respuesta correcta obtenida con ayuda; requiere recuperación autónoma |
| E-063 | HDLC/PPP/Ethernet | recuperación obtenida con apoyo |
| E-065 | Bucle L2/routing | diferenciación obtenida con apoyo |

## Nuevos corregidos

| Código | Tema | Error observado | Regla corregida |
|---|---|---|---|
| E-066 | Excepción esperada | se indicó que lanzar `IllegalArgumentException` hacía fallar el caso inválido | si la excepción es el resultado esperado, la prueba pasa |
| E-067 | Shellsort | se detuvo la comparación tras un desplazamiento y se mezclaron índices | continuar por `i-gap`, `i-2gap`, etc., dentro de la misma subsecuencia |

## Abiertos conservados

```text
E-016 — Java completo
E-039 — asociativa/débil
E-045 — digitalización/política/supuestos
E-050 — modelo relacional final
```

## Criterio de cierre

La jornada se aprueba con `8,0/10`, pero ninguno de estos temas asistidos se declara consolidado.
