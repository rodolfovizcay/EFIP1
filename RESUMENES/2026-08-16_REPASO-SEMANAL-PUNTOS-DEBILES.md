# Repaso semanal — Puntos débiles explicados con ejemplos
## Semana intensiva 1 y cierre del Día 9

**Fecha:** 16/08/2026  
**Objetivo:** estudiar únicamente las debilidades que todavía aparecen bajo presión  
**Base:** evaluaciones de los Días 5 a 9, recuperaciones y Caso integrador 1

---

# 1. Cómo usar este documento

No conviene releerlo de principio a fin de manera pasiva.

Usar este ciclo:

```text
1. Leer el título del punto débil.
2. Intentar explicarlo sin mirar.
3. Resolver el ejemplo.
4. Comparar con la corrección.
5. Repetir solamente si hubo error.
```

Escala sugerida:

```text
0 = no recordado
1 = recordado con error
2 = correcto con ayuda
3 = correcto y explicable oralmente
```

Prioridad:

```text
Alta
→ Java completo
→ asociativa vs. débil
→ PK/FK/UNIQUE
→ subsistema vs. entidad

Media
→ estados UML
→ secuencia sin conexión
→ supuestos de transmisión

Pendiente del programa
→ relaciones UML
→ DCL/TCL
→ algoritmos de ordenación
```

---

# 2. Java completo: el concepto está, la implementación todavía falla

## 2.1 Problema observado

Se comprende:

```text
clase abstracta
interfaz
extends
implements
sobrescritura
polimorfismo
```

Pero en el código reaparecen errores de estructura:

- validación después de asignar;
- llamada inválida a `super`;
- `toString()` omitido;
- `@Override` omitido;
- comparación o validación de `String` incompleta;
- varias clases `public` en un único archivo;
- falta de prueba polimórfica completa.

---

## 2.2 Regla: validar antes de construir el estado

### Incorrecto

```java
protected CanalNotificacion(String destinatario) {
    this.destinatario = destinatario;
    validarDestinatario();
}
```

Problema:

```text
primero se crea un estado potencialmente inválido
+
la validación puede no detener correctamente
```

### Correcto

```java
protected CanalNotificacion(String destinatario) {
    if (destinatario == null || destinatario.isBlank()) {
        throw new IllegalArgumentException(
            "El destinatario es obligatorio"
        );
    }

    this.destinatario = destinatario;
}
```

Regla oral:

> El constructor debe impedir que nazca un objeto inválido.

---

## 2.3 Regla: `super` no significa “usar un método heredado” siempre

### Error observado

```java
super.validarDestinatario();
```

El método `validarDestinatario()` está declarado en la propia clase `CanalNotificacion`. Desde su constructor no existe una implementación superior de ese método en `Object`.

### Uso correcto de `super`

```java
class NotificacionEmail extends CanalNotificacion {

    NotificacionEmail(String destinatario) {
        super(destinatario);
    }
}
```

`super(...)` llama al constructor de la superclase.

También puede utilizarse cuando una subclase sobrescribe un método y desea ejecutar expresamente la versión del padre:

```java
@Override
public String toString() {
    return super.toString() + " - EMAIL";
}
```

Regla oral:

```text
this
→ objeto actual

super
→ parte heredada de la superclase
```

---

## 2.4 `String`: referencia frente a contenido

### Incorrecto

```java
if (destinatario == "") {
}
```

`==` compara referencias.

### Correcto para validar vacío o espacios

```java
if (destinatario == null || destinatario.isBlank()) {
}
```

### Correcto para comparar un valor específico

```java
if ("EMAIL".equals(tipo)) {
}
```

Comparación:

```text
isEmpty()
→ longitud igual a cero

isBlank()
→ vacío o solo espacios

equals()
→ mismo contenido textual
```

Pregunta de control:

> ¿Por qué se evalúa `destinatario == null` antes de `destinatario.isBlank()`?

Respuesta:

> Porque si es `null`, llamar a un método produciría `NullPointerException`; `||` corta la evaluación cuando la primera condición es verdadera.

---

## 2.5 `toString()` debe mostrar valores reales

### Incorrecto

```java
@Override
public String toString() {
    return "id - descripcion - estado";
}
```

Devuelve siempre el mismo literal.

### Correcto

```java
@Override
public String toString() {
    return id + " - " + descripcion + " - " + estado;
}
```

Ejemplo de salida:

