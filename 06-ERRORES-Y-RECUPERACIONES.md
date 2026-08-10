# Registro de errores y recuperaciones

No registrar solo la respuesta correcta. Registrar por qué se produjo el error y qué regla evita repetirlo.

## Plantilla

### Error E-000

- **Fecha:**
- **Materia:**
- **Tema:**
- **Tipo:** conceptual / terminológico / aplicación / sintaxis / defensa oral
- **Respuesta o desarrollo incorrecto:**
- **Corrección:**
- **Por qué ocurrió:**
- **Regla para no repetirlo:**
- **Ejercicio de recuperación:**
- **Fecha de recuperación:**
- **Resultado:**
- **Estado:** abierto / corregido / consolidado

## Errores abiertos

Todavía no se registraron errores.


### Error E-001

- **Fecha:** 2026-08-05
- **Materia:** Análisis y Diseño
- **Tema:** PUD centrado en la arquitectura
- **Tipo:** conceptual / terminológico
- **Respuesta o desarrollo incorrecto:** Se lo definió como centrado en la documentación.
- **Corrección:** Se centra en las decisiones significativas sobre organización, elementos estructurales, interfaces, colaboraciones, subsistemas y estilo arquitectónico.
- **Por qué ocurrió:** Se asoció arquitectura con documentación del proyecto.
- **Regla para no repetirlo:** Arquitectura responde a cómo se organiza técnicamente el sistema; documentación es uno de sus artefactos, no su centro.
- **Ejercicio de recuperación:** Explicar cómo casos de uso y arquitectura se equilibran dentro del PUD.
- **Fecha de recuperación:** pendiente
- **Resultado:** pendiente
- **Estado:** abierto

### Error E-002

- **Fecha:** 2026-08-05
- **Materia:** Análisis y Diseño
- **Tema:** Asociación, agregación y composición
- **Tipo:** conceptual
- **Respuesta o desarrollo incorrecto:** Asociación se confundió con dependencia; agregación con herencia; composición con clase hija.
- **Corrección:** Asociación conecta clases; agregación es una relación todo/parte débil; composición es una relación todo/parte fuerte con dependencia de ciclo de vida.
- **Por qué ocurrió:** Se mezclaron relaciones UML distintas.
- **Regla para no repetirlo:** Herencia = “es un”; agregación/composición = “tiene un”; asociación = “se relaciona con”.
- **Ejercicio de recuperación:** Clasificar cuatro relaciones de un sistema de órdenes de trabajo.
- **Fecha de recuperación:** pendiente
- **Resultado:** pendiente
- **Estado:** abierto


### Error E-003

- **Fecha:** 2026-08-05
- **Materia:** Programación Orientada a Objetos
- **Tema:** Estado de un objeto
- **Tipo:** conceptual
- **Respuesta o desarrollo incorrecto:** Se definió el estado como editable/no editable o visible/no visible.
- **Corrección:** El estado es el conjunto de valores actuales de los atributos del objeto en un momento determinado.
- **Por qué ocurrió:** Se confundió estado con mutabilidad y visibilidad.
- **Regla para no repetirlo:** Estado responde a “qué valores tiene ahora”; visibilidad responde a “quién puede acceder”.
- **Ejercicio de recuperación:** Describir dos estados distintos del mismo objeto `OrdenTrabajo`.
- **Fecha de recuperación:** pendiente
- **Resultado:** pendiente
- **Estado:** abierto

### Error E-004

- **Fecha:** 2026-08-05
- **Materia:** Programación Orientada a Objetos
- **Tema:** Sobrecarga y sobrescritura
- **Tipo:** conceptual
- **Respuesta o desarrollo incorrecto:** No se recordó la diferencia.
- **Corrección:** Sobrecarga: mismo nombre y distinta lista de parámetros dentro de una clase. Sobrescritura: una subclase redefine un método heredado conservando su signatura.
- **Por qué ocurrió:** Falta de repaso teórico puntual.
- **Regla para no repetirlo:** Sobrecarga cambia parámetros; sobrescritura cambia implementación heredada.
- **Ejercicio de recuperación:** Crear dos métodos `calcular(...)` sobrecargados y un método `ejecutar()` sobrescrito.
- **Fecha de recuperación:** pendiente
- **Resultado:** pendiente
- **Estado:** abierto


