# Registro de errores y recuperaciones

**Estado consolidado al 13/08/2026 — cierre del Día 8**

Estados:

- `abierto`: error o brecha sin evidencia suficiente;
- `corregido`: respuesta correcta obtenida, requiere recuperación espaciada;
- `consolidado`: recuperado en más de una instancia o defendido suficientemente.

---

## Resumen

| Estado | Cantidad |
|---|---:|
| Consolidado | **29** |
| Corregido | **5** |
| Abierto | **11** |
| **Total** | **45** |

---

## Estado canónico

| Código | Materia | Tema | Estado | Regla vigente |
|---|---|---|---|---|
| E-001 | Análisis y Diseño | Arquitectura/documentación | consolidado | Arquitectura=decisiones; documentación=artefactos |
| E-002 | Análisis y Diseño | Asociación/agregación/composición | abierto | Asociación; agregación todo/parte débil; composición fuerte |
| E-003 | POO | Estado/visibilidad | consolidado | Estado=valores; visibilidad=quién accede |
| E-004 | POO | Sobrecarga/sobrescritura | consolidado | Parámetros distintos vs. método heredado redefinido |
| E-005 | Estructuras | Complejidades de ordenación | abierto | Inserción O(n²); mergesort O(n log n); quicksort según material |
| E-006 | Estructuras | Inserción al inicio | consolidado | `nuevo.siguiente=cabeza; cabeza=nuevo` |
| E-007 | Base de Datos | Terminología relacional | consolidado | Relación/tupla/atributo/dominio/grado/cardinalidad |
| E-008 | Base de Datos | DCL/TCL | abierto | `GRANT`=DCL; `COMMIT`=TCL |
| E-009 | Comunicaciones | Capas OSI | consolidado | Física a Aplicación, siete capas |
| E-010 | Comunicaciones | Síncrona/asíncrona | consolidado | Carácter+start/stop vs. bloque+cabecera/terminación |
| E-011 | Estructuras | Selección de estructura | consolidado | Elegir por política, operación dominante y volumen |
| E-012 | Base de Datos | Alcance del modelo | consolidado | Identificar entidades/relaciones antes de tablas |
| E-013 | Análisis y Diseño | Construcción/Transición | consolidado | Producto vs. entrega/beta/capacitación |
| E-014 | POO | Estado/comportamiento | consolidado | Valores vs. métodos |
| E-015 | POO | Identidad/ID | consolidado | Identidad del objeto; ID puede representarla |
| E-016 | POO/Java | Sintaxis/completitud | abierto | Practicar código completo; `toString()` fue omitido |
| E-017 | Estructuras | TDA interfaz/implementación | consolidado | Contrato independiente de representación; aplicación a Cola pendiente específica |
| E-018 | Estructuras | Dinámica/tipo de elemento | corregido | Cambia cantidad/tamaño, no necesariamente tipo |
| E-019 | Base de Datos | Dominio | consolidado | Valores permitidos, no observados |
| E-020 | Base de Datos | Clave candidata | consolidado | Superclave mínima |
| E-021 | Base de Datos | Cardinalidad concreta | consolidado | Definición + valor solicitado |
| E-022 | Base de Datos | FK | consolidado | Referencia otra relación y puede repetirse en N |
| E-023 | POO | Sobrecarga como “más parámetros” | consolidado | Cambia cantidad o tipos |
| E-024 | Comunicaciones | TCP/IP único protocolo | consolidado | Arquitectura/pila de protocolos |
| E-025 | Comunicaciones | PDU/PUD | consolidado | PDU=`SDU+PCI` |
| E-026 | Comunicaciones | IP solo fuera de LAN | corregido | IP es lógica también dentro de LAN |
| E-027 | Comunicaciones | Puerto | consolidado | Proceso/servicio en host |
| E-028 | Comunicaciones | Capa/dispositivo | consolidado | Switch C2; router C3; destino pila completa |
| E-029 | Comunicaciones | PDU switch/router | consolidado | Switch=trama; router=paquete |
| E-030 | POO/Java | Constructor `void` | consolidado | Nombre de clase, sin retorno |
| E-031 | Análisis y Diseño | Fases/flujos/ciclo | consolidado | Fases≠flujos; iteración→incremento |
| E-032 | Análisis y Diseño | Completo/verificable | consolidado | Información suficiente vs. comprobable objetivamente |
| E-033 | Estructuras | Riesgo vector/lista | consolidado | Capacidad fija vs. memoria/referencias |
| E-034 | Comunicaciones | Paquete/trama | consolidado | Red=paquete; Enlace=trama |
| E-035 | Comunicaciones | Bits/bytes Física | consolidado | Física=bits/señales |
| E-036 | Análisis y Diseño | Generalización UML | corregido | Línea continua, triángulo vacío hacia padre |
| E-037 | Base de Datos | Instancia | corregido | Ocurrencia concreta de una entidad |
| E-038 | Base de Datos | Simbología DER | abierto | Rectángulo doble=débil; línea doble=participación total |
| E-039 | Base de Datos | Asociativa/débil | corregido | Asociativa implementa N:M; débil depende para identificar/existir |
| E-040 | Análisis y Diseño | Realización incompleta/caso desviado | abierto | Mantener `Registrar ejecución`; incluir alternativo sin conexión |
| E-041 | Estructuras | Contrato TDA Cola | abierto | Permanece interfaz/FIFO; cambia vector/nodos |
| E-042 | Estructuras | Pila/Cola/trazabilidad | abierto | Pila=LIFO; Cola=FIFO; trazabilidad requiere registros |
| E-043 | Comunicaciones | Información fórmula/unidades | abierto | `P↑→I↓`; `I=log₂(1/P)`; bits |
| E-044 | Comunicaciones | Señales/fórmulas/muestreo | abierto | A, T, f; `f=1/T`; muestreo; `fs=2·fmax` |
| E-045 | Comunicaciones | Digitalización/política/supuestos | abierto | Analógica puede transmitirse; política decide envío; declarar protocolo |

