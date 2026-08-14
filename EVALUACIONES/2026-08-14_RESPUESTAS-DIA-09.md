# Respuestas y ejercicios de avance — Día 9
## Diseño + Abstracción/Polimorfismo + Normalización

**Fecha:** 14/08/2026  
**Modalidad:** sin apuntes, corrección guiada durante la jornada  
**Estado:** **PROGRESO PARCIAL — jornada pausada por cansancio**  
**Evaluación oficial:** pendiente  
**Defensa oral:** pendiente  
**Nota:** no asignada

> Este archivo conserva las respuestas reales del estudiante y registra las correcciones por separado. No representa una evaluación final ni un cierre académico.

---

# 1. Recuperación inicial del Día 8

## 1.1 Simbología DER

Respuesta:

```text
Rectángulo doble → Entidad débil
Línea doble      → Participación total
```

**Resultado:** correcto. `E-038` fue respondido correctamente en esta recuperación, pero deberá comprobarse nuevamente antes del cierre definitivo.

---

## 1.2 Alternativo por falta de conexión

Respuesta del estudiante:

```text
- El sistema detecta estar sin conexión y le avisa al usuario.
- El usuario solicita Registrar ejecución de OT.
- El sistema captura los datos y los coloca en una cola.
- Cuando la conexión vuelve, el sistema despacha las OT para ser procesadas en orden de llegada.
```

Ajustes registrados:

```text
- El flujo debe comenzar con la solicitud del Operario.
- Lo que queda pendiente es la solicitud de registro de ejecución, no la OT completa.
- Debe informarse el estado PENDIENTE DE ENVÍO.
- Al volver la conexión, se envían las solicitudes pendientes en orden FIFO.
```

Versión corregida:

```text
A1. El Operario solicita registrar la ejecución de la OT.
A2. La aplicación detecta que no hay conexión.
A3. La aplicación captura los datos disponibles.
A4. El sistema conserva la solicitud como PENDIENTE DE ENVÍO.
A5. La aplicación informa la situación al Operario.
A6. Al recuperarse la conexión, el sistema envía las solicitudes pendientes en orden FIFO.
```

---

## 1.3 TDA Cola: contrato e implementación

Respuesta:

```text
Permanece:
- la interfaz del TDA;
- la política FIFO;
- encolar, desencolar, cabecera, esVacia y longitud.

Cambia:
- la implementación interna;
- índices/vector o nodos/referencias.
```

**Resultado:** correcto. La diferencia contrato/implementación fue recuperada.

---

## 1.4 Pila, Cola y trazabilidad

Respuesta:

```text
Pila = LIFO, último en entrar y primero en salir.
Cola = FIFO, primero en entrar y primero en salir.
Trazabilidad = debe representar orden, fecha, hora, prioridad y estado.
```

Ajuste:

```text
Trazabilidad
→ capacidad de reconstruir qué ocurrió, quién actuó, cuándo, desde qué estado, hacia cuál y con qué resultado.

FIFO
→ preserva el orden de procesamiento.

FIFO no garantiza por sí sola trazabilidad.
```

---

## 1.5 Probabilidad e información

Respuesta:

```text
P ↑ → incertidumbre baja → información baja
P ↓ → incertidumbre alta → información alta
I(E) = log2(1*(P(E)))
Unidad = bits
```

Corrección:

```text
I(E) = log₂(1 / P(E))
```

La relación cualitativa fue correcta; la fórmula volvió a escribirse incorrectamente.

---

## 1.6 Unidades de información

Respuesta:

```text
bits = cantidad de información
bits/símbolo = cantidad media de información por símbolo
bits/segundo = tasa de información por tiempo
```

**Resultado:** correcto en el alcance trabajado.

---

## 1.7 Señales y fórmulas

Respuesta:

```text
A = Amplitud
T = tiempo de un ciclo en segundos
f = cantidad de ciclos por segundo
f = 1/T
T = 1/f
fs mínima = 2 * fmax
```

Cálculos:

```text
T = 0,004 s
f = 250

fmax = 7 kHz
fs mínima = 14 k muestras/s
```

Ajuste:

```text
f = 250 Hz
```

Las fórmulas fueron recuperadas; faltó automatizar la unidad del primer resultado.

---

## 1.8 Transmisión analógica y política de envío

Respuesta:

```text
- Una señal analógica sí puede transmitirse como analógica.
- I(E) no decide automáticamente qué debe enviarse.
- Los procesos y reglas del negocio definen qué datos son necesarios.
- Si el protocolo no está determinado, debe declararse un supuesto.
```

Ajuste:

```text
No se declara “un supuesto para ambas”.
Se elige una alternativa y se justifica:
- síncrona si se agrupan datos en bloques;
- asíncrona si se envían unidades individuales delimitadas.
```

---

## 1.9 Generalización UML

Respuesta:

```text
NotificacionEmail --|> CanalNotificacion
Hijo: NotificacionEmail
Padre: CanalNotificacion
Dirección: hacia el padre
Punta: flecha hueca
```

Ajuste terminológico:

```text
Línea continua con triángulo vacío apuntando al padre.
```

La dirección fue correcta; la simbología aún requiere precisión verbal.

---

## 1.10 Instancia

Respuesta:

```text
Es un dato concreto.
Entidad: ORDEN_TRABAJO
Instancia: 123, trabajo de poda.
```

Versión académica:

```text
Instancia = ocurrencia concreta de una entidad.
```

**Resultado:** recuperado en el alcance conceptual.

---

## 1.11 Entidad asociativa y entidad débil

Respuesta:

```text
Entidad asociativa = representa N:M.
Entidad débil = su identificación o existencia depende de otra entidad.
```

Justificación entregada:

```text
Una tabla con dos FK no es automáticamente débil porque puede tener identificador propio y valor de negocio.
```

Ajuste:

```text
Tener un ID propio no elimina automáticamente la dependencia de existencia.
Para decidir si es débil hay que analizar identificación y existencia conceptual.
Las FK, por sí solas, solo expresan referencias.
```

---

## 1.12 `toString()`

Respuesta:

```text
Clase: Objetc
Devuelve: un textual
Se sobrescribe: para cambiar el comportamiento textual
```

Código entregado:

```java
@Override
public String toString() {
    return "Id - descripcion - Estado";
}
```

Corrección:

```text
Clase: Object
Devuelve: representación textual del objeto.
El código debe usar los valores de los atributos, no un literal fijo.
```

Ejemplo corregido:

```java
@Override
public String toString() {
    return id + " - " + descripcion + " - " + estado;
}
```

---

# 2. Modelo de diseño

## 2.1 Análisis, diseño e implementación

Respuesta:

```text
Modelo de análisis:
Objetos, responsabilidades y colaboración. Refina los requerimientos para comprender el sistema de manera conceptual, abstrayéndose de la implementación real.

Modelo de diseño:
Clases, subsistemas, interfaces y secuencias. Refina el análisis e incorpora RNF y restricciones reales.

Implementación:
Código, base de datos y construcción de la aplicación.
```

Ajuste:

```text
La implementación materializa principalmente las decisiones del modelo de diseño, que a su vez refina el análisis.
```

**Resultado del control:** 9,5/10 orientativo, no evaluativo.

---

## 2.2 Signaturas, parámetros y visibilidad

Respuesta:

> El modelo de diseño toma en cuenta RNF y restricciones del mundo real y funciona como plano para construir el sistema; el análisis se concentra en comprender los requisitos y responsabilidades conceptuales.

**Resultado:** correcto.

---

## 2.3 Elementos propios del diseño

Clasificación:

```text
EjecucionService
OrdenTrabajoRepository
EjecucionRepository
ColaSincronizacion
```

Respuesta:

> Son elementos propios del diseño porque representan estructuras y decisiones de implementación más concretas.

**Resultado:** correcto.

---

## 2.4 Diagrama de secuencia

Respuesta:

```text
Diagrama de secuencia = objetos, comportamientos y responsabilidades en el tiempo.
Participante = actores, subsistemas o entidades.
Línea de vida = donde transcurren los comportamientos.
Mensaje = solicitudes entre participantes.
Foco de control = trabajo activo.
```

Ajustes:

```text
Línea de vida
→ existencia del participante durante la interacción; el tiempo avanza de arriba hacia abajo.

Foco de control
→ intervalo durante el cual un participante ejecuta una operación.
```

---

## 2.5 Orden temporal

Respuesta:

```text
1. Operario carga los datos.
2. AppEjecucion envía registrar al servicio.
3. EjecucionService consulta la OT.
4. EjecucionService verifica si admite ejecución.
5. EjecucionRepository guarda EjecucionOT.
6. AppEjecucion muestra la confirmación.
```

**Resultado:** correcto. Se observó que una secuencia completa podría incluir devoluciones intermedias.

---

## 2.6 Alternativo de diseño sin conexión

Respuesta:

```text
1. El sistema detecta falta de conexión.
2. AppEjecucion guarda los datos en ColaSincronizacion.
3. El sistema avisa al usuario.
4. El sistema detecta conexión.
5. Inicia la sincronización FIFO.
```