```text
1587 - Reparar red - DESPACHADA
```

Versión estructurada:

```java
@Override
public String toString() {
    return "OrdenTrabajo{" +
           "id=" + id +
           ", descripcion='" + descripcion + '\'' +
           ", estado='" + estado + '\'' +
           '}';
}
```

Regla oral:

> `toString()` se hereda de `Object` y devuelve una representación textual del objeto usando valores reales.

---

## 2.6 `@Override` como verificación del compilador

Debe utilizarse en:

```java
@Override
public void enviar(String mensaje) {
}
```

Y también al implementar una interfaz:

```java
@Override
public void registrarAuditoria(String evento) {
}
```

Beneficio:

> El compilador verifica que la signatura corresponde realmente a un método heredado o contratado.

---

## 2.7 Ejemplo Java completo para repetir

```java
import java.util.List;

interface Auditable {
    void registrarAuditoria(String evento);
}

abstract class CanalNotificacion {

    private final String destinatario;

    protected CanalNotificacion(String destinatario) {
        if (destinatario == null || destinatario.isBlank()) {
            throw new IllegalArgumentException(
                "El destinatario es obligatorio"
            );
        }
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public abstract void enviar(String mensaje);

    @Override
    public String toString() {
        return getClass().getSimpleName()
            + "{destinatario='" + destinatario + "'}";
    }
}

final class NotificacionEmail
        extends CanalNotificacion
        implements Auditable {

    NotificacionEmail(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(
            "EMAIL a " + getDestinatario() + ": " + mensaje
        );
    }

    @Override
    public void registrarAuditoria(String evento) {
        System.out.println("AUDITORÍA EMAIL: " + evento);
    }
}

final class NotificacionMovil
        extends CanalNotificacion
        implements Auditable {

    NotificacionMovil(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(
            "PUSH a " + getDestinatario() + ": " + mensaje
        );
    }

    @Override
    public void registrarAuditoria(String evento) {
        System.out.println("AUDITORÍA PUSH: " + evento);
    }
}

public class DemoNotificaciones {

    public static void main(String[] args) {
        List<CanalNotificacion> canales = List.of(
            new NotificacionEmail("admin@coop.com"),
            new NotificacionMovil("dispositivo-20")
        );

        for (CanalNotificacion canal : canales) {
            canal.enviar("OT registrada");
            System.out.println(canal);
        }
    }
}
```

Qué demostrar oralmente:

```text
Tipo de referencia:
CanalNotificacion

Objetos concretos:
NotificacionEmail y NotificacionMovil

Misma llamada:
enviar(...)

Resultado:
cada objeto ejecuta su método sobrescrito
```

---

# 3. Clase abstracta frente a interfaz

## 3.1 Debilidad observada

La diferencia se comprende, pero a veces se define por la palabra reservada:

```text
“es abstracta porque dice abstract”
“es interfaz porque dice interface”
```

Eso describe sintaxis, no la decisión de diseño.

---

## 3.2 Regla conceptual

### Clase abstracta

Se usa cuando varias clases pertenecen a una familia y necesitan compartir:

- estado;
- constructor;
- comportamiento concreto;
- operaciones abstractas.

Ejemplo:

```text
CanalNotificacion
├── NotificacionEmail
└── NotificacionMovil
```

Ambas:

```text
son un CanalNotificacion
```

### Interfaz

Se usa para definir una capacidad o contrato que pueden cumplir clases de familias diferentes.

Ejemplo:

```text
Auditable
```

Pueden implementarla:

```text
NotificacionEmail
NotificacionMovil
SolicitudPendiente
OrdenTrabajo
```

sin necesidad de que todas hereden de la misma clase.

---

## 3.3 Comparación de examen

| Criterio | Clase abstracta | Interfaz |
|---|---|---|
| Relación | `extends` | `implements` |
| Estado de instancia | puede tener | no se usa para compartir estado de instancia |
| Constructor | puede tener | no tiene constructor de instancia |
| Métodos concretos | puede tener | contrato; el alcance moderno de Java puede incluir métodos especiales, pero aquí se estudia como contrato |
| Métodos abstractos | puede tener | declara operaciones del contrato |
| Uso principal | familia de clases | capacidad transversal |

Respuesta corta:

> `CanalNotificacion` es abstracta porque comparte destinatario, constructor y comportamiento entre una familia de canales. `Auditable` es interfaz porque expresa una capacidad que pueden cumplir clases de jerarquías distintas.

