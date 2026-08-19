# Estado actual — EFIP I

**Actualizado al cierre académico del Día 12 — 19/08/2026**<br>
**Día 12:** **CERRADO Y APROBADO**<br>
**Evaluación:** **8,05/10**<br>
**Recuperación inicial:** **10,5/12**<br>
**Defensa integradora:** **1/1**<br>
**Día 11:** **CERRADO Y APROBADO — 9,2/10**<br>
**Día 10:** **CERRADO Y APROBADO — 8,5/10 + recuperación 4/4**<br>
**Semana intensiva 1:** **CERRADA POR EVIDENCIA ACUMULADA — 8,6/10**

---

# 1. Integridad del resultado

El Día 12 se desarrolló mediante recuperación inicial, actividades guiadas, recuperaciones selectivas, evaluación final de diez puntos y defensa integradora.

```text
Implementación y despliegue = 2,30/3,00
Java, archivos y excepciones = 2,50/3,00
Enlace de datos = 2,25/3,00
Integración oral = 1,00/1,00
Total = 8,05/10
Estado = cerrado y aprobado
```

La nota conserva los errores observados. Las correcciones posteriores permitieron cerrar la jornada, pero no modifican retroactivamente el puntaje. La ejecución automática de `DemoDia12` realizada durante la preparación no se atribuye al estudiante.

---

# 2. Estado por materia

| Materia | Nivel actual | Evidencia principal | Precisión pendiente |
|---|---|---|---|
| Análisis y Diseño | **Alto — aplicado y defendible** | arquitectura, vistas, implementación/despliegue, trazabilidad e infraestructura | componente/subsistema/artefacto y modelo de pruebas |
| POO | **Alto conceptual — aplicado y parcialmente defendible** | colecciones, igualdad, JVM, archivos, excepciones propias y SOLID | programa autónomo con archivos separados y sintaxis completa |
| Estructuras | **Alto — aplicado y defendible** | listas simples y avanzadas, Pila, Cola e iteradores | algoritmos de ordenación y complejidades |
| Base de Datos | **Alto en SQL básico — aplicado y defendible** | DDL/DML/TCL/DCL, consultas, cambios y restricciones | asociativa/débil, modelo final, SQL avanzado y ACID |
| Comunicaciones | **Medio-alto — aplicado** | OSI/TCP-IP, medios, Ethernet, switch, tabla MAC, router y STP | HDLC/PPP/Ethernet, bucles L2/routing, perturbaciones y direccionamiento |

---

# 3. Evidencia del Día 12

## Implementación y despliegue

- implementación como organización de piezas de software;
- despliegue como distribución en nodos;
- interfaz, fuente, componente/artefacto y nodo aplicados;
- trazabilidad UML→Java→artefacto→teléfono;
- servidor propio frente a infraestructura contratada;
- DIP y OCP al reemplazar el repositorio local.

## Java, archivos y excepciones

- `Path`, `Files`, UTF-8 y `try-with-resources`;
- lectura y escritura de texto;
- `CREATE`, `TRUNCATE_EXISTING` y `APPEND`;
- `IOException` checked;
- excepción propia con mensaje y causa;
- traducción de `NumberFormatException` a `FormatoArchivoException`;
- separación SRP entre dominio, persistencia y presentación.

## Enlace de datos

- HDLC, PPP y Ethernet trabajados;
- trama, LLC, MAC y FCS;
- aprendizaje por MAC origen y consulta de MAC destino;
- flooding y reenvío selectivo;
- tabla MAC final correcta;
- STP frente a enlaces redundantes;
- switch C2/MAC frente a router C3/IP.

## Integración

La defensa final obtuvo `1/1` al relacionar clase UML, archivo Java, artefacto, teléfono, almacenamiento local, trama Ethernet, tabla MAC y router.

---

# 4. Estado de errores

| Estado | Cantidad |
|---|---:|
| Consolidado | **42** |
| Corregido | **16** |
| Abierto | **7** |
| **Total registrado** | **65** |

Consolidados durante el Día 12:

```text
E-051 — implementación frente a despliegue
E-055 — switch/router: capa, PDU y dirección
E-057 — checked/unchecked y throw/throws
```

Nuevos errores corregidos:

```text
E-060 — componente/subsistema/artefacto
E-061 — traducción de excepción de formato
E-062 — aprendizaje y reenvío del switch
E-064 — LLC/MAC
```

Nuevos abiertos:

```text
E-063 — HDLC/PPP/Ethernet
E-065 — bucle L2 frente a bucle de enrutamiento
```

Abiertos prioritarios acumulados:

```text
E-005 — complejidades de ordenación
E-016 — Java completo
E-039 — entidad asociativa frente a débil
E-045 — digitalización, política y supuestos
E-050 — modelo relacional final completo
E-063 — HDLC/PPP/Ethernet
E-065 — bucle L2 frente a routing
```

---

# 5. Evidencias canónicas

- `03-ESTADO-ACTUAL-CIERRE-DIA-12.md`
- `04-MATRIZ-DE-PROGRESO-ACTUALIZACION-DIA-12.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-12.md`
- `EVALUACIONES/2026-08-19_RESPUESTAS-ESTUDIANTE-DIA-12.md`
- `EVALUACIONES/2026-08-19_RESULTADOS-DIA-12.md`
- `RESUMENES/2026-08-19_CIERRE-DIA-12.md`

---

# 6. Próxima acción

```text
20/08/2026 — Día 13
→ recuperación selectiva del Día 12
→ pruebas y modelo de prueba
→ inserción y Shellsort
→ SQL avanzado
```

No es necesario repetir el Día 12 completo. Los errores E-063 y E-065 deben reaparecer al inicio de una jornada posterior.
