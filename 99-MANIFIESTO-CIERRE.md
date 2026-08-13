# Manifiesto — Cierre Día 7

**Fecha:** 12/08/2026  
**Estado académico:** **CERRADO Y APROBADO**  
**Resultado global:** **8,3/10**

---

## Archivos del cierre

### Estado y seguimiento canónico

- `03-ESTADO-ACTUAL.md`
- `04-MATRIZ-DE-PROGRESO.md`
- `04-MATRIZ-DE-PROGRESO-ACTUALIZACION-DIA-07.md`
- `05-REGISTRO-DIARIO.md`
- `06-ERRORES-Y-RECUPERACIONES.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-07.md`

### Evidencia de la jornada

- `DIAS/2026-08-12_DIA-07_CASOS-DE-USO-HERENCIA-DER.md`
- `PLANTILLAS/2026-08-12_PLANTILLA-CASO-DE-USO.md`
- `FICHAS/2026-08-12_FICHA-HERENCIA-JAVA.md`
- `FICHAS/2026-08-12_FICHA-DER-Y-PASAJE-A-TABLAS.md`
- `CASOS/2026-08-12_CASO-INTEGRADOR-OT-CASOS-HERENCIA-DER.md`
- `EVALUACIONES/2026-08-12_EVALUACION-DIA-07.md`
- `EVALUACIONES/2026-08-12_RESPUESTAS-DIA-07.md`
- `EVALUACIONES/2026-08-12_RESULTADOS-DIA-07.md`
- `RESUMENES/2026-08-12_RESUMEN-GUIADO-DIA-07.md`
- `RESUMENES/2026-08-12_CIERRE-DIA-07.md`
- `RESUMENES/2026-08-12_ESTADO-ACUMULADO-DIAS-01-A-07.md`

### Historial de preparación

- `03-ESTADO-ACTUAL-PREPARADO-DIA-07.md`
- `99-MANIFIESTO-PREPARACION-DIA-07.md`

Los archivos de preparación se conservan como evidencia del estado previo. No son el estado académico vigente.

---

## Resultado evaluativo

| Instancia | Resultado |
|---|---:|
| Casos de uso | 2,10/2,50 |
| Herencia/Java | 2,22/2,50 |
| DER | 1,86/2,50 |
| Integración/recuperación | 0,35/0,50 |
| Evaluación escrita | **6,53/8,00 = 8,2/10** |
| Defensa distribuida | **1,72/2,00 = 8,6/10** |
| **Global** | **8,25/10 → 8,3/10 — APROBADO** |

---

## Criterio aplicado

1. Se preservan las respuestas reales, incluidos errores, omisiones y autocorrecciones.
2. La nota 8,3/10 corresponde a una evaluación integrada; no se replica como nota completa de cada materia.
3. La defensa se construyó con las respuestas interactivas justificadas durante la jornada.
4. Como no existió una única exposición final, los temas nuevos se marcan principalmente `A`, no `DO` generalizado.
5. Los errores que reaparecieron permanecen abiertos.
6. Las correcciones se documentan en resultados y errores, no sustituyen silenciosamente la entrega.
7. Los productos preparados se distinguen entre “existentes”, “usados como guía” y “completados”.
8. El estado canónico queda normalizado al Día 7.

---

## Avances publicados

### Casos de uso

- actor;
- caso de uso;
- resultado de valor;
- límite;
- asociación;
- `include`;
- `extend`;
- generalización conceptual;
- precondiciones;
- disparador;
- flujo principal;
- alternativos;
- excepciones;
- postcondiciones.

### Herencia y Java

- herencia;
- superclase/subclase;
- relación `es un`;
- `extends`;
- `this`;
- `super`;
- `super(...)`;
- `static`;
- sobrecarga;
- sobrescritura;
- jerarquía `UsuarioSistema → Encargado / Operario`.

### DER y tablas

- entidad, atributo y relación;
- identificadores;
- cardinalidades 1:N y N:M;
- participaciones mínimas/máximas;
- entidad fuerte/débil;
- multivaluado/derivado;
- FK del lado N;
- tabla asociativa;
- atributos propios de la relación;
- elección de PK según historial.

---

## Recuperaciones consolidadas

- `E-012` — alcance del modelo de datos;
- `E-025` — PDU;
- `E-030` — constructor Java;
- `E-034` — paquete/trama;
- `E-035` — bits/bytes.

Además, `peek/pop` fue respondido correctamente en la recuperación y la evaluación.

---

## Error previo que sigue abierto

- `E-032` — completo frente a verificable.

La respuesta inicial fue correcta, pero en la evaluación se volvió a asociar completo con “medible”.

---

## Errores nuevos

- `E-036` — notación de generalización UML.
- `E-037` — instancia confundida con cantidad.
- `E-038` — simbología de entidad débil y participación total.
- `E-039` — entidad asociativa confundida con entidad débil.

Ajustes sin código nuevo:

- `toString()` omitido;
- segunda postcondición de éxito omitida;
- `UNIQUE` relevante omitido;
- valor para el actor formulado parcialmente como implementación;
- N:M conceptual frente a tabla asociativa todavía requiere precisión.

---

## Estado del registro de errores

| Estado | Cantidad |
|---|---:|
| Consolidado | **26** |
| Corregido | **3** |
| Abierto | **10** |
| **Total** | **39** |

---

## Validación académica

El Día 7 cumple las condiciones de aprobación:

- resultado global superior a 7/10;
- ningún bloque central omitido;
- `include`/`extend` diferenciados;
- constructor sin `void`;
- `super(...)` ubicado correctamente;
- relación `es un` válida;
- DER con cardinalidades;
- N:M transformada mediante tabla asociativa;
- integración entre casos, clases y datos.

Los principales descuentos quedaron concentrados en precisión de DER y simbología UML.

---

## Próxima acción

Preparar el **Día 8 — 13/08/2026 — Modelo de análisis + Colas + Transmisión**, incorporando recuperación breve de:

- generalización UML;
- instancia;
- rectángulo doble/línea doble;
- asociativa frente a débil;
- completo/verificable;
- `toString()`;
- relación N:M conceptual frente a tabla asociativa;
- riesgo de vector/lista.

---

## Decisión documental

El cierre del Día 7 está completo y coherente con la entrega, la interacción guiada y la corrección. Debe publicarse mediante un PR separado hacia `main` y no fusionarse sin autorización explícita del usuario.
