# Resumen guiado del Día 5
## PUD, fundamentos de POO y modelo relacional

**Fecha de estudio:** lunes 10 de agosto de 2026  
**Materias:** Análisis y Diseño + Programación Orientada a Objetos + Base de Datos I  
**Propósito:** consolidar vocabulario académico, aplicarlo a un caso real y defenderlo sin apuntes.

---

# 1. Qué tenés que poder hacer al finalizar

1. Definir modelo y explicar por qué se utilizan varios modelos.
2. Diferenciar metodología, método, técnica y herramienta.
3. Explicar las tres características del PUD.
4. Diferenciar iteración e incremento.
5. Ubicar Inicio, Elaboración, Construcción y Transición.
6. Diferenciar clase y objeto.
7. Explicar estado, comportamiento e identidad.
8. Explicar atributos, métodos, constructor, `this` y encapsulamiento.
9. Escribir una clase Java breve y coherente.
10. Describir formalmente una relación.
11. Calcular grado y cardinalidad.
12. Diferenciar superclave, clave candidata, primaria y foránea.
13. Relacionar PUD, POO y persistencia en un mismo caso.

---

# 2. Recuperación de errores anteriores

Antes de estudiar, responder sin mirar.

## Tarjeta R1 — Arquitectura y documentación

```text
Arquitectura  = decisiones significativas sobre la organización técnica del sistema
Documentación = representación y comunicación de esas decisiones
```

## Tarjeta R2 — Construcción y Transición

```text
Construcción = desarrollo hasta obtener el producto completo
Transición   = beta, correcciones, capacitación, asistencia y puesta en marcha
```

## Tarjeta R3 — Estado y comportamiento

```text
Estado         = valores actuales de los atributos
Comportamiento = métodos u operaciones
```

## Tarjeta R4 — Identidad

La identidad permite distinguir un objeto de todos los demás, incluso cuando otro tenga valores semejantes. Un `id` puede representar esa identidad en persistencia, pero no es toda la definición.

## Tarjeta R5 — TDA

```text
TDA = datos + operaciones definidos mediante una interfaz,
      independientemente de la implementación
```

## Tarjeta R6 — Clave candidata

```text
Clave candidata = superclave mínima
```

## Tarjeta R7 — PDU

```text
PDU = datos del nivel superior + información de control del protocolo
```

## Tarjeta R8 — Puerto

```text
Puerto = identificador de un proceso o servicio de transporte dentro de un host
```

---

# PARTE I — ANÁLISIS Y DISEÑO

# 3. Modelo

## 3.1 Definición

Un modelo es una **simplificación de la realidad**. Para un nivel de abstracción determinado, incluye los elementos importantes y omite detalles que no resultan relevantes para el objetivo del observador.

Un modelo no es una copia total del sistema.

## 3.2 Para qué se modela

El material establece cuatro finalidades:

1. visualizar cómo es o cómo se desea que sea el sistema;
2. especificar su estructura o comportamiento;
3. obtener una guía para construir el programa;
4. documentar las decisiones adoptadas.

## 3.3 Perspectivas

Un modelo puede destacar:

- estructura;
- comportamiento;
- organización;
- dinámica;
- aspectos físicos;
- aspectos lógicos.

Ejemplo:

| Modelo | Pregunta que ayuda a responder |
|---|---|
| Casos de uso | ¿Qué resultado necesita cada actor? |
| Dominio | ¿Qué conceptos importantes existen? |
| Clases | ¿Qué estructura y comportamiento tendrá el software? |
| Secuencia | ¿Cómo colaboran los objetos? |
| Despliegue | ¿En qué nodos se ejecutan los componentes? |
| Datos | ¿Cómo se almacena persistentemente la información? |

## 3.4 Principios básicos

1. La elección de los modelos influye en cómo se comprende el problema y se da forma a la solución.
2. Un modelo puede expresarse con distintos niveles de precisión.
3. Los mejores modelos están ligados a la realidad.
4. Un sistema no trivial necesita varios modelos complementarios.

### Fórmula de examen

> Un modelo es una simplificación de la realidad que permite visualizar, especificar, construir y documentar un sistema desde una perspectiva y un nivel de detalle determinados.

---

# 4. Metodología, método, técnica y herramienta

| Concepto | Qué representa | Ejemplo general |
|---|---|---|
| Metodología | Camino sistemático que integra fases, tareas, reglas, técnicas, herramientas y productos | Organización completa del desarrollo |
| Método | Forma de construir técnicamente una parte del sistema | Método para analizar requisitos |
| Técnica | Procedimiento estructurado y repetible para una tarea concreta | Entrevista, prototipado, modelado |
| Herramienta | Soporte automatizado o semiautomatizado | Software CASE, IDE, modelador |

