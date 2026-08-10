# Resumen guiado del Día 3
## Tipos de datos abstractos, arreglos, nodos, listas y modelo relacional

**Fecha:** viernes 7 de agosto de 2026  
**Materias:** Taller de Algoritmos y Estructuras de Datos I + Base de Datos I  
**Duración prevista:** 2 horas y 30 minutos  
**Objetivo:** comprender cómo se organiza la información en memoria y cómo se representa de manera persistente en una base de datos relacional.

---

# 1. Qué tenés que poder explicar al terminar

Al finalizar el Día 3 deberías poder responder sin mirar:

1. ¿Qué es un tipo de dato abstracto?
2. ¿Qué diferencia existe entre una interfaz de operaciones y su implementación?
3. ¿Qué diferencia existe entre una estructura estática y una dinámica?
4. ¿Qué es un arreglo y cómo se accede a sus elementos?
5. ¿Qué diferencia existe entre capacidad y longitud utilizada?
6. ¿Qué es un nodo?
7. ¿Cómo se forma una lista simplemente enlazada?
8. ¿Cuándo elegir un arreglo y cuándo una lista enlazada?
9. ¿Qué es una relación dentro del modelo relacional?
10. ¿Qué son tupla, atributo, dominio, cabecera, cuerpo y dato?
11. ¿Qué diferencia existe entre grado y cardinalidad?
12. ¿Qué son superclave, clave candidata, clave primaria y clave foránea?
13. ¿Qué diferencia existe entre una relación —tabla— y una relación entre entidades?
14. ¿Cómo se conectan las estructuras en memoria con las tablas persistentes?

El programa oficial incluye pilas y colas implementadas con vectores y listas enlazadas, listas, ordenación, modelo relacional, sus componentes y reglas, DER, normalización y SQL. El Día 3 construye la base terminológica necesaria para esos temas posteriores.

---

# PARTE I — ALGORITMOS Y ESTRUCTURAS DE DATOS

# 2. Qué es una estructura de datos

Una estructura de datos es una forma de organizar datos relacionados para poder almacenarlos, consultarlos y modificarlos mediante determinadas operaciones.

No basta con conocer los valores. También importa:

- cómo se organizan;
- cómo se accede a ellos;
- qué operaciones se permiten;
- cómo cambia su tamaño;
- qué relación existe entre sus elementos.

Ejemplos:

- arreglo;
- lista enlazada;
- pila;
- cola;
- árbol;
- grafo.

En el material, una estructura se presenta como un tipo de dato que agrupa bajo un mismo nombre elementos relacionados. Cada elemento puede representar una parte o propiedad de la entidad modelada.

---

# 3. Tipo de Dato Abstracto — TDA

## 3.1 Definición

Un **Tipo de Dato Abstracto** es un conjunto de datos u objetos asociado a un conjunto de operaciones permitidas.

La característica central es que ofrece una **interfaz** y oculta la forma concreta en que esas operaciones están implementadas.

```text
TDA = qué datos representa + qué operaciones permite
Implementación = cómo se realizan internamente esas operaciones
```

## 3.2 Ejemplo: pila

Como TDA, una pila puede definir:

```text
push(elemento)
pop()
peek()
esVacia()
longitud()
```

El usuario de la pila necesita saber qué hace cada operación, pero no necesariamente si internamente se utiliza:

- un arreglo;
- una lista enlazada.

## 3.3 Por qué se llama abstracto

Se abstrae de la implementación.

Una misma interfaz puede tener varias implementaciones:

```text
TDA Pila
   ├── implementación con arreglo
   └── implementación con lista enlazada
```

## 3.4 Relación con encapsulamiento

El TDA y el encapsulamiento se relacionan porque ambos permiten utilizar una estructura a través de operaciones conocidas sin depender de sus detalles internos.

Ejemplo:

```java
public interface Pila {
    void push(Object elemento);
    Object pop();
    boolean esVacia();
}
```

Quien usa `Pila` conoce el contrato. La clase concreta decide cómo almacenar los elementos.

## 3.5 Respuesta oral modelo

