# Estado actual — EFIP I

**Fecha académica registrada:** 12 de agosto de 2026  
**Jornada:** Día 7 — Casos de uso + Herencia + DER — CERRADO  
**Modalidad evaluada:** escrita + defensa distribuida en controles interactivos  
**Próxima acción:** preparar el Día 8 del 13/08/2026 con Modelo de análisis + Colas + Transmisión.

---

## Resultado acumulado

| Materia | Diagnóstico Día 1 | Última evidencia | Estado actual |
|---|---:|---:|---|
| Análisis y Diseño | 4,75/10 | Día 7: casos de uso aplicados; global 8,3/10 | PUD y Requerimientos defendibles; casos de uso aplicados con notación UML pendiente |
| Programación Orientada a Objetos | 5,5/10 | Día 7: jerarquía Java y herencia; global 8,3/10 | Fundamentos y herencia aplicados; constructor consolidado; `Object/toString` pendiente |
| Algoritmos y Estructuras | 7,0/10 | Día 6: pila/LIFO defendidos; recuperaciones Día 7 | TDA y Pilas aplicados; Colas pendientes |
| Base de Datos | 6,0/10 | Día 7: DER y pasaje a tablas; global 8,3/10 | Modelo relacional/claves defendibles; DER aplicado con simbología y clasificación pendientes |
| Comunicaciones | 4,75/10 | Día 6: 9,2/10 global; recuperaciones Día 7 | OSI/TCP-IP defendible; PDU, paquete/trama y bits/señales consolidados |

> Las notas de los Días 5, 6 y 7 corresponden a evaluaciones integradas. No deben interpretarse como exámenes completos e independientes de cada materia.

---

## Resultado del Día 7

- Evaluación escrita: **6,53/8,00 = 8,2/10**.
- Defensa distribuida: **1,72/2,00 = 8,6/10**.
- Resultado global: **8,25/10 → 8,3/10 — APROBADO**.
- Materias principales: **Análisis y Diseño + POO + Base de Datos**.
- Caso integrador: **crear, asignar y gestionar Órdenes de Trabajo mediante casos de uso, jerarquía de clases y DER**.

> La defensa se obtuvo de respuestas justificadas durante los controles interactivos. No hubo una exposición única de 8–10 minutos; por eso los temas nuevos se registran principalmente como `A`, no como `DO` generalizado.

---

## Avances confirmados

### Análisis y Diseño — Casos de uso

- Actor como rol externo.
- Caso de uso como secuencia que aporta un resultado de valor.
- Límite del sistema.
- Asociación actor–caso.
- Nombres verbales de casos de uso.
- `include` como comportamiento obligatorio.
- Dirección `BASE → INCLUIDO`.
- `extend` como comportamiento opcional/condicionado.
- Dirección `EXTENSIÓN → BASE`.
- Generalización conceptual `HIJO → PADRE`.
- Precondiciones como estados previos.
- Disparador.
- Flujo principal.
- Flujo alternativo.
- Excepción.
- Postcondiciones de éxito/fallo.
- Aplicación a `Crear Orden de Trabajo`.

### POO / Java — Herencia

- Herencia, superclase y subclase.
- Especialización y reutilización.
- Relación conceptual `es un`.
- `extends`.
- `this` frente a `super`.
- `super(...)` como primera sentencia del constructor.
- Miembros estáticos.
- Sobrecarga.
- Sobrescritura.
- Jerarquía `UsuarioSistema → Encargado / Operario`.
- Contador estático de instancias.
- Constructor Java recuperado y consolidado.

### Base de Datos — DER

- DER como modelo conceptual.
- Entidades, atributos y relaciones.
- Identificadores.
- Cardinalidad 1:N.
- Cardinalidad N:M.
- Participación mínima/máxima.
- Entidad fuerte y débil en el núcleo conceptual.
- Atributos multivaluados y derivados.
- Participación total/parcial.
- `SECTOR 1:N ORDEN_TRABAJO`.
- `ORDEN_TRABAJO N:M OPERARIO`.
- Tabla asociativa `ASIGNACION_OT`.
- Atributos propios de una relación.
- Pasaje inicial de entidades y relaciones a tablas.
- Elección de PK según exista o no historial.

### Integración

- Necesidad/RF → caso de uso.
- Actor → participación externa.
- Caso de uso → varias clases y métodos.
- Jerarquía de usuarios mediante herencia.
- Entidades y relaciones persistentes mediante DER.
- FK del lado N.
- Tabla asociativa para N:M.
- Caso de prueba con OT en estado `PENDIENTE`.

