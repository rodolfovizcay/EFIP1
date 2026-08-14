# Resumen guiado EFIP I — Día 9
## Diseño, Abstracción/Polimorfismo y Normalización

**Fecha de estudio:** 14 de agosto de 2026  
**Materias:** Análisis y Diseño + Programación Orientada a Objetos + Base de Datos

---

# Cómo estudiar este resumen

Para cada concepto realizar cuatro acciones:

```text
1. Definir.
2. Diferenciar.
3. Aplicar a Órdenes de Trabajo.
4. Justificar la decisión.
```

No considerar aprendido un tema solo por reconocer palabras o código.

---

# PARTE I — MODELO DE DISEÑO

# 1. Propósito

El diseño modela el sistema para que soporte los requisitos y restricciones de implementación.

Según el material, permite:

- comprender requisitos no funcionales y restricciones;
- considerar lenguaje, sistema operativo, distribución, concurrencia, interfaz y transacciones;
- producir una entrada para implementación;
- dividir el trabajo en partes manejables;
- identificar interfaces entre subsistemas;
- preservar, en lo posible, la estructura encontrada en análisis.

Fórmula:

```text
Análisis
→ qué objetos conceptuales colaboran.

Diseño
→ cómo se realizará físicamente bajo restricciones concretas.

Implementación
→ código y componentes ejecutables.
```

---

# 2. Modelo de análisis vs. modelo de diseño

| Análisis | Diseño |
|---|---|
| Conceptual | Físico/plano de implementación |
| Responsabilidades | Operaciones, interfaces, subsistemas |
| Se abstrae de tecnología | Considera tecnología y RNF |
| Colaboración | Secuencia |
| Clase de análisis | Clase de diseño |
| Realización de análisis | Realización de diseño |

El modelo de diseño no es todavía código terminado, pero permite una traducción más directa a la implementación.

---

# 3. Artefactos del diseño

## Modelo de diseño

Modelo de objetos que representa la realización física de los casos de uso.

## Clase de diseño

Abstracción próxima a una construcción de implementación. Define atributos, operaciones, signaturas, visibilidad y relaciones.

## Realización de caso de uso–diseño

Describe cómo clases y objetos de diseño ejecutan un caso de uso. Incluye flujo textual, clases participantes y diagrama de secuencia.

## Subsistema de diseño

Agrupa clases, realizaciones, interfaces y otros subsistemas.

## Interfaz

Especifica operaciones visibles y separa el contrato de su implementación.

## Modelo de despliegue

Describe distribución física de funcionalidad entre nodos.

## Descripción de arquitectura

Selecciona subsistemas, interfaces, dependencias, clases fundamentales y realizaciones críticas.

---

# 4. Diagrama de secuencia

Muestra interacciones entre participantes y destaca el orden temporal.

```text
Eje x
→ participantes.

Eje y
→ tiempo de arriba hacia abajo.
```

## Componentes

```text
Actor/objeto/subsistema
→ participante.

Línea de vida
→ existencia durante la interacción.

Mensaje
→ solicitud o transferencia de información.

Foco de control
→ período en que el participante ejecuta una acción.

create/destroy
→ creación o destrucción de objetos cuando corresponda.
```

## Ejemplo abreviado

```text
Operario
→ AppRegistrarEjecucion: registrar(datos)

AppRegistrarEjecucion
→ ServicioRegistrarEjecucion: registrar(datos)

ServicioRegistrarEjecucion
→ RepositorioOrdenTrabajo: buscarPorId(idOT)

ServicioRegistrarEjecucion
→ OrdenTrabajo: admiteRegistroEjecucion()

ServicioRegistrarEjecucion
→ EjecucionOT: crear(datos)

ServicioRegistrarEjecucion
→ RepositorioEjecucion: guardar(ejecucion)

ServicioRegistrarEjecucion
→ AppRegistrarEjecucion: resultado
```

Regla:

```text
arriba = antes
abajo  = después
```

---

# 5. Flujo alternativo en secuencia

Caso sin conexión:

```text
A1. App detecta ausencia de conectividad.
A2. Crea solicitud pendiente.
A3. La encola por orden de llegada.
A4. Informa que quedó pendiente.
A5. Al recuperar conexión, envía según FIFO.
```

No cambiar el objetivo del caso:

