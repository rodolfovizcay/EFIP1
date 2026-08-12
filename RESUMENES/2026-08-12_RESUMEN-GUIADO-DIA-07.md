# Resumen guiado EFIP I — Día 7
## Casos de uso, Herencia y DER

**Fecha de estudio:** 12 de agosto de 2026  
**Materias:** Análisis y Diseño + Programación Orientada a Objetos + Base de Datos  
**Objetivo:** definir, diferenciar, aplicar y defender los tres bloques sin depender del apunte

---

# Cómo estudiar este resumen

Para cada concepto seguir cuatro pasos:

```text
1. Definir.
2. Diferenciar de conceptos cercanos.
3. Aplicar a Órdenes de Trabajo.
4. Justificar la decisión.
```

No considerar aprendido un tema solo porque la definición resulta familiar.

---

# PARTE I — CASOS DE USO

# 1. Modelo de casos de uso

El modelo de casos de uso permite que clientes y desarrolladores lleguen a un acuerdo sobre lo que debe cumplir el sistema. Contiene:

- actores;
- casos de uso;
- relaciones entre actores y casos;
- relaciones entre casos de uso.

El modelo sirve como entrada importante para:

- análisis;
- diseño;
- implementación;
- pruebas.

## 1.1 Vista externa

Un diagrama de casos de uso presenta una vista externa del comportamiento:

```text
Quién interactúa
Qué objetivo persigue
Qué resultado de valor ofrece el sistema
```

No describe directamente tablas, clases internas, algoritmos ni código.

---

# 2. Actor

## 2.1 Definición

Un actor representa un **rol externo** que interactúa con el sistema.

Puede ser una persona, sistema o dispositivo externo. El nombre debe expresar el rol, no una identidad individual.

```text
Actor: Operario
No actor general: Rodolfo
```

## 2.2 Responsabilidades

La descripción del actor debe resumir:

- qué necesita;
- qué responsabilidades tiene;
- qué información usa;
- qué funciones inicia o en cuáles participa.

## 2.3 Preguntas para encontrar actores

- ¿quién consulta esta información?;
- ¿quién actualiza estos datos?;
- ¿quién inicia la operación?;
- ¿qué otro sistema se comunica con el nuestro?;
- ¿quién recibe el resultado?;

## 2.4 Actor no equivale a usuario concreto

Un mismo usuario físico puede desempeñar varios roles, y varias personas pueden representar el mismo actor.

---

# 3. Caso de uso

## 3.1 Definición

Un caso de uso especifica una secuencia de acciones que el sistema puede llevar a cabo al interactuar con actores para producir un **resultado de valor**.

```text
Actor + objetivo + interacción + resultado
```

## 3.2 Nombre

Se recomienda comenzar con un verbo en infinitivo:

```text
Crear Orden de Trabajo
Programar Orden de Trabajo
Consultar Orden de Trabajo
Registrar Ejecución
```

Evitar:

```text
Pantalla de OT
Botón Crear
Tabla OrdenTrabajo
Formulario
```

Esos términos describen elementos de interfaz o persistencia, no objetivos del actor.

## 3.3 Esencial y de soporte

```text
Esencial
→ funcionalidad principal del sistema o negocio.

De soporte
→ permite que los casos esenciales funcionen o administra elementos auxiliares.
```

## 3.4 Concreto y abstracto

```text
Concreto
→ puede ser iniciado por un actor y forma un flujo completo.

Abstracto
→ no se inicia directamente; existe para inclusión, extensión o generalización.
```

---

# 4. Límite del sistema

El límite separa responsabilidades:

```text
Fuera del límite
→ actores y sistemas externos.

Dentro del límite
→ casos de uso ofrecidos por el sistema.
```

Errores frecuentes:

- colocar al actor dentro del sistema;
- tratar una base de datos interna como actor;
- colocar una clase Java como caso de uso;
- confundir un dispositivo interno con un actor externo.

---

# 5. Asociación

Una asociación entre actor y caso de uso indica comunicación o participación.

```text
Encargado ───────── Crear OT
Operario  ───────── Registrar ejecución
```

La asociación no es:

- herencia;
- `include`;
- `extend`;
- relación de base de datos.

---

# 6. Generalización de actores

Se utiliza cuando varios actores especializados comparten comportamiento de un actor general.

```text
UsuarioSistema
      △
      │
 ┌────┴────┐
Encargado Operario
```

La punta vacía apunta al padre.

```text
hijo → padre
```

Los actores hijos pueden participar en los casos asociados al padre y además tener casos propios.

Ejemplo:

```text
UsuarioSistema — Consultar perfil
Encargado       — Programar OT
Operario        — Ejecutar OT
```

No crear generalización solo porque dos actores usan el mismo sistema. Debe existir una relación real de especialización.

---

# 7. Generalización de casos de uso

El caso hijo hereda el comportamiento del padre y puede modificarlo o agregarle comportamiento.

```text
Procesar OT
    △
    │
 ┌──┴──────────┐
Programar OT Ejecutar OT
```

Dirección:

```text
caso hijo → caso padre
```

Se usa para reutilizar y organizar variantes especializadas.

---

# 8. Inclusión — `include`

## 8.1 Definición

El caso base incorpora explícitamente el comportamiento de otro caso de uso.

El comportamiento incluido es **obligatorio** para completar el objetivo del caso base.

```text
Caso base ──<<include>>──> Caso incluido
```

## 8.2 Dirección

```text
BASE → INCLUIDO
```

## 8.3 Ejemplo

```text
Crear OT ──<<include>>──> Validar datos obligatorios
Programar OT ──<<include>>──> Verificar disponibilidad
```

## 8.4 Propósito

- extraer comportamiento común obligatorio;
- evitar duplicación de flujos;
- separar una porción compleja;
- simplificar la lectura del caso base.

## 8.5 Pregunta de control

> ¿El caso base puede completar correctamente su objetivo sin ejecutar el incluido?

Si la respuesta es sí, probablemente no sea `include`.

---

# 9. Extensión — `extend`

## 9.1 Definición

Un caso de extensión agrega comportamiento opcional o condicionado a un caso base que puede ejecutarse por sí solo.

```text
Caso extensión ──<<extend>>──> Caso base
```

## 9.2 Dirección

```text
EXTENSIÓN → BASE
```

## 9.3 Ejemplo

```text
Adjuntar fotografía ──<<extend>>──> Registrar ejecución
Solicitar aprobación ──<<extend>>──> Cerrar OT
```

Condición:

```text
Si la actividad requiere evidencia visual.
```

## 9.4 Propósito

- separar comportamiento opcional;
- representar subflujos condicionales;
- mantener completo y comprensible el caso base.

## 9.5 Pregunta de control

> ¿El caso base sigue teniendo sentido y puede completarse sin la extensión?

Si la respuesta es no, probablemente debería analizarse `include` o integrarse el comportamiento al flujo principal.

---

# 10. Comparación de relaciones

| Relación | Cuándo usar | Dirección | Obligatorio |
|---|---|---|---|
| Asociación | Actor participa/interactúa | actor—caso | según caso |
| `include` | Comportamiento común requerido | base → incluido | Sí |
| `extend` | Comportamiento opcional/condicionado | extensión → base | No |
| Generalización | Especialización/herencia | hijo → padre | herencia |

Fórmula mental:

```text
include = siempre
extend  = a veces
generalización = es una especialización
```

---

# 11. Descripción de casos de uso

## 11.1 Elementos mínimos

```text
Código
Nombre
Objetivo
Actor principal
Actores secundarios
Disparador
Precondiciones
Postcondiciones
Flujo principal
Flujos alternativos
Excepciones
Reglas de negocio
RF/RNF relacionados
Relaciones UML
```

## 11.2 Precondición

Estado que debe cumplirse antes del inicio.

```text
El Encargado está autenticado y posee permiso de creación.
```

No confundir con una acción:

```text
Incorrecto como precondición:
El Encargado hace clic en Guardar.
```

Eso puede ser disparador o paso de flujo.

## 11.3 Disparador

Evento que inicia el caso:

```text
El Encargado solicita crear una OT.
```

