# Registro de errores y recuperaciones

**Estado consolidado al 10/08/2026 — cierre del Día 5**

Estados canónicos:

- `abierto`: error o brecha todavía no corregida con evidencia suficiente;
- `corregido`: respuesta correcta obtenida, pero requiere recuperación espaciada;
- `consolidado`: recuperado en más de una instancia o defendido con evidencia suficiente.

> Los archivos diarios conservan el detalle de cada recuperación. Este archivo es el índice canónico del estado actual y evita que errores ya recuperados sigan apareciendo como abiertos.

## Resumen

| Estado | Cantidad |
|---|---:|
| Consolidado | 15 |
| Corregido, pendiente de consolidación | 8 |
| Abierto | 8 |
| **Total registrado** | **31** |

---

## Estado canónico de errores

| Código | Materia | Tema | Estado | Regla/corrección vigente |
|---|---|---|---|---|
| E-001 | Análisis y Diseño | Arquitectura vs. documentación | **consolidado** | Arquitectura = decisiones significativas; documentación = artefactos que las representan |
| E-002 | Análisis y Diseño | Asociación/agregación/composición | **abierto** | Asociación = relación; agregación = todo/parte débil; composición = todo/parte fuerte |
| E-003 | POO | Estado vs. visibilidad | **consolidado** | Estado = valores actuales; visibilidad = quién accede |
| E-004 | POO | Sobrecarga vs. sobrescritura | **consolidado** | Sobrecarga cambia lista de parámetros; sobrescritura redefine método heredado |
| E-005 | Estructuras | Complejidades de ordenación | **abierto** | Inserción peor O(n²); Mergesort O(n log n); Quicksort según material O(n log n) habitual |
| E-006 | Estructuras | Inserción al inicio de lista | **consolidado** | `nuevo.siguiente = cabeza; cabeza = nuevo` |
| E-007 | Base de Datos | Terminología relacional | **consolidado** | Relación/tupla/atributo/dominio/grado/cardinalidad correctamente diferenciados |
| E-008 | Base de Datos | DCL/TCL | **abierto** | `GRANT` = DCL; `COMMIT` = TCL |
| E-009 | Comunicaciones | Capas OSI | **consolidado** | Física, Enlace, Red, Transporte, Sesión, Presentación, Aplicación |
| E-010 | Comunicaciones | Síncrona/asíncrona | **corregido** | Asíncrona = carácter + start/stop; síncrona = bloque + cabecera/terminación |
| E-011 | Estructuras | Selección de estructura | **abierto** | Elegir por operaciones dominantes y reglas del problema, no solo facilidad de recorrido |
| E-012 | Base de Datos | Alcance del modelo de datos | **corregido** | Identificar entidades y relaciones antes de limitar el diseño a una sola tabla |
| E-013 | Análisis y Diseño | Construcción vs. Transición | **consolidado** | Construcción = producto completo; Transición = beta/entrega/correcciones/capacitación |
| E-014 | POO | Estado vs. comportamiento | **consolidado** | Estado = atributos/valores; comportamiento = métodos/operaciones |
| E-015 | POO | Identidad vs. ID | **consolidado** | Identidad distingue al objeto; un ID puede representarla persistentemente |
| E-016 | POO/Java | Sintaxis Java escrita | **abierto** | Mantener práctica breve de sintaxis; constructor fue el principal error del Día 5 |
| E-017 | Estructuras | TDA sin interfaz/implementación | **corregido** | TDA = datos/objetos + operaciones + interfaz independiente de implementación |
| E-018 | Estructuras | Dinámica vs. tipo de elemento | **corregido** | En una estructura dinámica cambia cantidad/tamaño; no necesariamente el tipo |
| E-019 | Base de Datos | Dominio de estado | **consolidado** | Dominio = conjunto de valores permitidos; no confundir con booleano ni valores observados |
| E-020 | Base de Datos | Clave candidata | **consolidado** | Clave candidata = superclave mínima |
| E-021 | Base de Datos | Cardinalidad sin valor concreto | **consolidado** | Responder definición + valor pedido |
| E-022 | Base de Datos | Clave foránea | **consolidado** | FK referencia una clave de otra relación y puede repetirse del lado N |
| E-023 | POO | Sobrecarga expresada como “más parámetros” | **consolidado** | Misma operación con distinta cantidad o tipos de parámetros |
| E-024 | Comunicaciones | TCP/IP tratado como protocolo único | **abierto** | TCP/IP = arquitectura/pila/conjunto de protocolos |
| E-025 | Comunicaciones | PDU incompleta/confundida con PUD | **corregido** | PDU = Unidad de Datos de Protocolo = datos + información de control |
| E-026 | Comunicaciones | IP limitada a fuera de LAN | **corregido** | IP es direccionamiento lógico también dentro de la LAN |
| E-027 | Comunicaciones | Puerto | **consolidado** | Puerto = identificador de proceso/servicio de transporte dentro de un host |
| E-028 | Comunicaciones | Función de dispositivo atribuida a capa | **abierto** | Distinguir función general de capa de implementación concreta de switch/router |
| E-029 | Comunicaciones | Unidad de switch/router omitida | **abierto** | Switch → trama; Router → paquete/datagrama |
| E-030 | POO/Java | Constructor escrito como método `void` | **corregido** | Constructor = mismo nombre de clase y sin tipo de retorno |
| E-031 | Análisis y Diseño | Fases vs. flujos / ciclo vs. incremento | **corregido** | Fases ≠ flujos; iteración → incremento; ciclo completo → versión |