No son sinónimos.

```text
Metodología organiza el camino completo.
Método indica cómo abordar técnicamente.
Técnica ejecuta una tarea estructurada.
Herramienta brinda soporte.
```

---

# 5. Modelos de proceso — repaso controlado

| Modelo | Idea central | Resulta útil cuando | Riesgo o limitación |
|---|---|---|---|
| Cascada | Secuencia lineal de etapas | Los requisitos son estables | El producto funcional aparece tarde y los cambios cuestan |
| Incremental | Entregas sucesivas agregan funcionalidad | Se necesita valor temprano | Debe planificarse la integración |
| Prototipado | Representación rápida para aclarar requisitos | El usuario no puede precisar lo que necesita | Puede confundirse el prototipo con el producto |
| Espiral | Evolución iterativa con atención explícita a riesgos | El proyecto es complejo o riesgoso | Requiere gestión más compleja |

Este repaso no reemplaza el estudio completo de cada modelo; hoy sirve para ubicar al PUD dentro de una lógica iterativa e incremental.

---

# 6. Proceso Unificado de Desarrollo

## 6.1 Definición

El PUD es un proceso de desarrollo que organiza las actividades necesarias para transformar requisitos de los usuarios en un sistema de software. Utiliza UML para preparar y relacionar los modelos.

## 6.2 Tres características esenciales

```text
Dirigido por casos de uso
Centrado en la arquitectura
Iterativo e incremental
```

Las tres características se complementan.

---

# 7. Dirigido por casos de uso

Un caso de uso representa un fragmento de funcionalidad que proporciona un resultado de valor a un actor.

Los casos de uso:

- representan requisitos funcionales;
- guían el análisis;
- guían el diseño;
- orientan la implementación;
- proporcionan base para las pruebas.

Por eso se dice que constituyen el **hilo conductor**.

```text
Caso de uso
    ↓
Análisis
    ↓
Diseño
    ↓
Implementación
    ↓
Prueba
```

### Ejemplo

Caso:

```text
Programar orden de trabajo
```

Puede conducir a:

- conceptos del dominio;
- clases;
- operaciones;
- interfaces;
- tablas;
- componentes;
- pruebas de aceptación.

### Respuesta oral

> El PUD está dirigido por casos de uso porque estos representan funciones de valor para los actores y guían los principales flujos del desarrollo, desde los requisitos hasta las pruebas.

---

# 8. Centrado en la arquitectura

## 8.1 Qué comprende

La arquitectura reúne decisiones significativas sobre:

- organización del sistema;
- elementos estructurales;
- interfaces;
- colaboraciones;
- subsistemas;
- plataforma;
- base de datos;
- comunicaciones;
- implantación;
- requisitos no funcionales.

## 8.2 Función y forma

```text
Casos de uso = función
Arquitectura = forma
```

Los casos de uso deben poder realizarse dentro de la arquitectura y la arquitectura debe permitir el desarrollo de los casos requeridos.

## 8.3 No confundir

```text
Arquitectura  ≠ documentación
Arquitectura  = decisiones técnicas y estructurales
Documentación = artefactos que las representan
```

### Ejemplo

Requisito:

```text
Un operario debe consultar una OT desde un dispositivo móvil.
```

Posibles decisiones arquitectónicas:

- cliente web o móvil;
- API;
- servidor de aplicación;
- base de datos;
- autenticación;
- conectividad.

---

# 9. Iterativo e incremental

## 9.1 Iteración

Es un miniproyecto planificado. En una iteración se recorren actividades de:

- requisitos;
- análisis;
- diseño;
- implementación;
- prueba.

Se seleccionan casos de uso y riesgos importantes.

## 9.2 Incremento

Es el crecimiento verificable del producto que deja la iteración.

```text
Iteración = trabajo ejecutado
Incremento = resultado que hace crecer el producto
```

## 9.3 Ejemplo

```text
Iteración 1:
analizar, diseñar, implementar y probar “Crear OT”.

Incremento:
versión ejecutable que permite crear una OT.
```

Una iteración que no alcanza sus objetivos debe revisarse; no se considera exitosa solo porque transcurrió tiempo.

---

# 10. Fases del PUD

| Fase | Preguntas y productos dominantes |
|---|---|
| Inicio | Alcance, viabilidad, funciones principales, riesgos, arquitectura preliminar y plan |
| Elaboración | Casos importantes detallados, riesgos principales tratados y línea base arquitectónica |
| Construcción | Crecimiento de la arquitectura hasta obtener el sistema completo |
| Transición | Beta, retroalimentación, correcciones, capacitación, asistencia y puesta en marcha |