---

# 4. Polimorfismo: no confundirlo con sobrescritura

## 4.1 Sobrescritura

Cada subclase define su versión:

```java
@Override
public void enviar(String mensaje) {
    // comportamiento Email
}
```

```java
@Override
public void enviar(String mensaje) {
    // comportamiento Push
}
```

## 4.2 Polimorfismo

Los objetos se usan mediante un tipo común:

```java
CanalNotificacion canal =
    new NotificacionEmail("admin@coop.com");
```

La llamada:

```java
canal.enviar("OT registrada");
```

ejecuta el método del objeto real.

Fórmula:

```text
sobrescritura
→ aporta implementaciones diferentes

polimorfismo
→ permite invocarlas mediante la misma referencia común
```

---

# 5. Modelo de análisis, diseño e implementación

## 5.1 Debilidad observada

En la evaluación, el análisis se redujo a:

> “qué necesidades cubrir”.

Eso corresponde más a requisitos.

---

## 5.2 Cadena correcta

```text
Requisitos
→ servicios y restricciones que necesita el sistema

Casos de uso
→ objetivos que los actores realizan para obtener valor

Modelo de análisis
→ objetos conceptuales, responsabilidades y colaboraciones

Modelo de diseño
→ clases, operaciones, servicios, repositorios,
  interfaces, subsistemas y decisiones tecnológicas

Implementación
→ código, BD, configuración y componentes ejecutables
```

Ejemplo:

```text
Requisito:
conservar ejecuciones sin conexión y enviarlas en orden.

Análisis:
SolicitudPendiente representa la información pendiente.
ControlRegistrarEjecucion coordina el caso.

Diseño:
ColaSincronizacion y Sincronizador implementan FIFO.

Implementación:
Java + almacenamiento local + API + PostgreSQL.
```

Regla:

> La necesidad exige FIFO, pero no obliga a una clase llamada `ColaSincronizacion`; esa es una decisión de diseño.

---

# 6. Subsistema frente a entidad

## 6.1 Error observado

Se propuso:

```text
EjecucionOT como subsistema
```

Pero `EjecucionOT` representa un concepto del dominio, por lo que es una entidad o clase de dominio.

## 6.2 Ejemplos

### Entidad

```text
OrdenTrabajo
EjecucionOT
Operario
SolicitudPendiente
```

Representan información y comportamiento del dominio.

### Subsistema

```text
Subsistema Ejecuciones
Subsistema Sincronización
Subsistema Notificaciones
Subsistema Persistencia
```

Agrupan múltiples elementos y ofrecen servicios más amplios.

### Interfaz proporcionada

```text
IRegistroEjecucion

+ registrarEjecucion(datos)
+ consultarResultado(id)
```

Regla oral:

> Una entidad representa una cosa del dominio; un subsistema organiza varias clases y responsabilidades de diseño.

---

# 7. Diagrama de estados completo

## 7.1 Elementos

```text
Estado
→ situación estable del objeto

Evento
→ hecho que puede provocar un cambio

Transición
→ paso de un estado a otro

Condición/guarda
→ expresión que debe cumplirse

Acción
→ operación ejecutada durante la transición
```

## 7.2 Ejemplo de OrdenTrabajo

```text
[PENDIENTE]
   ── despachar ──>
[DESPACHADA]
   ── iniciar ──>
[EN_EJECUCION]
   ── finalizar [datos completos] ──>
[FINALIZADA]
```

Anulación:

```text
[PENDIENTE]
   ── anular [anulación permitida] ──>
[ANULADA]

[DESPACHADA]
   ── anular [anulación permitida] ──>
[ANULADA]
```

Restricción:

```text
FINALIZADA ──X──> PENDIENTE
```

Regla de negocio:

> Una OT finalizada no puede volver a pendiente.

Pregunta de control:

> ¿`DESPACHADA` es un evento o un estado?

Respuesta:

> Estado. `despachar` es el evento que produce la transición.

---

# 8. Secuencia sin conexión: orden que no debe fallar

## 8.1 Flujo correcto

```text
1. Operario solicita registrar ejecución.
2. App detecta falta de conexión.
3. Se crea SolicitudPendiente en PENDIENTE_ENVIO.
4. Se encola al final.
5. App informa al Operario.
6. Vuelve la conexión.
7. Sincronizador consulta cabecera().
8. Envía la solicitud sin eliminarla.
9. Servidor valida y procesa.
10. Servidor confirma.
11. Se registra trazabilidad.
12. Recién entonces se desencola.
```