```text
Registrar ejecución de OT ✅
Crear una OT nueva         ❌
```

---

# 6. Diagrama de estados

Muestra una máquina de estados y el flujo de control entre estados.

```text
Estado
→ condición de un objeto.

Evento
→ estímulo que activa una transición.

Transición
→ paso de un estado a otro.

Acción
→ computación atómica asociada.

Actividad
→ ejecución en curso dentro de un estado.
```

Ejemplo:

```text
PENDIENTE
  --despachar--> DESPACHADA
  --anular------> ANULADA

DESPACHADA
  --iniciar-----> EN_EJECUCION

EN_EJECUCION
  --finalizar [datos completos]--> FINALIZADA
```

Control de consistencia:

- los métodos que cambian estado deben existir en la clase;
- deben existir casos de uso que invoquen esos métodos;
- los estados y transiciones relevantes deben poder recorrerse.

---

# 7. Subsistemas e interfaces

## Subsistema

```text
SubsistemaTrabajoMovil
SubsistemaOrdenesTrabajo
SubsistemaEjecuciones
```

Agrupa elementos relacionados para reducir complejidad.

## Interfaz

```text
IOrdenTrabajo
+ buscarPorId(idOT)
+ validarEstadoParaEjecucion(idOT)
```

El cliente depende de la operación visible, no del detalle interno.

---

# 8. Respuesta oral modelo — Diseño

> El modelo de diseño refina el modelo de análisis e incorpora requisitos no funcionales y restricciones de implementación. Es un plano físico próximo al código. Sus artefactos incluyen modelo y clases de diseño, realizaciones de caso de uso–diseño, subsistemas, interfaces, despliegue y descripción de arquitectura. En una realización de diseño se utiliza normalmente un diagrama de secuencia, donde los participantes se ubican horizontalmente y los mensajes se ordenan de arriba hacia abajo. Un diagrama de estados muestra las condiciones por las que pasa un objeto y las transiciones activadas por eventos.

---

# PARTE II — ABSTRACCIÓN Y POLIMORFISMO

# 9. Abstracción

La abstracción selecciona características relevantes y suprime detalles irrelevantes para reducir complejidad.

```text
Abstracción
→ comportamiento esencial observable.

Encapsulamiento
→ ocultación/protección de la implementación.
```

Ejemplo:

```text
CanalNotificacion.enviar(mensaje)
```

El cliente usa el servicio sin conocer todos los detalles internos.

---

# 10. Clase abstracta

En el alcance del material:

- se declara con `abstract`;
- no puede instanciarse;
- puede tener atributos, métodos y constructor;
- se usa como superclase;
- contiene comportamiento común;
- posee al menos un método abstracto;
- las subclases concretas implementan los métodos abstractos.

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

Incorrecto:

```java
new CanalNotificacion("usuario");
```

---

# 11. Método abstracto

Método declarado sin cuerpo:

```java
public abstract void enviar(String mensaje);
```

Una subclase concreta debe sobrescribirlo:

```java
@Override
public void enviar(String mensaje) {
    System.out.println(mensaje);
}
```

Si no implementa todos los métodos abstractos, la subclase también debe ser abstracta.

---

# 12. Interfaz

Una interfaz define qué debe hacerse, no la implementación concreta.

En el alcance del material:

- se declara con `interface`;
- no se instancia;
- no tiene constructor;
- no contiene variables de instancia;
- una clase puede implementar varias;
- se utiliza `implements`;
- la implementación debe respetar signaturas y ser pública.

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

# 13. Clase abstracta vs. interfaz

| Clase abstracta | Interfaz |
|---|---|
| Base común de clases relacionadas | Contrato de comportamiento |
| Tiene constructor | No tiene constructor |
| Puede tener estado de instancia | No tiene variables de instancia según material |
| Puede aportar métodos concretos | El material enfatiza el contrato |
| Se usa `extends` | Se usa `implements` |
| Una superclase directa | Varias interfaces posibles |

Decisión:

```text
Estado + comportamiento común + relación de familia
→ clase abstracta.

Contrato común entre clases posiblemente diferentes
→ interfaz.
```

---

# 14. Polimorfismo

Permite programar de manera general y que distintos objetos respondan de forma diferente al mismo mensaje.

