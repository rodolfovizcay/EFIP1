# Registro de errores y recuperaciones

**Estado consolidado al cierre académico del Día 14 — 21/08/2026**

Estados:

- `abierto`: error o brecha sin evidencia suficiente;
- `corregido`: respuesta correcta obtenida, requiere recuperación espaciada;
- `consolidado`: recuperado en más de una instancia o defendido suficientemente.

---

## Resumen

| Estado | Cantidad |
|---|---:|
| Consolidado | **46** |
| Corregido | **23** |
| Abierto | **4** |
| **Total registrado** | **73** |

---

## Estado canónico

| Código | Materia | Tema | Estado | Regla vigente |
|---|---|---|---|---|
| E-001 | Análisis y Diseño | Arquitectura/documentación | consolidado | Arquitectura=decisiones; documentación=artefactos |
| E-002 | Análisis y Diseño | Asociación/agregación/composición | corregido | Definiciones correctas; requiere recuperación espaciada |
| E-003 | POO | Estado/visibilidad | consolidado | Estado=valores; visibilidad=quién accede |
| E-004 | POO | Sobrecarga/sobrescritura | consolidado | Parámetros distintos vs. método heredado redefinido |
| E-005 | Estructuras | Complejidades de ordenación | consolidado | Inserción: mejor `O(n)`, peor `O(n²)`; Shellsort depende de gaps; recuperación espaciada correcta en Día 14 |
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
| E-051 | Análisis y Diseño | Implementación frente a despliegue | consolidado | Implementación=cómo se organiza; despliegue=dónde se ejecuta; defensa repetida en Día 12 |
| E-052 | Estructuras | Cabeza frente a nodo centinela | corregido | `cabeza` referencia el primer nodo salvo centinela explícito |
| E-053 | Estructuras | Eliminación y reconexión de nodos | corregido | `cabeza=cabeza.siguiente`; `anterior.siguiente=actual.siguiente` |
| E-054 | Análisis y Diseño | Alternativas, consecuencias y riesgos | corregido | Alternativas distintas; consecuencia real; riesgo posible |
| E-055 | Comunicaciones | Nomenclatura OSI y dispositivo/PDU/dirección | consolidado | Switch C2/trama/MAC; router C3/paquete/IP; integrado en defensa Día 12 |
| E-056 | POO/Java | Igualdad lógica e identidad por `id` | corregido | Instancias distintas pueden ser iguales; `equals()` verdadero exige mismo `hashCode()` |
| E-057 | POO/Java | Checked/unchecked y `throw`/`throws` | consolidado | `throw` lanza; `throws` declara; checked obliga a capturar o declarar; aplicado con archivos en Día 12 |
| E-058 | Estructuras | Complejidad con referencias conocidas | corregido | Enlazar/desenlazar es `O(1)` si las referencias ya están disponibles; buscar es `O(n)` |
| E-059 | Estructuras | Lista circular de un nodo | corregido | En una circular no vacía de un nodo, `nodo.siguiente = nodo` |
| E-060 | Análisis y Diseño | Componente/subsistema/artefacto | corregido | Componente=pieza modular; subsistema=agrupación coherente; artefacto=archivo físico producido/usado |
| E-061 | POO/Java | Traducción de excepción | corregido | Capturar `NumberFormatException` y lanzar `FormatoArchivoException(mensaje, causa)` |
| E-062 | Comunicaciones | Aprendizaje y reenvío del switch | corregido | Aprende origen; consulta destino; desconocido=flooding; conocido=reenvío selectivo |
| E-063 | Comunicaciones | HDLC/PPP/Ethernet | corregido | HDLC=control de enlace; PPP=punto a punto; Ethernet=LAN, trama y MAC; falta recuperación autónoma |
| E-064 | Comunicaciones | LLC/MAC | corregido | LLC mira a capa 3; MAC arma tramas, direcciona y controla acceso hacia capa física |
| E-065 | Comunicaciones | Bucle L2 frente a routing | consolidado | L2=tramas sin TTL y STP; routing=paquetes/rutas con TTL o Hop Limit; recuperación correcta en Día 14 |
| E-066 | Pruebas | Excepción esperada y resultado | consolidado | Si la excepción esperada se produce, la prueba pasa |
| E-067 | Estructuras | Shellsort por subsecuencias | consolidado | Con gap `g`, continuar por `i-g`, `i-2g`, etc., sin mezclar subsecuencias |
| E-068 | Estructuras | Caso base de Mergesort | corregido | Una porción de tamaño 0 o 1 ya está ordenada |
| E-069 | Estructuras | Trabajo por nivel frente a memoria | corregido | Cada nivel procesa `n` elementos; auxiliar `O(n)` es un costo espacial separado |
| E-070 | Estructuras | Caso base de Quicksort | corregido | Detener la recursión en particiones de tamaño 0 o 1 |
| E-071 | Estructuras | Profundidad, tiempo y pila de Quicksort | corregido | Equilibrado: `O(log n)` de profundidad y `O(n log n)` de tiempo; peor: pila `O(n)` y tiempo `O(n²)` |
| E-072 | Base de Datos | Retorno de procedimiento | corregido | Un procedimiento no devuelve obligatoriamente como función; puede usar parámetros `OUT` o resultados según dialecto |
| E-073 | Base de Datos | `READS SQL DATA` frente a permisos | corregido | Es una característica de acceso a datos de la rutina, no un privilegio de usuario |


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
7. `E-052` — cabeza frente a nodo centinela.
8. `E-053` — eliminación y reconexión de nodos.
9. `E-054` — alternativas, consecuencias y riesgos.
10. `E-056` — igualdad lógica e identidad por `id`.
11. `E-058` — complejidad con referencias conocidas.
12. `E-059` — lista circular de un nodo.
13. `E-060` — componente/subsistema/artefacto.
14. `E-061` — traducción de excepción.
15. `E-062` — aprendizaje y reenvío del switch.
16. `E-064` — LLC/MAC.
17. `E-063` — HDLC/PPP/Ethernet.
18. `E-068` — caso base de Mergesort.
19. `E-069` — trabajo por nivel frente a memoria auxiliar.
20. `E-070` — caso base de Quicksort.
21. `E-071` — profundidad, tiempo y pila de Quicksort.
22. `E-072` — retorno de procedimiento.
23. `E-073` — `READS SQL DATA` frente a permisos.

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

