# Miércoles 12/8 — Día 7
## Casos de uso + Herencia + DER

**Etapa:** tercera jornada intensiva de vacaciones  
**Duración indicada por el plan:** 5,5 horas núcleo  
**Materias:** Análisis y Diseño + POO + Base de Datos  
**Modalidad:** recuperación activa, modelado, Java breve, pasaje a tablas, evaluación y defensa oral

> Nota de planificación: los bloques detallados del plan suman 6 horas efectivas —90 + 90 + 30 + 90 + 60 minutos— aunque el encabezado indica 5,5 horas núcleo. Se conservan todos los bloques; los últimos 30 minutos pueden utilizarse como cierre ajustable según energía.

---

# 1. Resultado esperado

Al terminar la jornada deben existir:

- explicación académica de actor y caso de uso;
- identificación del límite del sistema;
- diferenciación y dirección de `include`, `extend` y generalización;
- caso de uso con precondiciones, disparador, flujo principal, alternativos y postcondiciones;
- prototipo textual de interfaz asociado al caso de uso;
- jerarquía Java con superclase y dos subclases;
- constructor correcto con llamada a `super`;
- un método sobrescrito y un ejemplo de sobrecarga;
- uso justificado de un miembro estático;
- definición de DER, entidad, atributo, relación y cardinalidad;
- DER textual pequeño;
- pasaje inicial de entidades y relaciones a tablas;
- evaluación escrita;
- defensa oral;
- plantilla de cierre.

---

# 2. Archivos de la jornada

1. `RESUMENES/2026-08-12_RESUMEN-GUIADO-DIA-07.md`
2. `PLANTILLAS/2026-08-12_PLANTILLA-CASO-DE-USO.md`
3. `FICHAS/2026-08-12_FICHA-HERENCIA-JAVA.md`
4. `FICHAS/2026-08-12_FICHA-DER-Y-PASAJE-A-TABLAS.md`
5. `CASOS/2026-08-12_CASO-INTEGRADOR-OT-CASOS-HERENCIA-DER.md`
6. `EVALUACIONES/2026-08-12_EVALUACION-DIA-07.md`
7. `EVALUACIONES/2026-08-12_RESPUESTAS-DIA-07.md`
8. `RESUMENES/2026-08-12_CIERRE-DIA-07.md`

---

# 3. Cronograma operativo

## Mañana

| Bloque | Duración | Actividad |
|---|---:|---|
| Recuperación inicial | 15 min | Constructor, PDU, completo/verificable, paquete/trama, bits/bytes y `peek()` |
| M1 — Casos de uso | 75 min | Actores, casos, relaciones, flujos y prototipo |
| Pausa | 15 min | Descanso real |
| M2 — Herencia | 90 min | Superclase/subclase, `extends`, `super`, estáticos y sobrescritura |
| Cierre de mañana | 30 min | Diagrama textual de casos de uso + jerarquía de clases |

## Tarde

| Bloque | Duración | Actividad |
|---|---:|---|
| T1 — DER | 90 min | Entidades, atributos, relaciones, cardinalidades y tablas |
| Pausa | 15 min | Descanso |
| T2.1 — Java | 20 min | Escribir y corregir jerarquía |
| T2.2 — Evaluación/oral | 25 min | Preguntas y defensa breve |
| T2.3 — Síntesis | 15 min | Respuestas, errores y cierre inicial |

---

# 4. Recuperación inicial — sin apuntes

Responder en una o dos oraciones:

1. ¿Qué dos condiciones formales debe cumplir un constructor Java?
2. ¿Qué significa PDU y qué contiene?
3. ¿Qué diferencia existe entre requerimiento completo y verificable?
4. ¿Qué unidad forma Red/Internet y cuál forma Enlace/Acceso a la red?
5. ¿Qué transmite Física como unidad principal?
6. ¿Qué diferencia existe entre `peek()` y `pop()`?

Reglas:

- responder antes de consultar las fichas;
- no abrir debates largos;
- registrar únicamente errores reales;
- repetir al final del día los puntos fallados.

---

# 5. Bloque M1 — Actores y casos de uso

## 5.1 Actor

Un actor representa un **rol externo** que interactúa con el sistema.

Puede ser:

- una persona;
- otro sistema;
- un dispositivo externo;
- una organización o rol institucional, cuando interactúa como entidad externa.

No debe nombrarse a una persona concreta si lo relevante es el rol.

```text
Correcto: Encargado
Incorrecto como actor general: Juan Pérez
```

Preguntas para encontrar actores:

- ¿quién usa una función?;
- ¿quién consulta información?;
- ¿quién actualiza datos?;
- ¿qué sistema externo intercambia información?;
- ¿quién inicia el proceso?;

## 5.2 Caso de uso