> Un TDA es un conjunto de datos y operaciones definido por su interfaz, independientemente de cómo se implementa. Por ejemplo, una pila ofrece operaciones como apilar y desapilar, y puede implementarse con un arreglo o con una lista enlazada sin cambiar el comportamiento esperado por quien la utiliza.

---

# 4. Estructuras estáticas y dinámicas

## 4.1 Estructura estática

En una estructura estática, el tamaño o capacidad se define antes o al momento de crearla y no cambia automáticamente durante la ejecución.

Ejemplo típico del material:

```text
arreglo o vector
```

En Java:

```java
OrdenTrabajo[] ordenes = new OrdenTrabajo[100];
```

La capacidad es 100 posiciones.

## 4.2 Estructura dinámica

Una estructura dinámica puede crecer o reducirse durante la ejecución mediante elementos enlazados, mientras exista memoria disponible.

Ejemplos:

- lista enlazada;
- pila enlazada;
- cola enlazada;
- árbol;
- grafo.

El material utiliza el término **puntero** para describir el enlace entre elementos. En Java, este vínculo se representa mediante **referencias a objetos**.

## 4.3 Diferencia principal

```text
Estática = capacidad definida
Dinámica = cantidad de elementos variable durante la ejecución
```

## 4.4 No confundir

Una estructura dinámica no significa que sea infinita. Su tamaño sigue limitado por la memoria disponible.

Tampoco significa que siempre sea mejor. La elección depende del problema y de las operaciones que se realizan con más frecuencia.

---

# 5. Arreglos o arrays

## 5.1 Definición

Un arreglo es un conjunto de elementos del mismo tipo. Cada elemento se identifica mediante:

- el nombre del arreglo;
- un índice o subíndice.

Ejemplo:

```java
int[] consumos = new int[12];
```

Cada elemento se accede por una posición:

```java
consumos[0]
consumos[1]
consumos[2]
```

En Java, el primer índice es `0`.

## 5.2 El arreglo es un objeto

El material aclara que en Java los arreglos son objetos y que la variable conserva una referencia al objeto arreglo en memoria.

```java
OrdenTrabajo[] ordenes = new OrdenTrabajo[50];
```

Esto crea un arreglo capaz de guardar hasta 50 referencias a objetos `OrdenTrabajo`.

No crea automáticamente las 50 órdenes.

Por ejemplo:

```java
ordenes[0] = new OrdenTrabajo(...);
```

recién crea una orden concreta y guarda su referencia en la posición 0.

## 5.3 Índice

El índice indica la posición relativa del elemento dentro del conjunto.

```text
Índice:      0       1       2       3
Elemento:   OT10    OT11    OT12    OT13
```

El acceso por índice es directo: si se conoce la posición, se accede al elemento sin recorrer todos los anteriores.

## 5.4 Capacidad y longitud utilizada

El material distingue:

- **capacidad:** máximo de posiciones disponibles;
- **longitud utilizada:** cantidad de posiciones que contienen elementos válidos.

Ejemplo:

```text
capacidad = 10
longitud utilizada = 3
```

Representación:

```text
[OT1][OT2][OT3][ ][ ][ ][ ][ ][ ][ ]
```

En Java, `array.length` informa la cantidad total de posiciones creadas. Si se administra manualmente cuántas están ocupadas, suele utilizarse otra variable, por ejemplo `cantidad`.

```java
OrdenTrabajo[] ordenes = new OrdenTrabajo[10];
int cantidad = 3;
```

## 5.5 Operaciones frecuentes

- recorrer;
- buscar;
- agregar al final si hay espacio;
- insertar desplazando elementos;
- eliminar desplazando elementos;
- ordenar.

## 5.6 Ventajas

- acceso directo mediante índice;
- estructura sencilla;
- útil cuando se conoce o limita la capacidad;
- apropiado para datos homogéneos.

## 5.7 Limitaciones

- la capacidad se fija al crearlo;
- insertar o eliminar en posiciones intermedias puede requerir desplazamientos;
- puede quedar capacidad sin utilizar;
- si se llena, hay que crear una estructura mayor o impedir nuevas inserciones.

