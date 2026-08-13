# Registro de errores y recuperaciones

**Estado consolidado al 12/08/2026 — cierre del Día 7**

Estados canónicos:

- `abierto`: error o brecha todavía no corregida con evidencia suficiente;
- `corregido`: respuesta correcta obtenida, pero requiere recuperación espaciada;
- `consolidado`: recuperado en más de una instancia o defendido con evidencia suficiente.

> Los archivos diarios conservan el detalle. Este archivo es el índice canónico y evita que errores ya recuperados sigan apareciendo como abiertos.

---

## Resumen

| Estado | Cantidad |
|---|---:|
| Consolidado | **26** |
| Corregido, pendiente de consolidación | **3** |
| Abierto | **10** |
| **Total registrado** | **39** |

---

## Estado canónico de errores

| Código | Materia | Tema | Estado | Regla/corrección vigente |
|---|---|---|---|---|
| E-001 | Análisis y Diseño | Arquitectura vs. documentación | **consolidado** | Arquitectura = decisiones significativas; documentación = artefactos que las representan |
| E-002 | Análisis y Diseño | Asociación/agregación/composición | **abierto** | Asociación = relación; agregación = todo/parte débil; composición = todo/parte fuerte |
| E-003 | POO | Estado vs. visibilidad | **consolidado** | Estado = valores actuales; visibilidad = quién accede |
| E-004 | POO | Sobrecarga vs. sobrescritura | **consolidado** | Sobrecarga cambia parámetros; sobrescritura redefine método heredado |
| E-005 | Estructuras | Complejidades de ordenación | **abierto** | Inserción peor O(n²); Mergesort O(n log n); Quicksort habitual O(n log n) según material |
| E-006 | Estructuras | Inserción al inicio de lista | **consolidado** | `nuevo.siguiente = cabeza; cabeza = nuevo` |
| E-007 | Base de Datos | Terminología relacional | **consolidado** | Relación/tupla/atributo/dominio/grado/cardinalidad diferenciados |
| E-008 | Base de Datos | DCL/TCL | **abierto** | `GRANT` = DCL; `COMMIT` = TCL |
| E-009 | Comunicaciones | Capas OSI | **consolidado** | Física, Enlace, Red, Transporte, Sesión, Presentación, Aplicación |
| E-010 | Comunicaciones | Síncrona/asíncrona | **consolidado** | Asíncrona = carácter + start/stop; síncrona = bloque + cabecera/terminación |
| E-011 | Estructuras | Selección de estructura | **corregido** | Elegir por operaciones dominantes, restricciones y volumen esperado |
| E-012 | Base de Datos | Alcance del modelo de datos | **consolidado** | Identificar entidades/relaciones antes de pasar a tablas; aplicado en DER Día 7 |
| E-013 | Análisis y Diseño | Construcción vs. Transición | **consolidado** | Construcción = producto completo; Transición = beta/entrega/correcciones/capacitación |
| E-014 | POO | Estado vs. comportamiento | **consolidado** | Estado = atributos/valores; comportamiento = métodos/operaciones |
| E-015 | POO | Identidad vs. ID | **consolidado** | Identidad distingue al objeto; un ID puede representarla persistentemente |
| E-016 | POO/Java | Sintaxis/completitud Java escrita | **abierto** | Mantener práctica; en Día 7 se omitió `toString()` exigido |
| E-017 | Estructuras | TDA sin interfaz/implementación | **consolidado** | TDA = datos/objetos + operaciones + interfaz independiente de implementación |
| E-018 | Estructuras | Dinámica vs. tipo de elemento | **corregido** | En estructura dinámica cambia cantidad/tamaño; no necesariamente el tipo |
| E-019 | Base de Datos | Dominio de estado | **consolidado** | Dominio = conjunto de valores permitidos; no valores observados |
| E-020 | Base de Datos | Clave candidata | **consolidado** | Clave candidata = superclave mínima |
| E-021 | Base de Datos | Cardinalidad sin valor concreto | **consolidado** | Responder definición + valor pedido |
| E-022 | Base de Datos | Clave foránea | **consolidado** | FK referencia otra relación y puede repetirse del lado N |
| E-023 | POO | Sobrecarga expresada como “más parámetros” | **consolidado** | Misma operación con distinta cantidad o tipos de parámetros |
| E-024 | Comunicaciones | TCP/IP tratado como protocolo único | **consolidado** | TCP/IP = arquitectura/pila/conjunto de protocolos |
| E-025 | Comunicaciones | PDU incompleta/confundida con PUD | **consolidado** | PDU = Protocol Data Unit = Unidad de Datos de Protocolo = `SDU + PCI` |
| E-026 | Comunicaciones | IP limitada a fuera de LAN | **corregido** | IP es direccionamiento lógico también dentro de la LAN |
| E-027 | Comunicaciones | Puerto | **consolidado** | Puerto = proceso/servicio de transporte dentro de un host |
| E-028 | Comunicaciones | Función de dispositivo atribuida a capa | **consolidado** | Switch procesa capa 2; router capa 3; destino toda la pila |
| E-029 | Comunicaciones | Unidad de switch/router omitida | **consolidado** | Switch → trama; Router → paquete/datagrama |
| E-030 | POO/Java | Constructor escrito como método `void` | **consolidado** | Constructor = mismo nombre de clase y sin tipo de retorno, ni `void` |
| E-031 | Análisis y Diseño | Fases vs. flujos / ciclo vs. incremento | **consolidado** | Fases ≠ flujos; iteración → incremento; ciclo completo → versión |
| E-032 | Análisis y Diseño | Completo vs. verificable | **abierto** | Completo = información suficiente; verificable = comprobable objetivamente |
| E-033 | Estructuras | Riesgo de pila enlazada | **abierto** | Vector puede desbordar por capacidad; lista se limita por memoria/referencias |
| E-034 | Comunicaciones | Paquete vs. trama | **consolidado** | Internet/Red → paquete; Acceso/Enlace → trama |
| E-035 | Comunicaciones | Bits vs. bytes en Física | **consolidado** | Física transmite bits/señales como unidad del modelo |
| E-036 | Análisis y Diseño | Notación de generalización UML | **abierto** | Línea continua con triángulo vacío hacia el padre; `--|>` es notación textual válida |
| E-037 | Base de Datos | Instancia confundida con cantidad | **abierto** | Instancia = ocurrencia concreta de una entidad |
| E-038 | Base de Datos | Simbología entidad débil/participación | **abierto** | Rectángulo doble = entidad débil; línea doble = participación total |
| E-039 | Base de Datos | Entidad asociativa vs. entidad débil | **abierto** | Asociativa implementa N:M; debilidad exige dependencia de identificación/existencia |