Ajuste:

```text
Debe hacerse explícito Sincronizador:
- consulta la cola;
- desencola la primera solicitud;
- envía;
- registra resultado;
- continúa con la siguiente.
```

---

## 2.7 Cola como decisión de diseño

Respuesta:

> FIFO se detecta en el análisis como una necesidad, pero `ColaSincronizacion` es una implementación que se decide considerando lenguaje y restricciones.

**Resultado:** correcto.

---

# 3. Abstracción y Polimorfismo

## 3.1 Conceptos

Respuesta:

```text
Abstracción = representa una característica esencial y omite detalles de implementación.
Encapsulamiento = protege estados internos y controla cómo se accede.
```

**Resultado:** correcto.

---

## 3.2 Clase abstracta y constructor

Respuesta:

> No puede instanciarse porque representa características necesarias pero no aporta una implementación completa; algunos métodos deben sobrescribirse.

Ajuste:

```text
Puede tener constructor porque debe inicializar la parte común de las subclases concretas.
```

---

## 3.3 Métodos abstractos y concretos

Clasificación:

```text
enviar()  → método abstracto; debe implementarse en una subclase concreta.
getTipo() → método concreto; ya tiene implementación y no es obligatorio sobrescribirlo.
```

**Resultado:** correcto.

---

## 3.4 Clase abstracta frente a interfaz

Respuesta resumida:

```text
Clase abstracta:
- se hereda con extends;
- puede tener estado;
- puede tener constructor;
- puede tener métodos implementados y abstractos.

Interfaz:
- se implementa con implements;
- representa un contrato;
- no tiene constructor.
```

Ajuste:

```text
No todos los métodos heredados deben implementarse: solo los abstractos pendientes.
```

---

## 3.5 `extends` e `implements`

Respuesta:

> `NotificacionEmail` hereda y especializa `CanalNotificacion`, y cumple el contrato `Auditable`.

**Resultado:** correcto.

---

## 3.6 Polimorfismo

Respuesta:

> Una referencia `CanalNotificacion` puede representar objetos `NotificacionEmail` y `NotificacionMovil`; la misma llamada `enviar()` ejecuta el comportamiento sobrescrito del objeto concreto.

**Resultado:** correcto.

---

## 3.7 Código Java entregado

```java
public interface Auditable {
    void registrarAuditoria(String evento);
}

abstract class CanalNotificacion {
    private String destinatario;

    protected CanalNotificacion(String destinatario){
        this.destinatario = destinatario;
    }

    public String getDestinatario(){
        return this.destinatario;
    }

    public void validarDestinatario(){
        if (this.destinatario == "") {
            System.out.println("Destinatario es requerido");
        }
    }

    abstract public void enviar(String mensaje);
}

public class NotificacionEmail
        extends CanalNotificacion
        implements Auditable {

    public NotificacionEmail(String destinatario){
        super(destinatario);
    }

    public void enviar(String mensaje){
        super.validarDestinatario();
        System.err.println(
            "Enviado por mail a: " + super.getDestinatario()
            + " Mensaje:" + mensaje
        );
    }

    public void registrarAuditoria(String evento){
        System.out.println(evento);
    }
}

public class NotificacionMovil
        extends CanalNotificacion
        implements Auditable {

    public NotificacionMovil(String detinatario){
        super(detinatario);
    }

    public void enviar(String mensaje){
        super.validarDestinatario();
        System.err.println(
            "Enviado al movil: " + super.getDestinatario()
            + " Mensaje:" + mensaje
        );
    }

    public void registrarAuditoria(String evento){
        System.out.println(evento);
    }
}
```

Correcciones registradas:

1. `String` no debe compararse con `==`; usar `isBlank()`, `isEmpty()` o `equals()` según corresponda.
2. La validación actual informa el error pero no detiene el envío.
3. Falta `toString()`.
4. Faltan anotaciones `@Override`.
5. `super` no es necesario para llamar métodos heredados no sobrescritos.
6. Varias clases públicas requieren archivos separados.
7. Falta una prueba polimórfica con `List<CanalNotificacion>`.

**Resultado orientativo del ejercicio:** 8,7/10. No es nota oficial del Día 9.

---

# 4. Normalización

## 4.1 Objetivo y anomalías

Respuesta:

> La normalización descompone relaciones para separar responsabilidades, evitar redundancias e inconsistencias y reducir anomalías de inserción, modificación y borrado.

Clasificación correcta:

```text
Cambiar “Redes” en muchas filas → anomalía de modificación.
No poder registrar un Operario sin asignación → anomalía de inserción.
Perder datos al borrar la última asignación → anomalía de borrado.
```

