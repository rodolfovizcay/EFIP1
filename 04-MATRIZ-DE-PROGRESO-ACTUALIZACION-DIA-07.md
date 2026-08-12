# Matriz de progreso — actualización al cierre del Día 7

**Fecha:** 12/08/2026  
**Resultado global:** 8,3/10 — APROBADO

Estados:

- `NI` = No iniciado
- `EA` = En aprendizaje
- `C` = Comprendido
- `A` = Aplicado
- `DO` = Defendible oralmente

> La defensa del Día 7 fue distribuida en controles interactivos. Por prudencia, los temas nuevos se elevan principalmente a `A`; no se asigna `DO` de forma automática sin una exposición integrada única.

---

# 1. Análisis y Diseño

| Tema | Estado previo | Estado Día 7 | Evidencia |
|---|---|---|---|
| Actor | EA | **A** | Rol externo identificado y aplicado a Encargado/Operario |
| Caso de uso | EA | **A** | Funcionalidad con objetivo y resultado de valor |
| Resultado de valor | EA | **C/A** | Comprendido; debe evitar formularse como persistencia interna |
| Límite del sistema | NI/EA | **A** | Actores fuera; casos dentro |
| Asociación actor–caso | EA | **A** | Participación/interacción correctamente explicada |
| `include` | EA | **A** | Obligatorio; base → incluido |
| `extend` | EA | **A** | Opcional/condicionado; extensión → base |
| Generalización conceptual | EA | **A** | Hijo → padre; especialización comprendida |
| Notación de generalización | EA | **EA** | `--|>` interpretado incorrectamente en la evaluación |
| Precondiciones | NI/EA | **A** | Estados previos válidos: rol y autenticación |
| Disparador | NI/EA | **A** | Evento de inicio correctamente identificado |
| Flujo principal | NI/EA | **A** | Secuencia de creación de OT aplicada |
| Flujos alternativos | NI/EA | **A** | Fecha programada opcional correctamente separada |
| Excepciones | NI/EA | **A** | Sector ausente impide creación y permite corrección |
| Postcondiciones | NI/EA | **C/A** | Éxito/fallo comprendidos; faltó una postcondición de éxito |
| Prototipo de interfaz | NI | **C** | Diferenciado del caso de uso; no completado como producto independiente |
| Trazabilidad caso→clases→datos | EA | **C/A** | Integración realizada con ajustes |

---

# 2. Programación Orientada a Objetos / Java

| Tema | Estado previo | Estado Día 7 | Evidencia |
|---|---|---|---|
| Herencia | NI | **A** | Relación `es un` aplicada |
| Superclase/subclase | NI/EA | **A** | `UsuarioSistema` con `Encargado` y `Operario` |
| Especialización/reutilización | NI/EA | **A** | Métodos comunes y específicos diferenciados |
| `extends` | NI | **A** | Sintaxis correcta en ambas subclases |
| `this` | A parcial | **A** | Atributos de instancia inicializados correctamente |
| `super` | NI | **A** | Constructor de superclase invocado primero |
| Miembros estáticos | NI | **A** | `cantidadUsuarios` compartido por la clase |
| Constructor Java | corregido | **A / consolidado** | Sin `void`; mismo nombre; `super(...)` primero |
| Sobrecarga | A | **A** | `buscarOT(int)` y `buscarOT(String)` |
| Sobrescritura | A | **A** | `getRol()` redefinido en subclases |
| Clase `Object` | NI | **C** | Origen de `toString()` reconocido; método omitido en código final |
| `toString()` | NI | **EA** | Exigido pero no implementado en la entrega |
| Aplicación Java escrita | A | **A** | Jerarquía completa con error menor de completitud |

---

# 3. Base de Datos

| Tema | Estado previo | Estado Día 7 | Evidencia |
|---|---|---|---|
| DER: propósito | NI | **A** | Estructura conceptual de datos comprendida |
| Entidad | NI/EA | **A** | Sector, OT, Operario identificados |
| Instancia | NI/EA | **EA** | Confundida con cantidad de objetos |
| Atributo | NI/EA | **A** | Atributos asignados a entidades/relación |
| Relación | NI/EA | **A** | Relaciones nombradas y justificadas |
| Cardinalidad 1:1 | NI | **C** | Reconocida; sin ejercicio central propio |
| Cardinalidad 1:N | C parcial | **A** | Sector 0..N ↔ OT 1..1 |
| Cardinalidad N:M | NI/EA | **A** | OT ↔ Operario mediante asignación |
| Participación mínima/máxima | NI/EA | **A** | 0..N y 1..1 aplicados tras corrección |
| Entidad fuerte | NI | **C/A** | Identificación propia comprendida |
| Entidad débil | NI | **C** | Concepto comprendido; confusión con asociativa |
| Simbología DER | NI/EA | **EA** | Error en rectángulo doble y línea doble |
| Atributo multivaluado | NI | **A** | Teléfonos transformados en tabla relacionada |
| Atributo derivado | NI | **A** | Edad derivada de fecha de nacimiento |
| Pasaje entidad→tabla | NI/EA | **A** | Entidades fuertes convertidas en tablas |
| Pasaje 1:N | NI/EA | **A** | FK `id_sector` en `ORDEN_TRABAJO` |
| Pasaje N:M | NI/EA | **A** | `ASIGNACION_OT` con dos FK |
| Tabla asociativa | NI/EA | **A** | Atributos propios de la asignación |
| Asociativa vs. débil | NI | **EA** | Clasificación incorrecta en evaluación |
| Historial y elección de PK | NI/EA | **C/A** | Limitación de PK compuesta comprendida durante la práctica |
| `UNIQUE` | EA | **C** | Concepto previo; omitido en pasaje final |

---

# 4. Recuperación transversal

| Tema | Estado previo | Estado Día 7 | Evidencia |
|---|---|---|---|
| Constructor Java | Corregido | **Consolidado** | Recuperación inicial + código + evaluación |
| PDU | Corregido | **Consolidado** | `Protocol Data Unit` y `SDU + PCI` |
| Completo/verificable | Abierto | **Abierto** | Correcto al inicio; mezclado nuevamente en evaluación |
| Paquete/trama | Abierto | **Consolidado** | Correcto en dos instancias |
| Bits/bytes | Abierto | **Consolidado** | Física = bits/señales |
| `peek`/`pop` | A con precisión pendiente | **A** | Consulta sin eliminar vs. devuelve/elimina |
| Alcance del modelo de datos | Corregido | **Consolidado** | DER con varias entidades/relaciones |

---

# 5. Resultado del Día 7

| Instancia | Resultado |
|---|---:|
| Evaluación escrita | **6,53/8,00 = 8,2/10** |
| Defensa distribuida | **1,72/2,00 = 8,6/10** |
| **Global** | **8,25/10 → 8,3/10** |

**Estado: APROBADO**

---

# 6. Pendientes prioritarios

1. Generalización UML: simbología correcta.
2. Instancia como ocurrencia concreta.
3. Rectángulo doble y línea doble.
4. Entidad asociativa frente a entidad débil.
5. Completo frente a verificable.
6. `toString()` en código Java cuando se solicita.
7. Relación N:M conceptual frente a tabla asociativa.
8. Reglas generales de pasaje a tablas.
9. `UNIQUE` y claves para historial.
