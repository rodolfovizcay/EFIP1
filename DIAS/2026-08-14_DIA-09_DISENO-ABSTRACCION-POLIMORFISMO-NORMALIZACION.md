# Viernes 14/8 — Día 9
## Diseño + Abstracción/Polimorfismo + Normalización

**Etapa:** quinta jornada intensiva de vacaciones  
**Duración indicada por el plan:** 5,5 horas núcleo  
**Materias:** Análisis y Diseño + Programación Orientada a Objetos + Base de Datos  
**Modalidad:** recuperación activa, modelado, código, normalización, evaluación y defensa

> Nota de planificación: los bloques detallados suman 6 horas —90 + 90 + 30 + 90 + 60 minutos— aunque el encabezado del plan indica 5,5 horas núcleo. Se conservan todos los contenidos y el tramo final puede ajustarse según energía.

---

# 1. Resultado esperado

Al finalizar la jornada deben existir:

- explicación del propósito del diseño;
- comparación análisis/diseño/implementación;
- identificación de artefactos del diseño;
- diagrama de secuencia textual para `Registrar ejecución de OT`;
- diagrama de estados breve de `OrdenTrabajo`;
- explicación de subsistema e interfaz;
- definición y aplicación de abstracción;
- clase y método abstractos escritos en Java;
- interfaz Java con `implements`;
- ejemplo polimórfico ejecutable conceptualmente;
- comparación clase abstracta/interfaz;
- tabla descompuesta en 1FN, 2FN y 3FN;
- dependencias funcionales, parciales y transitivas justificadas;
- evaluación escrita;
- defensa oral;
- plantilla de cierre.

---

# 2. Productos del plan

1. `DIAGRAMAS/2026-08-14_DIAGRAMA-SECUENCIA-REGISTRAR-EJECUCION-OT.md`
2. `CODIGO/2026-08-14_EJEMPLO-POLIMORFICO-OT.md`
3. `BASE-DATOS/2026-08-14_NORMALIZACION-ASIGNACION-OT.md`

Producto integrador adicional:

- `CASOS/2026-08-14_CASO-INTEGRADOR-DISENO-POLIMORFISMO-NORMALIZACION.md`

---

# 3. Cronograma operativo

## Mañana

| Bloque | Duración | Actividad |
|---|---:|---|
| Recuperación inicial | 20 min | E-038, E-040 a E-045 y recuperaciones corregidas |
| M1 — Modelo de diseño | 70 min | Propósito, artefactos, secuencia, estados, subsistemas e interfaces |
| Pausa | 15 min | Descanso real |
| M2 — Abstracción/Polimorfismo | 90 min | `abstract`, interfaz, `implements`, polimorfismo y código |
| Cierre de mañana | 30 min | Defensa clase abstracta vs. interfaz |

## Tarde

| Bloque | Duración | Actividad |
|---|---:|---|
| T1 — Normalización | 90 min | Anomalías, dependencias, 1FN, 2FN y 3FN |
| Pausa | 15 min | Descanso |
| T2.1 — Caso integrador | 20 min | Diseño + polimorfismo + tablas normalizadas |
| T2.2 — Evaluación | 30 min | Escrito breve |
| T2.3 — Defensa y síntesis | 10 min | Defensa integrada y cierre inicial |

---

# 4. Recuperación inicial — sin apuntes

Responder antes de abrir las fichas:

1. ¿Qué significa `Línea doble` en un DER?
2. Para `Registrar ejecución de OT`, escribí un flujo alternativo por falta de conexión sin cambiar el objetivo del caso.
3. En un TDA Cola, ¿qué permanece y qué cambia entre vector y lista enlazada?
4. Diferenciá Pila, Cola y trazabilidad.
5. Completá:

```text
P ↑ → incertidumbre ___ → información ___
P ↓ → incertidumbre ___ → información ___
I(E) =
Unidad =
```

6. Diferenciá:

```text
bits
bits/símbolo
bits/segundo
```

7. Completá:

```text
A =
T =
f =
f =
T =
fs mínima =
```

8. ¿Puede una señal analógica transmitirse como analógica? ¿Quién decide qué datos se envían?
9. ¿Cómo se representa una generalización UML?
10. ¿Qué es una instancia de entidad?
11. ¿Qué diferencia existe entre entidad asociativa y entidad débil?
12. ¿Qué hace `toString()`?

Reglas:

- no consultar tarjetas antes de responder;
- conservar errores reales;
- repetir únicamente los puntos fallados al final del día.

---

# PARTE I — MODELO DE DISEÑO

# 5. Propósito del diseño

El flujo de diseño busca modelar el sistema y encontrar una forma que soporte los requisitos.

Según el material, sus propósitos incluyen:

- comprender requisitos no funcionales y restricciones;
- considerar lenguaje, componentes reutilizables, sistema operativo, distribución, concurrencia, interfaz y transacciones;
- producir una entrada apropiada para la implementación;
- dividir la implementación en partes manejables;
- identificar interfaces entre subsistemas;
- preservar, en lo posible, la estructura definida durante el análisis.

Idea central:

```text
Análisis
→ estructura conceptual del problema.

Diseño
→ plano físico de la solución bajo condiciones de implementación.

Implementación
→ código, base de datos y componentes ejecutables.
```

El modelo de diseño está más próximo a la implementación que el modelo de análisis.

---

# 6. Análisis vs. diseño

| Criterio | Modelo de análisis | Modelo de diseño |
|---|---|---|
| Perspectiva | Interna conceptual | Física/próxima a implementación |
| Lenguaje | Dominio y responsabilidades | Clases, operaciones, interfaces y subsistemas |
| Restricciones tecnológicas | Se abstrae en gran medida | Las incorpora |
| Casos de uso | Realización de análisis | Realización de diseño |
| Interacción típica | Colaboración | Diagrama de secuencia |
| Resultado | Comprensión estructurada | Plano para implementar |

No significa que diseño sea código terminado. Sigue siendo un modelo, pero suficientemente específico para orientar la implementación.

---

# 7. Artefactos fundamentales del diseño

El material enumera:

```text
Modelo de diseño
Clase de diseño
Realización de caso de uso–diseño
Subsistema de diseño
Interfaz
Modelo de despliegue
Descripción de arquitectura
```

## 7.1 Modelo de diseño

Modelo de objetos que describe la realización física de los casos de uso y cómo requisitos funcionales, no funcionales y restricciones afectan al sistema.

## 7.2 Clase de diseño

Abstracción con traducción más directa hacia una clase o construcción similar de implementación.

Puede especificar:

- atributos;
- operaciones;
- signaturas;
- visibilidad;
- relaciones;
- interfaces proporcionadas o requeridas.

## 7.3 Realización de caso de uso–diseño

Describe cómo se ejecuta un caso mediante clases de diseño, objetos y mensajes. Incluye normalmente:

- flujo textual;
- diagrama de clases participantes;
- diagrama de secuencia.

## 7.4 Subsistema de diseño

Organiza artefactos del diseño en piezas manejables. Puede contener:

- clases de diseño;
- realizaciones de casos de uso;
- interfaces;
- otros subsistemas.

## 7.5 Interfaz

Separa la especificación de la funcionalidad de su implementación.

```text
Interfaz
→ qué operaciones se ofrecen.

Implementación
→ cómo se realizan esas operaciones.
```

## 7.6 Modelo de despliegue

Describe la distribución física de funcionalidad entre nodos de cómputo. Se reconoce hoy, pero no se profundiza.

## 7.7 Descripción de arquitectura

Incluye los elementos relevantes del diseño:

- subsistemas;
- interfaces;
- dependencias;
- clases fundamentales;
- realizaciones críticas.

---

# 8. Realización de caso de uso–diseño

Caso de trabajo:

```text
Registrar ejecución de OT
```

En análisis teníamos responsabilidades conceptuales:

```text
AppRegistrarEjecucion      <<interfaz>>
ControlRegistrarEjecucion  <<control>>
OrdenTrabajo               <<entidad>>
EjecucionOT                <<entidad>>
```

En diseño se toman decisiones más concretas. Supuesto didáctico:

```text
AppRegistrarEjecucion
ServicioRegistrarEjecucion
RepositorioOrdenTrabajo
RepositorioEjecucion
ColaSincronizacion
OrdenTrabajo
EjecucionOT
```

Estas decisiones no son universales: dependen del entorno y restricciones elegidos.

---

# 9. Diagrama de secuencia

Un diagrama de secuencia muestra interacciones mediante mensajes y destaca su orden temporal.

## 9.1 Organización

```text
Eje horizontal (x)
→ actor, objetos o subsistemas participantes.

Eje vertical (y)
→ paso del tiempo de arriba hacia abajo.
```

## 9.2 Componentes