Un caso de uso representa una secuencia de acciones que el sistema realiza al interactuar con actores y que aporta un **resultado de valor**.

El nombre debe comenzar preferentemente con un verbo en infinitivo:

```text
Crear Orden de Trabajo
Programar Orden de Trabajo
Consultar Orden de Trabajo
Registrar Ejecución
```

Evitar nombres que sean solamente pantallas, tablas o botones:

```text
Pantalla OT      ← no expresa objetivo
Botón Guardar    ← elemento de interfaz
Tabla Orden      ← elemento de datos
```

## 5.3 Límite del sistema

El límite separa:

```text
Dentro:
funciones y responsabilidades del sistema.

Fuera:
actores y elementos externos.
```

No colocar al actor dentro del sistema ni tratar una tabla como actor.

## 5.4 Asociación actor–caso de uso

Indica que el actor y el caso de uso se comunican. Se grafica cuando el actor inicia o participa en el caso según el modelo definido.

La asociación no significa herencia, inclusión ni extensión.

---

# 6. Relaciones entre casos de uso

## 6.1 `include`

Se utiliza cuando un caso base **siempre necesita** ejecutar un comportamiento incluido para completar su objetivo.

```text
Caso base ──<<include>>──> Caso incluido
```

Dirección:

```text
BASE → INCLUIDO
```

Usos:

- extraer comportamiento obligatorio común;
- evitar repetir el mismo flujo;
- separar una funcionalidad compleja obligatoria.

Ejemplo:

```text
Crear OT ──<<include>>──> Validar datos obligatorios
```

Si `Crear OT` puede completarse sin validar datos obligatorios, la inclusión estaría mal modelada.

## 6.2 `extend`

Se utiliza para comportamiento **opcional o condicionado** que amplía un caso base que puede ejecutarse por sí solo.

```text
Caso de extensión ──<<extend>>──> Caso base
```

Dirección:

```text
EXTENSIÓN → BASE
```

Ejemplo:

```text
Adjuntar fotografía ──<<extend>>──> Registrar ejecución
```

Condición posible:

```text
Solo si el operario necesita documentar visualmente el trabajo.
```

## 6.3 Generalización

Un actor o caso de uso hijo hereda el comportamiento del padre y puede especializarlo.

```text
HIJO ─────▷ PADRE
```

Ejemplo de actores:

```text
UsuarioSistema
   ▲
   ├── Encargado
   └── Operario
```

Ejemplo de casos:

```text
Procesar OT
   ▲
   ├── Programar OT
   └── Ejecutar OT
```

Usar generalización solo cuando exista una relación real de especialización.

## 6.4 Fórmula comparativa

```text
include       = obligatorio y reutilizable
extend        = opcional/condicionado
Generalización= hijo especializa y hereda del padre
```

---

# 7. Descripción detallada de un caso de uso

Completar como mínimo:

```text
Código y nombre
Objetivo/resultado de valor
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
Relaciones include/extend/generalización
```

## 7.1 Precondición

Estado que debe ser verdadero antes de iniciar.

Ejemplo:

```text
El Encargado está autenticado y posee permiso para crear OT.
```

No escribir como precondición una acción que pertenece al flujo.

## 7.2 Disparador

Evento que inicia el caso.

```text
El Encargado solicita crear una nueva OT.
```

## 7.3 Flujo principal

Secuencia normal de acciones entre actor y sistema.

Ejemplo abreviado:

1. El Encargado solicita crear una OT.
2. El sistema solicita servicio, sector, descripción y prioridad.
3. El Encargado completa los datos.
4. El sistema valida datos obligatorios.
5. El sistema crea la OT en estado `PENDIENTE`.
6. El sistema informa el número asignado.

## 7.4 Flujo alternativo

Variación válida del flujo principal.

Ejemplo:

```text
4A. El Encargado decide adjuntar una ubicación de referencia.
4A.1. El sistema registra la ubicación.
4A.2. El flujo vuelve al paso 4.
```

## 7.5 Excepción

Situación que impide completar normalmente.

```text
4E. Falta un dato obligatorio.
4E.1. El sistema identifica los campos incompletos.
4E.2. No crea la OT.
```

## 7.6 Postcondición

Estado observable después de finalizar.

Éxito:

```text
Existe una OT nueva, con número único, estado PENDIENTE y sector asociado.
```

Fallo:

```text
No se crea ninguna OT y no quedan datos parciales persistidos.
```

---

# 8. Prototipo de interfaz

El prototipo ayuda a comprender y especificar la interacción entre actor y sistema.

Para el caso `Crear Orden de Trabajo`, representar:

```text
[Servicio:            v]
[Sector responsable:  v]
[Descripción:          ]
[Prioridad:           v]
[Fecha programada:     ]

[Guardar OT] [Cancelar]
```