---

## Errores abiertos prioritarios

### Análisis y Diseño

- **E-002:** relaciones UML.

### POO / Java

- **E-016:** precisión de sintaxis Java escrita.

### Algoritmos y Estructuras

- **E-005:** complejidades de ordenación.
- **E-011:** selección de estructura según operaciones/reglas.

### Base de Datos

- **E-008:** DCL/TCL.

### Comunicaciones

- **E-024:** TCP/IP como arquitectura/pila.
- **E-028:** función de capa vs. función de dispositivo.
- **E-029:** trama para switch y paquete/datagrama para router.

---

## Corregidos que requieren recuperación espaciada

1. **E-010 — Síncrona/asíncrona.**
2. **E-012 — Alcance del modelo de datos.**
3. **E-017 — TDA e interfaz.**
4. **E-018 — estructura dinámica/tipo.**
5. **E-025 — PDU.**
6. **E-026 — IP dentro/fuera de LAN.**
7. **E-030 — constructor Java.**
8. **E-031 — fases/flujos/ciclo/incremento.**

---

## Recuperaciones consolidadas destacadas

### PUD

```text
Arquitectura ≠ documentación
Construcción ≠ Transición
Iteración ≠ incremento
```

### POO

```text
Estado ≠ comportamiento
Identidad ≠ ID
Sobrecarga ≠ sobrescritura
```

### Base de Datos

```text
Grado = columnas/atributos
Cardinalidad = filas/tuplas
Candidata = superclave mínima
FK puede repetirse en 1:N
```

### Comunicaciones

```text
OSI = 7 capas en orden
Puerto = proceso/servicio
```

---

## Archivos de evidencia

- `06-ERRORES-Y-RECUPERACIONES-DIA-02.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-03.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-04.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-05.md`
- `EVALUACIONES/2026-08-10_RESPUESTAS-DIA-05.md`
- `EVALUACIONES/2026-08-10_RESULTADOS-DIA-05.md`

## Regla de seguimiento

Un error `corregido` solo pasa a `consolidado` después de una recuperación posterior sin ayuda o una defensa oral suficiente. No cerrar errores únicamente porque se haya mostrado la respuesta correcta durante la corrección.