## 5.8 Cuándo usarlo

Conviene cuando:

- se conoce la cantidad máxima;
- se necesita acceso por posición;
- los cambios de tamaño no son frecuentes;
- se procesan datos homogéneos.

Ejemplo:

```text
Consumos de los 12 meses del año
```

La cantidad de posiciones es conocida y estable.

---

# 6. Nodo

## 6.1 Definición

Un nodo es un elemento que contiene:

1. información o dato;
2. una o más referencias a otros nodos.

En una lista simplemente enlazada, un nodo suele contener:

```text
dato
siguiente
```

## 6.2 Ejemplo Java

```java
public class Nodo {

    private OrdenTrabajo dato;
    private Nodo siguiente;

    public Nodo(OrdenTrabajo dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
```

El atributo:

```java
private Nodo siguiente;
```

permite que un objeto `Nodo` conserve una referencia a otro objeto de la misma clase.

## 6.3 Nodo final

El último nodo no tiene sucesor:

```text
siguiente = null
```

Representación:

```text
[dato | siguiente] → [dato | siguiente] → [dato | null]
```

---

# 7. Lista simplemente enlazada

## 7.1 Definición

Una lista enlazada es una estructura dinámica lineal formada por nodos relacionados mediante referencias.

Una lista simple suele conservar una referencia al primer nodo:

```text
cabeza
```

Ejemplo:

```text
cabeza
  ↓
[A | •] → [B | •] → [C | null]
```

## 7.2 Partes

- **cabeza o inicio:** referencia al primer nodo;
- **dato:** información del nodo;
- **siguiente:** referencia al próximo nodo;
- **null:** indica el final.

## 7.3 Lista vacía

```text
cabeza = null
```

## 7.4 Recorrido

Para llegar al nodo C, hay que recorrer:

```text
A → B → C
```

No existe un índice directo equivalente al de un arreglo simple.

Pseudocódigo:

```text
actual = cabeza
mientras actual != null
    procesar actual.dato
    actual = actual.siguiente
fin mientras
```

## 7.5 Insertar al inicio

Lista original:

```text
cabeza → A → B → C → null
```

Se desea insertar X.

Pasos:

```text
1. crear X
2. X.siguiente = cabeza
3. cabeza = X
```

Resultado:

```text
cabeza → X → A → B → C → null
```

El orden de las asignaciones importa. Si primero se cambia `cabeza` y no se conserva la referencia anterior, puede perderse el resto de la lista.

## 7.6 Ejemplo Java simplificado

```java
public void insertarInicio(OrdenTrabajo orden) {
    Nodo nuevo = new Nodo(orden);
    nuevo.setSiguiente(cabeza);
    cabeza = nuevo;
}
```

## 7.7 Ventajas

- tamaño variable durante la ejecución;
- no necesita una capacidad máxima fijada inicialmente;
- insertar al inicio requiere modificar pocas referencias;
- no es necesario desplazar todos los elementos.

## 7.8 Limitaciones

- no posee acceso directo por índice;
- para buscar una posición suele ser necesario recorrer nodos;
- cada nodo necesita espacio adicional para la referencia;
- una referencia incorrecta puede cortar o perder parte de la lista.

## 7.9 Variantes que se estudiarán más adelante

- lista doblemente enlazada;
- lista circular;
- lista ordenada;
- iteradores.

En el Día 3 solo se necesita dominar la lista simple y su comparación con un arreglo.

---

# 8. Arreglo frente a lista enlazada

| Criterio | Arreglo | Lista enlazada |
|---|---|---|
| Tamaño | Capacidad definida | Variable durante la ejecución |
| Acceso | Directo por índice | Secuencial por referencias |
| Inserción al inicio/medio | Puede requerir desplazamientos | Cambia referencias |
| Memoria adicional | Elementos/posiciones | Cada nodo agrega enlaces |
| Orden físico/lógico | Posiciones indexadas | Orden definido por enlaces |
| Capacidad conocida | Muy apropiado | No es requisito |
| Búsqueda por posición | Directa | Requiere recorrido |