---

## 4.2 Primera Forma Normal

Respuesta:

```text
telefonos_operario viola 1FN porque contiene varios valores y no es atómico.
```

Transformación:

```text
OPERARIO_TELEFONO
- id_operario FK
- telefono
- PK(id_operario, telefono)
```

**Resultado:** correcto.

---

## 4.3 Segunda Forma Normal — primer intento

Clave didáctica:

```text
PK(id_ot, id_operario, fecha_asignacion)
```

Respuestas iniciales incorrectas:

```text
Atributos que dependen de id_ot → id_operario
Atributos que dependen de id_operario → fecha_asignacion
```

Corrección:

```text
id_ot
→ numero_ot, descripcion_ot, id_sector, nombre_sector

id_operario
→ nombre_operario, especialidad_operario

(id_ot, id_operario, fecha_asignacion)
→ estado_asignacion
```

Regla:

```text
2FN
→ estar en 1FN
→ cada atributo no clave debe depender de toda la PK compuesta.
```

---

## 4.4 Recuperación inmediata de 2FN

Respuesta corregida:

```text
id_ot
→ numero_ot, descripcion_ot, id_sector, nombre_sector

id_operario
→ nombre_operario, especialidad_operario

telefonos_operario
→ ya fue separado en 1FN
```

Punto todavía incompleto en esa respuesta:

```text
(id_ot, id_operario, fecha_asignacion)
→ estado_asignacion
```

Después de la corrección, el estudiante justificó que `numero_ot` debe quedar en `ORDEN_TRABAJO` y que `estado_asignacion` pertenece a la asignación concreta.

---

## 4.5 Tercera Forma Normal

Respuesta:

```text
id_ot → id_sector
id_sector → nombre_sector
```

Clasificación:

```text
Dependencia transitiva.
```

Transformación:

```text
SECTOR
- id_sector PK
- nombre_sector UNIQUE

ORDEN_TRABAJO
- id_ot PK
- numero_ot UNIQUE
- descripcion_ot
- id_sector FK
```

**Resultado:** correcto.

---

## 4.6 Modelo final propuesto

```text
SECTOR
- id_sector PK
- nombre_sector UNIQUE

ORDEN_TRABAJO
- id_ot PK
- numero_ot UNIQUE
- descripcion_ot
- id_sector FK → SECTOR.id_sector

OPERARIO
- id_operario PK
- nombre_operario
- especialidad_operario

OPERARIO_TELEFONO
- id_operario FK → OPERARIO.id_operario
- telefono
- PK(id_operario, telefono)

ASIGNACION_OT
- id_ot FK → ORDEN_TRABAJO.id_ot
- id_operario FK → OPERARIO.id_operario
- fecha_asignacion
- estado_asignacion
- PK(id_ot, id_operario, fecha_asignacion)
```

**Resultado del segundo control:** 9,1/10 orientativo, no evaluativo.

---

## 4.7 ID artificial

Respuesta inicial:

> Agregar `id_asignacion` no normaliza automáticamente mientras la entidad dependa de otras entidades; sería una PK artificial.

Corrección:

```text
La razón principal no es la dependencia de existencia.
La normalización analiza dependencias funcionales y redundancias.
Agregar una PK artificial no elimina:
- id_ot → datos de OT;
- id_operario → datos de Operario;
- id_ot → id_sector → nombre_sector.
```

Regla:

```text
Agregar una PK artificial ≠ normalizar automáticamente.
```

---

# 5. Estado de la jornada

## Completado

- recuperación inicial;
- modelo de análisis vs. diseño vs. implementación;
- elementos del diseño;
- secuencia normal;
- alternativo sin conexión en nivel parcial;
- abstracción y encapsulamiento;
- clase y método abstractos;
- interfaz, `extends` e `implements`;
- polimorfismo;
- ejercicio Java parcial;
- anomalías;
- 1FN;
- 2FN con recuperación;
- 3FN;
- esquema relacional final.

## Pendiente

- caso integrador Diseño + Polimorfismo + Normalización;
- diagrama de estados como ejercicio del estudiante;
- evaluación escrita oficial;
- defensa oral oficial;
- corrección final;
- cierre académico y actualización canónica.

---

# 6. Decisión

```text
Día 9: EN PAUSA
Evaluación: pendiente
Defensa: pendiente
Nota: no asignada
Cierre académico: pendiente
```

Continuación prevista:

```text
Domingo 16/08/2026
Comando: Recuperar EFIP — 2026-08-16 — completar Día 9
```
