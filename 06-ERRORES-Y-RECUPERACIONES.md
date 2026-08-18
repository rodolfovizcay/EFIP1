# Registro de errores y recuperaciones

**Estado consolidado al cierre académico del Día 11 — 18/08/2026**

Estados:

- `abierto`: error o brecha sin evidencia suficiente;
- `corregido`: respuesta correcta obtenida, requiere recuperación espaciada;
- `consolidado`: recuperado en más de una instancia o defendido suficientemente.

---

## Resumen

| Estado | Cantidad |
|---|---:|
| Consolidado | **39** |
| Corregido | **15** |
| Abierto | **5** |
| **Total registrado** | **59** |

---

## Estado canónico

| Código | Materia | Tema | Estado | Regla vigente |
|---|---|---|---|---|
| E-001 | Análisis y Diseño | Arquitectura/documentación | consolidado | Arquitectura=decisiones; documentación=artefactos |
| E-002 | Análisis y Diseño | Asociación/agregación/composición | corregido | Definiciones correctas; requiere recuperación espaciada |
| E-003 | POO | Estado/visibilidad | consolidado | Estado=valores; visibilidad=quién accede |
| E-004 | POO | Sobrecarga/sobrescritura | consolidado | Parámetros distintos vs. método heredado redefinido |
| E-005 | Estructuras | Complejidades de ordenación | **abierto** | Inserción O(n²); mergesort O(n log n); quicksort según material |
| E-006 | Estructuras | Inserción al inicio | consolidado | `nuevo.siguiente=cabeza; cabeza=nuevo` |
| E-007 | Base de Datos | Terminología relacional | consolidado | Relación/tupla/atributo/dominio/grado/cardinalidad |
| E-008 | Base de Datos | DCL/TCL | consolidado | `GRANT`=DCL; `COMMIT`=TCL; evidencia repetida en Día 11 |
| E-009 | Comunicaciones | Capas OSI | consolidado | Física a Aplicación, siete capas |
| E-010 | Comunicaciones | Síncrona/asíncrona | consolidado | Carácter+start/stop vs. bloque+cabecera/terminación |
| E-011 | Estructuras | Selección de estructura | consolidado | Elegir por política, operación dominante y volumen |
| E-012 | Base de Datos | Alcance del modelo | consolidado | Identificar entidades/relaciones antes de tablas |
| E-013 | Análisis y Diseño | Construcción/Transición | consolidado | Producto vs. entrega/beta/capacitación |
| E-014 | POO | Estado/comportamiento | consolidado | Valores vs. métodos |
| E-015 | POO | Identidad/ID | consolidado | Identidad del objeto; ID puede representarla |
| E-016 | POO/Java | Sintaxis/completitud | **abierto** | Validar antes de asignar; `super` correcto; `@Override`; `toString()`; archivos públicos y prueba polimórfica |
| E-017 | Estructuras | TDA interfaz/implementación | consolidado | Contrato independiente de representación |
| E-018 | Estructuras | Dinámica/tipo de elemento | consolidado | Cambia cantidad/tamaño, no necesariamente tipo; arreglo/ArrayList defendidos |
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
| E-037 | Base de Datos | Instancia | consolidado | Ocurrencia concreta de una entidad |
| E-038 | Base de Datos | Simbología DER | consolidado | Rectángulo doble=débil; línea doble=participación total |
| E-039 | Base de Datos | Asociativa/débil | **abierto** | Asociativa representa relación; débil depende para identificar/existir; no decidir solo por FK, ID o atributos |
| E-040 | Análisis y Diseño | Realización incompleta/caso desviado | **consolidado** | Mantener `Registrar ejecución`; alternativo y participantes completos |
| E-041 | Estructuras | Contrato TDA Cola | consolidado | Permanece interfaz/FIFO; cambia vector/nodos |
| E-042 | Estructuras | Pila/Cola/trazabilidad | corregido | Pila=LIFO; Cola=FIFO; trazabilidad requiere registros |
| E-043 | Comunicaciones | Información fórmula/unidades | corregido | `P↑→I↓`; `I=log₂(1/P)`; unidad bits |
| E-044 | Comunicaciones | Señales/fórmulas/muestreo | consolidado | A, T, f; `f=1/T`; `T=1/f`; `fs≥2·fmax` |
| E-045 | Comunicaciones | Digitalización/política/supuestos | **abierto** | Analógica puede transmitirse; política decide envío; declarar protocolo |
| E-046 | POO/Java | Comparación y validación de `String` | consolidado | `==` compara referencias; usar `equals/isBlank`; evidencia repetida en Día 11 |
| E-047 | Base de Datos | 2FN e ID artificial | **consolidado** | Datos dependen de clave completa; ID artificial no elimina redundancia ni dependencias |
| E-048 | Estructuras/Diseño | Eliminar pendiente antes de confirmar | **consolidado** | `cabecera→enviar→confirmar→trazar→desencolar` |
| E-049 | Comunicaciones | Conectividad usada para inferir sincronía | corregido | Sin conexión=no transmisión; síncrona/asíncrona depende del protocolo asumido |
| E-050 | Base de Datos | Modelo relacional final incompleto | **abierto** | Escribir atributos, PK, FK y `UNIQUE`; `OPERARIO_TELEFONO` usa PK compuesta |
| E-051 | Análisis y Diseño | Implementación frente a despliegue | corregido | Implementación=cómo se organiza; despliegue=dónde se ejecuta |
| E-052 | Estructuras | Cabeza frente a nodo centinela | corregido | `cabeza` referencia el primer nodo salvo centinela explícito |
| E-053 | Estructuras | Eliminación y reconexión de nodos | corregido | `cabeza=cabeza.siguiente`; `anterior.siguiente=actual.siguiente` |
| E-054 | Análisis y Diseño | Alternativas, consecuencias y riesgos | corregido | Alternativas distintas; consecuencia real; riesgo posible |
| E-055 | Comunicaciones | Nomenclatura OSI y dispositivo/PDU/dirección | corregido | Switch C2/trama/MAC; router C3/paquete/IP |
| E-056 | POO/Java | Igualdad lógica e identidad por `id` | corregido | Instancias distintas pueden ser iguales; `equals()` verdadero exige mismo `hashCode()` |
| E-057 | POO/Java | Checked/unchecked y `throw`/`throws` | corregido | `throw` lanza; `throws` declara; checked obliga a capturar o declarar; unchecked no |
| E-058 | Estructuras | Complejidad con referencias conocidas | corregido | Enlazar/desenlazar es `O(1)` si las referencias ya están disponibles; buscar es `O(n)` |
| E-059 | Estructuras | Lista circular de un nodo | corregido | En una circular no vacía de un nodo, `nodo.siguiente = nodo` |