---

## Recuperaciones consolidadas en el Día 7

1. **Constructor Java:** mismo nombre de clase, sin tipo de retorno y sin `void`.
2. **PDU:** `Protocol Data Unit = SDU + PCI`.
3. **Paquete/trama:** Red/Internet → paquete; Enlace/Acceso → trama.
4. **Bits/bytes:** Física transmite bits/señales.
5. **Alcance del modelo de datos:** se identifican entidades y relaciones antes de pasar a tablas.
6. **`peek`/`pop`:** consulta sin eliminar frente a devolución + eliminación.

---

## Ajustes detectados durante el Día 7

1. Un resultado de valor debe expresarse desde el objetivo del actor, no solo como “persistir”.
2. `--|>` es una notación textual válida de generalización; la punta triangular apunta al padre.
3. La consigna de postcondiciones exigía dos de éxito y una de fallo.
4. `toString()` fue requerido pero omitido en el código final.
5. Instancia significa ocurrencia concreta, no cantidad de objetos.
6. Rectángulo doble = entidad débil.
7. Línea doble = participación total.
8. Una entidad/tabla asociativa no es débil automáticamente.
9. Una relación N:M conceptual se implementa mediante una tabla asociativa en el modelo relacional.
10. `Completo` volvió a mezclarse con `verificable` al incluir “medible”.
11. En el pasaje a tablas faltó declarar un `UNIQUE` relevante.
12. La PK compuesta `(id_ot,id_operario)` no permite varias asignaciones históricas de la misma pareja.

---

## Pendientes abiertos prioritarios

### Análisis y Diseño

1. Asociación, agregación, composición y dependencia.
2. Generalización UML: notación precisa.
3. Completo frente a verificable.
4. Resultado de valor frente a detalle técnico.
5. Practicar una defensa integrada continua.
6. Modelo de análisis: interfaz, control y entidad.

### POO / Java

7. Precisión general de sintaxis Java.
8. `toString()` y clase `Object`.
9. `equals/hashCode` y comparación.
10. Abstracción, interfaces y polimorfismo.

### Algoritmos y Estructuras

11. Complejidades de ordenación.
12. Riesgo de vector frente a lista enlazada.
13. Colas, FIFO y sus implementaciones.

### Base de Datos

14. Instancia como ocurrencia concreta.
15. Simbología DER completa.
16. Entidad asociativa frente a entidad débil.
17. Reglas generales de pasaje a tablas.
18. `UNIQUE` y claves para historial.
19. DCL/TCL.
20. Normalización y álgebra relacional.

### Comunicaciones

21. Medida de la información.
22. Señales, muestreo y transmisión.
23. Serie/paralela.
24. Profundizar enlace, Ethernet, WAN y conmutación.

---

## Estado de errores canónico

| Estado | Cantidad |
|---|---:|
| Consolidado | **26** |
| Corregido, pendiente de consolidación | **3** |
| Abierto | **10** |
| **Total registrado** | **39** |

Nuevos códigos del Día 7:

- `E-036` — notación de generalización UML;
- `E-037` — instancia confundida con cantidad;
- `E-038` — simbología de entidad débil/participación total;
- `E-039` — entidad asociativa confundida con entidad débil.

---

## Evidencia principal del Día 7

- `DIAS/2026-08-12_DIA-07_CASOS-DE-USO-HERENCIA-DER.md`
- `EVALUACIONES/2026-08-12_RESPUESTAS-DIA-07.md`
- `EVALUACIONES/2026-08-12_RESULTADOS-DIA-07.md`
- `04-MATRIZ-DE-PROGRESO-ACTUALIZACION-DIA-07.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-07.md`
- `RESUMENES/2026-08-12_CIERRE-DIA-07.md`
- `RESUMENES/2026-08-12_ESTADO-ACUMULADO-DIAS-01-A-07.md`

---

## Próxima jornada

**Día 8 — 13/08/2026: Modelo de análisis + Colas + Transmisión**

Recuperación inicial recomendada:

- generalización UML;
- instancia;
- rectángulo doble/línea doble;
- asociativa frente a débil;
- completo/verificable;
- `toString()`;
- N:M conceptual frente a tabla asociativa.

---

## Criterio de cierre

El Día 7 se considera **CERRADO Y APROBADO con 8,3/10**.

Los estados `Defendible oralmente` continúan limitados a núcleos formalmente defendidos. Los contenidos nuevos del Día 7 se consideran principalmente `Aplicados`.
