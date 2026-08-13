# Matriz de progreso del programa

**Actualizada al cierre del Día 7 — 12/08/2026**

Usar los estados: `NI` No iniciado, `EA` En aprendizaje, `C` Comprendido, `A` Aplicado, `DO` Defendible oralmente.

> `DO` describe únicamente temas efectivamente defendidos en una exposición suficientemente integrada; no implica dominio de la asignatura completa. La defensa del Día 7 fue distribuida, por lo que sus contenidos nuevos se registran principalmente como `A`.

---

## 1. Análisis y Diseño de Software

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Modelos y finalidad del modelado | A | Día 2 + recuperación/aplicación Día 5 |
| Metodología, método, técnica y herramienta | A | Día 2 + aplicación Día 5 |
| Cascada, incremental, prototipado y espiral | EA | Cascada/incremental/prototipado comprendidos; espiral falta profundizar |
| Paradigma orientado a objetos | NI | Pendiente como bloque específico de Análisis y Diseño |
| UML: propósito y elementos | C | Casos de uso y notaciones introducidas; otras vistas pendientes |
| Asociación, dependencia, generalización y agregación | EA | Asociación/generalización aplicadas; agregación/composición/dependencia pendientes |
| Multiplicidad y navegabilidad | EA | Multiplicidad trabajada en DER; navegabilidad UML pendiente |
| Vistas de UML | NI | Pendiente |
| PUD: dirigido por casos de uso | DO | Aplicado y defendido en Día 5 |
| PUD: centrado en la arquitectura | DO | Arquitectura/documentación recuperado y defendido |
| PUD: iterativo e incremental | DO | Iteración/incremento aplicado y defendido |
| Inicio, elaboración, construcción y transición | DO | Diferenciadas y defendidas en Día 5 |
| Flujos de requisitos, análisis, diseño, implementación y prueba | A | Diferenciados de fases y recuperados en Días 5–6 |
| Artefacto, trabajador, actividad y flujo | NI | Pendiente |
| Ingeniería de requerimientos | DO | Definida, aplicada y defendida en Día 6 |
| Elicitación | DO | Entrevistas/preguntas/observación aplicadas al caso |
| Especificación | DO | Necesidades transformadas en RF, RNF y reglas |
| Validación de requerimientos | DO | Revisión con usuario, consistencia y retroalimentación |
| RF, RNF y calidad de requerimientos | A | RF/RNF defendidos; propiedades aplicadas con ajustes |
| Regla de negocio | DO | Diferenciada de RF/RNF y defendida |
| Correcto, consistente, completo y realista | A | Aplicados; completo/verificable aún se mezclan bajo presión |
| Necesario, verificable y rastreable | A | Aplicados; trazabilidad origen→prueba comprendida |
| Modelo de negocio y modelo de dominio | NI | Pendiente |
| Actor | A | Rol externo aplicado a Encargado/Operario Día 7 |
| Caso de uso | A | Objetivo y resultado de valor aplicados |
| Resultado de valor | C/A | Comprendido; evitar formularlo como persistencia técnica |
| Límite del sistema | A | Actores fuera; casos dentro |
| Asociación actor–caso | A | Interacción/participación correctamente explicada |
| `include` | A | Obligatorio; base → incluido |
| `extend` | A | Opcional/condicionado; extensión → base |
| Generalización conceptual | A | Hijo → padre; especialización comprendida |
| Notación de generalización UML | EA | `--|>` interpretado incorrectamente en evaluación |
| Precondiciones | A | Estados previos válidos |
| Disparador | A | Evento de inicio identificado |
| Flujo principal | A | Secuencia completa de Crear OT |
| Flujos alternativos | A | Fecha programada opcional |
| Excepciones | A | Sector faltante bloquea creación |
| Postcondiciones | C/A | Éxito/fallo comprendidos; completitud pendiente |
| Prototipo de interfaz | C | Diferenciado del caso de uso; usado como guía |
| Modelo de análisis | NI | Programado para Día 8 |
| Modelo de diseño | NI | Pendiente |
| Modelo de implementación | NI | Pendiente |
| Modelo de pruebas | NI | Pendiente |
| Arquitectura, documentación, implementación y testeo | EA | Arquitectura aplicada; resto pendiente |

---