---

## Cambios del cierre del Día 9

### Pasaron a consolidado

```text
E-040 — realización y alternativo sin conexión
E-047 — 2FN e ID artificial
E-048 — confirmación antes de desencolar
```

Evidencia:

- secuencia escrita correcta en la evaluación final;
- dependencias parciales y transitivas correctas;
- explicación correcta de ID artificial;
- orden `cabecera→envío→confirmación→trazabilidad→desencolar` aplicado sin ayuda.

### Nuevo error

```text
E-050 — modelo relacional final incompleto
```

En el escrito final:

- faltaron atributos descriptivos;
- faltaron `nombre_sector UNIQUE` y `numero_ot UNIQUE`;
- `OPERARIO_TELEFONO` fue declarado con `UNIQUE` pero sin PK;
- las FK no se escribieron con destino completo.

---

## Abiertos prioritarios

### POO / Java

- `E-016` — sintaxis y completitud de código.

### Estructuras

- `E-005` — complejidades de ordenación.

### Base de Datos

- `E-039` — asociativa frente a débil.
- `E-050` — modelo final con PK/FK/UNIQUE.

### Comunicaciones

- `E-045` — digitalización, política y supuestos.

---

## Corregidos que requieren recuperación espaciada

1. `E-002` — asociación/agregación/composición.
2. `E-026` — IP dentro/fuera de LAN.
3. `E-036` — triángulo vacío de generalización.
4. `E-042` — FIFO frente a trazabilidad.
5. `E-043` — `I(E)=log₂(1/P(E))` y unidad.
6. `E-049` — conectividad frente a sincronía.
7. `E-051` — implementación frente a despliegue.
8. `E-052` — cabeza frente a nodo centinela.
9. `E-053` — eliminación y reconexión de nodos.
10. `E-054` — alternativas, consecuencias y riesgos.
11. `E-055` — nomenclatura OSI y dispositivo/PDU/dirección.
12. `E-056` — igualdad lógica e identidad por `id`.
13. `E-057` — checked/unchecked y `throw`/`throws`.
14. `E-058` — complejidad con referencias conocidas.
15. `E-059` — lista circular de un nodo.