## 8.1 Regla para elegir

No elegir por costumbre. Preguntar:

1. ¿Conozco la cantidad máxima?
2. ¿Necesito acceder por posición?
3. ¿Voy a insertar o eliminar con frecuencia?
4. ¿La colección cambia mucho de tamaño?
5. ¿Necesito mantener un orden mediante enlaces?

## 8.2 Ejemplos

### Arreglo

```text
12 consumos mensuales
```

- cantidad conocida;
- acceso por mes;
- tamaño estable.

### Lista enlazada

```text
actividades agregadas dinámicamente a una OT
```

- cantidad variable;
- inserciones durante la ejecución;
- recorrido secuencial aceptable.

### Órdenes pendientes por prioridad

Un arreglo permite guardar y ordenar, pero no necesariamente mantiene automáticamente la regla de prioridad.

Podría evaluarse:

- arreglo ordenado;
- lista ordenada;
- cola de prioridad.

La elección debe justificarse según las operaciones del problema.

---

# PARTE II — BASE DE DATOS RELACIONALES

# 9. Modelo relacional

## 9.1 Idea central

El modelo relacional organiza los datos mediante relaciones representadas en forma tabular.

Una base relacional está formada por un conjunto de tablas relacionadas mediante valores y restricciones.

Ejemplo:

```text
ORDEN_TRABAJO
OPERARIO
SECTOR
ASIGNACION
```

## 9.2 Entidad y relación

En el análisis del dominio puede identificarse una entidad:

```text
OrdenTrabajo
```

Al trasladarla al modelo relacional, normalmente se representa mediante una relación o tabla:

```text
ORDEN_TRABAJO
```

No deben confundirse:

- **entidad:** concepto del dominio;
- **relación:** estructura tabular del modelo relacional;
- **relación entre entidades:** asociación, por ejemplo un operario es asignado a una OT.

La palabra “relación” puede aparecer en contextos distintos. En este bloque, cuando se habla de **relación del modelo relacional**, se refiere a la tabla.

---

# 10. Componentes de una relación

Usaremos este ejemplo:

```text
ORDEN_TRABAJO
+-------+-------------------+------------+-----------+
| id_ot | descripcion       | prioridad  | estado    |
+-------+-------------------+------------+-----------+
| 101   | Cambiar poste     | ALTA       | PENDIENTE |
| 102   | Reparar luminaria | MEDIA      | DESPACHADA|
| 103   | Revisar medidor   | BAJA       | PENDIENTE |
+-------+-------------------+------------+-----------+
```

## 10.1 Relación

Es la estructura completa:

```text
ORDEN_TRABAJO
```

Está constituida por filas y columnas y debe cumplir las reglas del modelo relacional.

## 10.2 Tupla

Es una fila de la relación.

Ejemplo:

```text
(101, Cambiar poste, ALTA, PENDIENTE)
```

Representa una ocurrencia concreta.

## 10.3 Atributo

Es una columna o propiedad.

Ejemplos:

```text
id_ot
descripcion
prioridad
estado
```

## 10.4 Cabecera

Es el conjunto de atributos de la relación:

```text
{id_ot, descripcion, prioridad, estado}
```

## 10.5 Cuerpo

Es el conjunto de tuplas almacenadas en un momento determinado.

En el ejemplo, el cuerpo contiene tres tuplas.

## 10.6 Dato

Es el valor almacenado en la intersección de una fila y una columna.

Ejemplo:

```text
ALTA
```

es un dato del atributo `prioridad` para la OT 101.

## 10.7 Dominio

Es el conjunto de valores posibles para un atributo.

Ejemplos:

```text
prioridad ∈ {BAJA, MEDIA, ALTA}

estado ∈ {
    PENDIENTE,
    DESPACHADA,
    EN_EJECUCION,
    EJECUTADA,
    ANULADA
}

id_ot ∈ enteros positivos
```

El dominio no es solo el tipo técnico. También puede incluir reglas sobre valores válidos.

---

# 11. Grado y cardinalidad

## 11.1 Grado

El grado es la cantidad de atributos o columnas de una relación.

En:

```text
ORDEN_TRABAJO(id_ot, descripcion, prioridad, estado)
```

el grado es:

```text
4
```

El material señala que el grado es relativamente estático: cambia cuando se modifica la estructura de la relación.

## 11.2 Cardinalidad

La cardinalidad es la cantidad de tuplas o filas existentes en la relación.

En el ejemplo hay tres OT:

```text
cardinalidad = 3
```

Es dinámica porque cambia al insertar o eliminar filas.

## 11.3 Fórmula mental

```text
Grado        = columnas
Cardinalidad = filas
```

## 11.4 No confundir con cardinalidad de una asociación

En un DER también se habla de cardinalidad para expresar cuántas entidades pueden relacionarse:

```text
1 : N
```

En una tabla, cardinalidad también se usa para la cantidad de filas.

El contexto indica cuál de los dos sentidos se está utilizando.

---

# 12. Claves

Las claves permiten identificar filas y relacionar tablas.

## 12.1 Superclave

Una superclave es un conjunto de uno o más atributos que identifica de forma única una tupla.

Ejemplo:

```text
{id_ot}
```

puede identificar una OT.

También:

```text
{id_ot, descripcion}
```

identificaría de forma única, pero incluye un atributo innecesario. Por eso es una superclave, aunque no sea mínima.

## 12.2 Clave candidata

Es una superclave mínima: identifica unívocamente sin atributos sobrantes.

Una relación puede tener varias claves candidatas.

Ejemplo hipotético:

```text
id_ot
codigo_visible
```

si ambos fueran únicos, podrían ser claves candidatas.

## 12.3 Clave primaria

Es la clave candidata elegida para identificar oficialmente cada tupla.

Ejemplo:

```text
id_ot
```

Propiedades esperadas:

- única;
- no nula;
- estable;
- mínima.

## 12.4 Clave foránea

Es un atributo o conjunto de atributos que referencia una clave de otra relación.

Ejemplo:

```text
ORDEN_TRABAJO(
    id_ot,
    descripcion,
    id_sector
)

SECTOR(
    id_sector,
    nombre
)
```

`ORDEN_TRABAJO.id_sector` es clave foránea hacia `SECTOR.id_sector`.

## 12.5 Qué permite la clave foránea

- vincular datos;
- representar relaciones;
- controlar integridad referencial;
- evitar referencias a entidades inexistentes.

## 12.6 Regla del lado “muchos”

En una relación 1:N, la clave foránea suele ubicarse en la tabla del lado N.

Ejemplo:

```text
Un SECTOR tiene muchas OT.
Cada OT pertenece a un SECTOR.
```

Entonces:

```text
ORDEN_TRABAJO.id_sector
```

contiene la clave foránea.

---

# 13. Ejemplo relacional completo

## 13.1 Relaciones

```text
SECTOR(
    id_sector,
    nombre
)

ORDEN_TRABAJO(
    id_ot,
    descripcion,
    prioridad,
    estado,
    id_sector
)
```

## 13.2 Claves

```text
SECTOR.id_sector
    → clave primaria

ORDEN_TRABAJO.id_ot
    → clave primaria

ORDEN_TRABAJO.id_sector
    → clave foránea
```

## 13.3 Grado

```text
SECTOR: 2
ORDEN_TRABAJO: 5
```

## 13.4 Cardinalidad hipotética

```text
SECTOR: 4 filas
ORDEN_TRABAJO: 800 filas
```

## 13.5 Dominios

```text
id_sector: entero positivo
nombre: cadena no vacía
prioridad: BAJA, MEDIA o ALTA
estado: conjunto de estados permitidos
```

---

# 14. Clase POO y relación de base de datos

Una clase y una tabla pueden parecerse, pero no son lo mismo.

## 14.1 Clase

Define:

- estado;
- comportamiento;
- identidad;
- relaciones;
- reglas del objeto en ejecución.

```java
class OrdenTrabajo {
    private int id;
    private String estado;

    public void iniciar() {
        // comportamiento
    }
}
```

## 14.2 Relación

Define una estructura persistente de filas y columnas.