Preguntas de validación:

- ¿los campos corresponden al flujo?;
- ¿se distingue obligatorio de opcional?;
- ¿qué mensajes se muestran ante error?;
- ¿el botón refleja el objetivo del caso?;
- ¿el prototipo introduce decisiones no solicitadas?

El prototipo no reemplaza la descripción del caso de uso.

---

# 9. Bloque M2 — Herencia

## 9.1 Concepto

La herencia permite definir una clase a partir de otra existente.

```text
Superclase / clase padre
→ define atributos y métodos comunes.

Subclase / clase hija
→ hereda y puede agregar o redefinir comportamiento.
```

Relación conceptual:

```text
Operario ES UN UsuarioSistema
Encargado ES UN UsuarioSistema
```

## 9.2 `extends`

```java
public class Operario extends UsuarioSistema {
}
```

Indica que `Operario` deriva de `UsuarioSistema`.

## 9.3 `this` y `super`

```text
this
→ objeto actual;
→ atributos/métodos de la instancia actual;
→ otro constructor de la misma clase mediante this(...).

super
→ miembros de la superclase;
→ constructor de la superclase mediante super(...).
```

En el constructor de una subclase, la llamada explícita a `super(...)` debe aparecer como primera sentencia.

## 9.4 Ejemplo base

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
        // comportamiento específico
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
        // comportamiento específico
    }
}
```

## 9.5 Miembros estáticos

Un miembro `static` pertenece a la clase, no a cada instancia individual.

Ejemplo:

```java
UsuarioSistema.getCantidadUsuarios();
```

No utilizar `static` para datos que deberían pertenecer al estado particular de cada objeto.

## 9.6 Sobrescritura

```text
subclase
+ método heredado
+ misma signatura
+ nueva implementación
```

Ejemplo: `getRol()` en `Operario` y `Encargado`.

## 9.7 Sobrecarga

```text
mismo nombre
+ distinta cantidad o tipos de parámetros
```

Ejemplo:

```java
public void buscarOT(int numero) { }
public void buscarOT(String texto) { }
```

La sobrecarga no requiere herencia.

## 9.8 Clase `Object`

Todas las clases Java derivan de `Object`, incluso sin declarar `extends Object`.

Métodos relevantes del material:

- `toString()`;
- `equals(Object obj)`;
- `hashCode()`;
- `getClass()`.

Hoy se usa `toString()` como ejemplo de sobrescritura. La comparación completa `equals/hashCode` se profundizará cuando corresponda.

---

# 10. Control de salida de Herencia

No pasar al siguiente bloque hasta poder responder:

- ¿qué diferencia existe entre superclase y subclase?;
- ¿qué significa relación “es un”?;
- ¿qué hace `extends`?;
- ¿por qué se llama a `super(...)`?;
- ¿qué diferencia existe entre `this` y `super`?;
- ¿qué pertenece a la clase cuando es `static`?;
- ¿sobrecarga o sobrescritura?;
- ¿por qué todas las clases heredan de `Object`?

---

# 11. Cierre de mañana — diagrama y jerarquía

## 11.1 Diagrama textual de casos de uso

Preparar:

```text
Actor general: UsuarioSistema
Actores especializados: Encargado, Operario

Encargado — Crear OT
Encargado — Programar OT
Operario  — Consultar OT
Operario  — Registrar ejecución

Crear OT <<include>> Validar datos obligatorios
Adjuntar fotografía <<extend>> Registrar ejecución
```

Justificar cada relación.

## 11.2 Jerarquía de clases

Preparar:

```text
UsuarioSistema
├── Encargado
└── Operario
```

Incluir:

- atributos comunes en la superclase;
- atributos específicos en subclases;
- constructor con `super`;
- método sobrescrito;
- un miembro estático justificado.

---

# 12. Bloque T1 — DER

## 12.1 Definición

El Diagrama Entidad–Relación expresa gráficamente la estructura lógica general de los datos.

Nociones básicas:

```text
Entidad
→ cosa, objeto o concepto distinguible del dominio.

Atributo
→ propiedad que describe a una entidad o relación.

Relación
→ asociación entre entidades.

Cardinalidad
→ cuántas instancias pueden participar.
```

## 12.2 Simbología básica del material

```text
Rectángulo      → entidad
Elipse          → atributo
Rombo           → relación
Línea           → conexión
Elipse doble    → atributo multivaluado
Elipse discontinua → atributo derivado
Rectángulo doble→ entidad débil
Línea doble     → participación total
```

En Markdown se utilizará una representación textual, pero se debe conocer la simbología.

## 12.3 Entidad fuerte y débil

```text
Entidad fuerte
→ posee identificación propia.