## 11.4 Flujo principal

Camino normal y esperado:

1. El Encargado solicita crear una OT.
2. El sistema solicita los datos obligatorios.
3. El Encargado completa servicio, sector, descripción y prioridad.
4. El sistema valida los datos.
5. El sistema crea la OT en estado `PENDIENTE`.
6. El sistema informa el número asignado.

## 11.5 Flujo alternativo

Variación válida:

```text
3A. El Encargado agrega una fecha programada opcional.
3A.1. El sistema valida la fecha.
3A.2. Continúa en el paso 4.
```

## 11.6 Excepción

Camino de error o impedimento:

```text
4E. Falta el sector.
4E.1. El sistema informa el campo obligatorio.
4E.2. No crea la OT.
```

## 11.7 Postcondición

Resultado observable.

Éxito:

```text
Existe una OT nueva con número único, estado PENDIENTE y sector válido.
```

Fallo:

```text
No existe una OT nueva ni datos parciales persistidos.
```

---

# 12. Prototipo de interfaz

El prototipo ayuda a comprender y especificar la interacción. No sustituye al caso de uso.

Ejemplo:

```text
CREAR ORDEN DE TRABAJO

Servicio:           [____________ v]
Sector responsable: [____________ v]
Descripción:        [______________]
Prioridad:          [____________ v]
Fecha programada:   [______________]

[Guardar OT] [Cancelar]
```

Validar:

- correspondencia entre campos y flujo;
- obligatoriedad;
- mensajes de error;
- acciones disponibles;
- permisos del actor;
- condiciones de RNF, por ejemplo accesibilidad o tiempo de respuesta.

---

# 13. Respuesta oral modelo — casos de uso

> Un actor representa un rol externo que interactúa con el sistema, mientras que un caso de uso representa una secuencia de acciones que aporta un resultado de valor al actor. La asociación indica participación. `include` se utiliza cuando un caso base siempre requiere otro comportamiento y la flecha va del base al incluido. `extend` agrega comportamiento opcional o condicionado y la flecha va de la extensión al caso base. La generalización permite que un actor o caso hijo herede del padre. Una especificación detallada debe incluir precondiciones, disparador, flujo principal, alternativos, excepciones y postcondiciones.

---

# PARTE II — HERENCIA EN JAVA

# 14. Concepto de herencia

La herencia permite definir una clase nueva a partir de una existente.

```text
Superclase
→ atributos y métodos comunes.

Subclase
→ hereda, especializa, agrega o redefine.
```

Beneficios:

- reutilización;
- especialización;
- organización jerárquica;
- base para polimorfismo.

No usar herencia únicamente para evitar copiar código. Debe existir una relación conceptual **es un**.

```text
Operario es un UsuarioSistema ✅
OrdenTrabajo es un Sector     ❌
```

---

# 15. Superclase y subclase

```text
UsuarioSistema = superclase
Operario       = subclase
Encargado      = subclase
```

La subclase puede:

- usar métodos heredados accesibles;
- agregar atributos;
- agregar métodos;
- sobrescribir métodos heredados.

Los miembros `private` siguen perteneciendo al objeto, pero no se acceden directamente desde la subclase; se usan servicios de la superclase cuando corresponde.

---

# 16. `extends`

Sintaxis:

```java
public class Operario extends UsuarioSistema {
}
```

Java permite herencia simple de clases: una clase extiende directamente una sola superclase.

---

# 17. Constructores y `super`

## 17.1 Regla

El constructor de la superclase debe ejecutarse antes que el constructor específico de la subclase.

```java
public Operario(int id, String nombre, String especialidad) {
    super(id, nombre);
    this.especialidad = especialidad;
}
```

La llamada explícita a `super(...)` debe ser la primera sentencia del constructor.

## 17.2 Llamada implícita

Si no se escribe una llamada explícita, Java intenta insertar `super()`.

Eso solo funciona si la superclase dispone de un constructor sin parámetros accesible.

## 17.3 Recuperación de constructor

```text
Constructor Java:
- mismo nombre que la clase;
- no declara tipo de retorno;
- ni siquiera void.
```

---