```text
ORDEN_TRABAJO(id_ot, estado)
```

No contiene por sí sola el comportamiento `iniciar()` como lo hace el objeto.

## 14.3 Correspondencia aproximada

```text
Clase       ↔ concepto de objetos en la aplicación
Objeto      ↔ instancia en memoria
Relación    ↔ tabla persistente
Tupla       ↔ fila persistente
Atributo    ↔ columna
```

Esta correspondencia ayuda a diseñar, pero no significa que clase y tabla sean idénticas.

---

# 15. Estructuras en memoria y base de datos

Un sistema suele trabajar en dos niveles:

## Nivel 1 — Persistencia

La base de datos conserva las OT aunque el programa se cierre.

```text
ORDEN_TRABAJO
```

## Nivel 2 — Ejecución

La aplicación consulta filas, crea objetos y los organiza temporalmente en estructuras.

```text
Base de datos
    ↓ consulta
Objetos OrdenTrabajo
    ↓ organización en memoria
Arreglo / lista / cola
```

## Ejemplo

1. SQL obtiene las órdenes pendientes.
2. La aplicación crea objetos `OrdenTrabajo`.
3. Los objetos se almacenan temporalmente en una colección.
4. La interfaz los muestra u ordena.
5. Las modificaciones válidas se persisten en la base.

## Importante

La base de datos y la estructura en memoria resuelven problemas diferentes:

```text
Base relacional = persistencia y consulta
Estructura de datos = organización durante la ejecución
```

---

# 16. Aplicación al proyecto SIGO

## 16.1 En memoria

Para mostrar un conjunto cerrado de resultados paginados puede utilizarse un arreglo o una colección indexada.

Para mantener una secuencia dinámica de elementos puede utilizarse una lista.

Para atender elementos por orden de llegada puede utilizarse una cola.

Para atender por prioridad y fecha debe evaluarse una estructura ordenada o una cola de prioridad.

## 16.2 En la base de datos

El dominio puede incluir relaciones como:

```text
ORDEN_TRABAJO
SECTOR
TIPO_OT
ORIGEN
DERIVACION_OT
ASIGNACION
```

Cada relación debe tener:

- atributos;
- dominios;
- clave primaria;
- claves foráneas según sus relaciones.

## 16.3 Ejemplo de justificación

> Mantendría las órdenes de trabajo en una base relacional para asegurar persistencia, integridad y consulta. Al recuperarlas en la aplicación, utilizaría una colección apropiada según la operación: una lista para un conjunto dinámico o una estructura ordenada cuando deban atenderse por prioridad y fecha.

---

# 17. Recuperación espaciada del Día 2

Antes de comenzar la evaluación del Día 3, responder sin mirar:

## 17.1 Fases

```text
Inicio       = alcance y viabilidad
Elaboración  = arquitectura estable
Construcción = producto completo
Transición   = beta, correcciones, formación y entrega
```

## 17.2 Iteración e incremento

```text
Iteración = trabajo planificado
Incremento = crecimiento obtenido
```

## 17.3 Estado y comportamiento

```text
Estado = valores actuales
Comportamiento = métodos
```

## 17.4 Sobrecarga y sobrescritura

```text
Sobrecarga = mismo nombre, parámetros distintos
Sobrescritura = método heredado, misma signatura, nueva implementación
```

Esta recuperación no reemplaza el contenido del Día 3. Sirve para comprobar retención.

---

# 18. Errores frecuentes

| Error | Corrección |
|---|---|
| TDA es una clase concreta | TDA define datos y operaciones; puede tener varias implementaciones |
| Un arreglo crea automáticamente todos sus objetos | Crea posiciones para referencias; cada objeto debe instanciarse |
| Capacidad y longitud son lo mismo | Capacidad es máximo; longitud utilizada es cantidad ocupada |
| Nodo es solamente el dato | Nodo contiene dato y referencias |
| Lista enlazada tiene índices directos | Se recorre mediante enlaces |
| Dinámica significa infinita | Crece mientras exista memoria |
| Relación significa solamente vínculo entre tablas | En el modelo relacional, relación también significa tabla |
| Grado es normalización | Grado es cantidad de columnas |
| Cardinalidad es orden | Cardinalidad es cantidad de filas o, en DER, participación entre entidades |
| Clave primaria y foránea son iguales | La primaria identifica; la foránea referencia |
| Clase y tabla son lo mismo | Se corresponden parcialmente, pero resuelven responsabilidades distintas |