### Participante

Actor, objeto o subsistema ubicado en la parte superior.

### Línea de vida

Línea vertical discontinua que representa la existencia del participante durante la interacción.

### Mensaje

Transferencia de solicitud o información entre participantes.

### Foco de control

Rectángulo delgado que representa el período en el cual un objeto ejecuta una acción.

### Creación/destrucción

Un objeto puede crearse mediante un mensaje de creación y destruirse al finalizar su vida, cuando corresponda.

## 9.3 Regla temporal

```text
Arriba
→ primero.

Abajo
→ después.
```

## 9.4 Flujo normal didáctico

```text
Operario
→ AppRegistrarEjecucion: registrar(datos)

AppRegistrarEjecucion
→ ServicioRegistrarEjecucion: registrar(datos)

ServicioRegistrarEjecucion
→ RepositorioOrdenTrabajo: buscarPorId(idOT)

RepositorioOrdenTrabajo
→ ServicioRegistrarEjecucion: ordenTrabajo

ServicioRegistrarEjecucion
→ OrdenTrabajo: admiteRegistroEjecucion()

ServicioRegistrarEjecucion
→ EjecucionOT: crear(datos)

ServicioRegistrarEjecucion
→ RepositorioEjecucion: guardar(ejecucion)

RepositorioEjecucion
→ ServicioRegistrarEjecucion: confirmación

ServicioRegistrarEjecucion
→ AppRegistrarEjecucion: resultado

AppRegistrarEjecucion
→ Operario: mostrarConfirmacion()
```

## 9.5 Alternativo sin conexión

```text
A1. App detecta que no hay conectividad.
A2. Crea una solicitud pendiente de sincronización.
A3. La encola por orden de llegada.
A4. Informa al Operario que quedó pendiente.
A5. Al recuperar conexión, se envía según FIFO.
```

El alternativo mantiene el objetivo `Registrar ejecución`; no lo cambia por `Crear OT`.

---

# 10. Diagrama de estados

Un diagrama de estados muestra una máquina de estados y el flujo de control entre ellos.

## 10.1 Conceptos

```text
Estado
→ condición o situación de un objeto durante su vida.

Evento
→ estímulo que puede activar una transición.

Transición
→ relación que lleva de un estado a otro cuando ocurre un evento y se cumplen condiciones.

Acción
→ computación atómica asociada.

Actividad
→ ejecución en curso dentro de un estado.
```

## 10.2 Ejemplo didáctico de OT

```text
[Inicial]
   ↓ crear
PENDIENTE
   ↓ despachar
DESPACHADA
   ↓ iniciar
EN_EJECUCION
   ↓ finalizar [datos completos]
FINALIZADA
```

Alternativa:

```text
PENDIENTE / DESPACHADA / EN_EJECUCION
   ↓ anular [motivo válido]
ANULADA
```

## 10.3 Consistencia

El material propone comprobar:

- que los métodos que provocan cambios de estado existan en la clase;
- que haya casos de uso que invoquen esos métodos;
- que todos los estados y transiciones relevantes puedan recorrerse.

---

# 11. Subsistemas e interfaces

## Subsistema

Agrupa piezas del diseño para hacerlo manejable.

Ejemplo didáctico:

```text
SubsistemaTrabajoMovil
- AppRegistrarEjecucion
- ServicioRegistrarEjecucion
- ColaSincronizacion

SubsistemaOrdenesTrabajo
- OrdenTrabajo
- RepositorioOrdenTrabajo

SubsistemaPartesDiarios
- EjecucionOT
- RepositorioEjecucion
```

## Interfaz entre subsistemas

Define las operaciones visibles desde afuera.

Ejemplo:

```text
IOrdenTrabajo
+ buscarPorId(idOT)
+ validarEstadoParaEjecucion(idOT)
```

El cliente depende de la interfaz, no del detalle interno del subsistema.

---

# Control de salida — Diseño

Responder sin apuntes:

1. ¿Por qué el modelo de diseño es más físico que el de análisis?
2. Nombrá cinco artefactos del diseño.
3. ¿Qué representa el eje vertical de un diagrama de secuencia?
4. ¿Qué es una línea de vida?
5. ¿Qué diferencia existe entre mensaje de análisis y operación de diseño?
6. ¿Qué es estado, evento y transición?
7. ¿Qué contiene un subsistema?
8. ¿Qué separa una interfaz?

---