Entidad débil
→ depende de otra entidad para identificarse o existir dentro del modelo.
```

No profundizar hoy en todos los casos de claves parciales; reconocer el concepto y justificar la dependencia.

## 12.4 Cardinalidades

### 1:1

Una instancia de A se relaciona, como máximo según el modelo, con una de B y viceversa.

### 1:N

Una instancia de A puede relacionarse con muchas de B; cada B se relaciona con una A en el modelo planteado.

### N:M

Muchas instancias de A pueden relacionarse con muchas de B.

Además de la máxima, considerar participación mínima cuando el problema la especifique:

```text
0..1
1..1
0..N
1..N
```

## 12.5 Ejemplo de OT

```text
SECTOR 1 ───── N ORDEN_TRABAJO

ORDEN_TRABAJO N ───── M OPERARIO
                    mediante ASIGNACION_OT
```

Entidades propuestas:

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

ASIGNACION_OT
- id_ot
- id_operario
- fecha_asignacion
- estado_asignacion
```

## 12.6 Pasaje inicial a tablas

### Entidad fuerte

Cada entidad fuerte suele transformarse en una tabla con clave primaria.

### Relación 1:N

La clave de la entidad del lado 1 se incorpora como FK en la tabla del lado N.

```text
SECTOR 1:N ORDEN_TRABAJO
→ ORDEN_TRABAJO.id_sector FK
```

### Relación N:M

Se crea una tabla asociativa con las claves de ambas entidades y atributos propios de la relación.

```text
ORDEN_TRABAJO N:M OPERARIO
→ ASIGNACION_OT(id_ot, id_operario, ...)
```

### Relación 1:1

Se decide dónde colocar la FK considerando participación, obligatoriedad y significado del dominio. No aplicar una regla automática sin analizar el caso.

### Entidad débil

La tabla resultante incluye la clave de la entidad propietaria y su identificación parcial según el modelo.

---

# 13. Ejercicio DER

Para el caso integrado:

1. identificar entidades;
2. listar atributos;
3. elegir identificadores;
4. nombrar relaciones con verbos;
5. definir cardinalidades mínimas y máximas cuando sea posible;
6. detectar relaciones con atributos propios;
7. convertir 1:N y N:M a tablas;
8. comprobar PK y FK;
9. explicar supuestos.

Control:

```text
No convertir inmediatamente cada sustantivo en tabla.
No confundir cardinalidad del DER con cantidad actual de filas.
No modelar una relación N:M con una sola FK.
No duplicar datos del lado 1 en cada entidad lógica antes de decidir el pasaje.
```

---

# 14. Bloque T2 — Java, evaluación y síntesis

## 14.1 Java — 20 minutos

Escribir sin copiar:

```java
class UsuarioSistema { ... }
class Encargado extends UsuarioSistema { ... }
class Operario extends UsuarioSistema { ... }
```

Debe contener:

- constructor de superclase;
- constructor de subclase con `super(...)`;
- `this` para un atributo específico;
- método sobrescrito con `@Override`;
- método sobrecargado o explicación precisa;
- miembro estático con uso justificado;
- `toString()` básico.

## 14.2 Evaluación

Resolver:

`EVALUACIONES/2026-08-12_EVALUACION-DIA-07.md`

Condiciones:

- sin apuntes;
- 50 minutos para el escrito;
- no corregir silenciosamente respuestas originales;
- defensa oral de 8 a 10 minutos;
- integrar las tres materias.

## 14.3 Síntesis

Prioridad:

1. guardar respuestas reales;
2. corregir evaluación;
3. registrar errores;
4. completar cierre;
5. actualizar estado canónico solo después de aprobar.

---

# 15. Criterio de aprobación

## Escrito

- equivalente a 7/10 o más;
- ningún bloque central omitido;
- `include` y `extend` correctamente diferenciados;
- constructor de subclase con `super`;
- DER con cardinalidades y pasaje coherente.

## Oral

- equivalente a 7/10 o más;
- debe definir, aplicar y justificar;
- debe relacionar caso de uso, jerarquía de clases y DER;
- debe corregir al menos una ambigüedad o supuesto del caso.

## Consolidación

`DO` se propone solamente para contenidos efectivamente defendidos, no para toda la asignatura.

---

# 16. Fuentes de la jornada

- `02-PLAN-MAESTRO-HASTA-03-09.md`.
- `Analisis_y_Diseno_de_Software.md`.
- `INF382_Programacion_Orientada_a_Objetos.md`.
- `Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md` como apoyo de herencia/sobrescritura.
- `INF387_Base_de_Datos_I_RESUMEN.md`.
- estado, resultados y errores acumulados hasta el Día 6.

No se incorporan fuentes externas como sustitución de los materiales universitarios.

---

# 17. Comando de inicio

> **Iniciar EFIP — 2026-08-12 — Día 7**
