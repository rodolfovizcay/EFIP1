# Registro de errores y recuperaciones

**Estado consolidado al cierre semanal — 15/08/2026**

Estados:

- `abierto`: error o brecha sin evidencia suficiente;
- `corregido`: respuesta correcta obtenida, requiere recuperación espaciada;
- `consolidado`: recuperado en más de una instancia o defendido suficientemente.

---

## Resumen

| Estado | Cantidad |
|---|---:|
| Consolidado | **33** |
| Corregido | **9** |
| Abierto | **7** |
| **Total registrado** | **49** |

---

## Estado canónico

| Código | Materia | Tema | Estado | Regla vigente |
|---|---|---|---|---|
| E-001 | Análisis y Diseño | Arquitectura/documentación | consolidado | Arquitectura=decisiones; documentación=artefactos |
| E-002 | Análisis y Diseño | Asociación/agregación/composición | **abierto** | Asociación; agregación todo/parte débil; composición fuerte |
| E-003 | POO | Estado/visibilidad | consolidado | Estado=valores; visibilidad=quién accede |
| E-004 | POO | Sobrecarga/sobrescritura | consolidado | Parámetros distintos vs. método heredado redefinido |
| E-005 | Estructuras | Complejidades de ordenación | **abierto** | Inserción O(n²); mergesort O(n log n); quicksort según material |
| E-006 | Estructuras | Inserción al inicio | consolidado | `nuevo.siguiente=cabeza; cabeza=nuevo` |
| E-007 | Base de Datos | Terminología relacional | consolidado | Relación/tupla/atributo/dominio/grado/cardinalidad |
| E-008 | Base de Datos | DCL/TCL | **abierto** | `GRANT`=DCL; `COMMIT`=TCL |
| E-009 | Comunicaciones | Capas OSI | consolidado | Física a Aplicación, siete capas |
| E-010 | Comunicaciones | Síncrona/asíncrona | consolidado | Carácter+start/stop vs. bloque+cabecera/terminación |
| E-011 | Estructuras | Selección de estructura | consolidado | Elegir por política, operación dominante y volumen |
| E-012 | Base de Datos | Alcance del modelo | consolidado | Identificar entidades/relaciones antes de tablas |
| E-013 | Análisis y Diseño | Construcción/Transición | consolidado | Producto vs. entrega/beta/capacitación |
| E-014 | POO | Estado/comportamiento | consolidado | Valores vs. métodos |
| E-015 | POO | Identidad/ID | consolidado | Identidad del objeto; ID puede representarla |
| E-016 | POO/Java | Sintaxis/completitud | **abierto** | Código completo, validación efectiva, `@Override`, organización de archivos y `toString()` |
| E-017 | Estructuras | TDA interfaz/implementación | consolidado | Contrato independiente de representación |
| E-018 | Estructuras | Dinámica/tipo de elemento | corregido | Cambia cantidad/tamaño, no necesariamente tipo |
| E-019 | Base de Datos | Dominio | consolidado | Valores permitidos, no observados |
| E-020 | Base de Datos | Clave candidata | consolidado | Superclave mínima |
| E-021 | Base de Datos | Cardinalidad concreta | consolidado | Definición + valor solicitado |
| E-022 | Base de Datos | FK | consolidado | Referencia otra relación y puede repetirse en N |
| E-023 | POO | Sobrecarga como “más parámetros” | consolidado | Cambia cantidad o tipos |
| E-024 | Comunicaciones | TCP/IP único protocolo | consolidado | Arquitectura/pila de protocolos |
| E-025 | Comunicaciones | PDU/PUD | consolidado | `PDU=SDU+PCI` |
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
| E-037 | Base de Datos | Instancia | **consolidado** | Ocurrencia concreta de una entidad |
| E-038 | Base de Datos | Simbología DER | **consolidado** | Rectángulo doble=débil; línea doble=participación total |
| E-039 | Base de Datos | Asociativa/débil | **abierto** | Asociativa representa relación; débil depende para identificar/existir; no decidir solo por FK o ID |
| E-040 | Análisis y Diseño | Realización incompleta/caso desviado | **corregido** | Mantener `Registrar ejecución`; incluir alternativo y participantes completos |
| E-041 | Estructuras | Contrato TDA Cola | **consolidado** | Permanece interfaz/FIFO; cambia vector/nodos |
| E-042 | Estructuras | Pila/Cola/trazabilidad | **corregido** | Pila=LIFO; Cola=FIFO; trazabilidad requiere registros |
| E-043 | Comunicaciones | Información fórmula/unidades | **corregido** | `P↑→I↓`; `I=log₂(1/P)`; unidad bits |
| E-044 | Comunicaciones | Señales/fórmulas/muestreo | **consolidado** | A, T, f; `f=1/T`; `T=1/f`; `fs≥2·fmax` |
| E-045 | Comunicaciones | Digitalización/política/supuestos | **abierto** | Analógica puede transmitirse; política decide envío; declarar protocolo |
| E-046 | POO/Java | Comparación y validación de `String` | **corregido** | `==` compara referencias; usar `equals/isBlank`; la validación debe detener o rechazar |
| E-047 | Base de Datos | 2FN e ID artificial | **corregido** | Dependencias de clave completa; ID artificial no elimina redundancia ni dependencias |
| E-048 | Estructuras/Diseño | Eliminar pendiente antes de confirmar | **corregido** | `cabecera→enviar→confirmar→trazar→desencolar` |
| E-049 | Comunicaciones | Conectividad usada para inferir sincronía | **abierto** | Sin conexión=no transmisión; síncrona/asíncrona depende del protocolo asumido |