---

## Abiertos prioritarios

### Análisis y Diseño

- `E-002` — relaciones UML.
- `E-040` — realización con objetivo y alternativo.

### POO / Java

- `E-016` — sintaxis/completitud y `toString()`.

### Estructuras

- `E-005` — complejidades.
- `E-041` — contrato TDA/implementación.
- `E-042` — Pila/Cola y trazabilidad.

### Base de Datos

- `E-008` — DCL/TCL.
- `E-038` — línea doble/entidad débil.

### Comunicaciones

- `E-043` — información/fórmula/unidades.
- `E-044` — parámetros de señal/muestreo.
- `E-045` — digitalización y supuestos.

---

## Corregidos que requieren recuperación

1. `E-018` — estructura dinámica frente a tipo.
2. `E-026` — IP dentro/fuera de LAN.
3. `E-036` — generalización UML con triángulo vacío.
4. `E-037` — instancia como ocurrencia concreta.
5. `E-039` — asociativa frente a débil.

---

## Consolidaciones del Día 8

```text
E-011 → selección según política/operación
E-032 → completo ≠ verificable
E-033 → vector capacidad; lista memoria/referencias
```

También quedó aplicado:

```text
Cola=FIFO
encolar por final
desencolar por frente
Serie ≠ paralela
Asíncrona ≠ síncrona
```

---

## Tarjetas de recuperación

```text
TARJETAS/2026-08-13_TARJETAS-RECUPERACION-ERRORES-DIA-08.md
```

Contiene preguntas/respuestas sobre `E-036` a `E-045`, más fórmulas, unidades, simulaciones y mini examen.

---

## Evidencia

- `06-ERRORES-Y-RECUPERACIONES-DIA-08.md`
- `EVALUACIONES/2026-08-13_RESPUESTAS-DIA-08.md`
- `EVALUACIONES/2026-08-13_RESULTADOS-DIA-08.md`
- `TARJETAS/2026-08-13_TARJETAS-RECUPERACION-ERRORES-DIA-08.md`

---

## Regla de seguimiento

Un error que reaparece en evaluación permanece abierto. Un error corregido pasa a consolidado solo después de otra recuperación sin ayuda o una defensa suficiente.