## 2. Programación Orientada a Objetos

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Características básicas de Java | C/A | Clases escritas; precisión y completitud todavía en seguimiento |
| Clases y objetos | DO | Aplicado a `OrdenTrabajo` y defendido oralmente |
| Estado, comportamiento e identidad | DO | Recuperado y defendido en Día 5 |
| Atributos, métodos y constructores | A | Constructor consolidado Día 7 |
| Encapsulamiento y modificadores | DO | Encapsulamiento defendido; `private/public` aplicados |
| `this` | A | Aplicado en clases y subclases |
| `super` | A | Constructor de superclase invocado primero |
| Miembros estáticos | A | Contador de instancias aplicado |
| Herencia | A | Jerarquía `UsuarioSistema → Encargado/Operario` |
| Superclase/subclase | A | Relación padre–hijos correctamente modelada |
| Especialización/reutilización | A | Atributos/métodos comunes y específicos diferenciados |
| `extends` | A | Sintaxis correcta |
| Sobrecarga y sobrescritura | A | `buscarOT` y `getRol` aplicados |
| Polimorfismo | EA | Base conceptual disponible; bloque formal pendiente |
| Abstracción | NI | Pendiente |
| Clase y método abstractos | C | Buena comprensión diagnóstica; profundización posterior |
| Interfaces | C | Comprensión del contrato; profundización posterior |
| Clase `Object` | C | Reconocida; profundización pendiente |
| `toString()` | EA | Exigido en Día 7 pero omitido en código final |
| `equals/hashCode` y comparación | NI | Pendiente |
| Arreglos | NI | Pendiente dentro de POO; trabajados en Estructuras |
| `ArrayList` | NI | Pendiente |
| Clase `String` | NI | Pendiente |
| Excepciones | NI | Pendiente |
| Excepciones propias | NI | Pendiente |
| Archivos | NI | Pendiente |
| Aplicación Java escrita a mano | A | Clase OT + jerarquía de usuarios escritas sin apuntes |

---

## 3. Algoritmos y Estructuras de Datos

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| TDA y estructuras estáticas/dinámicas | A | Interfaz independiente de implementación consolidada |
| Arreglos y operaciones | A | Definición, capacidad/longitud y elección aplicadas |
| Nodos y referencias | C | Dato + referencia comprendidos |
| Pilas: concepto y operaciones | DO | Pila/LIFO aplicados y defendidos en Día 6 |
| Cima, `push`, `pop`, `peek`, `esVacia` | A | Simulación completa; `peek/pop` recuperados Día 7 |
| Pilas con vectores | A | Índice `top`, capacidad y desbordamiento aplicados |
| Pilas con listas enlazadas | A | Cabecera/top, nodos y tamaño variable aplicados |
| Comparación vector/lista enlazada | A | Memoria, capacidad, riesgos e interfaz comparados; riesgo requiere repetición |
| Colas: concepto y operaciones | C | FIFO correcto en diagnóstico; bloque formal Día 8 |
| Colas con vectores | NI | Programado para Día 8 |
| Colas con listas enlazadas | NI | Programado para Día 8 |
| Lista simplemente enlazada | A | Recorrido e inserción al inicio aplicados |
| Lista doblemente enlazada | NI | Pendiente |
| Lista circular | NI | Pendiente |
| Lista ordenada | NI | Pendiente |
| Iteradores | NI | Pendiente |
| Ordenación por inserción | EA | Complejidad todavía inestable |
| Shellsort | NI | Pendiente |
| Mergesort | C | Estrategia comprendida; complejidad a consolidar |
| Quicksort | C | Pivote/recursión comprendidos; complejidad a consolidar |
| Selección de estructura según problema | A | Pila elegida por operación dominante; generalización a otras estructuras pendiente |

---

## 4. Base de Datos I

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Motor relacional | NI | Pendiente |
| Relación, tupla, atributo y dominio | A | Modelo básico aplicado; dominio consolidado |
| Grado y cardinalidad relacional | DO | Definidos, calculados y defendidos |
| Claves primaria, candidata y foránea | DO | Candidata = superclave mínima; FK 1:N defendida |
| Álgebra relacional | NI | Pendiente |
| Selección y proyección | NI | Pendiente |
| Unión, diferencia y producto cartesiano | NI | Pendiente |
| Join | NI | Pendiente |
| DER: propósito | A | Modelo conceptual aplicado Día 7 |
| Entidad | A | Sector, OT y Operario identificados |
| Instancia | EA | Confundida con cantidad de objetos |
| Atributo en DER | A | Atributos ubicados correctamente |
| Relación en DER | A | 1:N y N:M aplicadas |
| Cardinalidad 1:1 | C | Concepto reconocido |
| Cardinalidad 1:N | A | Sector 0..N ↔ OT 1..1 |
| Cardinalidad N:M | A | OT ↔ Operario |
| Participación mínima/máxima | A | 0..N y 1..1 aplicados |
| Entidad fuerte | C/A | Identificación propia comprendida |
| Entidad débil | C | Concepto comprendido; asociativa confundida |
| Simbología DER | EA | Error en rectángulo doble/línea doble |
| Atributo multivaluado | A | Teléfonos transformados en tabla relacionada |
| Atributo derivado | A | Edad derivada de fecha de nacimiento |
| Participación total/parcial | A | OT total, Sector parcial |
| Pasaje entidad→tabla | A | Entidades fuertes transformadas |
| Pasaje 1:N | A | FK en lado N |
| Pasaje N:M | A | Tabla `ASIGNACION_OT` |
| Tabla asociativa | A | Dos FK y atributos propios |
| Asociativa vs. entidad débil | EA | Clasificación incorrecta en evaluación |
| Historial y elección de PK | C/A | Limitación de PK compuesta comprendida durante práctica |
| Restricciones `UNIQUE` | C | Concepto previo; omitido en pasaje final |
| Primera forma normal | EA | Práctica diagnóstica correcta; bloque formal pendiente |
| Segunda forma normal | EA | Falta dependencia parcial formal |
| Tercera forma normal | EA | Falta dependencia transitiva formal |
| DDL | C | `CREATE` identificado correctamente |
| DML | C | `INSERT` identificado correctamente |
| DCL | EA | `GRANT` pendiente |
| TCL | EA | `COMMIT` pendiente |
| SELECT, JOIN y subconsultas | NI | Pendiente como bloque académico |
| GROUP BY y HAVING | C | Diferencia comprendida |
| Bloques procedimentales | NI | Pendiente |
| Procedimientos y funciones | NI | Pendiente |
| Cursores | NI | Pendiente |
| Triggers | NI | Pendiente |

