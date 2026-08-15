# Caso integrador 1 — SIGO Móvil
## Registrar ejecución de una Orden de Trabajo con funcionamiento sin conexión

**Fecha:** 15/08/2026  
**Materias integradas:** Análisis y Diseño + POO + Estructuras + Base de Datos + Comunicaciones

---

# 1. Situación

La Cooperativa utiliza SIGO para organizar trabajos de calle.

Un Encargado crea y despacha Órdenes de Trabajo. Un Operario utiliza una aplicación móvil para consultar las OT asignadas, iniciar el trabajo y registrar su ejecución.

La conectividad móvil no siempre está disponible. Cuando falta conexión, el Operario debe poder completar los datos y conservar una solicitud pendiente. Al volver la conexión, las solicitudes deben enviarse respetando el orden de llegada.

Antes de confirmar una ejecución, el Operario puede modificar prioridad local, fecha, observación o teléfono de contacto y debe poder deshacer la última modificación no confirmada.

Cuando una ejecución se registra correctamente, el sistema notifica por correo electrónico y por notificación móvil. Ambos canales comparten una operación común, pero la realizan de forma diferente. Los envíos deben poder auditarse.

La base debe conservar datos de Sectores, Órdenes de Trabajo, Operarios, teléfonos, asignaciones y ejecuciones sin redundancias innecesarias.

Opcionalmente, una ejecución puede adjuntar una medición proveniente de un sensor analógico. La aplicación toma muestras y transmite una representación digital al servidor.

---

# 2. Reglas dadas del dominio

1. Toda OT pertenece obligatoriamente a un Sector.
2. Un Sector puede existir sin OT y puede tener muchas.
3. Una OT puede tener varios Operarios asignados.
4. Un Operario puede participar en varias OT.
5. Una misma pareja OT–Operario puede asignarse varias veces en fechas diferentes.
6. Toda OT nueva nace en estado `PENDIENTE`.
7. Para registrar una ejecución, la OT debe estar `DESPACHADA` o `EN_EJECUCION` según el flujo definido.
8. Una OT `FINALIZADA` no vuelve a `PENDIENTE`.
9. Si falta conexión, la solicitud de registrar ejecución queda `PENDIENTE_ENVIO`.
10. Las solicitudes pendientes se envían por orden de llegada.
11. Una solicitud no se elimina de la cola hasta recibir confirmación del servidor.
12. FIFO preserva el orden, pero la trazabilidad requiere registrar identificador, fecha/hora, usuario, estado, intentos y resultado.
13. Solo se pueden deshacer cambios locales todavía no confirmados.
14. Al confirmar los cambios, el historial local de deshacer se vacía.
15. El número visible de OT no puede repetirse.
16. Un Operario puede tener varios teléfonos.
17. Cada asignación registra fecha y estado.
18. El sistema puede notificar mediante Email y Push.
19. Todo canal de notificación debe poder registrar auditoría.
20. Si el enunciado no determina una tecnología o protocolo, debe declararse el supuesto utilizado.

---

# 3. Datos disponibles

## OT del ejercicio

```text
id_ot:          1587
numero_ot:      OT-1587
descripcion:    Reparar red en zona norte
estado:         DESPACHADA
prioridad:      URGENTE
id_sector:      4
nombre_sector:  Redes
```

## Operario

```text
id_operario:          20
nombre_operario:      Juan Pérez
especialidad:         Redes
telefonos:            2245-111111, 2245-222222
```

## Ejecución

```text
fecha:          2026-08-15
resultado:      Trabajo finalizado
observacion:    Se reemplazó un tramo de cable
medicion:       opcional
```

## Conectividad

```text
Inicio del registro: sin conexión
Recuperación de conexión: posterior
Política de pendientes: FIFO
```

## Sensor opcional

```text
Señal original: analógica
fmax:           4 kHz
```

---

# 4. Parte A — Problema, alcance y objetivos

## A1. Problema

Redactar el problema en un párrafo incluyendo:

- necesidad del Operario;
- falta de conectividad;
- orden de envío;
- notificaciones;
- persistencia coherente.

## A2. Alcance

Definir:

```text
Incluido:
Excluido:
```

No incluir funciones que el caso no solicita.

## A3. Objetivos

Escribir:

```text
Objetivo general:
Objetivo específico 1:
Objetivo específico 2:
Objetivo específico 3:
```

---

# 5. Parte B — Requisitos

## B1. Requerimientos funcionales

Redactar al menos ocho RF, incluyendo:

- consultar OT asignada;
- registrar ejecución;
- guardar solicitud pendiente;
- sincronizar por orden de llegada;
- deshacer última modificación local;
- notificar por distintos canales;
- registrar auditoría;
- consultar trazabilidad.

Formato:

```text
RF-01 El sistema deberá...
```