---

## Reglas de recuperación

### Sin conexión

```text
solicitar
→ PENDIENTE_ENVIO
→ encolar
→ informar
→ cabecera
→ enviar
→ confirmar
→ trazar
→ desencolar
```

### Java

```text
validar antes de asignar
null || isBlank()
`super` solo para la parte heredada
`toString()` usa atributos reales
`@Override` verifica la signatura
```

### Normalización

```text
1FN = valores atómicos
2FN = dependencia de la PK completa
3FN = sin dependencias transitivas
ID artificial ≠ normalización
PK ≠ UNIQUE
```

### Comunicaciones

```text
I(E)=log₂(1/P(E))
f=1/T
fs≥2·fmax
conectividad≠sincronía
```

---

## Documento de repaso

```text
RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md
```

Incluye explicación, ejemplos correctos/incorrectos, preguntas de control y mini examen.

---

## Evidencia

- `EVALUACIONES/2026-08-16_RESPUESTAS-EVALUACION-DIA-09.md`
- `EVALUACIONES/2026-08-16_RESULTADOS-DIA-09-SIN-DEFENSA.md`
- `RESUMENES/2026-08-14_CIERRE-DIA-09.md`
- `RESUMENES/2026-08-16_REPASO-SEMANAL-PUNTOS-DEBILES.md`

---

## Regla de seguimiento

Un error que reaparece vuelve a `abierto`. Un error `corregido` pasa a `consolidado` solo después de otra recuperación sin ayuda o evidencia evaluativa suficiente.

---

## Cambios del cierre del Día 10

### Pasaron de abierto a corregido

- `E-002`: las cuatro relaciones UML se diferenciaron sin apuntes;
- `E-049`: se explicó que la desconexión no determina sincronía o asincronía.

### Nuevos errores corregidos en la misma jornada

- `E-051`: implementación y despliegue se invirtieron en la evaluación y luego se recuperaron `4/4`;
- `E-052`: se supuso inicialmente una cabeza con dato `0`; se corrigió la referencia al primer nodo;
- `E-053`: se intentó conservar el nodo al eliminar; se corrigió la reconexión;
- `E-054`: se repitió la opción elegida como alternativa; se diferenciaron alternativas, consecuencias y riesgos;
- `E-055`: se mezclaron nombres OSI/TCP-IP y se omitieron direcciones; la recuperación final fue correcta.

### Evidencia

- `EVALUACIONES/2026-08-17_RESPUESTAS-DIA-10.md`
- `EVALUACIONES/2026-08-17_RESULTADOS-DIA-10.md`
- `RESUMENES/2026-08-17_CIERRE-DIA-10.md`

---

## Cambios del cierre del Día 11

### Pasaron a consolidado

- `E-008`: `COMMIT` y `GRANT` fueron clasificados correctamente en práctica y evaluación;
- `E-018`: arreglo y `ArrayList` se compararon nuevamente por tamaño y tipo admitido;
- `E-046`: `==` y `equals()` se diferenciaron en varias instancias después de la corrección inicial.

### Nuevos errores corregidos en la jornada

- `E-056`: al principio se exigió la misma instancia para considerar iguales dos trabajos con el mismo `id`; luego se recuperó la igualdad lógica y el contrato de hash;
- `E-057`: se generalizó la obligación de `throws` y se presentó el fallo unchecked como seguro; la recuperación oral incorporó la regla exacta;
- `E-058`: se respondió `O(n)` para enlazar con referencias ya conocidas; se corrigió a `O(1)` y se separó el costo de búsqueda;
- `E-059`: se indicó `null` para un único nodo circular; se corrigió el autoenlace.

### Evidencia

- `EVALUACIONES/2026-08-18_RESPUESTAS-DIA-11.md`
- `EVALUACIONES/2026-08-18_RESULTADOS-DIA-11.md`
- `RESUMENES/2026-08-18_CIERRE-DIA-11.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-11.md`
