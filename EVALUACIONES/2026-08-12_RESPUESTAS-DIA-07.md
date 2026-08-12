# Respuestas del estudiante — Evaluación Día 7

**Fecha:** 12/08/2026  
**Modalidad:** sin apuntes  
**Fuente de entrega:** archivo Markdown adjunto + respuestas interactivas de la jornada  
**Estado:** entrega original preservada; correcciones separadas en resultados y errores

> El formato fue normalizado para poder leerlo en el repositorio. No se sustituyeron silenciosamente respuestas incorrectas por respuestas correctas.

---

# Parte A — Casos de uso

## 1. Actor, caso de uso y límite

### Actor

> Agente externo que quiere realizar una interacción y obtener un resultado.

### Caso de uso

> Servicios/funciones que brinda el sistema.

### Resultado de valor

> Valor esperado por el actor al interactuar con los casos de usos.

### Límite del sistema

> En el contexto interno del sistema se encuentran los casos de uso y relaciones entre casos de uso; en el externo se encuentran los actores.

### Asociación actor–caso

> Relación que muestra qué actor puede interactuar con qué caso de uso.

### Por qué los nombres propuestos no son buenos casos de uso

> Porque denotan interfaz o implementación de persistencia; no representan una acción o servicio del sistema.

Alternativas entregadas:

```text
Pantalla OT         → Mostrar Orden de Trabajo
Botón Guardar       → Crear Orden de Trabajo
Tabla OrdenTrabajo  → Listar Órdenes de Trabajo
```

---

## 2. `include`, `extend` y generalización

### `include`

> Relación de obligatoriedad, que obliga a implementar el caso de uso relacionado para poder ejecutar correctamente el caso de uso base.

Dirección entregada:

```text
BASE → incluido
```

### `extend`

> Relación de extensión. Permite de forma opcional implementar un caso de uso relacionado en el caso de uso base. Si no se ejecuta el caso de uso relacionado, no se interrumpe la ejecución del caso de uso base.

Dirección entregada:

```text
Extendido → base
```

### Generalización

> Relación padre–hijos: permite a los casos de uso hijos heredar comportamiento del padre.

Dirección entregada:

```text
Hijo → padre
```

### Análisis de propuestas

```text
Crear OT <<include>> Validar datos obligatorios
```

Respuesta:

> No es correcta; falta la flecha dirigida al caso de uso implementado.

```text
Adjuntar fotografía <<extend>> Registrar ejecución
```

Respuesta:

> No es correcta; falta la flecha dirigida al caso de uso padre.

```text
Encargado --|> UsuarioSistema
```

Respuesta:

> La idea es correcta, pero la flecha debe ser `->` sin la `|`.

---

## 3. Caso de uso detallado — Crear Orden de Trabajo

### Actor principal

```text
Encargado
```

### Objetivo

> Crear una Orden de Trabajo en el sistema con servicio, sector, descripción y prioridad, con estado PENDIENTE, dejándola lista para usar.

### Resultado de valor

> Orden de Trabajo creada de forma correcta.

### Disparador

> El Encargado solicita crear Orden de Trabajo.

### Precondiciones

1. El usuario debe tener rol de Encargado.
2. El usuario debe estar autenticado.

### Flujo principal

1. El Encargado solicita crear Orden de Trabajo.
2. El sistema verifica autorización y permite la creación.
3. El Encargado carga los datos servicio, sector, descripción y prioridad.
4. El sistema carga automáticamente estado como PENDIENTE.
5. El sistema valida la información.
6. El sistema crea la Orden de Trabajo.
7. El sistema devuelve la información de la orden creada.

### Flujo alternativo

```text
3.1 El Encargado decide programar la Orden de Trabajo.
3.2 El Encargado carga fecha programada.
3.3 El sistema valida la fecha.
3.4 El sistema continúa en el paso 5 del flujo principal.
```

### Excepción

1. El sistema, al validar, detecta que no hay sector cargado.
2. El sistema devuelve un mensaje mencionando el problema.
3. La Orden de Trabajo no se crea.

### Postcondiciones entregadas

1. El sistema crea la Orden de Trabajo y muestra la información al Encargado.
2. El sistema detecta un error y la Orden de Trabajo no se crea, mostrándole un mensaje al Encargado.

---

# Parte B — Herencia y Java

## 4. Conceptos

### Herencia

> Relación entre dos clases.

### Superclase