# 18. `this` frente a `super`

| Palabra | Referencia principal |
|---|---|
| `this` | objeto actual / miembros de la clase actual |
| `super` | parte heredada / miembros o constructor de la superclase |

Ejemplo:

```java
public Operario(int id, String nombre, String especialidad) {
    super(id, nombre);          // constructor del padre
    this.especialidad = especialidad; // atributo de esta instancia
}
```

No usar `super` como sinónimo de “global” ni `this` como nombre de clase.

---

# 19. Miembros estáticos

Un miembro `static` pertenece a la clase.

```java
private static int cantidadUsuarios;
```

Existe una sola variable compartida por todas las instancias de esa clase.

Acceso recomendado:

```java
UsuarioSistema.getCantidadUsuarios();
```

Usos válidos:

- contador de instancias;
- constantes compartidas;
- operaciones que no dependen de una instancia concreta.

No usar `static` para estado individual:

```text
nombre del usuario → instancia
cantidad total de usuarios → clase/static
```

---

# 20. Sobrescritura

Una subclase redefine un método heredado conservando su signatura compatible.

```java
@Override
public String getRol() {
    return "OPERARIO";
}
```

Fórmula:

```text
método heredado
+ misma signatura
+ nueva implementación
```

La anotación `@Override` ayuda a detectar errores de signatura.

---

# 21. Sobrecarga

Métodos con mismo nombre y distinta lista de parámetros.

```java
public void buscarOT(int numero) { }
public void buscarOT(String texto) { }
```

Fórmula:

```text
mismo nombre
+ distinta cantidad o tipos de parámetros
```

No requiere herencia.

---

# 22. Sobrecarga frente a sobrescritura

| Sobrecarga | Sobrescritura |
|---|---|
| Mismo nombre | Método heredado |
| Parámetros diferentes | Misma signatura compatible |
| Puede estar en la misma clase | Ocurre en subclase |
| Elige por argumentos | Cambia implementación heredada |

---

# 23. Clase `Object`

Todas las clases Java derivan directa o indirectamente de `Object`.

Métodos del material:

```text
toString()
equals(Object obj)
hashCode()
getClass()
clone()
```

Ejemplo:

```java
@Override
public String toString() {
    return getRol() + " - " + getNombre();
}
```

No profundizar hoy en el contrato completo `equals/hashCode`; reconocer su origen en `Object`.

---

# 24. Ejemplo completo

```java
public class UsuarioSistema {
    private final int id;
    private final String nombre;
    private static int cantidadUsuarios = 0;

    public UsuarioSistema(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        cantidadUsuarios++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return "USUARIO";
    }

    public static int getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    @Override
    public String toString() {
        return getRol() + " - " + nombre;
    }
}
```

```java
public class Encargado extends UsuarioSistema {

    public Encargado(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public String getRol() {
        return "ENCARGADO";
    }

    public void programarOT(int numeroOT) {
        // comportamiento del encargado
    }
}
```

```java
public class Operario extends UsuarioSistema {
    private final String especialidad;

    public Operario(int id, String nombre, String especialidad) {
        super(id, nombre);
        this.especialidad = especialidad;
    }

    @Override
    public String getRol() {
        return "OPERARIO";
    }

    public void ejecutarOT(int numeroOT) {
        // comportamiento del operario
    }
}
```

---

# 25. Errores frecuentes de herencia

| Error | Corrección |
|---|---|
| Constructor con `void` | No lleva retorno |
| `super(...)` después de otra sentencia | Debe ir primero |
| Herencia para cualquier relación | Debe significar “es un” |
| Sobrecarga = más parámetros | Pueden cambiar cantidad o tipos |
| Sobrescritura sin herencia | Requiere método heredado |
| `static` como estado de cada objeto | `static` pertenece a la clase |
| Acceder directo a `private` del padre | Usar métodos accesibles |
| `this` y `super` como equivalentes | Referencian niveles distintos |

---

# 26. Respuesta oral modelo — herencia