---

# 19. Respuesta oral integrada modelo

> Un TDA define un conjunto de datos y operaciones sin depender de su implementación. Por ejemplo, una pila puede ofrecer `push` y `pop` e implementarse mediante un arreglo o una lista enlazada. Un arreglo es una estructura de capacidad definida cuyos elementos del mismo tipo se acceden mediante índices. Una lista enlazada es dinámica y está compuesta por nodos; cada nodo contiene un dato y una referencia al siguiente. En una base relacional, la información persistente se organiza en relaciones o tablas, formadas por atributos y tuplas. El grado es la cantidad de columnas y la cardinalidad la cantidad de filas. Una clave primaria identifica cada tupla y una clave foránea relaciona tablas. En un sistema de OT, la base conserva las órdenes y la aplicación puede organizarlas temporalmente en arreglos, listas o estructuras ordenadas según las operaciones necesarias.

---

# 20. Tarjetas de memoria

## Tarjeta 1

**Pregunta:** ¿Qué es un TDA?  
**Respuesta:** Un conjunto de datos y operaciones definido por una interfaz, independiente de su implementación.

## Tarjeta 2

**Pregunta:** ¿Estructura estática?  
**Respuesta:** Tiene una capacidad definida al crearla.

## Tarjeta 3

**Pregunta:** ¿Estructura dinámica?  
**Respuesta:** Puede cambiar su cantidad de elementos durante la ejecución mediante referencias.

## Tarjeta 4

**Pregunta:** ¿Qué es un arreglo?  
**Respuesta:** Conjunto de elementos del mismo tipo accesibles mediante índices.

## Tarjeta 5

**Pregunta:** ¿Capacidad frente a longitud utilizada?  
**Respuesta:** Capacidad es el máximo disponible; longitud utilizada es la cantidad ocupada.

## Tarjeta 6

**Pregunta:** ¿Qué contiene un nodo simple?  
**Respuesta:** Un dato y una referencia al siguiente nodo.

## Tarjeta 7

**Pregunta:** ¿Cómo insertar al inicio?  
**Respuesta:** `nuevo.siguiente = cabeza`; luego `cabeza = nuevo`.

## Tarjeta 8

**Pregunta:** ¿Qué es una relación?  
**Respuesta:** Una tabla del modelo relacional formada por atributos y tuplas.

## Tarjeta 9

**Pregunta:** ¿Qué es una tupla?  
**Respuesta:** Una fila de la relación.

## Tarjeta 10

**Pregunta:** ¿Qué es un dominio?  
**Respuesta:** Conjunto de valores posibles para un atributo.

## Tarjeta 11

**Pregunta:** ¿Grado?  
**Respuesta:** Cantidad de columnas o atributos.

## Tarjeta 12

**Pregunta:** ¿Cardinalidad?  
**Respuesta:** Cantidad de filas o tuplas en una relación.

## Tarjeta 13

**Pregunta:** ¿Clave primaria?  
**Respuesta:** Clave candidata elegida para identificar cada tupla.

## Tarjeta 14

**Pregunta:** ¿Clave foránea?  
**Respuesta:** Atributo que referencia una clave de otra relación.

---

# 21. Autoevaluación rápida

Responder sin mirar:

1. ¿Qué diferencia existe entre TDA e implementación?
2. ¿Por qué una pila puede implementarse de dos formas?
3. ¿Qué diferencia existe entre estructura estática y dinámica?
4. ¿Qué es un índice?
5. ¿Qué diferencia existe entre capacidad y longitud utilizada?
6. ¿Un arreglo de objetos crea todos los objetos? Explicá.
7. ¿Qué contiene un nodo?
8. ¿Cómo se inserta un nodo al inicio?
9. ¿Por qué una lista no tiene acceso directo como un arreglo?
10. ¿Qué es una relación?
11. ¿Qué diferencia existe entre tupla y atributo?
12. ¿Qué es el dominio?
13. ¿Qué diferencia existe entre grado y cardinalidad?
14. ¿Qué diferencia existe entre clave primaria y foránea?
15. ¿Qué diferencia existe entre objeto en memoria y tupla persistente?