> Clase padre en una herencia.

### Subclase

> Clase hija en una herencia.

### Especialización

> Agregar comportamiento o atributos específicos a la clase hija.

### Reutilización

> Utilizar los métodos o atributos heredados.

### Relación “es un”

> La subclase, en esencia, es una superclase con más o diferentes comportamientos y atributos.

### Justificación

> El Operario es un UsuarioSistema porque comparte comportamientos comunes y atributos.

> La Orden de Trabajo solo pertenece al Sector; no comparten comportamientos ni atributos.

---

## 5. `extends`, `this`, `super` y `static`

### `extends`

> Etiqueta que permite extender en Java una superclase en una subclase.

### `this`

> Para acceder a los métodos y atributos de la clase con los estados de la instancia actual/local.

### `super`

> Representa la herencia.

### `super(...)`

> Representa el constructor de la superclase.

### `static`

> Se utiliza para declarar métodos o atributos que pertenecen a la clase y no a una única instancia.

### Posición de `super(...)`

> Es lo primero que se carga en el constructor de la subclase.

### Datos que deberían ser estáticos

```text
cantidadDeRegistros → cantidad de instancias
montoTotalDeSueldos → suma de los atributos sueldo de todas las instancias
```

### Datos que no deberían ser estáticos

```text
nombre
fecha de nacimiento
```

### Código corregido entregado

```java
public Operario(int id, String nombre) {
    super(id, nombre);
    this.especialidad = "REDES";
}
```

---

## 6. Código y métodos

### Explicaciones

> `getRol()` es sobrescritura porque altera el comportamiento heredado.

> `buscarOT(...)` es sobrecarga porque modifica la cantidad o el tipo de parámetro manteniendo el mismo nombre de método.

### `UsuarioSistema`

```java
public class UsuarioSistema {

    private int id;
    private String nombre;
    private static int cantidadUsuarios;

    public UsuarioSistema(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        cantidadUsuarios++;
    }

    public String getRol() {
        return "USUARIO";
    }

    public static int getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    public void buscarOT(int numero) {
    }

    public void buscarOT(String texto) {
    }
}
```

### `Encargado`

```java
public class Encargado extends UsuarioSistema {

    public Encargado(int id, String nombre) {
        super(id, nombre);
    }

    public String getRol() {
        return "ENCARGADO";
    }
}
```

### `Operario`

```java
public class Operario extends UsuarioSistema {

    private String especialidad;

    public Operario(int id, String nombre, String especialidad) {
        super(id, nombre);
        this.especialidad = especialidad;
    }

    public String getRol() {
        return "OPERARIO";
    }
}
```

---

# Parte C — DER

## 7. Conceptos y simbología

### DER

> Diagrama que representa la estructura de datos y sus relaciones.

### Entidad

> Es una cosa u objeto del mundo real o del dominio.

### Instancia

> Cantidad de objetos.

### Atributo

> Campo o propiedad de una entidad.

### Relación

> Asociación entre dos entidades.

### Cardinalidad

> Restricciones de cantidad entre entidades.

### Entidad fuerte

> Tiene un identificador propio y los atributos tienen relevancia dentro del negocio.

### Entidad débil

> La identificación depende de otra entidad.

### Simbología entregada

```text
Rectángulo         → Entidad
Elipse             → Atributo
Rombo              → Relación
Elipse doble       → Atributo multivalor
Elipse discontinua → Atributo derivado
Rectángulo doble   → [sin completar]
Línea doble        → Entidad fuerte
```

---

## 8. Modelado y cardinalidades

### Entidades y atributos

```text
SECTOR
- id_sector PK
- detalle

ORDEN_TRABAJO
- id_ot PK
- id_sector FK
- detalle
- estado

OPERARIO
- id_operario PK
- nombre

ASIGNACION_OT
- id_ot FK
- id_operario FK
- fecha
- estado
- PK(id_ot, id_operario)
```

### Relaciones y cardinalidades máximas

```text
SECTOR 1..N ORDEN_TRABAJO
ORDEN_TRABAJO N..M OPERARIO
```

### Participaciones mínimas entregadas

```text
SECTOR → OT = 0..N
OT → SECTOR = 1..1
OT → OPERARIO = 0..N
OPERARIO → OT = 0..N
```

Los dos últimos se utilizaron como supuesto ante falta de obligatoriedad explícita.

### Atributos propios de `ASIGNACION_OT`

