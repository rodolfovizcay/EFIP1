# Resumen semanal por materia
## Semana intensiva 1 — 10/08 al 15/08/2026

**Fecha de cierre:** 15/08/2026  
**Modalidad:** cierre por evidencia acumulada  
**Indicador descriptivo:** **8,6/10**  
**Examen semanal adicional:** no realizado  
**Caso integrador 1:** práctica guiada completada, sin puntaje formal  
**Día 9:** en pausa, evaluación y defensa específicas pendientes

---

# 1. Análisis y Diseño de Software

## Temas recorridos

```text
PUD
Requisitos
Casos de uso
Modelo de análisis
Modelo de diseño inicial
Secuencia y alternativos
```

## Consolidado

- PUD dirigido por casos de uso, centrado en la arquitectura e iterativo/incremental.
- Fases de Inicio, Elaboración, Construcción y Transición.
- Ingeniería de Requerimientos, elicitación, especificación y validación.
- RF, RNF y reglas de negocio.
- Actor, caso de uso, límite del sistema y resultado de valor.
- `include` obligatorio y `extend` opcional/condicionado.
- Modelo de análisis como vista interna conceptual.
- Clases de interfaz, control y entidad.

## Aplicado durante la semana

- requisitos para Órdenes de Trabajo;
- caso `Registrar ejecución de OT`;
- alternativo sin conexión;
- colaboración entre interfaz, control y entidades;
- transición del análisis al diseño;
- servicios, repositorios, Cola de sincronización y Sincronizador.

## Precisión pendiente

- asociación, agregación, composición y dependencia;
- triángulo vacío de generalización bajo presión;
- secuencias con todos los participantes explícitos;
- diagrama de estados completo;
- mantener estrictamente el objetivo del caso en alternativos.

## Evidencia

```text
RF/RNF/RN:
Días 6 y Caso integrador 1.

Caso de uso:
Día 7 y práctica del 15/08.

Colaboración:
Día 8.

Diseño y secuencia:
Día 9 parcial y Caso integrador 1.
```

## Respuesta oral de 60 segundos

> Los requisitos expresan las necesidades y restricciones. Los casos de uso muestran externamente qué objetivo realiza el actor. El modelo de análisis explica conceptualmente qué objetos y responsabilidades colaboran, y el modelo de diseño transforma esa solución en clases, operaciones, servicios, repositorios e interfaces próximas a implementación. El código y la base de datos materializan esas decisiones.

## Tarjetas a repetir

- generalización UML;
- resultado de valor;
- alternativo sin conexión;
- análisis frente a diseño;
- secuencia y estados.

---

# 2. Programación Orientada a Objetos

## Temas recorridos

```text
Clase/objeto
Encapsulamiento
Herencia
this/super/static
Sobrecarga/sobrescritura
Abstracción
Clase abstracta
Interfaz
Polimorfismo
toString()
```

## Consolidado

- clase y objeto;
- estado, comportamiento e identidad;
- encapsulamiento;
- constructor Java sin retorno;
- `this`, `super` y miembros estáticos;
- herencia y relación `es un`;
- sobrecarga y sobrescritura.

## Aplicado durante la semana

- jerarquía `UsuarioSistema`, `Encargado` y `Operario`;
- clase abstracta `CanalNotificacion`;
- subclases Email y Móvil;
- interfaz `Auditable`;
- `extends` e `implements`;
- colección polimórfica de canales;
- diseño de `OrdenTrabajo`, `EjecucionOT` y `SolicitudPendiente`.

## Precisión pendiente

- comparar `String` por contenido y no mediante `==`;
- validaciones que detengan una operación inválida;
- `@Override`;
- `toString()` con atributos reales;
- una clase pública por archivo cuando corresponde;
- `equals`, `hashCode`, excepciones y colecciones.

## Evidencia de código

```text
Clase abstracta:
CanalNotificacion.

Interfaz:
Auditable.

Subclases:
NotificacionEmail y NotificacionMovil.

Validación:
Conceptualmente corregida con null/isBlank.

Polimorfismo:
List<CanalNotificacion> + canal.enviar(...).

toString():
Comprendido; escritura autónoma todavía debe consolidarse.
```

## Respuesta oral de 60 segundos

> La abstracción representa lo esencial y el encapsulamiento protege el estado. Una clase abstracta puede aportar estado, constructor y comportamiento común, además de métodos abstractos. Una interfaz define un contrato. El polimorfismo permite utilizar una referencia común y ejecutar la implementación sobrescrita del objeto concreto.

## Tarjetas a repetir

- `String`: `==` frente a `equals/isBlank`;
- constructor de clase abstracta;
- clase abstracta frente a interfaz;
- `toString()`;
- sobrescritura frente a polimorfismo.

---

# 3. Taller de Algoritmos y Estructuras de Datos I

## Temas recorridos

```text
TDA
Vector/lista
Pila/LIFO
Cola/FIFO
Frente/final
Selección por operación dominante
```

## Consolidado

- TDA e independencia de implementación;
- Pila LIFO;
- `push`, `pop`, `peek` y cima;
- Cola FIFO;
- `encolar`, `desencolar`, `cabecera`, frente y final;
- vector frente a lista enlazada;
- elección de estructura por política y operación dominante.

