# Errores y recuperaciones — Día 10

**Fecha:** 17/08/2026  
**Resultado de recuperación final:** **4/4**

| Código | Error observado | Corrección demostrada | Estado |
|---|---|---|---|
| E-002 | relación UML pendiente | asociación, agregación, composición y dependencia diferenciadas | corregido |
| E-049 | desconexión usada antes para inferir asincronía | conectividad y organización temporal diferenciadas | corregido |
| E-051 | implementación y despliegue invertidos | `.apk`=implementación; teléfono=despliegue | corregido |
| E-052 | cabeza interpretada como nodo con dato cero | cabeza referencia el primer nodo | corregido |
| E-053 | enlaces incorrectos al eliminar | avanzar cabeza o saltar `actual` desde `anterior` | corregido |
| E-054 | alternativa repetía la decisión | comparar soluciones distintas y separar consecuencia/riesgo | corregido |
| E-055 | mezcla OSI/TCP-IP y direcciones omitidas | switch C2/trama/MAC; router C3/paquete/IP | corregido |

## Reglas de recuperación

```text
insertar al inicio:
nuevo.siguiente = cabeza
cabeza = nuevo

eliminar primero:
cabeza = cabeza.siguiente

eliminar intermedio:
anterior.siguiente = actual.siguiente
```

```text
implementación = cómo se organiza
despliegue = dónde se ejecuta
procesos = qué sucede durante la ejecución
```

```text
switch = C2 + trama + MAC
router = C3 + paquete + IP
```

Los siete puntos requieren recuperación espaciada; no deben repetirse como jornada completa.
