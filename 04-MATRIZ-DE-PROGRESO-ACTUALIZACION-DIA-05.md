# Matriz de progreso — actualización al cierre del Día 5

Estados:

- `NI` = No iniciado
- `EA` = En aprendizaje
- `C` = Comprendido
- `A` = Aplicado
- `DO` = Defendible oralmente

> `DO` se asigna solo al contenido efectivamente defendido, no a la materia completa.

## Análisis y Diseño

| Tema | Estado previo | Estado Día 5 | Evidencia |
|---|---|---|---|
| Modelo y finalidad | C | A | Definición sin apuntes y aplicación |
| Metodología, método, técnica y herramienta | C | A | Definiciones y ejemplos; técnica de entrevista y herramienta CASE |
| PUD dirigido por casos de uso | C | DO | Explicado, aplicado y defendido |
| PUD centrado en arquitectura | C | DO | Arquitectura/documentación recuperado y aplicado |
| PUD iterativo e incremental | C | DO | Iteración e incremento correctamente relacionados |
| Inicio | C | DO | Visión, alcance y planificación inicial |
| Elaboración | C | DO | Línea base arquitectónica |
| Construcción | C | DO | Producto completo preparado para entrega |
| Transición | C | DO | Beta, feedback, correcciones, capacitación y asistencia |
| Flujos Requisitos/Análisis/Diseño/Implementación/Prueba | NI | C | Diferenciados de las fases al final de la defensa |
| Aplicación de riesgos en una iteración | EA | A | Riesgos de hora, bloqueo y planificación identificados |

## Programación Orientada a Objetos

| Tema | Estado previo | Estado Día 5 | Evidencia |
|---|---|---|---|
| Clase | C | DO | Plantilla/definición de tipo aplicada a `OrdenTrabajo` |
| Objeto | C | DO | Instancia concreta con estado, comportamiento e identidad |
| Estado | C | DO | Valores actuales de atributos |
| Comportamiento | C | DO | Métodos `iniciar`, `despachar`, `cambiarPrioridad`, `anular` |
| Identidad | EA | DO | Diferenciada de ID y de igualdad de estado |
| Atributos y métodos | C | A | Aplicados en clase Java |
| Constructor | C | A | Concepto correcto; error formal corregido |
| `this` | C | A | Atributo de instancia frente a parámetro |
| Encapsulamiento | A | DO | Privados + interfaz controlada justificada desde reglas del dominio |
| Modificadores de acceso | C | C | Uso de `private` y `public`; otros alcances no defendidos |
| Sobrecarga / sobrescritura | EA | A | Recuperadas con ejemplos correctos |
| Sintaxis Java escrita | EA | C | Mejora clara; queda error de constructor para recuperación |

## Base de Datos

| Tema | Estado previo | Estado Día 5 | Evidencia |
|---|---|---|---|
| Relación | A | DO | `ORDEN_TRABAJO` correctamente identificada |
| Tupla | C | DO | Fila concreta correctamente ejemplificada |
| Atributo | C | DO | Columnas correctamente identificadas |
| Cabecera | C | A | Conjunto de atributos correctamente identificado |
| Dominio | C | A | Se corrigió valores observados vs. valores permitidos |
| Grado | A | DO | Cantidad de atributos; cálculo correcto |
| Cardinalidad | C | DO | Cantidad de tuplas; cálculo correcto |
| Superclave | EA | A | Uno o más atributos que identifican unívocamente |
| Clave candidata | EA | DO | Superclave mínima; múltiples candidatas comprendidas |
| Clave primaria | A | DO | Candidata seleccionada; `id_ot` aplicado |
| Clave foránea | A | DO | Referencia a otra relación y repetición válida en 1:N |
| Relación 1:N | C | DO | `SECTOR 1:N ORDEN_TRABAJO` defendida |

## Recuperación transversal

| Tema | Estado previo | Estado Día 5 | Evidencia |
|---|---|---|---|
| TDA | EA | C | Datos/objetos + operaciones + abstracción de implementación; falta automatizar `interfaz` |
| Sobrecarga / sobrescritura | EA | A | Recuperación con código conceptual |
| PDU | EA | C | Unidad de Datos de Protocolo; confusión con PUD corregida |
| Puerto | EA | C | Proceso/servicio de transporte dentro del host |
| Síncrona / asíncrona | EA | C | Carácter + start/stop vs. bloque + cabecera/terminación |

## Resultado global del Día 5

- Evaluación escrita/integrada: **9,0/10**.
- Defensa oral: **9,0/10**.
- Resultado global: **9,0/10 — APROBADO**.

## Pendientes de retención

1. Constructor Java.
2. TDA con la palabra `interfaz` explícita.
3. PDU como `datos + información de control`.
4. Síncrona/asíncrona.
5. Fases vs. flujos del PUD.