> La herencia permite crear una subclase a partir de una superclase y reutilizar atributos y métodos comunes. En Java se declara con `extends`. El constructor de la subclase llama primero a `super(...)` para inicializar la parte heredada y usa `this` para referirse a la instancia actual. Una subclase puede sobrescribir un método heredado manteniendo su signatura, mientras que la sobrecarga conserva el nombre y cambia los parámetros. Los miembros estáticos pertenecen a la clase y todas las clases derivan de `Object`.

---

# PARTE III — DER

# 27. Qué es un DER

El Diagrama Entidad–Relación representa gráficamente la estructura lógica general de una base de datos.

Permite modelar:

- entidades;
- atributos;
- relaciones;
- cardinalidades;
- participación;
- entidades fuertes y débiles;
- generalización/especialización en el alcance del material.

No es todavía el esquema SQL definitivo, aunque sirve como base para construirlo.

---

# 28. Entidad

Una entidad es una cosa, objeto, clase o categoría distinguible del mundo real o del dominio.

Puede ser:

```text
Concreta: OPERARIO, VEHICULO, SECTOR
Abstracta: ASIGNACION, VIAJE, ALQUILER
```

Una **instancia** es un caso individual:

```text
Entidad: OPERARIO
Instancia: Operario 145 — Ana Pérez
```

No confundir entidad con atributo:

```text
OPERARIO = entidad
nombre = atributo
```

---

# 29. Atributo

Propiedad que describe una entidad o relación.

Ejemplo:

```text
ORDEN_TRABAJO
- id_ot
- numero
- descripcion
- estado
- prioridad
```

Tipos gráficos del material:

- elipse simple: atributo;
- elipse doble: multivaluado;
- elipse discontinua: derivado.

## 29.1 Identificador

Atributo o conjunto de atributos que permite distinguir instancias.

Al pasar a tablas, normalmente se materializa como clave candidata/primaria según las decisiones del modelo.

---

# 30. Relación

Asociación entre entidades.

Se recomienda nombrarla con un verbo:

```text
SECTOR contiene ORDEN_TRABAJO
OPERARIO participa en ORDEN_TRABAJO
USUARIO crea ORDEN_TRABAJO
```

Una relación puede tener atributos propios.

Ejemplo:

```text
ASIGNACION
- fecha_asignacion
- estado_asignacion
```

Si una relación N:M tiene datos propios, esos datos pertenecen a la relación asociativa, no a una de las entidades arbitrariamente.

---

# 31. Cardinalidad

Indica cuántas instancias pueden relacionarse.

## 31.1 Máxima

```text
1:1
1:N
N:M
```

## 31.2 Mínima

```text
0..1
1..1
0..N
1..N
```

La cardinalidad debe derivarse del dominio, no de las filas que hoy existen.

Ejemplo:

```text
Un SECTOR puede tener muchas OT.
Cada OT pertenece obligatoriamente a un SECTOR.

SECTOR 1 ───── N ORDEN_TRABAJO
participación de OT: 1..1
```

---

# 32. Entidad fuerte y débil

## 32.1 Fuerte

Posee identificación propia.

```text
ORDEN_TRABAJO(id_ot)
```

## 32.2 Débil

Depende de una entidad propietaria para su identificación o existencia dentro del modelo.

Ejemplo conceptual:

```text
DETALLE_OT depende de ORDEN_TRABAJO
```

Debe justificarse que el detalle no tiene sentido independiente en ese modelo. No toda tabla hija es automáticamente una entidad débil.

Simbología:

```text
Entidad fuerte → rectángulo
Entidad débil  → rectángulo doble
```

---

# 33. Simbología del DER

| Símbolo | Significado |
|---|---|
| Rectángulo | Entidad |
| Elipse | Atributo |
| Rombo | Relación |
| Línea | Conexión |
| Elipse doble | Atributo multivaluado |
| Elipse discontinua | Atributo derivado |
| Línea doble | Participación total |
| Rectángulo doble | Entidad débil |
| Triángulo `ES` | Generalización/especialización según material |

En los archivos Markdown se usa notación textual, pero debe conocerse el significado gráfico.

---

# 34. Generalización y especialización en DER

```text
PERSONA
  △ ES
  ├── CLIENTE
  └── EMPLEADO
```