> `fecha_asignacion` y `estado_asignacion` representan estados y fecha de cuándo se asignó, para que no queden solo los identificadores de ambas tablas.

---

## 9. Pasaje inicial a tablas

```text
SECTOR
- id_sector PK
- detalle

ORDEN_TRABAJO
- id_ot PK
- id_sector FK → SECTOR.id_sector
- detalle
- estado

OPERARIO
- id_operario PK
- nombre

ASIGNACION_OT
- id_ot FK → ORDEN_TRABAJO.id_ot
- id_operario FK → OPERARIO.id_operario
- fecha
- estado
- PK(id_ot, id_operario)
```

### Reglas generales entregadas

```text
Entidad fuerte → SECTOR, ORDEN_TRABAJO, OPERARIO
Relación 1:N   → SECTOR 1:N ORDEN_TRABAJO
Relación N:M   → ORDEN_TRABAJO N:M OPERARIO
Entidad débil  → ASIGNACION_OT
```

### Cambio: un Operario vigente sin historial

> En ese caso no necesitaríamos la relación `ASIGNACION_OT` y el Operario se asignaría directamente a `ORDEN_TRABAJO`.

---

# Parte D — Integración y recuperación

## 10. Integración

### RF

```text
RF-01 El sistema debe permitir crear una Orden de Trabajo.
RF-02 El sistema debe permitir asignar una Orden de Trabajo a un Operario.
```

### Caso de uso

```text
Crear y asignar Orden de Trabajo
```

### Actor

```text
Encargado
```

### Clases/atributos entregados

```text
OrdenTrabajo
- id_ot
- detalle
- id_operario
- estado

Operario
- id_operario
- nombre
```

### Entidades/tablas

```text
ORDEN_TRABAJO
OPERARIO
```

### Relación/cardinalidad

```text
OPERARIO 1:N ORDEN_TRABAJO
```

### Caso de prueba

1. Al crear la Orden de Trabajo cargar:
   - detalle: `trabajo de poda`;
   - id_operario: `1`;
   - estado: `PENDIENTE`.
2. Al crear la Orden de Trabajo debe mostrarse:
   - `id_ot: n`;
   - detalle: `trabajo de poda`;
   - Operario: `Juan`;
   - estado: `PENDIENTE`.

### Caso de uso vs. método

> Un caso de uso puede usar múltiples métodos y relaciones.

### Clase Java vs. tabla

> No es necesario que equivalgan porque el modelo relacional se debe diseñar para ser eficiente y escalable, mientras que las clases se deben ajustar a los procesos del negocio.

---

## 11. Recuperación espaciada

```text
Constructor Java = mismo nombre + no da retorno, ni siquiera void

PDU = Protocol Data Unit

Requerimiento completo = tiene la información necesaria para ser medible y comprendido tanto por el usuario como por los desarrolladores

Requerimiento verificable = puede ser probado y medido

Red/Internet forma = paquete

Enlace/Acceso forma = trama

Física transmite = bits o señales

peek() = muestra el elemento de la cima de la pila

pop() = muestra y elimina el elemento de la cima de la pila
```

---

# Defensa distribuida — evidencia de la jornada

No se realizó una exposición final única. Durante la jornada se respondieron y justificaron, sin copiar código:

- actor, caso de uso, resultado de valor y límite;
- `include`, `extend` y generalización;
- caso `Crear Orden de Trabajo` con flujos;
- herencia y relación `es un`;
- `extends`, `super`, `this` y `static`;
- jerarquía Java completa;
- relación 1:N Sector–OT;
- relación N:M OT–Operario;
- tabla `ASIGNACION_OT`;
- entidad fuerte/débil;
- multivaluado, derivado y participación;
- pasaje inicial a tablas;
- recuperación de constructor, PDU, paquete/trama, bits/señales y `peek/pop`.

---

# Autoevaluación posterior registrada por corrección

| Criterio | Nivel estimado |
|---|---:|
| Comprensión conceptual | 2,5/3 |
| Terminología académica | 2/3 |
| Aplicación práctica | 2,5/3 |
| Claridad y orden | 2/3 |

## Dudas/errores conservados

1. Generalización UML y notación `--|>`.
2. Instancia confundida con cantidad.
3. Rectángulo doble y línea doble.
4. `ASIGNACION_OT` clasificada como entidad débil.
5. Completo volvió a mezclarse con verificable.
6. `toString()` omitido.