# PARTE II — ABSTRACCIÓN Y POLIMORFISMO

# 12. Abstracción

En el alcance del material, la abstracción permite seleccionar las características relevantes de un objeto y suprimir detalles que no son necesarios para el problema actual.

```text
Abstracción
→ qué es esencial y qué servicio se observa.

Encapsulamiento
→ cómo se oculta y protege la implementación.
```

Son complementarios, pero no equivalentes.

Ejemplo:

```text
CanalNotificacion
→ enviar(mensaje)
```

El cliente necesita conocer la operación, no todos los detalles internos de correo o notificación móvil.

---

# 13. Clase abstracta

Según el material:

- se declara con `abstract`;
- no puede instanciarse;
- puede tener atributos, métodos y constructor;
- se utiliza como superclase;
- contiene estructura y comportamiento común;
- al menos un método es abstracto en el alcance presentado;
- una subclase concreta debe implementar todos los métodos abstractos o declararse abstracta.

Ejemplo:

```java
public abstract class CanalNotificacion {
    protected String destinatario;

    public CanalNotificacion(String destinatario) {
        this.destinatario = destinatario;
    }

    public boolean tieneDestinatario() {
        return destinatario != null && !destinatario.isBlank();
    }

    public abstract void enviar(String mensaje);
}
```

No puede escribirse:

```java
new CanalNotificacion("usuario"); // incorrecto
```

---

# 14. Método abstracto

Método sin cuerpo declarado con `abstract` dentro de una clase abstracta.

```java
public abstract void enviar(String mensaje);
```

Una subclase concreta debe proporcionar la implementación:

```java
@Override
public void enviar(String mensaje) {
    // implementación específica
}
```

---

# 15. Interfaz Java

En el alcance del material, una interfaz especifica qué debe hacerse sin definir la implementación concreta.

Características estudiadas:

- se declara con `interface`;
- no se instancia;
- no posee constructor;
- no declara variables de instancia;
- una clase puede implementar varias interfaces;
- se utiliza `implements`;
- los métodos implementados deben ser públicos y conservar la signatura.

Ejemplo:

```java
public interface Auditable {
    void registrarAuditoria(String evento);
}
```

```java
public class EjecucionOT implements Auditable {
    @Override
    public void registrarAuditoria(String evento) {
        System.out.println(evento);
    }
}
```

---

# 16. Clase abstracta vs. interfaz

| Criterio | Clase abstracta | Interfaz |
|---|---|---|
| Propósito | Base común para subclases relacionadas | Contrato de comportamiento |
| Instanciación | No | No |
| Constructor | Sí | No |
| Atributos de instancia | Sí | No, según alcance del material |
| Métodos con implementación | Puede tener | El material enfatiza encabezados/contrato |
| Método abstracto | Sí | Métodos del contrato |
| Relación Java | `extends` | `implements` |
| Cantidad | Una superclase directa | Varias interfaces posibles |
| Uso típico | Compartir estado y comportamiento | Unificar comportamiento entre clases incluso no relacionadas |

Pregunta de decisión:

```text
¿Necesito estado y comportamiento común entre clases relacionadas?
→ clase abstracta.

¿Necesito exigir un contrato común a clases posiblemente diferentes?
→ interfaz.
```

---

# 17. Polimorfismo

El material presenta el polimorfismo como la capacidad de programar de manera general y permitir que distintos objetos respondan de forma diferente al mismo mensaje.

Ejemplo:

```java
CanalNotificacion canal1 = new NotificacionEmail("a@coop.test");
CanalNotificacion canal2 = new NotificacionMovil("usuario-15");

canal1.enviar("OT asignada");
canal2.enviar("OT asignada");
```

Ambas referencias son de tipo `CanalNotificacion`, pero cada objeto ejecuta su propia versión de `enviar`.

## 17.1 Ejemplo con colección

```java
List<CanalNotificacion> canales = List.of(
    new NotificacionEmail("a@coop.test"),
    new NotificacionMovil("usuario-15")
);

for (CanalNotificacion canal : canales) {
    canal.enviar("La OT 1587 fue asignada");
}
```

La llamada es la misma:

```text
enviar(mensaje)
```

La respuesta concreta depende del objeto real.

---

# 18. Errores frecuentes POO