```text
Especialización
→ diseño descendente: entidad general a subgrupos.

Generalización
→ diseño ascendente: entidades semejantes a una entidad superior común.
```

No confundir con la generalización de actores o clases, aunque comparten la idea padre–hijo.

---

# 35. Pasaje inicial a tablas

## 35.1 Entidad fuerte

```text
Entidad → tabla
Atributos → columnas
Identificador elegido → PK
```

Ejemplo:

```text
SECTOR(
    id_sector PK,
    nombre
)
```

## 35.2 Relación 1:N

La PK del lado 1 se incorpora como FK en el lado N.

```text
SECTOR 1:N ORDEN_TRABAJO
```

```text
ORDEN_TRABAJO(
    id_ot PK,
    numero UNIQUE,
    descripcion,
    estado,
    prioridad,
    id_sector FK → SECTOR.id_sector
)
```

## 35.3 Relación N:M

Se crea una tabla asociativa.

```text
ORDEN_TRABAJO N:M OPERARIO
```

```text
ASIGNACION_OT(
    id_ot FK,
    id_operario FK,
    fecha_asignacion,
    estado_asignacion,
    PK(id_ot, id_operario)
)
```

La PK exacta puede cambiar si el dominio permite varias asignaciones históricas entre la misma OT y el mismo operario; en ese caso debe incorporarse otro identificador o atributo temporal según el requerimiento.

## 35.4 Relación 1:1

Se coloca una FK en una de las tablas según:

- obligatoriedad;
- participación;
- dependencia;
- semántica del dominio;
- necesidad de evitar nulos o duplicación.

No aplicar una regla automática sin analizar.

## 35.5 Entidad débil

La tabla incluye la clave de la entidad propietaria y la identificación parcial propia.

---

# 36. DER integrado de ejemplo

```text
SECTOR 1 ───── N ORDEN_TRABAJO

ORDEN_TRABAJO N ───── M OPERARIO
                    ASIGNACION_OT
```

## Entidades

```text
SECTOR
- id_sector
- nombre

ORDEN_TRABAJO
- id_ot
- numero
- descripcion
- estado
- prioridad

OPERARIO
- id_operario
- nombre
- especialidad
```

## Relación asociativa

```text
ASIGNACION_OT
- id_ot
- id_operario
- fecha_asignacion
- estado_asignacion
```

## Supuestos

- cada OT pertenece a un único sector;
- un sector puede contener muchas OT;
- una OT puede asignarse a varios operarios;
- un operario puede intervenir en varias OT;
- la asignación conserva fecha y estado propios.

Cambiar los supuestos cambia el DER.

---

# 37. Errores frecuentes de DER

| Error | Corrección |
|---|---|
| Cada sustantivo es tabla | Analizar identidad y función en el dominio |
| Cardinalidad = cantidad actual de filas | Es restricción del modelo |
| Relación N:M con una FK | Crear tabla asociativa |
| FK en lado 1 de 1:N sin justificación | Normalmente la FK va en N |
| Atributo multivaluado en una columna | Evaluar entidad/tabla relacionada |
| Tabla = clase exactamente | Correspondencia parcial, no identidad conceptual |
| Entidad débil = cualquier hija | Debe depender para identificación/existencia |
| Omitir supuestos | Declarar reglas del dominio |

---

# 38. Respuesta oral modelo — DER

> Un DER representa la estructura lógica de los datos mediante entidades, atributos, relaciones y cardinalidades. Una entidad es un objeto o concepto distinguible; un atributo la describe; una relación vincula entidades; y la cardinalidad establece cuántas instancias participan. Al pasar al modelo relacional, una entidad fuerte suele convertirse en tabla, una relación 1:N se representa llevando la clave del lado 1 como FK al lado N, y una relación N:M requiere una tabla asociativa con las claves de ambas entidades y los atributos propios de la relación.

---

# PARTE IV — INTEGRACIÓN

# 39. Trazabilidad del caso

```text
Necesidad / RF
      ↓
Caso de uso
      ↓
Clases y métodos
      ↓
DER y tablas
      ↓
Pruebas
```

