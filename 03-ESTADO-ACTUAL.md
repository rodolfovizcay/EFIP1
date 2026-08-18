# Estado actual — EFIP I

**Actualizado al cierre académico del Día 10 — 17/08/2026**  
**Día 10:** **CERRADO Y APROBADO EN SU ALCANCE REAL**  
**Evaluación integradora:** **8,5/10**  
**Recuperación selectiva final:** **4/4**  
**Semana intensiva 1:** **CERRADA POR EVIDENCIA ACUMULADA — 8,6/10**  
**Día 9:** **CERRADO DOCUMENTALMENTE — SIN DEFENSA ORAL**

---

# 1. Integridad del resultado

El Día 10 se desarrolló mediante recuperación inicial, actividades guiadas por bloque, evaluación integradora de diez consignas y recuperación selectiva final.

```text
Evaluación integradora real = 8,5/10
Recuperación final = 4/4
Estado = cerrado y aprobado
```

La evaluación preparada originalmente con desglose `8 puntos escritos + 2 de defensa` no se ejecutó con esa modalidad exacta. No se inventa un desglose por área ni una defensa formal: se conserva el instrumento real y la evidencia dialogada equivalente.

El cierre no declara cobertura de contenidos que no fueron trabajados. Continúan pendientes el código Java completo de Lista, inserción al final y modificación, perturbaciones avanzadas del canal, gateway, módem, última milla y el caso integrador completo.

---

# 2. Estado por materia

| Materia | Nivel actual | Evidencia principal | Precisión pendiente |
|---|---|---|---|
| Análisis y Diseño | **Alto — aplicado y defendible en arquitectura básica** | decisiones significativas, RNF, subsistemas, interfaces, dependencias, cohesión/acoplamiento y vistas 4+1 | modelo de implementación formal, diagramas de estados y relaciones UML restantes |
| POO | **Medio-alto — aplicado conceptualmente** | constructor, `super`, `String`, `toString()` y distinción entidad/subsistema recuperados | Java completo, `@Override`, archivos y prueba polimórfica |
| Estructuras | **Alto — aplicado en Lista simple, Pila y Cola** | nodo/cabeza, recorrido, búsqueda, inserción, eliminación y complejidades básicas | implementación Java completa, modificación, inserción final y listas avanzadas |
| Base de Datos | **Medio-alto — aplicado** | modelo relacional y normalización ya evidenciados | asociativa/débil y modelo final con atributos, PK, FK y `UNIQUE` |
| Comunicaciones | **Medio-alto — aplicado en medios y dispositivos principales** | guiados/no guiados, UTP, trenzado, FTP/STP, fibra, repetidor/hub, switch y router | perturbaciones completas, gateway, módem, última milla y enlaces |

---

# 3. Evidencia del Día 10

## Recuperación inicial

- asociaciones UML explicadas correctamente;
- entidad frente a subsistema recuperado;
- constructor validado antes de asignar;
- `super`, `String`, LIFO/FIFO, señales y modelo relacional repasados;
- resultado inicial: `8,75/12`, seguido por recuperación breve `4,5/5`.

## Arquitectura

- diferencia entre tecnología y decisión arquitectónica;
- decisión local SQLite, persistencia central PostgreSQL y comunicación REST justificadas;
- subsistemas, interfaces y dirección de dependencias;
- separación de Sincronización documentada con alternativas, consecuencias, riesgos, RNF y artefactos;
- vistas 4+1 identificadas y recuperadas hasta `4/4`.

## Lista simple

- `cabeza` comprendida como referencia al primer nodo;
- inserción al inicio y entre nodos;
- recorrido y búsqueda secuenciales;
- eliminación de cabeza y nodo intermedio;
- complejidades `O(1)` y `O(n)`;
- errores de referencias corregidos mediante ejecución mental.

## Nivel físico

- medios guiados y no guiados;
- señal eléctrica, bits y trama diferenciados;
- UTP, trenzado, blindaje y elección de fibra entre edificios;
- hub/repetidor, switch y router ubicados por capa, PDU y dirección.

---

# 4. Estado de errores

| Estado | Cantidad |
|---|---:|
| Consolidado | **36** |
| Corregido | **13** |
| Abierto | **6** |
| **Total registrado** | **55** |

Abiertos prioritarios:

```text
E-005 — complejidades de ordenación
E-008 — DCL/TCL
E-016 — Java completo
E-039 — entidad asociativa frente a débil
E-045 — digitalización, política y supuestos
E-050 — modelo relacional final completo
```

Recuperados durante el Día 10:

```text
E-002 — asociación/agregación/composición → corregido
E-049 — conectividad frente a sincronía → corregido
E-051 — implementación frente a despliegue → corregido
E-052 — cabeza frente a nodo centinela → corregido
E-053 — eliminación y reconexión de nodos → corregido
E-054 — alternativas/consecuencias/riesgos arquitectónicos → corregido
E-055 — nomenclatura OSI y dispositivo/PDU/dirección → corregido
```

---

# 5. Evidencias canónicas

- `EVALUACIONES/2026-08-17_RESPUESTAS-DIA-10.md`
- `EVALUACIONES/2026-08-17_RESULTADOS-DIA-10.md`
- `RESUMENES/2026-08-17_RESUMEN-GUIADO-DIA-10.md`
- `RESUMENES/2026-08-17_CIERRE-DIA-10.md`
- `04-MATRIZ-DE-PROGRESO-ACTUALIZACION-DIA-10.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-10.md`

---

# 6. Próxima acción

```text
18/08/2026 — Día 11
→ Java complementario
→ listas avanzadas
→ SQL
```

No es necesario repetir el Día 10 completo. Las recuperaciones deben ser espaciadas y breves, integradas en jornadas futuras.