Las fases no equivalen a los flujos. Dentro de una fase puede haber varias iteraciones y en cada iteración pueden aparecer requisitos, análisis, diseño, implementación y prueba con distinta intensidad.

---

# PARTE II — PROGRAMACIÓN ORIENTADA A OBJETOS

# 11. Paradigma orientado a objetos

La POO organiza el problema mediante objetos que:

- poseen atributos;
- ofrecen métodos;
- tienen identidad;
- colaboran mediante mensajes;
- representan entidades reales o abstractas del dominio.

Su propósito incluye favorecer:

- organización;
- reutilización;
- modularidad;
- mantenimiento;
- protección de la información interna.

---

# 12. Objeto

Un objeto representa una entidad real o abstracta con una función dentro del dominio.

Todo objeto posee:

1. estado;
2. comportamiento;
3. identidad.

## 12.1 Estado

Es el conjunto de valores actuales de los atributos.

Ejemplo:

```text
numero      = 105
descripcion = "Reparar acometida"
estado      = "PENDIENTE"
```

## 12.2 Comportamiento

Son las operaciones o métodos.

Ejemplo:

```text
cambiarEstado()
asignarSector()
mostrarDatos()
```

## 12.3 Identidad

Distingue un objeto de otro.

Dos órdenes podrían tener el mismo estado y la misma descripción y continuar siendo objetos diferentes.

---

# 13. Clase

Una clase es una plantilla a partir de la cual se crean objetos mediante instanciación. También puede comprenderse como la definición de un tipo de dato construido por el programador.

Una clase especifica:

- atributos;
- métodos;
- constructores;
- reglas de acceso;
- responsabilidades.

```text
Clase  → definición común
Objeto → instancia concreta
```

---

# 14. Atributos y métodos

## Atributo

Dato o propiedad que describe el rango de valores que pueden asumir los objetos.

## Método

Operación que representa comportamiento y permite:

- consultar el estado;
- modificar el estado;
- enviar o recibir información;
- colaborar con otros objetos.

No todos los métodos cambian el estado. Un método de consulta puede devolver información sin modificarla.

---

# 15. Constructor e instanciación

El constructor:

- tiene el mismo nombre de la clase;
- se utiliza al crear el objeto;
- inicializa los atributos;
- no declara tipo de retorno.

```java
OrdenTrabajo ot = new OrdenTrabajo(105, "Reparar acometida");
```

En esa línea:

```text
OrdenTrabajo                 = tipo/clase
ot                           = variable de referencia
new                          = creación
OrdenTrabajo(...)            = constructor
```

Si no se define ningún constructor explícito, Java proporciona un constructor por defecto sin parámetros.

---

# 16. `this`

`this` referencia al objeto actual.

```java
public OrdenTrabajo(int numero, String descripcion) {
    this.numero = numero;
    this.descripcion = descripcion;
}
```

Permite distinguir:

```text
this.numero = atributo del objeto
numero      = parámetro recibido
```

---

# 17. Encapsulamiento

El encapsulamiento separa:

- la interfaz visible del objeto;
- su implementación interna.

Habitualmente:

```text
atributos privados
métodos públicos controlados
```

Ventajas:

- evita acceso no deseado;
- protege invariantes;
- reduce acoplamiento;
- permite cambiar la implementación sin afectar a los clientes mientras la interfaz se conserve.

## Encapsulamiento y abstracción

Son complementarios:

```text
Abstracción     = qué características y comportamiento esenciales se muestran
Encapsulamiento = cómo se oculta y protege la implementación interna
```

Hoy se profundiza encapsulamiento. La abstracción completa se trabajará en una jornada posterior.

---

# 18. Modificadores de acceso

| Modificador | Alcance general según el material |
|---|---|
| `public` | Accesible desde cualquier clase |
| `private` | Accesible únicamente desde la propia clase |
| `protected` | Propia clase, clases del paquete y subclases conforme a las reglas de Java |
| sin modificador | Acceso dentro del paquete |

La visibilidad no es el estado del objeto.

```text
Estado      = qué valores tiene
Visibilidad = quién puede acceder
```

---

# 19. Ejemplo Java integrado

```java
public class OrdenTrabajo {
    private int numero;
    private String descripcion;
    private String estado;

    public OrdenTrabajo(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.estado = "PENDIENTE";
    }

    public int getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public boolean estaPendiente() {
        return "PENDIENTE".equals(estado);
    }
}
```

## Lectura académica