---

## Cambios del cierre semanal

### Pasaron a consolidados

```text
E-037 — instancia
E-038 — simbología DER
E-041 — contrato del TDA Cola
E-044 — frecuencia y muestreo
```

### Pasaron a corregidos

```text
E-040 — alternativo y objetivo del caso
E-042 — Pila/Cola/trazabilidad
E-043 — fórmula y unidad de información
```

### Reabierto

```text
E-039 — asociativa frente a débil
```

Se reabre porque durante la integración oral volvió a justificarse `ASIGNACION_OT` mediante dependencia de existencia, mezclando función asociativa y debilidad.

### Nuevos errores canónicos

```text
E-046 — String y validación
E-047 — 2FN e ID artificial
E-048 — confirmación antes de desencolar
E-049 — conectividad frente a sincronía
```

Los códigos provisionales `P09-*` quedan absorbidos por estos errores o por `E-016`.

---

## Abiertos prioritarios

### Análisis y Diseño

- `E-002` — asociación/agregación/composición.

### POO / Java

- `E-016` — sintaxis y completitud de código.

### Estructuras

- `E-005` — complejidades de ordenación.

### Base de Datos

- `E-008` — DCL/TCL.
- `E-039` — asociativa frente a débil.

### Comunicaciones

- `E-045` — digitalización, política y supuestos.
- `E-049` — conectividad frente a síncrona/asíncrona.

---

## Corregidos que requieren recuperación espaciada

1. `E-018` — estructura dinámica frente a tipo.
2. `E-026` — IP dentro/fuera de LAN.
3. `E-036` — triángulo vacío de generalización.
4. `E-040` — realización y alternativo sin conexión.
5. `E-042` — FIFO frente a trazabilidad.
6. `E-043` — `I(E)=log₂(1/P(E))` y unidad.
7. `E-046` — validación de `String`.
8. `E-047` — 2FN e ID artificial.
9. `E-048` — confirmación antes de desencolar.

---

## Reglas de recuperación semanal

```text
Caso sin conexión:
solicitar→guardar PENDIENTE_ENVIO→encolar→informar
→cabecera→enviar→confirmar→trazar→desencolar
```

```text
Java:
String no se compara por contenido con ==
validación inválida no debe continuar
`toString()` usa atributos reales
```

```text
Normalización:
1FN=atómico
2FN=dependencia de clave completa
3FN=sin dependencia transitiva
ID artificial≠normalización
```

```text
Comunicaciones:
I(E)=log₂(1/P(E))
f=1/T
fs≥2·fmax
conectividad≠sincronía
```

---

## Evidencia

- `06-ERRORES-Y-RECUPERACIONES-PARCIAL-DIA-09.md`
- `EVIDENCIAS/2026-08-15_EVIDENCIA-GUIADA-CASO-INTEGRADOR-01.md`
- `EVALUACIONES/2026-08-15_RESULTADO-SEMANAL-POR-EVIDENCIA.md`
- `RESUMENES/2026-08-15_RESUMEN-SEMANAL-POR-MATERIA.md`

---

## Regla de seguimiento

Un error que reaparece vuelve a `abierto`. Un error `corregido` pasa a `consolidado` solo después de otra recuperación sin ayuda o una defensa suficiente.
