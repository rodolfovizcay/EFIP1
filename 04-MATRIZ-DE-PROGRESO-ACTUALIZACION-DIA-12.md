# Actualización de matriz — Cierre del Día 12

**Fecha:** 19/08/2026<br>
**Resultado:** **8,05/10 — APROBADO**

---

# 1. Cambios respaldados por evidencia

## Análisis y Diseño

| Tema | Estado anterior | Estado nuevo | Evidencia |
|---|---|---|---|
| Modelo de implementación | NI/EA | A | clasificación, trazabilidad y evaluación |
| Modelo de despliegue y nodos | C/A | A/DO | recuperación, evaluación y defensa final |
| Trazabilidad diseño→código→artefacto→nodo | EA | A/DO | defensa integradora `1/1` |
| Decisión de infraestructura | NI | A | comparación y justificación con costos, riesgos y mitigación |
| Componente/subsistema/artefacto | EA | C/A | aplicación con imprecisiones; recuperación espaciada requerida |

## POO/Java

| Tema | Estado anterior | Estado nuevo | Evidencia |
|---|---|---|---|
| Archivos | NI | C/A | `Path`, `Files`, lectura/escritura y opciones de apertura |
| UTF-8 y cierre de recursos | NI | A | explicación de `try-with-resources` y codificación |
| Excepciones propias | EA | A | clase checked, `throw`, `throws`, mensaje y causa |
| Flujo checked/unchecked | A | A/DO | recuperación repetida y evaluación aprobada |
| Separación dominio/persistencia/presentación | A | A/DO | SRP aplicado en evaluación |

## Comunicaciones

| Tema | Estado anterior | Estado nuevo | Evidencia |
|---|---|---|---|
| Enlace y Ethernet | NI/EA | C/A | trama, MAC, FCS y aplicación en LAN |
| HDLC/PPP/Ethernet | NI | EA/C | trabajados; comparación final incompleta |
| LLC/MAC | NI/EA | C/A | funciones recuperadas; término “enrutamiento físico” corregido |
| Switch y tabla MAC | NI | A | simulación y recuperación completa |
| STP y bucles de capa 2 | NI/EA | C/A | función comprendida; comparación con routing pendiente |
| Bucle de routing, TTL y métricas | NI | EA | diferencia final no demostrada sin apoyo |
| Router y tabla de enrutamiento | NI/EA | C/A | función integrada en defensa final |

---

# 2. Evidencia evaluativa incorporada

```text
Parte A = 2,30/3,00
Parte B = 2,50/3,00
Parte C = 2,25/3,00
Parte D = 1,00/1,00
Total   = 8,05/10
```

---

# 3. Límites del avance

- `DemoDia12` fue validado durante la preparación, pero no ejecutado autónomamente como evidencia del estudiante;
- HDLC, PPP y Ethernet no quedan defendibles todavía;
- el bucle de capa 2 frente al bucle de routing queda abierto;
- componente, subsistema y artefacto quedan comprendidos, pero no consolidados;
- archivos Java quedan aplicados conceptualmente, con programa autónomo completo aún pendiente.

---

# 4. Decisión

Actualizar la matriz canónica con los cambios anteriores y programar recuperación breve al inicio de una jornada posterior.
