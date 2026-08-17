# Ficha — Arquitectura de software
## Día 10 — 17/08/2026

---

# 1. Definición

La arquitectura de un sistema es el conjunto de decisiones significativas sobre:

```text
- organización del sistema;
- selección de elementos estructurales;
- interfaces de esos elementos;
- comportamiento y colaboraciones;
- composición en subsistemas mayores;
- estilo arquitectónico que guía la organización.
```

No es solamente:

```text
un dibujo
una lista de tecnologías
una base de datos
una estructura de carpetas
```

Es una combinación de decisiones, razones, restricciones, vistas y artefactos.

---

# 2. Factores que influyen

La arquitectura surge de las necesidades de la organización y los casos de uso, pero también está condicionada por:

```text
plataforma de hardware
sistema operativo
sistema gestor de base de datos
protocolos de red
componentes reutilizables
implantación
sistemas heredados
rendimiento
fiabilidad
seguridad
otras restricciones no funcionales
```

Ejemplo SIGO:

```text
Necesidad:
Operarios registran trabajos desde la calle.

Factores:
- conectividad intermitente;
- PostgreSQL;
- aplicación móvil;
- permisos por sector;
- integración con otros sistemas;
- trazabilidad;
- disponibilidad.
```

---

# 3. ¿Por qué se necesita arquitectura?

```text
Comprensión del sistema
→ ofrece una visión global.

Organización del desarrollo
→ distribuye responsabilidades y trabajo.

Reutilización
→ identifica servicios y componentes reutilizables.

Evolución
→ permite cambiar partes sin rehacer todo el sistema.
```

La función se expresa en los casos de uso y la forma se expresa en la arquitectura. Ambas deben equilibrarse.

---

# 4. Casos de uso y arquitectura

Proceso conceptual:

```text
1. Comprender los casos de uso principales.
2. Crear un esquema arquitectónico inicial.
3. Seleccionar casos críticos o significativos.
4. Realizarlos mediante subsistemas, clases y componentes.
5. Descubrir nuevas decisiones y riesgos.
6. Repetir hasta estabilizar la arquitectura.
```

Un caso de uso significativo puede ser:

```text
Registrar ejecución de OT sin conexión
```

porque impacta:

- sincronización;
- persistencia local;
- servicios de servidor;
- seguridad;
- trazabilidad;
- comunicación móvil;
- notificaciones.

---

# 5. Vistas

El material menciona que la arquitectura se describe mediante cinco vistas relacionadas, conocidas como enfoque `4+1`.

Los nombres aparecen principalmente en la figura del material. Como complemento didáctico estándar de UML, se trabajarán:

```text
Vista de casos de uso
→ escenarios arquitectónicamente significativos.

Vista lógica o de diseño
→ clases, subsistemas, interfaces y relaciones.

Vista de procesos
→ concurrencia, comunicación y comportamiento en ejecución.

Vista de implementación
→ componentes y organización física del software.

Vista de despliegue
→ nodos y distribución física de componentes.
```

Regla:

> Una vista no es todo el modelo; selecciona los elementos significativos para un propósito arquitectónico.

---

# 6. Descripción de arquitectura

La descripción arquitectónica debe seleccionar los artefactos más relevantes.

## Desde el modelo de diseño

Puede incluir:

```text
descomposición en subsistemas
interfaces proporcionadas
interfaces requeridas
dependencias
clases fundamentales
realizaciones de casos de uso críticos
```

## Desde el despliegue

Puede incluir:

```text
nodos
componentes asignados a nodos
configuraciones de red
correspondencia software–infraestructura
```

---

# 7. Subsistema de diseño

Un subsistema organiza artefactos del diseño en una pieza manejable.

Puede contener:

```text
clases de diseño
servicios
realizaciones de casos de uso
interfaces
otros subsistemas
```

No es lo mismo que una entidad.

```text
EjecucionOT
→ entidad del dominio.

Subsistema Ejecuciones
→ agrupación de elementos que implementan operaciones de ejecución.
```

---

# 8. Alta cohesión y bajo acoplamiento

## Alta cohesión

Los elementos de un subsistema deben contribuir a un propósito común.

Ejemplo correcto:

```text
Subsistema Notificaciones
- ServicioNotificaciones
- CanalNotificacion
- NotificacionEmail
- NotificacionMovil
- AuditoriaNotificacion
```

Ejemplo con baja cohesión:

```text
Subsistema Variado
- NotificacionEmail
- CalculoFacturacion
- OrdenTrabajoRepository
- Impresora
```

## Bajo acoplamiento

Los subsistemas deben depender lo menos posible entre sí y hacerlo mediante interfaces claras.

```text
Ejecuciones
→ usa INotificaciones
```

Es preferible a:

```text
Ejecuciones
→ conoce clases internas, tablas y detalles concretos de Notificaciones
```

---

# 9. Interfaz de diseño

Una interfaz separa:

```text
qué operaciones se ofrecen
```

 de:

```text
cómo se implementan
```

Ejemplo:

```text
IRegistroEjecucion

+ registrar(datos): ResultadoRegistro
+ consultarResultado(id): ResultadoRegistro
```

Posibles implementaciones:

```text
EjecucionServiceLocal
EjecucionServiceRemoto
```

Los clientes dependen del contrato y no de los detalles internos.

---

# 10. Dependencias entre subsistemas

Una dependencia indica uso.

```text
Subsistema TrabajoEnCalle
   ─ ─ ─ ─ ─▷ ISincronizacion

Subsistema Sincronizacion
   ─ ─ ─ ─ ─▷ IRegistroEjecucion

Subsistema Ejecuciones
   ─ ─ ─ ─ ─▷ INotificaciones

Subsistema Persistencia
   proporciona repositorios
```

En UML, una dependencia se representa con línea discontinua dirigida hacia el elemento utilizado.

---

# 11. Relaciones UML de recuperación

## Asociación

Vínculo estructural entre clases.

```text
OrdenTrabajo — Sector
```

## Agregación

Todo/parte compartida; la parte puede vivir independientemente.

```text
EquipoTrabajo ◇── Operario
```

## Composición

Todo/parte fuerte; la parte depende del ciclo de vida del todo.

```text
OrdenCompra ◆── DetalleOrden
```

## Dependencia

Relación de uso, frecuentemente mediante parámetro, operación o interfaz.

```text
EjecucionService - - -▷ INotificaciones
```

---

# 12. Ejemplo de arquitectura SIGO

```text
[SIGO Móvil]
     │
     ▼
IRegistroEjecucion
     │
     ▼
[Subsistema Ejecuciones]
     ├── EjecucionService
     ├── OrdenTrabajoRepository
     └── EjecucionRepository
     │
     ├────────▷ INotificaciones
     │              │
     │              ▼
     │       [Subsistema Notificaciones]
     │
     └────────▷ ISincronizacion
                    │
                    ▼
            [Subsistema Sincronización]
            ├── ColaSincronizacion
            ├── Sincronizador
            └── SolicitudPendiente
```

Decisiones a justificar:

```text
- por qué separar Sincronización;
- qué información permanece local;
- cómo se registra trazabilidad;
- qué subsistema conoce la Cola;
- qué interfaz ve la App;
- qué RNF impacta cada subsistema.
```

---

# 13. Documentar una decisión

Plantilla:

```text
Decisión:

Problema que resuelve:

Alternativas consideradas:

Opción elegida:

Justificación:

Consecuencias positivas:

Riesgos/costos:

RNF relacionados:

Artefactos afectados:
```

Ejemplo:

```text
Decisión:
Separar Sincronización como subsistema.

Problema:
Conectividad móvil intermitente.

Opción elegida:
Cola persistente de solicitudes pendientes.

Consecuencia:
Mayor fiabilidad, pero más estados, trazabilidad y reintentos.
```

---

# 14. Preguntas de control

1. ¿Por qué arquitectura no equivale a tecnología?
2. ¿Qué decisiones significativas incluye?
3. ¿Qué factores no funcionales la afectan?
4. ¿Qué diferencia hay entre entidad y subsistema?
5. ¿Qué significa alta cohesión?
6. ¿Qué significa bajo acoplamiento?
7. ¿Qué proporciona una interfaz?
8. ¿Qué representa una dependencia?
9. ¿Por qué se documentan vistas?
10. ¿Qué caso de uso de SIGO es arquitectónicamente significativo y por qué?