## 8.2 Por qué `cabecera()` antes de `desencolar()`

```text
cabecera()
→ consulta sin eliminar

desencolar()
→ elimina
```

Si se elimina antes de enviar y la red falla:

```text
la solicitud puede perderse
```

Fórmula para memorizar:

```text
cabecera
→ enviar
→ confirmar
→ trazar
→ desencolar
```

---

# 9. FIFO frente a trazabilidad

## FIFO

```text
Primera solicitud en entrar
→ primera solicitud en procesarse
```

## Trazabilidad

Permite reconstruir:

```text
qué ocurrió
quién actuó
cuándo
estado anterior
estado nuevo
intento
resultado
motivo
```

Una Cola no almacena automáticamente toda esa historia.

Ejemplo mínimo de `SolicitudPendiente`:

```text
id_solicitud
fecha_creacion
estado
cantidad_intentos
fecha_ultimo_intento
ultimo_resultado
usuario
```

Respuesta corta:

> FIFO garantiza orden; la trazabilidad requiere registros históricos.

---

# 10. Entidad asociativa frente a entidad débil

## 10.1 Entidad asociativa

`ASIGNACION_OT` existe para representar:

```text
ORDEN_TRABAJO N:M OPERARIO
```

Conserva datos de esa relación:

```text
fecha_asignacion
estado_asignacion
```

Su función conceptual es materializar o representar la asociación N:M.

## 10.2 Entidad débil

Una entidad es débil cuando depende de otra para:

```text
identificarse
u
existir conceptualmente
```

## 10.3 Lo que no alcanza para decidir

No alcanza observar:

```text
tiene dos FK
```

Tampoco alcanza observar:

```text
tiene id artificial
```

Ni:

```text
tiene atributos propios
```

Hay que analizar identificación y existencia en el dominio.

### Respuesta correcta para el caso

> `ASIGNACION_OT` es asociativa porque representa la relación N:M entre OT y Operario y conserva atributos propios. Que su PK esté formada por FK no permite afirmar automáticamente que sea una entidad débil.

---

# 11. PK, FK y UNIQUE: modelo final sin omisiones

## 11.1 Modelo esperado

```text
SECTOR
- id_sector PK
- nombre_sector UNIQUE
```

```text
ORDEN_TRABAJO
- id_ot PK
- numero_ot UNIQUE
- descripcion_ot
- id_sector FK → SECTOR.id_sector
```

```text
OPERARIO
- id_operario PK
- nombre_operario
- especialidad_operario
```

```text
OPERARIO_TELEFONO
- id_operario FK → OPERARIO.id_operario
- telefono
- PK(id_operario, telefono)
```

```text
ASIGNACION_OT
- id_ot FK → ORDEN_TRABAJO.id_ot
- id_operario FK → OPERARIO.id_operario
- fecha_asignacion
- estado_asignacion
- PK(id_ot, id_operario, fecha_asignacion)
```

## 11.2 PK frente a UNIQUE

### PK

```text
identifica la fila seleccionada como clave principal
no admite valores nulos
una por tabla
```

### UNIQUE

```text
impide repeticiones en una clave alternativa
puede haber varias restricciones UNIQUE
```

En `OPERARIO_TELEFONO`:

```text
PK(id_operario, telefono)
```

No alcanza escribir solamente:

```text
UNIQUE(id_operario, telefono)
```

si no se declaró otra PK.

## 11.3 Alternativa con `id_asignacion`

```text
ASIGNACION_OT
- id_asignacion PK
- id_ot FK
- id_operario FK
- fecha_asignacion
- estado_asignacion
- UNIQUE(id_ot, id_operario, fecha_asignacion)
```

El ID artificial facilita la referencia, pero no reemplaza la restricción histórica ni la normalización.

---

# 12. Normalización: explicación completa con el mismo ejemplo

## Relación inicial

```text
ASIGNACION_OT_AMPLIADA

PK(id_ot, id_operario, fecha_asignacion)
numero_ot
descripcion_ot
id_sector
nombre_sector
nombre_operario
especialidad_operario
telefonos_operario
estado_asignacion
```

## 12.1 Primera Forma Normal

Problema:

```text
telefonos_operario = "2245-111111, 2245-222222"
```

Viola:

```text
valores atómicos
sin grupos repetitivos
```