---

## Errores abiertos prioritarios

### Análisis y Diseño

- **E-002:** asociación/agregación/composición.
- **E-032:** completo frente a verificable.
- **E-036:** notación de generalización UML.

### POO / Java

- **E-016:** precisión y completitud de código Java escrito.

### Algoritmos y Estructuras

- **E-005:** complejidades de ordenación.
- **E-033:** riesgo de pila enlazada frente a vector.

### Base de Datos

- **E-008:** DCL/TCL.
- **E-037:** instancia.
- **E-038:** simbología DER.
- **E-039:** asociativa frente a débil.

---

## Corregidos que requieren recuperación espaciada

1. **E-011 — Selección de estructura.** Aplicado a pila; generalizar a cola/listas.
2. **E-018 — Estructura dinámica/tipo.** Repetir al estudiar colas.
3. **E-026 — IP dentro/fuera de LAN.** Repetir al profundizar redes.

---

## Consolidaciones destacadas al Día 7

### PUD y Requerimientos

```text
Arquitectura ≠ documentación
Construcción ≠ Transición
Fases ≠ flujos
Iteración → incremento
Ciclo completo → versión
```

### Casos de uso

```text
Actor = rol externo
Caso = objetivo con resultado de valor
include = obligatorio, base → incluido
extend = opcional, extensión → base
Generalización conceptual = hijo → padre
```

### POO / Java

```text
Estado ≠ comportamiento
Identidad ≠ ID
Sobrecarga ≠ sobrescritura
Constructor = nombre de clase + sin retorno
super(...) primero
static pertenece a la clase
```

### Estructuras

```text
TDA = interfaz independiente de implementación
Pila = LIFO
peek consulta sin eliminar
pop devuelve y elimina
```

### Base de Datos

```text
Grado = atributos
Cardinalidad relacional = tuplas
Candidata = superclave mínima
FK puede repetirse en 1:N
1:N → FK en lado N
N:M → tabla asociativa
```

### Comunicaciones

```text
OSI = 7 capas
TCP/IP = arquitectura/pila
PDU = SDU + PCI
Puerto = proceso/servicio
Red → paquete
Enlace → trama
Física → bits/señales
```

---

## Archivos de evidencia

- `06-ERRORES-Y-RECUPERACIONES-DIA-02.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-03.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-04.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-05.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-06.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-07.md`
- `EVALUACIONES/2026-08-12_RESPUESTAS-DIA-07.md`
- `EVALUACIONES/2026-08-12_RESULTADOS-DIA-07.md`

---

## Recuperación recomendada para Día 8

1. Generalización UML y triángulo vacío.
2. Instancia con ejemplo concreto.
3. Rectángulo doble y línea doble.
4. Entidad asociativa frente a débil.
5. Completo frente a verificable.
6. `toString()` en Java.
7. N:M conceptual frente a tabla asociativa.
8. Riesgo de vector/lista al introducir cola.

---

## Regla de seguimiento

Un error `corregido` solo pasa a `consolidado` después de una recuperación posterior sin ayuda o una defensa suficiente. Un error que reaparece en evaluación permanece `abierto`, aunque haya sido respondido correctamente al comienzo de la misma jornada.
