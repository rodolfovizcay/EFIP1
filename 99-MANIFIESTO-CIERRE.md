# Manifiesto — Cierre semanal y cierre documental del Día 9

**Fecha:** 16/08/2026  
**Semana intensiva 1:** **CERRADA — NIVEL ALTO / APROBADO**  
**Indicador semanal:** **8,6/10**  
**Día 9:** **CERRADO SIN DEFENSA ORAL**  
**Nota global Día 9:** no asignada

---

# 1. Decisiones académicas

## Semana intensiva 1

```text
Evaluaciones completas utilizadas:
Día 5 = 9,0
Día 6 = 9,2
Día 7 = 8,3
Día 8 = 7,9

Promedio descriptivo = 8,6/10
```

El indicador semanal no es una nueva nota formal ni una calificación del Caso integrador 1.

## Día 9

```text
Escrito = 5,70/8,00
Porcentaje = 71,25 %
Equivalencia escrita = 7,1/10
Defensa oral = no realizada
Nota global = no asignada
Estado = cerrado documentalmente
```

La defensa omitida no se convierte artificialmente en `0/2` y el escrito no se incorpora al promedio 8,6 porque no representa una modalidad completa comparable.

---

# 2. Archivos canónicos actualizados

- `03-ESTADO-ACTUAL.md`
- `04-MATRIZ-DE-PROGRESO.md`
- `05-REGISTRO-DIARIO.md`
- `06-ERRORES-Y-RECUPERACIONES.md`
- `99-MANIFIESTO-CIERRE.md`

---

# 3. Evidencia nueva del Día 9

- `EVALUACIONES/2026-08-16_RESPUESTAS-EVALUACION-DIA-09.md`
- `EVALUACIONES/2026-08-16_RESULTADOS-DIA-09-SIN-DEFENSA.md`
- `RESUMENES/2026-08-14_CIERRE-DIA-09.md`

Se conservan como historia:

- `03-ESTADO-ACTUAL-PARCIAL-DIA-09.md`;
- `04-MATRIZ-DE-PROGRESO-PARCIAL-DIA-09.md`;
- `06-ERRORES-Y-RECUPERACIONES-PARCIAL-DIA-09.md`;
- `EVALUACIONES/2026-08-14_RESPUESTAS-DIA-09.md`.

Estos archivos reflejan el estado anterior a la recuperación del 16/08.

---

# 4. Cierre semanal actualizado

- `EVALUACIONES/2026-08-15_RESULTADO-SEMANAL-POR-EVIDENCIA.md`
- `RESUMENES/2026-08-15_CIERRE-CASO-INTEGRADOR-01.md`

Estado:

```text
Semana intensiva 1:
CERRADA POR EVIDENCIA ACUMULADA

Nivel:
ALTO / APROBADO

Indicador:
8,6/10

Caso integrador 1:
práctica guiada completa, sin nota formal

Día 9:
cerrado sin defensa, sin nota global
```

---

# 5. Documento de repaso

Se incorpora:

```text
RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md
```

El documento contiene:

- explicación de cada debilidad;
- ejemplos incorrectos y corregidos;
- Java completo de notificaciones;
- clase abstracta frente a interfaz;
- sobrescritura frente a polimorfismo;
- análisis, diseño e implementación;
- entidad frente a subsistema;
- diagrama de estados;
- secuencia offline segura;
- FIFO frente a trazabilidad;
- asociativa frente a débil;
- modelo final con PK, FK y `UNIQUE`;
- 1FN, 2FN y 3FN;
- supuestos de transmisión;
- señal analógica y digitalización;
- relaciones UML pendientes;
- DCL/TCL;
- algoritmos de ordenación;
- plan de 60 minutos;
- mini examen de veinte preguntas.

---

# 6. Resultado del Día 9 por bloque

| Parte | Máximo | Obtenido |
|---|---:|---:|
| Modelo de diseño | 2,50 | 1,85 |
| Abstracción/Polimorfismo | 2,50 | 1,55 |
| Normalización | 2,50 | 1,95 |
| Integración | 0,50 | 0,35 |
| **Total escrito** | **8,00** | **5,70** |

Fortalezas:

- secuencia sin conexión;
- necesidad FIFO frente a decisión de Cola;
- abstracción, interfaz y polimorfismo conceptuales;
- 2FN, 3FN e ID artificial;
- integración general.

Debilidades:

- Java completo;
- uso de `super`;
- `toString()` y `@Override`;
- entidad frente a subsistema;
- estados completos;
- PK/FK/UNIQUE;
- asociativa frente a débil.

---

# 7. Estado canónico de errores

| Estado | Cantidad |
|---|---:|
| Consolidado | **36** |
| Corregido | **6** |
| Abierto | **8** |
| **Total** | **50** |

Consolidados en este cierre:

```text
E-040 — realización y alternativo sin conexión
E-047 — 2FN e ID artificial
E-048 — confirmación antes de desencolar
```

Nuevo abierto:

```text
E-050 — modelo relacional final incompleto
```

Prioridades abiertas:

```text
E-002 — relaciones UML
E-005 — complejidades de ordenación
E-008 — DCL/TCL
E-016 — Java completo
E-039 — asociativa/débil
E-045 — digitalización/supuestos
E-049 — conectividad/sincronía
E-050 — PK/FK/UNIQUE finales
```

---

# 8. Integridad documental

1. No se inventa una defensa oral.
2. No se asigna una nota global al Día 9.
3. No se modifica el indicador semanal 8,6.
4. Las respuestas originales se preservan separadas de la corrección.
5. Los archivos parciales se conservan como historia.
6. El Caso integrador 1 continúa sin puntaje formal.
7. El repaso se deriva de errores y omisiones observados.
8. Los estados `DO` no se elevan sin defensa suficiente.

---

# 9. Próxima etapa

La semana intensiva 1 y el Día 9 quedan cerrados documentalmente.

La continuación debe priorizar:

```text
repaso dirigido
→ temas no recorridos
→ Java breve y completo
→ simulacro oral integral posterior
```

No se requiere realizar retroactivamente la defensa oral del Día 9 ni el examen semanal omitido.

---

# 10. Decisión de publicación

El cierre documental está completo y debe publicarse mediante un PR separado hacia `main`. No debe fusionarse sin autorización explícita del estudiante.
