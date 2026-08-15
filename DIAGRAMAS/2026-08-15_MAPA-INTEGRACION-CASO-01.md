# Mapa de integración — Caso integrador 1
## SIGO Móvil — Registrar ejecución de OT

**Fecha:** 15/08/2026

---

# 1. Trazabilidad principal

```text
Problema del negocio
        ↓
Objetivos
        ↓
RF + RNF + reglas de negocio
        ↓
Actores y casos de uso
        ↓
Realización de análisis
interfaz → control → entidades
        ↓
Realización de diseño
app → service → repository → cola/sincronizador
        ↓
Código POO
clase abstracta + interfaz + polimorfismo
        ↓
Estructuras
Pila LIFO + Cola FIFO
        ↓
Datos
DER → relaciones → 1FN → 2FN → 3FN
        ↓
Comunicaciones
TCP/IP + PDU + direccionamiento + señales
        ↓
Casos de prueba
        ↓
Defensa oral
```

---

# 2. Vista externa

```text
Encargado
   │
   ├── Crear Orden de Trabajo
   ├── Despachar Orden de Trabajo
   └── Consultar trazabilidad

Operario
   │
   ├── Consultar Órdenes asignadas
   ├── Registrar ejecución de OT
   ├── Deshacer modificación local
   └── Sincronizar solicitudes pendientes

Servicio externo
   │
   └── Entregar notificación
```

---

# 3. Vista interna de análisis

```text
Operario
   │
   │ registrar ejecución
   ▼
AppRegistrarEjecucion          <<interfaz>>
   │
   │ solicitar registro
   ▼
ControlRegistrarEjecucion      <<control>>
   │
   ├── consultar ─────────────► OrdenTrabajo       <<entidad>>
   │
   ├── crear/actualizar ──────► EjecucionOT         <<entidad>>
   │
   └── conservar pendiente ───► SolicitudPendiente  <<entidad>>
```

Regla:

```text
Análisis
→ responsabilidades conceptuales
→ todavía no define repositorios, protocolos o estructuras definitivas
```

---

# 4. Vista de diseño

```text
Operario
   │
   ▼
AppEjecucion
   │ registrar(idOT, datos)
   ▼
EjecucionService
   │
   ├── buscarPorId(idOT) ─────► OrdenTrabajoRepository
   │
   ├── guardar(ejecucion) ────► EjecucionRepository
   │
   ├── encolar(solicitud) ────► ColaSincronizacion
   │
   └── notificar(resultado) ──► ServicioNotificaciones

Sincronizador
   │
   ├── cabecera/desencolar ───► ColaSincronizacion
   └── enviar pendiente ──────► API/Servidor
```

Regla:

```text
FIFO
→ necesidad de orden

ColaSincronizacion
→ decisión de diseño

vector/lista/broker/tabla
→ decisión de implementación
```

---

# 5. Secuencia normal

```text
1. Operario → AppEjecucion:
   ingresar datos de ejecución

2. AppEjecucion → EjecucionService:
   registrar(idOT, datos)

3. EjecucionService → OrdenTrabajoRepository:
   buscarPorId(idOT)

4. OrdenTrabajoRepository → EjecucionService:
   OrdenTrabajo

5. EjecucionService → OrdenTrabajo:
   puedeRegistrarEjecucion()

6. EjecucionService → EjecucionRepository:
   guardar(EjecucionOT)

7. EjecucionRepository → EjecucionService:
   ejecución registrada

8. EjecucionService → ServicioNotificaciones:
   notificar resultado

9. EjecucionService → AppEjecucion:
   ResultadoRegistro

10. AppEjecucion → Operario:
    mostrar confirmación
```

---

# 6. Secuencia alternativa sin conexión

```text
alt [sin conexión]

1. AppEjecucion crea SolicitudSincronizacion.

2. AppEjecucion → ColaSincronizacion:
   encolar(solicitud)

3. AppEjecucion registra:
   estado=PENDIENTE_ENVIO

4. AppEjecucion informa al Operario.

5. Al volver la conexión:
   Sincronizador consulta cabecera.

6. Sincronizador envía la primera solicitud.

7. Si recibe confirmación:
   registra resultado y desencola.

8. Si falla:
   conserva la solicitud y registra intento.
```

---

# 7. Diagrama textual de estados

```text
[PENDIENTE]
     │ despachar
     ▼
[DESPACHADA]
     │ iniciar
     ▼
[EN_EJECUCION]
     │ finalizar [datos completos]
     ▼
[FINALIZADA]

PENDIENTE / DESPACHADA / EN_EJECUCION
     │ anular [permiso + motivo]
     ▼
[ANULADA]
```