```java
CanalNotificacion canalA = new NotificacionEmail("a@coop.test");
CanalNotificacion canalB = new NotificacionMovil("usuario-15");

canalA.enviar("OT asignada");
canalB.enviar("OT asignada");
```

Misma llamada:

```text
enviar(mensaje)
```

Distinta implementación según el objeto real.

## Colección polimórfica

```java
List<CanalNotificacion> canales = List.of(
    new NotificacionEmail("a@coop.test"),
    new NotificacionMovil("usuario-15")
);

for (CanalNotificacion canal : canales) {
    canal.enviar("La OT 1587 fue asignada");
}
```

---

# 15. Polimorfismo vs. sobrecarga/sobrescritura

```text
Sobrecarga
→ mismo nombre, parámetros distintos.

Sobrescritura
→ subclase redefine método heredado.

Polimorfismo
→ referencia general invoca comportamiento específico del objeto real.
```

La sobrescritura suele permitir el comportamiento polimórfico en ejecución.

---

# 16. Errores frecuentes POO

```text
Instanciar abstracta                        ❌
Usar extends para implementar interfaz     ❌
Método abstracto con cuerpo                ❌
Omitir método abstracto en subclase concreta❌
Método de interfaz implementado como private❌
Polimorfismo = solo sobrecarga             ❌
Abstracción = encapsulamiento              ❌
```

---

# 17. Respuesta oral modelo — POO

> La abstracción selecciona las características esenciales y oculta detalles irrelevantes. Una clase abstracta no puede instanciarse, puede tener estado, constructor y comportamiento común, y deja métodos abstractos para que las subclases los implementen. Una interfaz define un contrato y se implementa con `implements`; una clase puede implementar varias. El polimorfismo permite tratar distintos objetos mediante una referencia común y que respondan de manera específica al mismo mensaje.

---

# PARTE III — NORMALIZACIÓN

# 18. Propósito

Normalizar significa descomponer tablas para que cumplan reglas basadas en claves y dependencias funcionales.

Beneficios:

- evita anomalías de inserción;
- evita anomalías de modificación;
- evita anomalías de borrado;
- mejora independencia;
- reduce redundancia problemática.

Dentro del alcance del día, un modelo en 3FN se considera normalizado.

---

# 19. Dependencia funcional

```text
X → Y
```

significa que X determina Y.

Ejemplos:

```text
id_operario → nombre_operario
id_sector   → nombre_sector
id_ot       → descripcion_ot
```

---

# 20. Dependencia parcial

Ocurre cuando un atributo depende solo de una parte de una clave compuesta.

Clave:

```text
(id_ot, id_operario, fecha_asignacion)
```

Dependencias parciales:

```text
id_ot       → numero_ot, descripcion_ot
id_operario → nombre_operario
```

No dependen de la clave completa.

---

# 21. Dependencia transitiva

Ocurre cuando:

```text
PK → atributo no clave A
A  → atributo no clave B
```

Ejemplo:

```text
id_ot     → id_sector
id_sector → nombre_sector
```

Entonces `nombre_sector` depende transitivamente de `id_ot`.

---

# 22. Anomalías

## Inserción

No poder registrar un Operario si todavía no tiene una asignación.

## Modificación

Cambiar `nombre_sector` en una fila y dejar otras con el nombre anterior.

## Borrado

Eliminar la última asignación y perder información del Operario o Sector.

---

# 23. Primera forma normal — 1FN

Regla:

```text
Valores atómicos
+ sin grupos repetitivos
```

Incorrecto:

```text
telefonos = "2245-111111, 2245-222222"
```

Correcto:

```text
OPERARIO_TELEFONO(
    id_operario FK,
    telefono,
    PK(id_operario, telefono)
)
```

---

# 24. Segunda forma normal — 2FN

Regla:

```text
1FN
+
atributos no clave dependen de la PK completa
```

Se aplica a claves compuestas.

Si la PK es simple y la relación está en 1FN, el material indica que también está en 2FN.

Descomposición:

```text
ORDEN_TRABAJO
OPERARIO
ASIGNACION_OT
```

para eliminar dependencias parciales de `id_ot` y `id_operario`.

---

# 25. Tercera forma normal — 3FN

Regla:

```text
2FN
+
sin dependencias transitivas de la PK
```

Si:

```text
id_ot → id_sector
id_sector → nombre_sector
```

se crea:

```text
SECTOR(id_sector PK, nombre_sector UNIQUE)
```

Y:

```text
ORDEN_TRABAJO(..., id_sector FK)
```

---

# 26. Modelo final normalizado

```text
SECTOR(
    id_sector PK,
    nombre_sector UNIQUE
)

ORDEN_TRABAJO(
    id_ot PK,
    numero_ot UNIQUE,
    descripcion_ot,
    id_sector FK
)

OPERARIO(
    id_operario PK,
    nombre_operario,
    especialidad_operario
)

OPERARIO_TELEFONO(
    id_operario FK,
    telefono,
    PK(id_operario, telefono)
)

ASIGNACION_OT(
    id_ot FK,
    id_operario FK,
    fecha_asignacion,
    estado_asignacion,
    PK(id_ot, id_operario, fecha_asignacion)
)
```

---

# 27. ID artificial

Agregar `id_asignacion` puede facilitar identificación, pero no elimina por sí solo dependencias parciales o transitivas.

La normalización pregunta:

```text
¿De qué depende cada atributo?
```

No solamente:

```text
¿Existe una columna id?
```

---

# 28. Procedimiento rápido

```text
1. Identificar PK.
2. Escribir dependencias.
3. Eliminar multivaluados → 1FN.
4. Eliminar dependencias parciales → 2FN.
5. Eliminar dependencias transitivas → 3FN.
6. Marcar PK/FK/UNIQUE.
7. Revisar anomalías.
```

---

# 29. Respuesta oral modelo — Normalización

> La normalización descompone tablas para reducir anomalías. En 1FN todos los valores son atómicos y no hay grupos repetitivos. En 2FN la relación está en 1FN y cada atributo no clave depende de la clave primaria completa, por lo que se eliminan dependencias parciales de claves compuestas. En 3FN la relación está en 2FN y no existen dependencias transitivas entre la clave y atributos no clave. La descomposición debe justificarse mediante dependencias funcionales, no solo agregando identificadores artificiales.

---

# PARTE IV — RECUPERACIÓN DEL DÍA 8

# 30. Fórmulas y reglas activas

```text
Línea doble → participación total

Pila → LIFO
Cola → FIFO
FIFO ≠ trazabilidad

TDA:
permanece contrato/comportamiento
cambia implementación

P ↑ → incertidumbre ↓ → información ↓
P ↓ → incertidumbre ↑ → información ↑

I(E)=log₂(1/P(E))
Unidad=bits

H(S)=bits/símbolo
R=bits/segundo

A=amplitud
T=período
f=frecuencia
f=1/T
T=1/f
fs mínima=2·fmax
```

---

# 31. Veinte preguntas rápidas

1. ¿Qué incorpora diseño que análisis abstrae?
2. ¿Qué es una clase de diseño?
3. ¿Qué destaca un diagrama de secuencia?
4. ¿Qué representa una línea de vida?
5. ¿Qué diferencia hay entre estado y transición?
6. ¿Qué contiene un subsistema?
7. ¿Qué separa una interfaz?
8. ¿Qué es abstracción?
9. ¿Puede instanciarse una clase abstracta?
10. ¿Qué contiene un método abstracto?
11. ¿Qué palabra usa una clase para implementar una interfaz?
12. ¿Qué diferencia hay entre abstracta e interfaz?
13. ¿Qué es polimorfismo?
14. ¿Qué anomalías reduce la normalización?
15. ¿Qué exige 1FN?
16. ¿Cuándo existe dependencia parcial?
17. ¿Qué exige 2FN?
18. ¿Qué es dependencia transitiva?
19. ¿Qué exige 3FN?
20. ¿Por qué un ID artificial no normaliza automáticamente?

---

# 32. Criterio de preparación

```text
17–20 correctas
→ listo para evaluación.

14–16
→ recuperar el bloque más débil.

10–13
→ rehacer productos obligatorios.

Menos de 10
→ volver a definición, diferencia, ejemplo y justificación.
```

---

# 33. Fuentes

- `Analisis_y_Diseno_de_Software.md`.
- `INF382_Programacion_Orientada_a_Objetos.md`.
- `INF387_Base_de_Datos_I_RESUMEN.md`.
- `02-PLAN-MAESTRO-HASTA-03-09.md`.
- estado y errores acumulados hasta el Día 8.