## B2. Requerimientos no funcionales

Redactar al menos cinco RNF de categorías diferentes:

- rendimiento;
- fiabilidad;
- seguridad;
- portabilidad;
- disponibilidad o usabilidad.

Todo valor debe poder comprobarse objetivamente.

## B3. Reglas de negocio

Transformar al menos seis reglas del dominio en reglas numeradas:

```text
RN-01 ...
```

## B4. Calidad

Elegir dos RF y verificar:

```text
Correcto:
Consistente:
Completo:
Realista:
Necesario:
Verificable:
Rastreable:
```

---

# 6. Parte C — Casos de uso

## C1. Actores

Identificar y justificar:

- Encargado;
- Operario;
- sistema externo o servicio de notificaciones, si corresponde.

## C2. Casos de uso

Proponer casos con nombres verbales.

Mínimo:

```text
Crear Orden de Trabajo
Despachar Orden de Trabajo
Consultar Órdenes asignadas
Registrar ejecución de OT
Sincronizar ejecuciones pendientes
Consultar trazabilidad
Notificar resultado
```

## C3. Relaciones

Analizar posibles usos de:

```text
<<include>>
<<extend>>
generalización
```

No usar relaciones solo para decorar el diagrama.

## C4. Caso detallado: Registrar ejecución de OT

Completar:

```text
Actor principal:
Objetivo:
Resultado de valor:
Disparador:
Precondiciones:
Postcondiciones de éxito:
Postcondiciones de fallo:
```

Escribir:

- flujo principal de 7–10 pasos;
- alternativo por falta de conexión;
- excepción por estado no permitido;
- alternativo por medición opcional.

El alternativo sin conexión debe conservar el objetivo `Registrar ejecución de OT`.

---

# 7. Parte D — Modelo de análisis

## D1. Clases de análisis

Clasificar y justificar:

```text
AppRegistrarEjecucion
ControlRegistrarEjecucion
OrdenTrabajo
EjecucionOT
SolicitudPendiente
Operario
```

Usar:

```text
<<interfaz>>
<<control>>
<<entidad>>
```

## D2. Responsabilidades

Asignar responsabilidades sin convertirlas todavía en tecnología definitiva.

## D3. Realización de caso de uso–análisis

Construir una colaboración con:

- actor;
- interfaz;
- control;
- entidades;
- al menos seis mensajes conceptuales;
- alternativo sin conexión.

Diferenciar:

```text
responsabilidad conceptual
método Java definitivo
```

---

# 8. Parte E — Modelo de diseño

## E1. Elementos de diseño

Justificar la aparición de:

```text
AppEjecucion
EjecucionService
OrdenTrabajoRepository
EjecucionRepository
ColaSincronizacion
Sincronizador
ServicioNotificaciones
```

## E2. Diagrama de secuencia textual

Construir el flujo normal indicando:

- participantes;
- mensajes;
- orden temporal;
- respuestas;
- foco de control cuando sea relevante.

## E3. Fragmento alternativo

Usar:

```text
alt [sin conexión]
```

Debe incluir:

1. creación de solicitud pendiente;
2. encolado;
3. mensaje al Operario;
4. recuperación de conexión;
5. intervención del Sincronizador;
6. desencolado;
7. envío y confirmación;
8. trazabilidad del intento.

## E4. Estados de la OT

Proponer un diagrama textual con:

```text
PENDIENTE
DESPACHADA
EN_EJECUCION
FINALIZADA
ANULADA
```

Identificar:

```text
Estado:
Evento:
Transición:
Condición:
Acción:
```

---

# 9. Parte F — Diseño POO

## F1. Clases principales

Proponer atributos y métodos para:

```text
OrdenTrabajo
EjecucionOT
SolicitudSincronizacion
```

Aplicar encapsulamiento.

## F2. Abstracción y Polimorfismo

Diseñar:

```text
CanalNotificacion          abstracta
├── NotificacionEmail
└── NotificacionMovil

Auditable                  interfaz
```

Requisitos:

- atributo privado `destinatario`;
- constructor protegido;
- método concreto de validación;
- método abstracto `enviar`;
- `toString()`;
- `extends`;
- `implements`;
- `@Override`;
- prueba polimórfica con `List<CanalNotificacion>`.

## F3. Validación

Evitar:

```java
texto == ""
```

La operación inválida debe detenerse mediante retorno controlado o excepción.

## F4. Defensa conceptual

Diferenciar:

```text
Abstracción
Encapsulamiento
Herencia
Sobrescritura
Polimorfismo
Clase abstracta
Interfaz
```

---

# 10. Parte G — Estructuras de Datos

## G1. Pila

Justificar una Pila para:

```text
Deshacer la última modificación local no confirmada
```

Simular:

```text
Cambiar prioridad
Cambiar fecha
Agregar observación
Cambiar teléfono
Deshacer
Deshacer
```

Indicar la cima después de cada operación.

## G2. Cola

Justificar una Cola para solicitudes pendientes.

Simular:

```text
encolar(EJ-01)
encolar(EJ-02)
encolar(EJ-03)
cabecera()
desencolar()
encolar(EJ-04)
desencolar()
```

Indicar:

- elemento devuelto;
- estado de la Cola;
- frente;
- final.

## G3. Implementación

Comparar:

```text
vector e índices
lista enlazada y referencias
```

Explicar qué permanece en el TDA y qué cambia.

## G4. Trazabilidad

Explicar por qué FIFO no basta para reconstruir la historia de cada solicitud.

---

# 11. Parte H — DER y modelo relacional

## H1. Entidades mínimas

```text
SECTOR
ORDEN_TRABAJO
OPERARIO
OPERARIO_TELEFONO
ASIGNACION_OT
EJECUCION_OT
SOLICITUD_SINCRONIZACION
```

## H2. Relaciones

Determinar cardinalidades y participación mínima/máxima.

Mínimo:

```text
SECTOR 1:N ORDEN_TRABAJO
ORDEN_TRABAJO N:M OPERARIO
ORDEN_TRABAJO 1:N EJECUCION_OT
SOLICITUD_SINCRONIZACION N:1 EJECUCION_OT
```

Declarar supuestos cuando el mínimo no esté definido.

## H3. Claves

Marcar:

- PK;
- FK;
- `UNIQUE`;
- claves compuestas cuando correspondan.

## H4. Fuerte, débil y asociativa

Clasificar justificadamente. No decidir solo por la existencia de FK.

---

# 12. Parte I — Normalización

Partir de:

```text
REGISTRO_EJECUCION_COMPLETO

id_ot
numero_ot
descripcion_ot
id_sector
nombre_sector
id_operario
nombre_operario
especialidad_operario
telefonos_operario
fecha_asignacion
estado_asignacion
id_ejecucion
fecha_ejecucion
resultado_ejecucion
```

## I1. 1FN

Detectar valores no atómicos y separar grupos repetitivos.

## I2. 2FN

Suponer para la asignación:

```text
PK(id_ot, id_operario, fecha_asignacion)
```

Identificar dependencias parciales.

## I3. 3FN

Analizar:

```text
id_ot → id_sector
id_sector → nombre_sector
```

## I4. Modelo final

Proponer relaciones con PK, FK y `UNIQUE`.

## I5. ID artificial

Explicar por qué agregar `id_asignacion` no elimina automáticamente las dependencias funcionales.

---

# 13. Parte J — Comunicaciones

## J1. Arquitectura

Representar:

```text
Aplicación móvil
→ red de acceso
→ switch/router
→ Internet/WAN
→ servidor/API
→ base de datos
```

## J2. Recorrido TCP/IP

Explicar:

```text
Aplicación
→ datos

Transporte
→ segmento + puertos

Internet/Red
→ paquete + IP

Acceso/Enlace
→ trama + MAC

Física
→ bits/señales
```

## J3. Nodos intermedios

Diferenciar:

```text
Switch
Router
Servidor destino
```

## J4. PDU

Completar:

```text
PDU = SDU + PCI
```

## J5. Información

Calcular:

```text
P(E)=1/16
I(E)=?
```

Mostrar fórmula y unidad.

## J6. Frecuencia y muestreo

Para el sensor:

```text
fmax=4 kHz
fs mínima=?
```

Además:

```text
T=0,002 s
f=?
```

## J7. Clasificaciones

Diferenciar:

```text
analógica/digital
serie/paralela
síncrona/asíncrona
guiada/no guiada
```

Elegir una forma de transmisión para el caso y declarar el supuesto.

---

# 14. Parte K — Pruebas y trazabilidad

Proponer al menos ocho casos de prueba:

1. OT con estado válido y conexión disponible.
2. OT con estado inválido.
3. Falta de conexión.
4. Recuperación y envío FIFO.
5. Reintento fallido sin eliminar la solicitud.
6. Deshacer última modificación local.
7. Notificación Email y Push mediante polimorfismo.
8. Registro de teléfonos y asignación sin redundancia.

Para cada uno indicar:

```text
Identificador:
Precondición:
Datos:
Acción:
Resultado esperado:
RF/RN asociado:
```

---

# 15. Defensa oral

Preparar una exposición de 8–12 minutos con esta cadena:

```text
Problema y requisitos
→ casos de uso
→ análisis
→ diseño y secuencia
→ POO/polimorfismo
→ Pila/Cola
→ DER/normalización
→ comunicaciones
→ pruebas
```

No limitarse a enumerar definiciones. Debe justificarse cada decisión en relación con el caso.