Conceptos:

```text
Estado
→ situación estable del objeto

Evento
→ hecho que puede provocar un cambio

Transición
→ paso entre estados

Condición
→ expresión que habilita la transición

Acción
→ operación ejecutada por la transición
```

---

# 8. Jerarquía y contratos POO

```text
                 <<abstract>>
              CanalNotificacion
              - destinatario
              + validarDestinatario()
              + enviar(mensaje)*
              + toString()
                     ▲
          ┌──────────┴──────────┐
          │                     │
NotificacionEmail      NotificacionMovil
          │                     │
          └──── implements Auditable ────┘
```

```text
Clase abstracta
→ estado y comportamiento común
→ constructor
→ método abstracto

Interfaz
→ contrato
→ capacidad transversal

Polimorfismo
→ referencia CanalNotificacion
→ objeto Email o Móvil
→ misma llamada enviar()
→ comportamiento concreto
```

---

# 9. Pila y Cola

```text
PILA
LIFO

Uso:
Deshacer última modificación local no confirmada

Cima
→ último cambio realizado
```

```text
COLA
FIFO

Uso:
Enviar solicitudes pendientes por orden de llegada

Frente
→ próxima solicitud

Final
→ nueva solicitud
```

```text
Trazabilidad
≠ FIFO

Trazabilidad requiere:
id + usuario + fecha/hora + estado + intentos + resultado
```

---

# 10. DER textual

```text
SECTOR 1 ───────── N ORDEN_TRABAJO

ORDEN_TRABAJO N ── M OPERARIO
             mediante ASIGNACION_OT

ORDEN_TRABAJO 1 ── N EJECUCION_OT

EJECUCION_OT 1 ─── N SOLICITUD_SINCRONIZACION

OPERARIO 1 ─────── N OPERARIO_TELEFONO
```

Participación dada:

```text
SECTOR → OT = 0..N
OT → SECTOR = 1..1
```

Los demás mínimos deben declararse como supuesto cuando el enunciado no los determine.

---

# 11. Relaciones normalizadas

```text
SECTOR
- id_sector PK
- nombre_sector UNIQUE

ORDEN_TRABAJO
- id_ot PK
- numero_ot UNIQUE
- descripcion_ot
- estado
- prioridad
- id_sector FK

OPERARIO
- id_operario PK
- nombre_operario
- especialidad

OPERARIO_TELEFONO
- id_operario FK
- telefono
- PK(id_operario, telefono)

ASIGNACION_OT
- id_ot FK
- id_operario FK
- fecha_asignacion
- estado_asignacion
- PK(id_ot, id_operario, fecha_asignacion)

EJECUCION_OT
- id_ejecucion PK
- id_ot FK
- id_operario FK
- fecha_ejecucion
- resultado
- observacion

SOLICITUD_SINCRONIZACION
- id_solicitud PK
- id_ejecucion FK
- fecha_creacion
- estado
- intentos
- ultimo_resultado
```

---

# 12. Normalización

```text
1FN
→ teléfonos multivaluados
→ OPERARIO_TELEFONO

2FN
→ datos de OT dependen de id_ot
→ datos de Operario dependen de id_operario
→ estado_asignacion depende de clave completa

3FN
→ id_ot → id_sector → nombre_sector
→ SECTOR separado
```

```text
Agregar id_asignacion
≠ normalizar automáticamente
```

---

# 13. Arquitectura de comunicaciones

```text
App móvil
   ↓ datos de aplicación
Transporte
   ↓ segmento + puertos
Internet/Red
   ↓ paquete + IP
Acceso/Enlace
   ↓ trama + MAC
Física
   ↓ bits/señales
Red de acceso
   ↓
Switch / Router
   ↓
Internet o WAN
   ↓
Servidor API
   ↓
Base de datos
```

Nodos:

```text
Switch
→ analiza trama/MAC

Router
→ analiza paquete/IP
→ forma una nueva trama para el siguiente enlace

Servidor
→ desencapsula hasta Aplicación
```

---

# 14. Fórmulas del caso

```text
I(E)=log₂(1/P(E))
Unidad=bits

f=1/T
T=1/f

fs mínima=2·fmax
```

Para el sensor:

```text
fmax=4 kHz
fs mínima=8 k muestras/s
```

---

# 15. Prueba integrada

```text
RF/RN
   ↓ rastrea
Caso de uso
   ↓ realiza
Clases de análisis/diseño
   ↓ materializa
Código + estructuras + relaciones
   ↓ verifica
Caso de prueba
```

Cada caso de prueba debe indicar el requisito o regla que verifica.