## Aplicado durante la semana

- Pila para deshacer modificaciones locales;
- Cola para solicitudes `PENDIENTE_ENVIO`;
- conservación del frente hasta confirmación del servidor;
- Cola de prioridad para urgencias;
- comparación de capacidad, memoria y referencias.

## Precisión pendiente

- FIFO no equivale a trazabilidad;
- `cabecera()` consulta y `desencolar()` elimina;
- no desencolar antes de la confirmación;
- complejidades y algoritmos de ordenación;
- listas doble, circular y ordenada.

## Evidencia

```text
Pila para:
deshacer la última modificación no confirmada.

Cola para:
procesar pendientes por orden de llegada.

Permanece en el TDA:
política y operaciones.

Cambia en implementación:
vector/índices o nodos/referencias.

Trazabilidad:
requiere identificador, fecha/hora, estado, intentos y resultado.
```

## Respuesta oral de 60 segundos

> La Pila trabaja con LIFO y sirve para deshacer el último cambio. La Cola trabaja con FIFO y sirve para enviar primero la solicitud que llegó primero. El contrato del TDA permanece aunque cambie la implementación interna. FIFO conserva el orden, pero la trazabilidad exige guardar la historia de cada solicitud.

## Tarjetas a repetir

- Pila vs. Cola;
- cabecera vs. desencolar;
- FIFO vs. trazabilidad;
- vector vs. lista;
- complejidades.

---

# 4. Base de Datos I

## Temas recorridos

```text
Modelo relacional
Claves
DER
Cardinalidades
Entidad fuerte/débil/asociativa
1FN
2FN
3FN
PK/FK/UNIQUE
```

## Consolidado

- relación, tupla, atributo, dominio, grado y cardinalidad;
- superclave, candidata, primaria y foránea;
- relación 1:N con FK en el lado N;
- relación N:M mediante tabla asociativa;
- atributos multivaluados y derivados;
- 1FN y valores atómicos.

## Aplicado durante la semana

- `SECTOR 1:N ORDEN_TRABAJO`;
- `ORDEN_TRABAJO N:M OPERARIO` mediante `ASIGNACION_OT`;
- `OPERARIO_TELEFONO` para teléfonos múltiples;
- dependencias parciales de 2FN;
- dependencia transitiva `id_ot → id_sector → nombre_sector`;
- esquema final hasta 3FN;
- ID artificial frente a normalización;
- claves históricas y `UNIQUE` alternativo.

## Precisión pendiente

- entidad asociativa frente a entidad débil;
- identidad propia no determina automáticamente fortaleza;
- claves de `EJECUCION_OT` y `SOLICITUD_PENDIENTE`;
- cardinalidades exactas por supuesto;
- `UNIQUE` de claves candidatas históricas;
- DCL/TCL y álgebra relacional.

## Evidencia

```text
Entidades:
SECTOR, ORDEN_TRABAJO, OPERARIO, OPERARIO_TELEFONO,
ASIGNACION_OT, EJECUCION_OT y SOLICITUD_PENDIENTE.

Relación 1:N:
SECTOR–ORDEN_TRABAJO.

Relación N:M:
ORDEN_TRABAJO–OPERARIO mediante ASIGNACION_OT.

1FN:
separar varios teléfonos de una celda.

2FN:
datos de OT dependen de id_ot; datos de Operario de id_operario.

3FN:
nombre_sector se traslada a SECTOR.

ID artificial:
facilita identificación, pero no elimina redundancia ni dependencias.
```

## Respuesta oral de 60 segundos

> La normalización descompone relaciones para reducir redundancia y anomalías. En 1FN los valores son atómicos; en 2FN cada atributo no clave depende de toda la clave compuesta; en 3FN no existen dependencias transitivas entre atributos no clave. Agregar un ID artificial no reemplaza el análisis de dependencias funcionales.

## Tarjetas a repetir

- asociativa vs. débil;
- dependencia parcial;
- dependencia transitiva;
- PK compuesta vs. ID artificial;
- `UNIQUE`, DCL y TCL.

---

# 5. Comunicaciones

## Temas recorridos

```text
Sistema de comunicaciones
OSI/TCP-IP
Encapsulamiento/PDU
MAC/IP/puerto
Switch/router
Información
Señales
Frecuencia y muestreo
Serie/paralela
Síncrona/asíncrona
```

## Consolidado

- modelo OSI y arquitectura TCP/IP;
- encapsulamiento y desencapsulamiento;
- datos, segmento, paquete, trama y bits;
- PDU, SDU y PCI;
- MAC, IP y puerto;
- switch en capa 2 y router en capa 3;
- serie/paralela y síncrona/asíncrona.

## Aplicado durante la semana

- recorrido móvil–servidor;
- funcionamiento local sin conexión;
- `I(E)=log₂(1/P(E))`;
- `f=1/T` y `T=1/f`;
- `fs mínima=2·fmax`;
- muestreo, cuantificación y representación digital;
- cálculo de 4 bits para `P(E)=1/16`;
- cálculo de 500 Hz y 8 k muestras/s.