- La clase define un tipo `OrdenTrabajo`.
- Los atributos representan estado.
- El constructor inicializa el objeto.
- `this` referencia el objeto actual.
- Los atributos son `private`.
- Los métodos públicos forman parte de la interfaz.
- `cambiarEstado()` representa comportamiento modificador.
- `getEstado()` representa comportamiento selector.
- `estaPendiente()` consulta sin modificar el estado.

---

# 20. Lista de control de sintaxis Java

- [ ] `public`, `private`, `class`, `return` y `this` en minúsculas.
- [ ] Nombre de clase con mayúscula inicial.
- [ ] Constructor con el mismo nombre de la clase.
- [ ] Sin tipo de retorno en el constructor.
- [ ] `String` con mayúscula.
- [ ] Cadenas con comillas dobles.
- [ ] Punto y coma.
- [ ] Llaves balanceadas.
- [ ] Tipo de retorno coherente.
- [ ] `.equals(...)` para comparar contenido de cadenas.

---

# PARTE III — BASE DE DATOS

# 21. Relación y estructura tabular

Una relación es una representación bidimensional constituida por filas y columnas. En el diseño relacional, las relaciones representan entidades modeladas y sus atributos se asocian a dominios.

## Componentes

| Concepto | Definición |
|---|---|
| Relación | Tabla del modelo relacional |
| Cabecera | Conjunto de atributos |
| Cuerpo | Conjunto de tuplas |
| Tupla | Fila que representa un hecho o instancia |
| Atributo | Columna o propiedad |
| Dato | Unidad almacenada en la intersección fila-columna |
| Dominio | Conjunto de valores posibles o permitidos |
| Grado | Cantidad de atributos |
| Cardinalidad | Cantidad de tuplas |

## Regla mnemotécnica

```text
Grado        cuenta columnas
Cardinalidad cuenta filas
```

---

# 22. Dominio

El dominio no es solamente el nombre de un tipo técnico. Comprende el conjunto de valores válidos para un atributo y las restricciones asociadas.

Ejemplos:

```text
prioridad = {BAJA, MEDIA, ALTA}
numero_ot = enteros positivos
estado    = conjunto de estados permitidos
```

Un dominio incorrecto puede permitir datos que no representan la realidad del problema.

---

# 23. Claves

## 23.1 Superclave

Conjunto de uno o más atributos que identifica unívocamente una tupla.

## 23.2 Clave candidata

Superclave mínima. Si se quita alguno de sus atributos, deja de identificar unívocamente.

## 23.3 Clave primaria

Clave candidata elegida como identificación principal de la relación.

## 23.4 Clave foránea

Atributo o conjunto de atributos que referencia una clave de otra relación y permite representar el vínculo entre ambas.

### Respuesta completa

> `id_sector` es una clave foránea de `ORDEN_TRABAJO` porque referencia una clave de la relación `SECTOR`.

No alcanza con decir “relaciona tablas”.

---

# 24. Ejercicio resuelto

Relación:

```text
ORDEN_TRABAJO(
    id_ot,
    descripcion,
    prioridad,
    estado,
    id_sector
)
```

Suposición: 250 tuplas.

| Pregunta | Respuesta |
|---|---|
| Relación | `ORDEN_TRABAJO` |
| Cabecera | Los cinco atributos declarados |
| Cuerpo | Las 250 tuplas |
| Grado | 5 |
| Cardinalidad | 250 |
| Primaria probable | `id_ot` |
| Foránea probable | `id_sector` |
| Relación referenciada | `SECTOR` |

Tupla de ejemplo:

```text
(105, "Reparar acometida", "ALTA", "PENDIENTE", 3)
```

La validez depende de que cada valor pertenezca al dominio de su atributo y de que las restricciones de claves se cumplan.

---

# 25. POO en memoria y relación persistente

No confundir:

```text
Objeto Java       = instancia en memoria durante la ejecución
Tupla relacional  = hecho almacenado persistentemente en una relación
```

Pueden representar el mismo concepto del dominio, pero pertenecen a modelos distintos.

Ejemplo:

```text
Objeto OrdenTrabajo en memoria
              ↓ persistencia
Tupla de ORDEN_TRABAJO en la base
```

La correspondencia no significa que objeto y fila sean idénticos en todos sus detalles.

---

# PARTE IV — INTEGRACIÓN

# 26. Caso breve: programar una orden de trabajo

## PUD

Caso de uso significativo:

```text
Programar orden de trabajo
```

La iteración selecciona ese caso y trata sus riesgos. El incremento esperado es una versión verificable que permita programarla.

## POO

Clase principal:

```text
OrdenTrabajo
```

Estado:

```text
numero, descripcion, prioridad, estado
```

Comportamiento:

```text
programar(), cambiarPrioridad(), cambiarEstado()
```

## Modelo relacional

Relaciones posibles:

```text
ORDEN_TRABAJO
SECTOR
```

La clave foránea representa el vínculo correspondiente.

## Integración oral

> El caso de uso guía el desarrollo; la arquitectura define la forma técnica; la clase modela estructura y comportamiento en el software; y la relación conserva persistentemente los datos. Son modelos conectados, pero no equivalentes.

---

# 27. Veinte preguntas de recuperación

Responder en una oración y sin apuntes.

1. ¿Qué es un modelo?
2. ¿Cuáles son sus cuatro finalidades?
3. ¿Por qué un sistema no trivial necesita varios modelos?
4. ¿Qué diferencia existe entre metodología y método?
5. ¿Qué diferencia existe entre técnica y herramienta?
6. ¿Cuáles son las tres características del PUD?
7. ¿Por qué los casos de uso son el hilo conductor?
8. ¿Qué comprende la arquitectura?
9. ¿Qué diferencia existe entre arquitectura y documentación?
10. ¿Qué diferencia existe entre iteración e incremento?
11. ¿Qué diferencia existe entre clase y objeto?
12. ¿Qué forman el estado, el comportamiento y la identidad?
13. ¿Qué hace un constructor?
14. ¿Para qué se usa `this`?
15. ¿Qué protege el encapsulamiento?
16. ¿Qué diferencia existe entre relación, tupla y atributo?
17. ¿Qué diferencia existe entre grado y cardinalidad?
18. ¿Qué es un dominio?
19. ¿Qué diferencia existe entre clave candidata y primaria?
20. ¿Qué debe indicarse para definir completamente una clave foránea?

## Recuperación adicional de días anteriores

- ¿Qué es un TDA?
- ¿Qué diferencia existe entre sobrecarga y sobrescritura?
- ¿Qué es una PDU?
- ¿Qué identifica un puerto?
- ¿Qué diferencia existe entre transmisión síncrona y asíncrona?

Estas cinco no abren contenido nuevo; verifican retención.

---

# 28. Respuestas orales modelo

## PUD — 60 a 90 segundos

> El PUD es un proceso de desarrollo que transforma requisitos en un sistema de software y utiliza UML para representar sus modelos. Está dirigido por casos de uso, porque guían requisitos, análisis, diseño, implementación y prueba; centrado en la arquitectura, porque organiza las decisiones técnicas significativas; e iterativo e incremental, porque el trabajo se divide en miniproyectos que producen crecimiento verificable del producto.

## POO — 60 a 90 segundos

> Una clase define la estructura y el comportamiento común de un conjunto de objetos, mientras que un objeto es una instancia concreta. Su estado está formado por los valores de sus atributos, su comportamiento por los métodos y su identidad lo diferencia de los demás. El constructor inicializa el objeto y el encapsulamiento protege su implementación mediante acceso controlado.

## Modelo relacional — 60 a 90 segundos

> Una relación es una estructura tabular compuesta por una cabecera de atributos y un cuerpo de tuplas. El grado es la cantidad de atributos y la cardinalidad la cantidad de tuplas. Cada atributo posee un dominio. Una clave candidata es una superclave mínima, la primaria es la candidata elegida y la foránea referencia una clave de otra relación.

---

# 29. Errores que no deben repetirse

```text
Arquitectura ≠ documentación
Iteración ≠ incremento
Estado ≠ comportamiento
Identidad ≠ simplemente un ID
Constructor ≠ método con retorno
Encapsulamiento ≠ ocultar todo sin interfaz
Grado ≠ cardinalidad
Dominio ≠ solamente tipo de dato
Candidata = superclave mínima
Foránea referencia una clave de otra relación
```

---

# 30. Fuentes utilizadas

- Material de Análisis y Diseño de Software:
  - modelos;
  - metodologías;
  - PUD;
  - arquitectura;
  - iteraciones, incrementos y fases.
- Material de Programación Orientada a Objetos:
  - objetos;
  - clases;
  - estado, comportamiento e identidad;
  - constructores;
  - encapsulamiento;
  - modificadores.
- Material de Base de Datos I:
  - estructura tabular;
  - dominios;
  - grado;
  - cardinalidad;
  - claves.
- Documentación de seguimiento de los Días 1 a 4.

Cuando una formulación se simplifica para estudiar, conserva el sentido y la terminología principal de las fuentes. No se sustituye el material universitario por contenido externo.