Solución:

```text
OPERARIO_TELEFONO(id_operario, telefono)
PK(id_operario, telefono)
```

## 12.2 Segunda Forma Normal

La PK es compuesta:

```text
(id_ot, id_operario, fecha_asignacion)
```

Dependencias parciales:

```text
id_ot
→ numero_ot, descripcion_ot, id_sector, nombre_sector
```

```text
id_operario
→ nombre_operario, especialidad_operario
```

Dependencia completa:

```text
(id_ot, id_operario, fecha_asignacion)
→ estado_asignacion
```

Solución:

```text
datos de OT → ORDEN_TRABAJO
datos de Operario → OPERARIO
datos de asignación → ASIGNACION_OT
```

## 12.3 Tercera Forma Normal

Dependencia transitiva:

```text
id_ot → id_sector
id_sector → nombre_sector
```

Por lo tanto:

```text
id_ot → nombre_sector
```

indirectamente.

Solución:

```text
nombre_sector → SECTOR
id_sector queda como FK en ORDEN_TRABAJO
```

## 12.4 ID artificial

Agregar:

```text
id_asignacion PK
```

no elimina:

```text
id_ot → descripcion_ot
id_operario → nombre_operario
id_sector → nombre_sector
```

Por eso:

```text
ID artificial ≠ normalización
```

---

# 13. Comunicaciones: supuestos tecnológicos

## 13.1 Debilidad observada

Se intentó justificar:

```text
transmisión asíncrona porque no hay conexión
```

Eso es incorrecto.

## 13.2 Regla

```text
sin conexión
→ no existe transmisión en ese momento
```

```text
síncrona/asíncrona
→ depende de cómo el protocolo organiza y sincroniza los datos
```

Ejemplos de supuestos válidos:

```text
Supongo transmisión síncrona porque las solicitudes
se agrupan y envían en bloques delimitados.
```

```text
Supongo transmisión asíncrona porque cada unidad
se envía individualmente con delimitación propia.
```

La respuesta debe declarar:

```text
qué se supone
+
por qué
```

---

# 14. Señal analógica y digitalización

## Regla

Una señal analógica puede transmitirse como analógica.

Se digitaliza cuando la solución requiere:

```text
procesarla digitalmente
almacenarla
codificarla
enviarla como datos digitales
```

Cadena:

```text
señal analógica
→ muestreo
→ cuantificación
→ codificación
→ datos digitales
```

Para:

```text
fmax = 4 kHz
```

```text
fs mínima = 2 × fmax
fs mínima = 8 k muestras/s
```

Precisión:

```text
fs ≥ 2 × fmax
```

No es obligatorio usar exactamente el mínimo.

---

# 15. Relaciones UML todavía pendientes

## Asociación

Relación general entre clases.

Ejemplo:

```text
Operario — OrdenTrabajo
```

## Agregación

Relación todo–parte débil. La parte puede existir sin el todo.

Ejemplo didáctico:

```text
Equipo ◇── Operario
```

La elección exacta depende del dominio.

## Composición

Relación todo–parte fuerte. La parte depende del ciclo de vida del todo.

Ejemplo didáctico:

```text
OrdenCompra ◆── ItemOrden
```

Si desaparece el todo, las partes no tienen sentido independiente.

## Dependencia

Una clase utiliza temporalmente a otra sin conservar necesariamente una relación estructural.

Ejemplo:

```java
void notificar(ServicioNotificaciones servicio) {
}
```

Pregunta de control:

> ¿Herencia y composición significan lo mismo?

Respuesta:

```text
Herencia → “es un”
Composición → “es parte inseparable de”
```

---

# 16. DCL y TCL — pendiente corto de Base de Datos

```text
DCL
→ control de permisos
→ GRANT, REVOKE
```

```text
TCL
→ control de transacciones
→ COMMIT, ROLLBACK
```

Ejemplo:

```sql
GRANT SELECT ON orden_trabajo TO supervisor;
```

```sql
BEGIN;
UPDATE orden_trabajo
SET estado = 'FINALIZADA'
WHERE id_ot = 1587;
COMMIT;
```

Pregunta de control:

```text
GRANT → DCL
COMMIT → TCL
```

---

# 17. Algoritmos de ordenación — pendiente de Estructuras

Según el alcance registrado:

```text
Inserción
→ caso general/peor: O(n²)
→ útil para conjuntos pequeños o casi ordenados
```