| Error | Corrección |
|---|---|
| Instanciar clase abstracta | Solo instanciar subclases concretas |
| Método abstracto con cuerpo | No posee implementación |
| Subclase concreta no implementa abstractos | Implementar o declarar subclase abstracta |
| Interfaz con constructor | No tiene constructor en el alcance del material |
| Usar `extends` para interfaz implementada | Usar `implements` |
| Método de interfaz implementado como privado | Debe ser público |
| Polimorfismo = solo sobrecarga | Implica mismo contrato/mensaje con respuestas distintas |
| Confundir abstracción con encapsulamiento | Esencial observable vs. ocultación de implementación |

---

# Cierre de mañana — defensa

Responder durante 5 minutos:

> Compare clase abstracta e interfaz. Explique cuándo utilizaría cada una, qué pueden contener según el material, cómo se relacionan con `extends` e `implements`, y cómo permiten polimorfismo. Aplique la respuesta a canales de notificación de Órdenes de Trabajo.

---

# PARTE III — NORMALIZACIÓN

# 19. Propósito

La normalización es una técnica para diseñar la estructura lógica del modelo relacional mediante descomposición de tablas.

Ventajas indicadas por el material:

- evitar anomalías de inserción, modificación y borrado;
- mejorar independencia de datos;
- evitar restricciones artificiales;
- lograr relaciones menos vulnerables a anomalías.

Un modelo que cumple 3FN se considera normalizado dentro del alcance del día.

---

# 20. Dependencia funcional

Expresa que el valor de un atributo o conjunto determina otro.

Notación didáctica:

```text
id_operario → nombre_operario
```

Significa que, para un mismo `id_operario`, corresponde un único `nombre_operario` dentro del modelo.

## Dependencia completa

Un atributo depende de toda una clave compuesta.

```text
(id_ot, id_operario, fecha_asignacion)
→ estado_asignacion
```

## Dependencia parcial

Un atributo depende solamente de una parte de la clave compuesta.

```text
id_ot → descripcion_ot
```

si la PK original es:

```text
(id_ot, id_operario, fecha_asignacion)
```

## Dependencia transitiva

La clave determina un atributo no clave y este determina otro atributo no clave.

```text
id_ot → id_sector
id_sector → nombre_sector
```

Por lo tanto:

```text
id_ot → nombre_sector
```

indirectamente.

---

# 21. Anomalías

## Inserción

No poder registrar un Operario hasta que exista una asignación.

## Modificación

Tener `nombre_sector` repetido en muchas filas y actualizar solo algunas.

## Borrado

Eliminar la última asignación de un Operario y perder también sus datos personales.

La normalización separa hechos diferentes para reducir estas anomalías.

---

# 22. Primera forma normal — 1FN

Una relación está en 1FN cuando sus dominios contienen valores atómicos y no hay grupos repetitivos.

Incorrecto:

```text
telefonos_operario = "2245-111111, 2245-222222"
```

Correcto mediante relación separada:

```text
OPERARIO_TELEFONO
- id_operario FK
- telefono
- PK(id_operario, telefono)
```

La celda contiene un valor atómico.

---

# 23. Segunda forma normal — 2FN

Una relación está en 2FN si:

1. está en 1FN;
2. cada atributo no clave depende de la clave primaria completa.

Se aplica especialmente a claves compuestas.

Relación didáctica inicial:

```text
ASIGNACION_OT_AMPLIADA
PK(id_ot, id_operario, fecha_asignacion)

id_ot
numero_ot
descripcion_ot
id_sector
nombre_sector
id_operario
nombre_operario
especialidad_operario
fecha_asignacion
estado_asignacion
```

Dependencias parciales:

```text
id_ot → numero_ot, descripcion_ot, id_sector, nombre_sector
id_operario → nombre_operario, especialidad_operario
```

Para pasar a 2FN:

```text
ORDEN_TRABAJO(
    id_ot PK,
    numero_ot UNIQUE,
    descripcion_ot,
    id_sector,
    nombre_sector
)

OPERARIO(
    id_operario PK,
    nombre_operario,
    especialidad_operario
)

ASIGNACION_OT(
    id_ot FK,
    id_operario FK,
    fecha_asignacion,
    estado_asignacion,
    PK(id_ot, id_operario, fecha_asignacion)
)
```

Ahora los atributos de OT dependen de `id_ot`; los del Operario, de `id_operario`; y el estado de asignación, de toda la clave de la asignación.

---

# 24. Tercera forma normal — 3FN

Una relación está en 3FN si:

1. está en 2FN;
2. ningún atributo no clave depende transitivamente de la clave primaria.

