# Evidencia guiada — Caso integrador 1
## SIGO Móvil — Registrar ejecución de OT

**Fecha:** 15/08/2026  
**Modalidad:** resolución interactiva guiada  
**Evaluación formal:** no realizada  
**Uso:** evidencia cualitativa para el cierre semanal

> Este archivo resume las respuestas producidas durante la práctica guiada. No las presenta como respuestas de un examen formal ni les asigna puntaje.

---

# 1. Recuperación inicial

El estudiante respondió correctamente o con corrección inmediata:

```text
Línea doble DER → participación total
Análisis ≠ diseño
Permanece el contrato del TDA; cambia la implementación
FIFO preserva orden; trazabilidad necesita registros
bits / bits-símbolo / bits-segundo
f=1/T
T=1/f
fs mínima=2·fmax
ID artificial ≠ normalización
```

Errores observados:

```text
I(E) escrita inicialmente como log₂(1·P(E))
String: error ortográfico en isEmpty
trazabilidad definida inicialmente solo por campos sueltos
```

Corrección final:

```text
I(E)=log₂(1/P(E))
Unidad=bits
```

---

# 2. Problema y requisitos

La respuesta inicial identificó:

- registro de ejecuciones desde la calle;
- OT previamente asignadas;
- observaciones, evidencias y mediciones opcionales;
- modificaciones locales;
- interrupciones de conexión;
- sincronización ordenada;
- trazabilidad y notificaciones.

Fortalezas:

- comprensión completa del problema operativo;
- múltiples RF y reglas de negocio;
- reconocimiento de funcionamiento offline.

Ajustes:

- objetivo general demasiado amplio;
- RNF de disponibilidad no verificable;
- `Registrar ejecución` confundido parcialmente con “realizar” el trabajo;
- faltaron inicialmente deshacer, auditoría, consulta de resultado y trazabilidad.

---

# 3. Actores y casos de uso

Identificados:

```text
Encargado
Operario
Servicio externo de Notificaciones
```

Casos propuestos:

```text
Crear Orden de Trabajo
Despachar Orden de Trabajo
Consultar Órdenes asignadas
Registrar ejecución de OT
Sincronizar ejecuciones pendientes
Consultar trazabilidad
Notificar resultado
```

Relaciones aplicadas:

```text
Registrar ejecución
<<include>> Validar estado de la OT

Adjuntar evidencia
<<extend>> Registrar ejecución

Adjuntar medición
<<extend>> Registrar ejecución
```

Ajustes:

- el sistema no es actor de sí mismo;
- el Servicio de Notificaciones es actor secundario/de apoyo;
- generalización: línea continua y triángulo vacío hacia el padre.

---

# 4. Caso de uso detallado

El flujo incluyó:

- selección de OT asignada;
- validación del estado;
- ingreso de resultado y observación;
- validación de información;
- confirmación;
- verificación de conexión;
- creación de ejecución;
- trazabilidad;
- respuesta al Operario.

Alternativo sin conexión:

```text
crear solicitud PENDIENTE_ENVIO
→ encolar
→ informar al Operario
→ detectar recuperación de conexión
→ sincronizar en FIFO
```

Correcciones incorporadas:

```text
OT válida = DESPACHADA o EN_EJECUCION
Sincronizador explícito
cabecera sin eliminar
confirmación del servidor
trazabilidad
solo después desencolar
```

Excepción:

```text
FINALIZADA o ANULADA
→ rechazar registro
→ no crear ejecución parcial
→ conservar estado
→ registrar intento
```

Medición:

```text
señal analógica
→ fs≥2·fmax
→ muestreo
→ cuantificación
→ codificación
→ representación digital
```

---

# 5. Modelo de análisis y diseño

Clasificación correcta:

```text
AppRegistrarEjecucion     → <<interfaz>>
ControlRegistrarEjecucion → <<control>>
OrdenTrabajo              → <<entidad>>
EjecucionOT               → <<entidad>>
SolicitudPendiente        → <<entidad>>
Operario interno          → <<entidad>>
```

Colaboración conceptual ordenada correctamente:

```text
Operario ingresa
→ interfaz envía
→ control consulta OT
→ OT responde
→ control crea EjecucionOT
→ interfaz informa
```

Elementos de diseño reconocidos:

```text
AppEjecucion
EjecucionService
OrdenTrabajoRepository
EjecucionRepository
ColaSincronizacion
Sincronizador
ServicioNotificaciones
```

Ajuste principal:

```text
consultar cabecera
→ enviar
→ esperar confirmación
→ registrar trazabilidad
→ desencolar
```

---

# 6. POO y Estructuras

## Clases propuestas

```text
OrdenTrabajo
- id, descripción, estado, prioridad
- cambiarPrioridad, finalizar, toString

EjecucionOT
- id_ejecucion, id_ot, id_operario, fecha, resultado,
  observación, evidencia, medición, estado

SolicitudPendiente
- id_solicitud, datos de ejecución, estado,
  fecha, intentos, último resultado
```

## Encapsulamiento

Se justificó `private estado` para controlar valores, transiciones y permisos.

## Pila

```text
Cambiar observación
Agregar evidencia
Cambiar teléfono
```

```text
Cima inicial → Cambiar teléfono
Primer pop → Cambiar teléfono
Nueva cima → Agregar evidencia
```

## Cola

```text
SOL-01, SOL-02, SOL-03
Frente=SOL-01
Final=SOL-03
Tras confirmar SOL-01 → [SOL-02, SOL-03]
```

## Polimorfismo

Se explicó:

```text
tipo común CanalNotificacion
objetos NotificacionEmail/NotificacionMovil
misma llamada enviar()
sobrescritura específica
```

## Interfaz

`Auditable` se justificó como contrato aplicable a clases de jerarquías distintas.

---

# 7. Base de Datos

Entidades y relaciones identificadas:

```text
SECTOR
ORDEN_TRABAJO
OPERARIO
OPERARIO_TELEFONO
ASIGNACION_OT
EJECUCION_OT
SOLICITUD_PENDIENTE
```

Cardinalidades centrales:

```text
SECTOR → OT = 0..N
OT → SECTOR = 1..1
OT ↔ OPERARIO = N:M mediante ASIGNACION_OT
EJECUCION_OT → OT = 1..1
EJECUCION_OT → OPERARIO = 1..1
```

Normalización:

```text
1FN → separar teléfonos
2FN → separar datos de OT y Operario de la asignación
3FN → separar nombre_sector mediante SECTOR
```

Ajustes:

- `EJECUCION_OT` y `SOLICITUD_PENDIENTE` necesitan identidad propia en el diseño recomendado;
- `UNIQUE(id_ot,id_operario,fecha_asignacion)` si `id_asignacion` es PK;
- `id_sector` no es una “clave transitiva”; la dependencia completa es transitiva;
- tener dos FK no convierte automáticamente una entidad en débil.

---

# 8. Comunicaciones

Recorrido explicado:

```text
Aplicación
→ Transporte/puertos/segmento
→ Internet/IP/paquete
→ Acceso/MAC/trama
→ Física/bits/señales
```

```text
PDU=SDU+PCI
Switch=C2/MAC/trama
Router=C3/IP/paquete
```

Cálculos correctos finales:

```text
P(E)=1/16
I(E)=log₂(16)=4 bits

T=0,002 s
f=500 Hz

fmax=4 kHz
fs mínima=8 k muestras/s
```

Ajustes:

- la MAC corresponde al enlace local;
- en móvil el primer medio puede ser no guiado;
- la falta de conexión no determina sincronía/asíncronía;
- `4 kHz` fue expresado oralmente una vez como `4 Hz`.

---

# 9. Integración oral

El estudiante explicó la cadena:

```text
Requisito
→ caso de uso
→ análisis
→ diseño
→ implementación
→ estructuras
→ base de datos
→ comunicaciones
```

Fortalezas:

- relación entre LIFO/FIFO y el problema;
- secuencia segura de sincronización;
- relación entre muestreo y digitalización;
- comprensión del papel de la base normalizada.

Precisión pendiente:

- asociativa frente a débil;
- base de datos como parte paralela de diseño/implementación, no etapa posterior fija;
- unidades y supuestos tecnológicos.

---

# 10. Conclusión

La práctica guiada demuestra un nivel semanal alto y capacidad de integración. No reemplaza una evaluación formal, pero complementa las notas cerradas de los Días 5 a 8 para determinar el nivel semanal.