Ejemplo:

```text
RF:
El sistema deberá permitir al Encargado crear una OT.

Caso de uso:
Crear Orden de Trabajo.

Clases:
Encargado, OrdenTrabajo, Sector.

DER:
SECTOR 1:N ORDEN_TRABAJO.

Prueba:
Crear OT con sector válido y comprobar estado PENDIENTE.
```

No asumir correspondencia automática uno-a-uno:

- un caso de uso puede requerir varias clases;
- una clase puede participar en varios casos;
- una entidad del DER no siempre equivale exactamente a una clase Java;
- una relación puede necesitar una tabla asociativa.

---

# 40. Caso integrado recomendado

## Necesidad

> Un Encargado crea y programa una OT; un Operario la consulta y registra su ejecución. La evidencia fotográfica es opcional. Una OT pertenece a un sector y puede asignarse a varios operarios.

## Casos de uso

```text
Crear OT
Programar OT
Consultar OT
Registrar ejecución
Validar datos obligatorios
Adjuntar fotografía
```

Relaciones:

```text
Crear OT <<include>> Validar datos obligatorios
Adjuntar fotografía <<extend>> Registrar ejecución
```

Actores:

```text
UsuarioSistema
├── Encargado
└── Operario
```

## Clases

```text
UsuarioSistema
├── Encargado
└── Operario

OrdenTrabajo
Sector
```

## DER

```text
SECTOR 1:N ORDEN_TRABAJO
ORDEN_TRABAJO N:M OPERARIO mediante ASIGNACION_OT
```

---

# PARTE V — RECUPERACIÓN DEL DÍA 6

# 41. Tarjetas obligatorias

## Constructor

```text
Mismo nombre que la clase.
Sin tipo de retorno, ni siquiera void.
```

## PDU

```text
PDU = Protocol Data Unit
    = Unidad de Datos de Protocolo
    = SDU + PCI
```

## Completo vs. verificable

```text
Completo
→ contiene toda la información necesaria.

Verificable
→ puede probarse objetivamente.
```

## Paquete vs. trama

```text
Red/Internet → paquete/datagrama
Enlace/Acceso → trama
```

## Bits vs. bytes

```text
Física → bits/señales
```

## `peek()` vs. `pop()`

```text
peek → consulta sin eliminar
pop  → devuelve y elimina
```

---

# 42. Veinte preguntas rápidas

1. ¿Qué representa un actor?
2. ¿Qué resultado debe producir un caso de uso?
3. ¿Cómo se nombra un caso de uso?
4. ¿Qué representa el límite?
5. ¿Qué indica una asociación?
6. ¿Cuándo se usa `include`?
7. ¿En qué dirección apunta `include`?
8. ¿Cuándo se usa `extend`?
9. ¿En qué dirección apunta `extend`?
10. ¿Qué hereda un actor hijo?
11. ¿Qué es una precondición?
12. ¿Qué es una postcondición?
13. ¿Qué diferencia hay entre flujo alternativo y excepción?
14. ¿Qué significa `extends`?
15. ¿Qué diferencia existe entre `this` y `super`?
16. ¿Qué es un miembro estático?
17. ¿Sobrecarga o sobrescritura?
18. ¿Qué es una entidad?
19. ¿Dónde se coloca la FK en 1:N?
20. ¿Cómo se transforma N:M?

---

# 43. Criterio de preparación

```text
17–20 correctas
→ listo para evaluación.

14–16
→ recuperar relaciones y cardinalidades.

10–13
→ releer los bloques débiles y rehacer el caso.

Menos de 10
→ volver a definición, diferencia, ejemplo y justificación.
```

---

# 44. Fuentes utilizadas

Este resumen conserva la terminología y el alcance de:

- `Analisis_y_Diseno_de_Software.md`;
- `INF382_Programacion_Orientada_a_Objetos.md`;
- `Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md` como apoyo;
- `INF387_Base_de_Datos_I_RESUMEN.md`;
- `02-PLAN-MAESTRO-HASTA-03-09.md`;
- estado y errores acumulados hasta el Día 6.

No sustituye los materiales universitarios con contenidos externos.
