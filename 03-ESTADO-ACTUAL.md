# Estado actual — EFIP I

**Actualizado al cierre académico del Día 11 — 18/08/2026**<br>
**Día 11:** **CERRADO Y APROBADO**<br>
**Evaluación:** **9,2/10**<br>
**Recuperación oral de excepciones:** **COMPLETADA**<br>
**Día 10:** **CERRADO Y APROBADO — 8,5/10 + recuperación 4/4**<br>
**Semana intensiva 1:** **CERRADA POR EVIDENCIA ACUMULADA — 8,6/10**<br>
**Día 9:** **CERRADO DOCUMENTALMENTE — SIN DEFENSA ORAL**

---

# 1. Integridad del resultado

El Día 11 se desarrolló mediante recuperación inicial, actividades guiadas, controles formativos, evaluación final de diez puntos y una recuperación oral posterior sobre excepciones.

```text
Evaluación final = 9,2/10
Java = 2,5/3
Listas avanzadas = 2,8/3
SQL = 2,9/3
Integración/SOLID = 1/1
Recuperación oral posterior = completada
Estado = cerrado y aprobado
```

La recuperación posterior mejora la precisión entre checked/unchecked y `throw`/`throws`, pero no altera retroactivamente el `9,2/10`.

El cierre no atribuye al estudiante la ejecución automática de ejemplos realizada durante la preparación. Continúan pendientes un programa Java autónomo con archivos separados, algoritmos de ordenación, asociativa frente a débil, el modelo relacional final completo y los temas de Comunicaciones reprogramados.

---

# 2. Estado por materia

| Materia | Nivel actual | Evidencia principal | Precisión pendiente |
|---|---|---|---|
| Análisis y Diseño | **Alto — aplicado y defendible en arquitectura básica** | decisiones significativas, RNF, subsistemas, interfaces, dependencias, cohesión/acoplamiento y vistas 4+1 | modelo de implementación formal, diagramas de estados y relaciones UML restantes |
| POO | **Alto conceptual — aplicado y parcialmente defendible** | arreglo/`ArrayList`, igualdad, JVM, excepciones y SOLID aplicados | programa Java autónomo, archivos y recuperación espaciada de excepciones |
| Estructuras | **Alto — aplicado y defendible** | Lista simple, doble, circular, ordenada, Pila, Cola e iteradores | algoritmos de ordenación y código autónomo completo |
| Base de Datos | **Alto en SQL básico — aplicado y defendible** | DDL/DML/TCL/DCL, consultas, cambios seguros y restricciones | asociativa/débil, modelo final completo, SQL avanzado y ACID |
| Comunicaciones | **Medio-alto — aplicado en medios y dispositivos principales** | guiados/no guiados, UTP, trenzado, FTP/STP, fibra, repetidor/hub, switch y router | perturbaciones completas, gateway, módem, última milla y enlaces |

---

# 3. Evidencia del Día 11

## Recuperación inicial

- resultado `11/12`;
- corrección principal: `==` compara referencias, no tipos;
- vistas, listas, Java básico y SQL recuperados antes de avanzar.

## Java complementario

- arreglo frente a `ArrayList`;
- `==`, `equals()`, `hashCode()` y `toString()`;
- bytecode, JDK, JVM y límites de portabilidad;
- checked/unchecked y `try/catch/finally/throw/throws`;
- SRP, DIP y reconocimiento de OCP aplicados a `AgendaTrabajos`.

## Listas avanzadas

- cuatro enlaces de inserción en lista doble;
- recorrido circular y caso de un único nodo;
- inserción ordenada y corte temprano;
- iterador, `hasNext()`, `next()` y `remove()`;
- diferencia entre costo de búsqueda `O(n)` y actualización directa `O(1)`.

## SQL e integración

- DDL, DML, TCL y DCL clasificados;
- `SELECT`, filtros y orden múltiple;
- `INSERT`, verificación previa, `UPDATE` y `DELETE` con `WHERE`;
- PK, FK, `NOT NULL`, `UNIQUE` y `CHECK`;
- validación temprana en Java e integridad garantizada en la base.

---

# 4. Estado de errores

| Estado | Cantidad |
|---|---:|
| Consolidado | **39** |
| Corregido | **15** |
| Abierto | **5** |
| **Total registrado** | **59** |

Abiertos prioritarios:

```text
E-005 — complejidades de ordenación
E-016 — Java completo
E-039 — entidad asociativa frente a débil
E-045 — digitalización, política y supuestos
E-050 — modelo relacional final completo
```

Consolidados durante el Día 11:

```text
E-008 — DCL/TCL
E-018 — estructura dinámica frente a tipo
E-046 — comparación de String
```

Nuevos corregidos:

```text
E-056 — igualdad lógica por id y contrato hashCode
E-057 — checked/unchecked y throw/throws
E-058 — costo con referencias conocidas
E-059 — lista circular de un nodo
```

---

# 5. Evidencias canónicas

- `EVALUACIONES/2026-08-18_RESPUESTAS-DIA-11.md`
- `EVALUACIONES/2026-08-18_RESULTADOS-DIA-11.md`
- `RESUMENES/2026-08-18_RESUMEN-GUIADO-DIA-11.md`
- `RESUMENES/2026-08-18_CIERRE-DIA-11.md`
- `04-MATRIZ-DE-PROGRESO-ACTUALIZACION-DIA-11.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-11.md`

---

# 6. Próxima acción

```text
19/08/2026 — Día 12
→ modelo de implementación, componentes, nodos y despliegue
→ archivos y excepciones propias
→ enlace de datos, Ethernet, tabla MAC y STP
```

No es necesario repetir el Día 11 completo. La precisión de excepciones debe reaparecer en una recuperación breve y espaciada.