```text
Mergesort
→ O(n log n)
→ divide, ordena y combina
→ requiere memoria auxiliar
```

```text
Quicksort
→ normalmente muy eficiente
→ depende de la elección del pivote
→ el peor caso puede degradarse
```

No memorizar solamente una complejidad: explicar la estrategia.

Pregunta de control:

> ¿Por qué Mergesort no es simplemente “más rápido” que Inserción en todos los casos?

Respuesta:

> Porque la elección también depende del tamaño, el orden previo, la memoria y el costo de implementación.

---

# 18. Plan de repaso de 60 minutos

```text
15 min
→ escribir Java completo sin copiar

10 min
→ abstracta vs. interfaz + polimorfismo oral

10 min
→ dibujar estados y secuencia offline

10 min
→ escribir modelo relacional completo

10 min
→ explicar asociativa vs. débil y 1FN/2FN/3FN

5 min
→ supuestos de transmisión + DCL/TCL
```

Criterio de dominio:

```text
Java compila conceptualmente
+
modelo final contiene PK/FK/UNIQUE
+
secuencia no elimina antes de confirmar
+
asociativa no se justifica como débil
```

---

# 19. Mini examen de repaso

Responder sin mirar:

1. ¿Por qué `super.validarDestinatario()` fue incorrecto en el constructor de la abstracta?
2. Escribí la validación correcta de `destinatario`.
3. Escribí un `toString()` con valores reales.
4. Diferenciá clase abstracta e interfaz por decisión de diseño.
5. Explicá sobrescritura frente a polimorfismo.
6. ¿Por qué `EjecucionOT` no es un subsistema?
7. Escribí las transiciones principales de una OT.
8. Ordená: cabecera, envío, confirmación, trazabilidad, desencolar.
9. Diferenciá FIFO y trazabilidad.
10. Explicá asociativa frente a débil.
11. Escribí el modelo final con PK, FK y `UNIQUE`.
12. Diferenciá PK y `UNIQUE`.
13. Aplicá 1FN, 2FN y 3FN al ejemplo de asignaciones.
14. Explicá por qué `id_asignacion` no normaliza.
15. ¿La desconexión implica transmisión asíncrona?
16. ¿Puede transmitirse una señal analógica como analógica?
17. `GRANT` pertenece a qué familia.
18. `COMMIT` pertenece a qué familia.
19. Estrategia básica de Mergesort.
20. Complejidad general de Inserción.

---

# 20. Respuestas rápidas del mini examen

```text
1. Porque el método estaba en la propia clase, no en Object.
2. null || isBlank(), lanzar excepción antes de asignar.
3. Usar id, descripción, estado u otros atributos reales.
4. Abstracta=familia y estado común; interfaz=contrato transversal.
5. Sobrescritura crea versiones; polimorfismo las invoca por tipo común.
6. Es una entidad del dominio; un subsistema agrupa varios elementos.
7. PENDIENTE→DESPACHADA→EN_EJECUCION→FINALIZADA; ANULADA según regla.
8. cabecera→envío→confirmación→trazabilidad→desencolar.
9. FIFO ordena; trazabilidad conserva historia.
10. Asociativa representa relación; débil depende para identificar/existir.
11. SECTOR, OT, OPERARIO, TELEFONO y ASIGNACION con claves completas.
12. PK identifica principalmente; UNIQUE protege claves alternativas.
13. Teléfonos; parciales por OT/Operario; Sector transitivo.
14. El ID no elimina dependencias ni redundancia.
15. No; sin conexión no hay transmisión.
16. Sí.
17. DCL.
18. TCL.
19. Dividir, ordenar subproblemas y combinar.
20. O(n²) en caso general/peor del alcance estudiado.
```

---

# 21. Síntesis oral de dos minutos

> Mis puntos más débiles no están en comprender la idea general, sino en completar la solución con precisión. En Java debo validar antes de asignar, usar correctamente `String`, escribir `@Override` y `toString()`, y demostrar el polimorfismo con un tipo común. En Análisis y Diseño debo diferenciar entidad y subsistema, completar diagramas de estados y respetar la secuencia segura sin conexión. En Base de Datos debo escribir todas las PK, FK y restricciones `UNIQUE`, y no confundir entidad asociativa con débil. En Comunicaciones debo declarar los supuestos y no deducir sincronía a partir de la conectividad. También quedan pendientes DCL/TCL y algoritmos de ordenación.