### Pasaron de abiertos a corregidos

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

---

## Cambios del cierre del Día 12

### Pasaron a consolidado

- `E-051`: implementación y despliegue se diferenciaron nuevamente y se integraron en la defensa final;
- `E-055`: switch y router se defendieron por capa, PDU y dirección;
- `E-057`: checked/unchecked y `throw`/`throws` se aplicaron a archivos y excepción propia.

### Nuevos errores corregidos

- `E-060`: se corrigió la clasificación entre componente, subsistema y artefacto;
- `E-061`: se corrigió la traducción de `NumberFormatException` a `FormatoArchivoException` conservando la causa;
- `E-062`: la simulación inicial del switch se recuperó con aprendizaje por origen y decisión por destino;
- `E-064`: se eliminó “enrutamiento físico” de la responsabilidad MAC y se precisó LLC.

### Nuevos errores abiertos

- `E-063`: la comparación HDLC/PPP/Ethernet quedó incompleta en la evaluación;
- `E-065`: no se completó la diferencia entre bucle de capa 2 y bucle de enrutamiento.

### Evidencia

- `EVALUACIONES/2026-08-19_RESPUESTAS-ESTUDIANTE-DIA-12.md`
- `EVALUACIONES/2026-08-19_RESULTADOS-DIA-12.md`
- `RESUMENES/2026-08-19_CIERRE-DIA-12.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-12.md`

---

## Cambios del cierre del Día 13

### Pasaron de abiertos a corregidos

- `E-005`: complejidades de inserción y dependencia de gaps resueltas con ayuda;
- `E-063`: HDLC, PPP y Ethernet recuperados con apoyo;
- `E-065`: bucle L2 y routing diferenciados con apoyo mediante trama/paquete, STP y TTL.

### Nuevos corregidos

- `E-066`: se corrigió que una excepción esperada implica éxito del caso negativo;
- `E-067`: se corrigió la detención prematura y mezcla de índices en Shellsort.

No pasan a consolidados porque la evaluación no fue autónoma.

### Evidencia

- `EVALUACIONES/2026-08-20_RESPUESTAS-ESTUDIANTE-DIA-13.md`
- `EVALUACIONES/2026-08-20_RESULTADOS-DIA-13.md`
- `RESUMENES/2026-08-20_CIERRE-DIA-13.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-13.md`

---

## Cambios del cierre del Día 14

### Pasaron de corregidos a consolidados

- `E-005`: complejidades de inserción y Shellsort recuperadas en el control inicial;
- `E-065`: bucle L2 y routing diferenciados nuevamente;
- `E-066`: excepción esperada identificada correctamente como éxito;
- `E-067`: recorrido Shellsort `i-gap` aplicado sin mezclar subsecuencias.

### Nuevos corregidos

- `E-068`: caso base de Mergesort;
- `E-069`: trabajo temporal por nivel frente a memoria auxiliar;
- `E-070`: caso base de Quicksort;
- `E-071`: profundidad, tiempo y pila recursiva de Quicksort;
- `E-072`: contrato de retorno de procedimiento;
- `E-073`: significado de `READS SQL DATA`.

No se consolidan porque las correcciones nuevas fueron guiadas y la evaluación final fue asistida.

### Evidencia

- `EVALUACIONES/2026-08-21_RESPUESTAS-ESTUDIANTE-DIA-14.md`
- `EVALUACIONES/2026-08-21_RESULTADOS-DIA-14.md`
- `RESUMENES/2026-08-21_CIERRE-DIA-14.md`
- `06-ERRORES-Y-RECUPERACIONES-DIA-14.md`