En `ORDEN_TRABAJO` todavía tenemos:

```text
id_ot → id_sector
id_sector → nombre_sector
```

`nombre_sector` depende transitivamente de `id_ot`.

Para pasar a 3FN:

```text
SECTOR(
    id_sector PK,
    nombre_sector UNIQUE
)

ORDEN_TRABAJO(
    id_ot PK,
    numero_ot UNIQUE,
    descripcion_ot,
    id_sector FK → SECTOR.id_sector
)
```

Modelo final:

```text
SECTOR
ORDEN_TRABAJO
OPERARIO
OPERARIO_TELEFONO
ASIGNACION_OT
```

---

# 25. PK artificial y normalización

Agregar:

```text
id_asignacion PK
```

puede ser una decisión válida de identificación, pero no elimina automáticamente dependencias parciales o transitivas del resto de los atributos.

La pregunta central sigue siendo:

```text
¿De qué atributo o conjunto depende cada dato?
```

No:

```text
¿La tabla tiene un ID autoincremental?
```

---

# 26. Procedimiento de normalización

1. Identificar el hecho que representa la tabla.
2. Identificar clave candidata/primaria.
3. Escribir dependencias funcionales.
4. Comprobar valores atómicos y grupos repetitivos.
5. Llevar a 1FN.
6. Buscar dependencias parciales de claves compuestas.
7. Llevar a 2FN.
8. Buscar dependencias transitivas entre atributos no clave.
9. Llevar a 3FN.
10. Marcar PK, FK y `UNIQUE`.
11. Comprobar que los hechos puedan reconstruirse mediante relaciones.
12. Revisar anomalías restantes.

---

# 27. Errores frecuentes de normalización

| Error | Corrección |
|---|---|
| 1FN = tener PK | Exige atomicidad y ausencia de grupos repetitivos |
| 2FN se aplica solo a cualquier PK simple | Con PK simple, una relación en 1FN ya cumple 2FN según el material |
| Dependencia parcial = dato opcional | Es dependencia de una parte de clave compuesta |
| 3FN = eliminar todas las FK | Las FK son necesarias; se eliminan dependencias transitivas |
| Crear muchas tablas sin justificar | Cada descomposición responde a dependencias/anomalías |
| ID artificial normaliza todo | No corrige dependencias por sí solo |
| Repetir nombre de Sector en OT | Separar `SECTOR` y referenciar con FK |

---

# 28. Caso integrador

Necesidad:

> Un Operario registra la ejecución de una OT. El sistema debe notificar por distintos canales y conservar asignaciones históricas sin redundancia.

Cadena:

```text
Caso de uso
→ Registrar ejecución de OT

Diseño
→ secuencia y subsistemas/interfaces

POO
→ CanalNotificacion abstracto + implementaciones polimórficas

Datos
→ OT, Sector, Operario, Asignación y teléfonos normalizados
```

La solución debe declarar supuestos de tecnología, no presentarlos como universales.

---

# 29. Evaluación

Resolver:

`EVALUACIONES/2026-08-14_EVALUACION-DIA-09.md`

Condiciones:

- sin apuntes;
- 50 minutos escritos;
- cálculos y dependencias visibles;
- código estructuralmente correcto;
- no sustituir respuestas originales después de entregar;
- defensa de 8–10 minutos.

---

# 30. Criterio de aprobación

## Escrito

- equivalente a 7/10 o más;
- ningún bloque central omitido;
- análisis/diseño diferenciados;
- secuencia con orden temporal;
- clase abstracta/interfaz diferenciadas;
- polimorfismo aplicado;
- 1FN/2FN/3FN justificadas;
- dependencias parciales/transitivas identificadas.

## Oral

- equivalente a 7/10 o más;
- conecta diseño, código y datos;
- declara supuestos;
- corrige al menos un error de la recuperación inicial.

---

# 31. Fuentes de la jornada

- `02-PLAN-MAESTRO-HASTA-03-09.md`.
- `Analisis_y_Diseno_de_Software.md`.
- `INF382_Programacion_Orientada_a_Objetos.md`.
- `INF387_Base_de_Datos_I_RESUMEN.md`.
- estado, matriz, resultados, errores y tarjetas acumulados hasta el Día 8.

No se incorporan fuentes externas como sustitución de los materiales universitarios.

---

# 32. Comando de inicio

> **Iniciar EFIP — 2026-08-14 — Día 9**