### Error E-005

- **Fecha:** 2026-08-05
- **Materia:** Algoritmos y Estructuras de Datos
- **Tema:** Complejidad de algoritmos de ordenación
- **Tipo:** conceptual / terminológico
- **Respuesta o desarrollo incorrecto:** Se indicó `OlogN` para Mergesort/Quicksort y `On` para inserción.
- **Corrección:** Mergesort es O(n log n). Quicksort es O(n log n) en condiciones normales según el material. Inserción es O(n²) en el peor caso y O(n) en el mejor caso cuando el arreglo ya está ordenado.
- **Por qué ocurrió:** Se recordó la idea general, pero no la notación completa.
- **Regla para no repetirlo:** Todo algoritmo debe relacionarse con su estrategia y complejidad: inserción = cuadrático en peor caso; mergesort/quicksort = n por log n.
- **Ejercicio de recuperación:** Comparar los tres algoritmos en una tabla con estrategia, mejor caso, peor caso y memoria auxiliar.
- **Fecha de recuperación:** pendiente
- **Resultado:** pendiente
- **Estado:** abierto

### Error E-006

- **Fecha:** 2026-08-05
- **Materia:** Algoritmos y Estructuras de Datos
- **Tema:** Inserción al inicio de una lista
- **Tipo:** aplicación / terminológico
- **Respuesta o desarrollo incorrecto:** La idea fue correcta, pero no se explicitaron las dos asignaciones de referencia.
- **Corrección:** Crear `X`; asignar `X.siguiente = cabeza`; actualizar `cabeza = X`.
- **Por qué ocurrió:** La explicación se dio de forma gráfica y no algorítmica.
- **Regla para no repetirlo:** En listas, describir siempre qué referencia cambia y en qué orden.
- **Ejercicio de recuperación:** Escribir la inserción al inicio y al final de una lista simple.
- **Fecha de recuperación:** pendiente
- **Resultado:** pendiente
- **Estado:** abierto


### Error E-007

- **Fecha:** 2026-08-05
- **Materia:** Base de Datos
- **Tema:** Modelo relacional
- **Tipo:** conceptual / terminológico
- **Respuesta o desarrollo incorrecto:** Relación se definió como tablas que comparten datos; grado como grado de normalización; cardinalidad como orden.
- **Corrección:** Relación = tabla del modelo relacional; tupla = fila; atributo = columna; dominio = valores posibles de un atributo; grado = cantidad de atributos; cardinalidad = cantidad de tuplas.
- **Por qué ocurrió:** Experiencia práctica sin repaso de terminología formal.
- **Regla para no repetirlo:** Grado cuenta columnas; cardinalidad cuenta filas.
- **Ejercicio de recuperación:** Describir formalmente una tabla real indicando relación, cabecera, cuerpo, grado, cardinalidad y dominios.
- **Fecha de recuperación:** pendiente
- **Resultado:** pendiente
- **Estado:** abierto

### Error E-008

- **Fecha:** 2026-08-05
- **Materia:** Base de Datos
- **Tema:** Familias SQL
- **Tipo:** terminológico
- **Respuesta o desarrollo incorrecto:** `GRANT` y `COMMIT` quedaron sin clasificar.
- **Corrección:** `GRANT` pertenece a DCL y concede privilegios; `COMMIT` pertenece a TCL y confirma una transacción.
- **Por qué ocurrió:** Falta de repaso de sublenguajes SQL.
- **Regla para no repetirlo:** DDL define; DML manipula; DCL controla permisos; TCL controla transacciones.
- **Ejercicio de recuperación:** Clasificar veinte sentencias SQL en DDL, DML, DCL y TCL.
- **Fecha de recuperación:** pendiente
- **Resultado:** pendiente
- **Estado:** abierto