## Precisión pendiente

- declarar correctamente supuestos de TCP/protocolo;
- no deducir sincronía a partir de la falta de conexión;
- amplitud frente a potencia;
- una señal analógica puede transmitirse analógicamente;
- MAC por enlace local;
- medios, ruido, atenuación, dispersión y latencia.

## Fórmulas

```text
I(E)=log₂(1/P(E))
Unidad=bits

f=1/T
T=1/f

fs mínima=2·fmax
```

## Evidencia

```text
Recorrido móvil-servidor:
Aplicación→Transporte→Internet→Acceso→Física.

Switch:
capa 2, MAC, trama.

Router:
capa 3, IP, paquete.

PDU:
SDU+PCI.

Supuesto de transmisión:
debe declararse según protocolo; la desconexión no lo determina.
```

## Respuesta oral de 60 segundos

> La aplicación genera datos; Transporte agrega puertos y forma segmentos; Internet agrega IP y forma paquetes; Acceso agrega MAC y forma tramas; Física transmite bits mediante señales. En el servidor se desencapsula en sentido inverso. Una solicitud offline se conserva localmente y se envía cuando vuelve la conexión.

## Tarjetas a repetir

- información y unidades;
- MAC por enlace;
- analógica/digital;
- supuesto síncrono/asíncrono;
- medios y perturbaciones.

---

# 6. Integración transversal

## Cadena del caso

```text
Problema
→ objetivos
→ requisitos
→ casos de uso
→ modelo de análisis
→ modelo de diseño
→ POO y estructuras
→ base de datos normalizada
→ comunicaciones
→ pruebas
```

## Decisión mejor justificada

```text
Pila LIFO para deshacer y Cola FIFO para pendientes.
```

## Decisión con mayor debilidad

```text
Identidad, cardinalidad y claves exactas de EjecucionOT/SolicitudPendiente,
y supuestos de transmisión.
```

## Conceptos confundidos inicialmente

```text
Entidad asociativa vs. débil.
FIFO vs. trazabilidad.
Conectividad vs. síncrona/asíncrona.
ID artificial vs. normalización.
```

## Correcciones realizadas

```text
cabecera→enviar→confirmar→trazar→desencolar
I(E)=log₂(1/P(E))
fs mínima=2·fmax
PK artificial≠normalización
```

## Supuestos declarados

- una OT puede tener varias ejecuciones de avance;
- la sincronización puede activarse automáticamente al recuperar conexión;
- el protocolo de transporte debe declararse si el caso no lo fija.

---

# 7. Resultado semanal

No se utiliza la tabla de 100 puntos porque el examen semanal no se rindió.

| Evidencia cerrada | Resultado |
|---|---:|
| Día 5 | 9,0/10 |
| Día 6 | 9,2/10 |
| Día 7 | 8,3/10 |
| Día 8 | 7,9/10 |
| **Indicador promedio** | **8,6/10** |

```text
Nivel semanal: ALTO
Estado: APROBADO POR EVIDENCIA ACUMULADA
```

---

# 8. Errores

## Recuperados o consolidados durante la semana

- selección de estructura;
- completo frente a verificable;
- vector frente a lista;
- instancia como ocurrencia concreta;
- línea doble como participación total;
- contrato TDA frente a implementación;
- fórmulas de frecuencia y muestreo.

## Corregidos, repetir después

- generalización UML;
- alternativo sin conexión;
- FIFO frente a trazabilidad;
- fórmula/unidades de información;
- `String` y `toString()`;
- 2FN e ID artificial;
- confirmación antes de desencolar.

## Abiertos

- relaciones UML restantes;
- sintaxis Java completa;
- asociativa frente a débil bajo presión;
- supuestos tecnológicos;
- ordenación/complejidades;
- DCL/TCL;
- medios y nivel físico avanzado.

---

# 9. Prioridades de la semana siguiente

1. Completar Día 9.
2. Java completo: validaciones, `toString()`, excepciones y colecciones.
3. Arquitectura, listas y nivel físico.
4. DCL/TCL, álgebra relacional y SQL académico.
5. Simulaciones integradas y defensa oral continua.

---

# 10. Resumen oral semanal

> Durante la semana trabajé el desarrollo desde los requisitos hasta una solución conceptual e implementable. En Análisis y Diseño reforcé PUD, requisitos, casos de uso, análisis y diseño. En POO apliqué encapsulamiento, herencia, abstracción, interfaces y polimorfismo. En Estructuras utilicé Pila para deshacer y Cola para sincronizar. En Base de Datos construí DER y normalicé hasta 3FN. En Comunicaciones expliqué el recorrido TCP/IP y resolví información, frecuencia y muestreo. Mi principal fortaleza es integrar conceptos en un caso real; debo mejorar precisión de sintaxis, claves históricas y supuestos tecnológicos.

---

# 11. Decisión documental

```text
Caso integrador:
práctica guiada completada, sin examen ni nota formal.

Día 9:
permanece en pausa.

Estado canónico:
semana cerrada por evidencia acumulada.

Recuperación siguiente:
completar Día 9 o descansar el 16/08.
```