---

## 5. Comunicaciones

| Tema | Estado | Evidencia acumulada |
|---|---|---|
| Sistema de comunicaciones | C | Día 4: 8,6/10 escrito |
| ETD y ETCD | EA | Introducido; no evaluado en profundidad |
| Protocolos y normalización | A | Protocolo aplicado; normalización pendiente |
| Modelo OSI | DO | Siete capas y recorrido defendidos Día 6 |
| Funciones de las siete capas | DO en el núcleo recorrido | Transporte/Red/Enlace/Física aplicadas |
| TCP/IP y comparación con OSI | DO | Arquitectura/pila y correspondencia defendidas |
| Cinco capas TCP/IP | A | Reproducidas sin errores |
| Encapsulamiento y desencapsulamiento | DO | Explicados y defendidos |
| PDU, SDU y PCI | A / consolidado | Sigla y fórmula recuperadas Día 7 |
| Datos, segmento, paquete, trama y bits | A | Orden correcto; paquete/trama y bits consolidados Día 7 |
| MAC, IP y puerto | DO | Diferenciados y defendidos |
| Switch y router | A | Trama/MAC frente a paquete/IP consolidados |
| Procesamiento por nodos intermedios | A | Switch hasta capa 2; router hasta capa 3 |
| Medida de la información | NI | Programado para Día 8 |
| Señales analógicas y digitales | NI | Programado para Día 8 |
| Frecuencia, período y muestreo | NI | Programado para Día 8 |
| Serie/paralela | NI | Programado para Día 8 |
| Síncrona/asíncrona | A | Consolidada en recuperación Día 6 |
| Medios guiados/no guiados | C | Ejemplos correctos |
| Atenuación, ruido, interferencia, dispersión y latencia | NI | Pendiente |
| Dispositivos de capa física | NI | Pendiente |
| Última milla | NI | Pendiente |
| Funciones de protocolos | NI | Pendiente |
| HDLC y PPP | NI | Pendiente |
| Ethernet | EA | Concepto general presente; bloque pendiente |
| LLC y MAC | NI | Pendiente |
| IEEE 802.x | NI | Pendiente |
| Redes de difusión y conmutadas | NI | Pendiente |
| Conmutación de circuitos y paquetes | NI | Pendiente |
| Topologías | NI | Pendiente |
| LAN y WAN | C | Comprensión general correcta |
| Enrutamiento | A | Router/IP y recorrido entre redes aplicados |
| MPLS y congestión | NI | Pendiente |
| Comunicaciones móviles y tendencias | NI | Pendiente |

---

## Evidencia evaluativa acumulada

| Jornada | Resultado |
|---|---:|
| Día 1 — Diagnóstico general | 5,6/10 promedio |
| Día 2 — Análisis y Diseño + POO | 8,0/10 global |
| Día 3 — Estructuras + Base de Datos | 8,3/10 global |
| Día 4 — Comunicaciones escrita | 8,6/10 |
| Día 5 — PUD + POO + modelo relacional | 9,0/10 global |
| Día 6 — Requisitos + Pilas + OSI/TCP-IP | 9,2/10 global |
| Día 7 — Casos de uso + Herencia + DER | **8,3/10 global** |

---

## Pendientes de retención inmediata

1. Generalización UML y notación triangular.
2. Instancia como ocurrencia concreta.
3. Rectángulo doble = entidad débil.
4. Línea doble = participación total.
5. Entidad asociativa frente a entidad débil.
6. Completo frente a verificable.
7. `toString()` cuando se solicita.
8. Relación N:M conceptual frente a tabla asociativa.
9. Reglas generales de pasaje a tablas y `UNIQUE`.
10. Riesgo de vector frente a lista enlazada.

## Regla de lectura

La matriz mide evidencia obtenida hasta la fecha. Un tema `NI` no significa ausencia total de experiencia, sino ausencia de evidencia suficiente dentro de este sistema de estudio. Un tema `DO` no implica dominio de toda la materia.