### Error E-009

- **Fecha:** 2026-08-05
- **Materia:** Comunicaciones
- **Tema:** Modelo OSI
- **Tipo:** conceptual / terminológico
- **Respuesta o desarrollo incorrecto:** Se nombraron solo red, enlace, transmisión, aplicación y seguridad.
- **Corrección:** Las capas son física, enlace de datos, red, transporte, sesión, presentación y aplicación.
- **Por qué ocurrió:** Recuerdo parcial de la materia.
- **Regla para no repetirlo:** Memorizar el orden ascendente y asociar una función concreta a cada capa.
- **Ejercicio de recuperación:** Escribir las siete capas y explicar una PDU o función por capa.
- **Fecha de recuperación:** pendiente
- **Resultado:** pendiente
- **Estado:** abierto

### Error E-010

- **Fecha:** 2026-08-05
- **Materia:** Comunicaciones
- **Tema:** Transmisión síncrona y asíncrona
- **Tipo:** conceptual
- **Respuesta o desarrollo incorrecto:** Se vinculó síncrona con mayor velocidad y reinicio total; asíncrona con segmentos y reenvío de paquetes.
- **Corrección:** La transmisión asíncrona delimita cada carácter con bits de inicio y parada y admite intervalos variables. La síncrona transmite bloques con sincronismo a nivel de paquete, cabecera y terminación.
- **Por qué ocurrió:** Se mezcló sincronización con control de errores y retransmisión.
- **Regla para no repetirlo:** Asíncrona = carácter + start/stop; síncrona = bloque + cabecera/terminación.
- **Ejercicio de recuperación:** Comparar ambas en una tabla con unidad transmitida, sincronización, sobrecarga y rendimiento.
- **Fecha de recuperación:** pendiente
- **Resultado:** pendiente
- **Estado:** abierto


### Error E-011

- **Fecha:** 2026-08-05
- **Materia:** Algoritmos y Estructuras de Datos
- **Tema:** Selección de estructura para órdenes pendientes
- **Tipo:** aplicación / justificación
- **Respuesta o desarrollo incorrecto:** Se eligió un arreglo para mostrar y ordenar órdenes sin justificar cómo mantener prioridad y fecha.
- **Corrección:** Para el requisito de atender por prioridad y fecha conviene analizar una cola de prioridad, una lista ordenada o una estructura que mantenga ambos criterios.
- **Por qué ocurrió:** Se eligió una estructura por facilidad de recorrido, no por la regla de atención.
- **Regla para no repetirlo:** La estructura se elige a partir de las operaciones dominantes y las reglas del problema.
- **Ejercicio de recuperación:** Comparar arreglo, lista ordenada y cola de prioridad para órdenes pendientes.
- **Fecha de recuperación:** pendiente
- **Resultado:** pendiente
- **Estado:** abierto

### Error E-012

- **Fecha:** 2026-08-05
- **Materia:** Base de Datos
- **Tema:** Alcance del modelo de datos
- **Tipo:** aplicación / modelado
- **Respuesta o desarrollo incorrecto:** Se propuso solamente una tabla `orden_trabajo`.
- **Corrección:** El caso requiere, como mínimo, analizar entidades para orden, operario, sector, estado y asignación; la estructura exacta depende de los requerimientos.
- **Por qué ocurrió:** Se simplificó el caso a la entidad principal.
- **Regla para no repetirlo:** Identificar sustantivos del dominio y relaciones antes de definir tablas.
- **Ejercicio de recuperación:** Crear un DER mínimo para órdenes, operarios y sectores.
- **Fecha de recuperación:** pendiente
- **Resultado:** pendiente
- **Estado:** abierto