## Criterio

- 13–15 correctas: listo para el examen.
- 10–12: repasar tarjetas.
- 7–9: releer los bloques débiles.
- Menos de 7: explicar el resumen en palabras propias antes de continuar.

---

# 22. Ejercicios guiados

## Ejercicio A — Elegir estructura

### Caso 1

Se guardan los consumos de los 12 meses.

**Decisión:** arreglo.

**Justificación:** cantidad conocida y acceso por posición.

### Caso 2

Se agregan actividades a una OT durante su ejecución y no se conoce la cantidad.

**Decisión posible:** lista enlazada.

**Justificación:** cantidad variable e inserciones dinámicas.

### Caso 3

Las órdenes deben atenderse por prioridad y fecha.

**Decisión:** no alcanza con decir “arreglo”. Se debe evaluar una colección ordenada o cola de prioridad y justificar cómo mantiene ambos criterios.

---

## Ejercicio B — Componentes relacionales

Dada:

```text
OPERARIO(
    id_operario,
    nombre,
    activo,
    id_sector
)
```

Responder:

```text
Relación: OPERARIO
Atributos: 4
Grado: 4
Clave primaria: id_operario
Clave foránea: id_sector
Dominio de activo: {true, false}
Tupla: una fila concreta de un operario
Cardinalidad: cantidad de operarios almacenados
```

---

## Ejercicio C — Insertar nodo

Lista:

```text
A → B → C → null
```

Insertar X:

```text
nuevo = X
nuevo.siguiente = cabeza
cabeza = nuevo
```

Resultado:

```text
X → A → B → C → null
```

---

# 23. Hoja final de una página

```text
TDA
Datos + operaciones + interfaz.
Se abstrae de la implementación.

ESTÁTICA / DINÁMICA
Estática: capacidad definida.
Dinámica: cantidad variable mediante referencias.

ARREGLO
Elementos del mismo tipo.
Acceso por índice.
Capacidad fija al crearlo.
Capacidad ≠ longitud utilizada.

NODO
Dato + referencia al siguiente.

LISTA SIMPLE
cabeza → nodo → nodo → null
Inserción inicial:
nuevo.siguiente = cabeza
cabeza = nuevo

ARREGLO VS LISTA
Arreglo: acceso directo, capacidad conocida.
Lista: crecimiento dinámico, recorrido secuencial.

MODELO RELACIONAL
Relación = tabla.
Tupla = fila.
Atributo = columna.
Dominio = valores posibles.
Cabecera = conjunto de atributos.
Cuerpo = conjunto de tuplas.
Dato = valor de una celda.

GRADO / CARDINALIDAD
Grado = columnas.
Cardinalidad = filas.

CLAVES
Superclave = identifica.
Candidata = superclave mínima.
Primaria = candidata elegida.
Foránea = referencia otra relación.

MEMORIA / PERSISTENCIA
Estructuras = organización durante la ejecución.
Base relacional = conservación persistente.
```

---

# 24. Fuentes utilizadas

Este resumen fue elaborado a partir de:

- `PROGRAMA EFIP I - INFORMATICA NUEVO.pdf`;
- `Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md`:
  - tipos de datos estáticos y dinámicos;
  - arreglos;
  - capacidad y longitud;
  - TDA;
  - nodos;
  - listas enlazadas;
- `INF387_Base_de_Datos_I_RESUMEN.md`:
  - estructura tabular;
  - relación, tupla, cuerpo, cabecera, atributo, dato, grado, cardinalidad y dominio;
  - claves y relaciones mediante clave foránea;
- diagnóstico del Día 1;
- resultados y cierre del Día 2;
- plan maestro hasta el 3/9/2026.
