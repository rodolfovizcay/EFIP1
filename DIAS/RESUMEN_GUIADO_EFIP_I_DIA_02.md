# Resumen guiado del Día 2  
## Modelos, metodologías, PUD y fundamentos de Programación Orientada a Objetos

**Fecha de estudio:** jueves 6 de agosto de 2026  
**Materias:** Análisis y Diseño de Software + Programación Orientada a Objetos  
**Propósito:** comprender los conceptos, relacionarlos con un proyecto real y poder explicarlos oralmente.

---

# 1. Qué tenés que aprender hoy

Al finalizar el Día 2 deberías poder responder, sin mirar los apuntes:

1. ¿Qué es un modelo y por qué se modela?
2. ¿Qué diferencia existe entre metodología, método, técnica y herramienta?
3. ¿Cuándo conviene cascada, incremental, prototipado o espiral?
4. ¿Qué es el PUD?
5. ¿Por qué está dirigido por casos de uso?
6. ¿Por qué está centrado en la arquitectura?
7. ¿Qué significa que sea iterativo e incremental?
8. ¿Qué ocurre en inicio, elaboración, construcción y transición?
9. ¿Qué diferencia existe entre fase, iteración e incremento?
10. ¿Qué son clase, objeto, estado, comportamiento e identidad?
11. ¿Qué hace un constructor?
12. ¿Qué significa encapsular?
13. ¿Qué diferencia existe entre estado y visibilidad?
14. ¿Qué diferencia existe entre sobrecarga y sobrescritura?

El programa oficial incluye modelos y metodologías, fases del PUD, UML, arquitectura, objetos, clases, constructores, control de acceso, `this`, `super`, sobrecarga, clases abstractas e interfaces. En el Día 2 se estudia la base necesaria para continuar luego con esos temas.

---

# PARTE I — ANÁLISIS Y DISEÑO DE SOFTWARE

# 2. Qué es un modelo

## 2.1 Definición sencilla

Un **modelo** es una representación simplificada de una realidad.

No contiene absolutamente todo. Selecciona lo que resulta importante para el objetivo del observador y deja de lado detalles que, en ese momento, no son necesarios.

## 2.2 Ejemplo fuera del software

Un plano de una casa no es la casa:

- no contiene ladrillos reales;
- no muestra cada imperfección del terreno;
- representa dimensiones, ambientes y relaciones importantes;
- permite comprender y construir la vivienda antes de que exista.

En software sucede algo similar.

## 2.3 Ejemplo dentro del software

Para un sistema de órdenes de trabajo pueden utilizarse varios modelos:

| Modelo | Qué permite observar |
|---|---|
| Casos de uso | Qué necesita hacer cada actor |
| Modelo de dominio | Qué conceptos existen en el problema |
| Diagrama de clases | Qué clases se diseñan y cómo se relacionan |
| Diagrama de secuencia | Cómo colaboran los objetos durante una operación |
| Diagrama de despliegue | En qué equipos o nodos se ejecutan los componentes |
| Modelo de datos | Cómo se organiza la información persistente |

Ninguno representa por sí solo todo el sistema. Cada uno muestra una perspectiva.

## 2.4 Para qué se modela

Según el material de Análisis y Diseño, se modela para:

1. **Visualizar** cómo es o cómo se desea que sea un sistema.
2. **Especificar** su estructura o comportamiento.
3. **Guiar la construcción** del programa.
4. **Documentar decisiones** adoptadas durante el proyecto.

## 2.5 Cuatro principios importantes del modelado

### Principio 1 — La elección del modelo influye en la solución

Un modelo mal elegido puede hacer que el equipo se concentre en elementos irrelevantes.

Ejemplo: utilizar solamente un DER para analizar la interacción de un operario con una aplicación móvil sería insuficiente, porque el DER muestra datos, no el comportamiento del usuario.

### Principio 2 — Un modelo puede tener diferentes niveles de precisión

No se muestra el mismo detalle a todos los participantes.

- El usuario necesita comprender qué hará el sistema.
- El analista necesita comprender requisitos y procesos.
- El diseñador necesita conocer clases, interfaces y arquitectura.
- El programador necesita detalles de implementación.

### Principio 3 — El modelo debe estar ligado a la realidad

Todo modelo simplifica, pero no debe ocultar elementos importantes del problema.

### Principio 4 — Un sistema necesita varios modelos

Un sistema no trivial se comprende mejor mediante vistas complementarias.

```text
Casos de uso    → visión funcional
Clases          → visión estructural
Secuencia       → visión dinámica
Despliegue      → visión física
Datos           → visión persistente
```

## 2.6 Respuesta oral modelo

> Un modelo es una simplificación de la realidad utilizada para comprender, visualizar, especificar, construir y documentar un sistema. Un mismo sistema necesita varios modelos porque cada uno representa una perspectiva distinta, como la funcional, estructural, dinámica o física.

---

# 3. Metodología, método, técnica y herramienta

Estos términos están relacionados, pero no son sinónimos.

## 3.1 Metodología

Una **metodología** organiza el camino completo de desarrollo.

Puede definir:

- fases;
- tareas;
- reglas;
- técnicas;
- herramientas;
- productos o artefactos;
- controles;
- documentación;
- responsabilidades.

### Ejemplo

Una metodología puede indicar:

1. primero se relevan requisitos;
2. luego se modela;
3. después se diseña;
4. se implementa;
5. se prueba;
6. se entrega.

## 3.2 Método

Un **método** indica cómo realizar técnicamente una parte del trabajo.

Ejemplo:

- método para capturar requisitos;
- método para diseñar una base de datos;
- método para construir casos de uso.

## 3.3 Técnica

Una **técnica** es un procedimiento estructurado y repetible para realizar una tarea específica.

Ejemplos:

- entrevista;
- cuestionario;
- observación;
- lluvia de ideas;
- normalización;
- prototipado.

## 3.4 Herramienta

Una **herramienta** proporciona soporte automatizado o semiautomatizado.

Ejemplos:

- Draw.io para diagramas;
- StarUML;
- GitHub;
- un IDE;
- un gestor de base de datos;
- una herramienta CASE.

## 3.5 Diferencia resumida

```text
Metodología = organiza el camino completo
Método      = indica cómo hacer una parte
Técnica     = procedimiento concreto y repetible
Herramienta = soporte para ejecutar el trabajo
```

## 3.6 Ejemplo integrado

En un proyecto:

- **Metodología:** PUD.
- **Método:** modelado mediante casos de uso.
- **Técnica:** entrevista a usuarios.
- **Herramienta:** software para dibujar UML.

---

# 4. Modelos de proceso de software

Un modelo de proceso organiza de qué forma se desarrolla el software a través del tiempo.

## 4.1 Cascada

### Idea

Las etapas se ejecutan de manera secuencial:

```text
Requisitos → Análisis → Diseño → Implementación → Pruebas → Entrega
```

### Conviene cuando

- los requisitos están bien definidos;
- hay pocos cambios esperados;
- el trabajo puede ejecutarse en orden.

### Limitaciones

- los cambios tardíos son costosos;
- el usuario ve una versión funcional cuando el proyecto ya está avanzado;
- los proyectos reales no siempre siguen una secuencia estricta.

### Ejemplo

Un sistema pequeño con reglas completamente cerradas y sin cambios esperados.

---

## 4.2 Incremental

### Idea

El producto se entrega en partes funcionales que agregan capacidades sucesivas.

```text
Incremento 1 → funciones básicas
Incremento 2 → nuevas funciones
Incremento 3 → producto ampliado
```

### Conviene cuando

- se necesita entregar valor temprano;
- se puede dividir el sistema;
- se desea recibir retroalimentación entre entregas.

### Ejemplo en SIGO

```text
Incremento 1 → crear y consultar OT
Incremento 2 → programar y despachar OT
Incremento 3 → ejecutar trabajo y generar PD
Incremento 4 → trazabilidad e informes
```

### Precaución

Los incrementos deben integrarse dentro de una arquitectura coherente.

---

## 4.3 Prototipado

### Idea

Se construye rápidamente una representación parcial para comprender mejor los requisitos.

El prototipo puede ser:

- una pantalla;
- un flujo navegable;
- un formulario;
- una simulación;
- una versión mínima.

### Conviene cuando

- el usuario no puede explicar claramente lo que necesita;
- la interfaz es importante;
- existe incertidumbre.

### Riesgo

El usuario puede creer que el prototipo ya es el producto terminado, aunque se haya construido sin considerar calidad, seguridad o mantenimiento.

---

## 4.4 Espiral

### Idea

Combina desarrollo iterativo con análisis y control de riesgos.

Cada vuelta de la espiral produce una versión más completa.

### Conviene cuando

- el sistema es grande;
- existen riesgos técnicos importantes;
- se utilizan tecnologías nuevas;
- las decisiones deben revisarse progresivamente.

### Limitación

La gestión es más compleja y requiere evaluar correctamente los riesgos.

---

## 4.5 Tabla comparativa

| Modelo | Organización | Principal ventaja | Principal limitación |
|---|---|---|---|
| Cascada | Secuencial | Orden claro | Se adapta mal al cambio |
| Incremental | Entregas sucesivas | Valor temprano | Requiere buena integración |
| Prototipado | Modelo rápido | Aclara requisitos | Puede confundirse con producto final |
| Espiral | Iteraciones orientadas a riesgos | Reduce riesgos | Gestión compleja |

## 4.6 Cómo elegir en un examen

```text
Requisitos estables y secuencia fija        → Cascada
Entrega temprana por partes                  → Incremental
Usuario no sabe exactamente qué necesita    → Prototipado
Proyecto grande y con riesgos importantes   → Espiral
```

---

# 5. Proceso Unificado de Desarrollo — PUD

## 5.1 Definición

El **Proceso Unificado de Desarrollo** es un proceso que organiza las actividades necesarias para transformar los requisitos de los usuarios en un sistema de software.

Utiliza UML para preparar y relacionar los modelos del sistema.

## 5.2 Las tres características esenciales

El PUD es:

1. dirigido por casos de uso;
2. centrado en la arquitectura;
3. iterativo e incremental.

Estas características no funcionan separadas. Se complementan.

---

# 6. PUD dirigido por casos de uso

## 6.1 Qué significa

Los casos de uso describen funciones que proporcionan un resultado de valor a un actor.

No se usan solamente para escribir requisitos. También guían:

- análisis;
- diseño;
- implementación;
- pruebas.

## 6.2 Ejemplo

Caso de uso:

```text
Programar orden de trabajo
```

A partir de ese caso pueden surgir:

- clases: `OrdenTrabajo`, `Programacion`, `Encargado`;
- métodos: `programar()`, `reprogramar()`;
- tablas;
- interfaces;
- pruebas;
- decisiones de seguridad.

## 6.3 Por qué se dice que son el hilo conductor

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

La prueba final debe verificar que el caso de uso realmente funcione como fue especificado.

## 6.4 Respuesta oral modelo

> El PUD está dirigido por casos de uso porque estos representan los requisitos funcionales y guían el análisis, el diseño, la implementación y las pruebas. Por eso constituyen el hilo conductor del desarrollo.

---

# 7. PUD centrado en la arquitectura

## 7.1 Qué es arquitectura

La arquitectura comprende las decisiones significativas sobre:

- organización del sistema;
- componentes;
- subsistemas;
- interfaces;
- colaboraciones;
- plataforma;
- base de datos;
- comunicaciones;
- restricciones;
- requisitos no funcionales.

## 7.2 Arquitectura no es documentación

La documentación explica o representa la arquitectura, pero no es la arquitectura.

```text
Arquitectura  = decisiones estructurales y técnicas
Documentación = forma de registrar y comunicar esas decisiones
```

## 7.3 Relación entre casos de uso y arquitectura

Los casos de uso representan principalmente la **función**.

La arquitectura representa principalmente la **forma** que permite realizar esa función.

Ejemplo:

```text
Función:
El operario debe ejecutar una OT desde un dispositivo móvil.

Forma arquitectónica:
Aplicación móvil/web + API + servidor + base de datos + conectividad.
```

La arquitectura debe permitir realizar los casos de uso y los casos de uso ayudan a descubrir qué necesita la arquitectura.

## 7.4 Ejemplo SIGO

Decisiones arquitectónicas:

- aplicación web desarrollada con Scriptcase;
- base de datos PostgreSQL;
- servicios de automatización con n8n;
- API para integración;
- aplicación accesible desde móviles;
- servidor Linux;
- separación en módulos.

## 7.5 Respuesta oral modelo

> El PUD está centrado en la arquitectura porque el sistema debe construirse sobre una estructura técnica estable. La arquitectura incluye decisiones sobre componentes, interfaces, base de datos, comunicaciones, plataforma y requisitos no funcionales. Los casos de uso representan la función y deben encajar dentro de esa arquitectura.

---

# 8. PUD iterativo e incremental

## 8.1 Iteración

Una **iteración** es un miniproyecto planificado.

Durante una iteración pueden realizarse:

- requisitos;
- análisis;
- diseño;
- implementación;
- pruebas.

La iteración es el trabajo realizado durante un período.

## 8.2 Incremento

El **incremento** es el crecimiento del producto obtenido como resultado de la iteración.

```text
Iteración = proceso de trabajo
Incremento = resultado agregado al producto
```

## 8.3 Ejemplo

```text
Iteración:
Analizar, diseñar, documentar, implementar y probar CU07 Crear OT.

Incremento:
El sistema incorpora la creación controlada de órdenes de trabajo.
```

## 8.4 Error frecuente

No decir:

> Iterar es repetir porque algo salió mal.

Una iteración es una unidad planificada del desarrollo, aunque también puede incluir correcciones.

## 8.5 Respuesta oral modelo

> El PUD es iterativo porque el desarrollo se organiza en miniproyectos controlados, e incremental porque cada iteración produce un crecimiento funcional del sistema. La iteración es el proceso de trabajo y el incremento es el resultado incorporado al producto.

---

# 9. Fases del PUD

Cada ciclo del PUD tiene cuatro fases:

```text
Inicio → Elaboración → Construcción → Transición
```

Una fase puede contener varias iteraciones.

---

## 9.1 Inicio

### Preguntas principales

- ¿Qué se va a construir?
- ¿Para quién?
- ¿Cuál es el alcance?
- ¿Es viable?
- ¿Cuáles son los riesgos principales?
- ¿Cuál podría ser la arquitectura inicial?

### Productos habituales

- visión general;
- alcance;
- casos de uso críticos;
- riesgos;
- estimación;
- planificación;
- esbozo arquitectónico.

### Ejemplo

Decidir que SIGO administrará órdenes, trabajos en vivo y partes diarios, y establecer los actores y riesgos iniciales.

---

## 9.2 Elaboración

### Objetivo

Comprender en profundidad el problema y establecer una arquitectura estable.

### Actividades

- detallar la mayoría de los casos de uso;
- resolver riesgos importantes;
- diseñar la arquitectura;
- construir una línea base arquitectónica;
- planificar la construcción.

### Resultado clave

```text
Línea base de arquitectura
```

### Ejemplo

Definir estados de OT, relaciones con PD, permisos, reglas de concurrencia, componentes, base de datos e integración.

---

## 9.3 Construcción

### Objetivo

Desarrollar el sistema completo sobre la arquitectura establecida.

### Actividades

- implementar casos de uso;
- desarrollar componentes;
- integrar;
- probar;
- completar funciones.

### Resultado

Producto preparado para ser entregado a usuarios.

---

## 9.4 Transición

### Objetivo

Poner el producto en manos de los usuarios.

### Actividades

- versión beta;
- pruebas con usuarios;
- corrección de defectos;
- capacitación;
- asistencia;
- ajustes;
- despliegue.

### Resultado

Producto adoptado por el usuario.

---

## 9.5 Tabla para memorizar

| Fase | Palabra clave |
|---|---|
| Inicio | Alcance y viabilidad |
| Elaboración | Arquitectura estable |
| Construcción | Producto completo |
| Transición | Entrega y adopción |

---

# 10. Fase, iteración, incremento y flujo de trabajo

## 10.1 Fase

Período amplio con un objetivo principal.

Ejemplo:

```text
Elaboración
```

## 10.2 Iteración

Miniproyecto que ocurre dentro de una fase.

Ejemplo:

```text
Iteración para especificar y resolver CU07
```

## 10.3 Incremento

Resultado agregado al producto.

Ejemplo:

```text
Creación de OT completamente documentada y validada
```

## 10.4 Flujo de trabajo

Conjunto de actividades relacionadas con una disciplina.

Flujos fundamentales:

- requisitos;
- análisis;
- diseño;
- implementación;
- prueba.

En una iteración pueden recorrerse varios flujos.

## 10.5 Artefacto

Información creada, utilizada o modificada.

Ejemplos:

- caso de uso;
- diagrama;
- clase;
- código;
- prueba;
- prototipo;
- documento de arquitectura.

## 10.6 Trabajador

Rol que una persona desempeña dentro del proceso.

Ejemplos:

- analista;
- arquitecto;
- diseñador;
- programador;
- ingeniero de pruebas.

## 10.7 Actividad

Trabajo concreto realizado por un trabajador.

Ejemplos:

- encontrar actores;
- detallar un caso de uso;
- diseñar una clase;
- implementar un componente;
- ejecutar una prueba.

## 10.8 Relación completa

```text
Fase
  contiene iteraciones
      que recorren flujos
          donde trabajadores realizan actividades
              y producen artefactos
                  que generan incrementos
```

---

# PARTE II — PROGRAMACIÓN ORIENTADA A OBJETOS

# 11. Idea central de POO

La POO organiza el programa en objetos que colaboran entre sí.

Cada objeto posee:

- características: atributos;
- comportamientos: métodos;
- identidad;
- relaciones con otros objetos.

La POO busca favorecer:

- organización;
- reutilización;
- modularidad;
- mantenimiento;
- protección de datos;
- menor acoplamiento entre componentes.

---

# 12. Clase y objeto

## 12.1 Clase

Una **clase** es una plantilla o definición de un tipo de objeto.

Define:

- atributos;
- métodos;
- relaciones;
- reglas comunes.

Ejemplo:

```text
Clase: OrdenTrabajo
```

## 12.2 Objeto

Un **objeto** es una instancia concreta de una clase.

Ejemplo:

```text
OT 145
```

es un objeto de la clase `OrdenTrabajo`.

## 12.3 Diferencia

```text
Clase  = definición general
Objeto = ejemplar concreto
```

Ejemplo:

```text
Clase: Automóvil
Objetos: automóvil rojo, automóvil azul, automóvil verde
```

---

# 13. Estado, comportamiento e identidad

## 13.1 Estado

El estado es el conjunto de valores actuales de los atributos.

Ejemplo:

```text
OT 145
estado = DESPACHADA
prioridad = ALTA
sector = ENERGÍA
```

El objeto puede cambiar luego:

```text
estado = EN_EJECUCION
```

Sigue siendo el mismo objeto, pero cambió su estado.

## 13.2 Comportamiento

Es lo que el objeto puede hacer.

Se representa mediante métodos.

Ejemplos:

```java
programar();
despachar();
iniciar();
finalizar();
cancelar();
```

Los métodos pueden:

- consultar el estado;
- modificar el estado;
- comunicarse con otros objetos;
- devolver resultados.

## 13.3 Identidad

Permite distinguir un objeto de otro.

Dos objetos pueden tener iguales atributos y seguir siendo distintos.

Ejemplo:

```text
OT 145 y OT 146
```

pueden compartir tarea, fecha y sector, pero poseen identidad diferente.

## 13.4 No confundir estado con visibilidad

```text
Estado      = qué valores tiene el objeto
Visibilidad = quién puede acceder a sus miembros
```

---

# 14. Atributos y métodos

## 14.1 Atributo

Representa una propiedad o dato del objeto.

```java
private int id;
private String descripcion;
private String estado;
```

## 14.2 Método

Representa una operación o comportamiento.

```java
public void iniciar() {
    estado = "EN_EJECUCION";
}
```

## 14.3 Responsabilidad

Una clase no debe ser solo un conjunto de datos.

Debe asumir responsabilidades coherentes con el dominio.

Ejemplo:

```text
OrdenTrabajo
- conoce su estado;
- conoce su prioridad;
- puede iniciar;
- puede finalizar;
- puede cambiar de prioridad bajo reglas válidas.
```

---

# 15. Constructor

## 15.1 Qué es

Un constructor es una operación especial que crea e inicializa un objeto.

## 15.2 Reglas básicas en Java

- tiene el mismo nombre que la clase;
- no declara tipo de retorno;
- puede recibir parámetros;
- puede haber varios constructores;
- se ejecuta al usar `new`.

## 15.3 Ejemplo

```java
public OrdenTrabajo(int id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;
    this.estado = "PENDIENTE";
}
```

## 15.4 Qué sucede

```java
OrdenTrabajo ot = new OrdenTrabajo(145, "Reparar luminaria");
```

1. Se reserva memoria para el objeto.
2. Se ejecuta el constructor.
3. Se asignan los valores iniciales.
4. La variable `ot` guarda una referencia al objeto.

## 15.5 Constructor por defecto

Si no se declara ningún constructor, Java puede proporcionar un constructor sin parámetros.

Si se declara un constructor propio, el constructor por defecto ya no se genera automáticamente.

---

# 16. La palabra `this`

`this` representa al objeto actual.

Ejemplo:

```java
this.id = id;
```

- `this.id`: atributo del objeto.
- `id`: parámetro recibido.

También puede usarse para invocar otro constructor de la misma clase, aunque ese uso no es central en el Día 2.

---

# 17. Encapsulamiento

## 17.1 Definición

El encapsulamiento separa:

- la interfaz pública;
- la implementación interna.

El objeto publica los servicios necesarios y oculta sus detalles internos.

## 17.2 Objetivo

- proteger los datos;
- evitar modificaciones inválidas;
- reducir dependencia;
- permitir cambiar la implementación sin afectar a quienes usan la clase;
- controlar cómo cambia el estado.

## 17.3 Ejemplo incorrecto

```java
public String estado;
```

Cualquier parte del programa podría escribir:

```java
ot.estado = "CUALQUIER_COSA";
```

## 17.4 Ejemplo encapsulado

```java
private String estado;

public void iniciar() {
    if ("DESPACHADA".equals(estado)) {
        estado = "EN_EJECUCION";
    }
}
```

Ahora la clase controla el cambio.

## 17.5 Getter

Permite consultar un valor:

```java
public String getEstado() {
    return estado;
}
```

## 17.6 Setter

Permite modificar un valor, pero debe respetar reglas.

No todo atributo necesita setter.

Ejemplo:

```java
public void cambiarPrioridad(String nuevaPrioridad) {
    if ("BAJA".equals(nuevaPrioridad)
            || "MEDIA".equals(nuevaPrioridad)
            || "ALTA".equals(nuevaPrioridad)) {
        this.prioridad = nuevaPrioridad;
    }
}
```

---

# 18. Modificadores de acceso

| Modificador | Acceso |
|---|---|
| `private` | Solo desde la propia clase |
| sin modificador | Desde clases del mismo paquete |
| `protected` | Clase, paquete y subclases |
| `public` | Desde cualquier clase que pueda verla |

## Regla práctica

- atributos: normalmente `private`;
- servicios públicos: `public`;
- elementos para herencia controlada: `protected`, cuando está justificado;
- no exponer datos sin necesidad.

---

# 19. Encapsulamiento y abstracción

Son conceptos relacionados, pero distintos.

## Abstracción

Se concentra en las características esenciales y en lo que el objeto ofrece.

```text
Qué hace
```

## Encapsulamiento

Oculta cómo está implementado internamente.

```text
Cómo lo hace
```

Ejemplo:

El usuario conoce:

```java
ot.iniciar();
```

No necesita conocer todos los controles internos que realiza el método.

---

# 20. Recuperación: sobrecarga y sobrescritura

Aunque la herencia se estudia con mayor profundidad más adelante, esta diferencia debe quedar clara desde ahora.

## 20.1 Sobrecarga

Métodos con:

- mismo nombre;
- distinta cantidad o tipo de parámetros.

```java
public void programar(String fecha) {
}

public void programar(String fecha, String operario) {
}
```

La sobrecarga ocurre normalmente dentro de una misma clase.

## 20.2 Sobrescritura

Una subclase redefine un método heredado conservando su signatura.

```java
class Trabajo {
    public String ejecutar() {
        return "Trabajo general";
    }
}

class Reparacion extends Trabajo {
    @Override
    public String ejecutar() {
        return "Reparación";
    }
}
```

## 20.3 Fórmula mental

```text
Sobrecarga    = cambian los parámetros
Sobrescritura = cambia la implementación heredada
```

---

# 21. Recuperación: relaciones UML

Esta parte corrige una confusión del Día 1.

## Herencia

```text
Es un
```

Ejemplo:

```text
Reparacion es un Trabajo
```

## Asociación

```text
Se relaciona con
```

Ejemplo:

```text
Operario se asigna a OrdenTrabajo
```

## Agregación

```text
Tiene partes que pueden existir separadas
```

Ejemplo:

```text
Cuadrilla tiene Operarios
```

El operario puede existir aunque la cuadrilla se elimine.

## Composición

```text
Tiene partes cuyo ciclo de vida depende del todo
```

Ejemplo:

```text
OrdenTrabajo contiene DetalleOrden
```

Si el detalle solo existe dentro de esa orden, depende de ella.

## Dependencia

```text
Usa temporalmente
```

Ejemplo:

Un servicio recibe una `OrdenTrabajo` como parámetro para generar un informe.

---

# 22. Ejemplo completo: clase `OrdenTrabajo`

```java
public class OrdenTrabajo {

    private int id;
    private String descripcion;
    private String prioridad;
    private String estado;

    public OrdenTrabajo(
            int id,
            String descripcion,
            String prioridad) {

        this.id = id;
        this.descripcion = descripcion;
        cambiarPrioridad(prioridad);
        this.estado = "PENDIENTE";
    }

    public void iniciar() {
        if ("DESPACHADA".equals(estado)) {
            estado = "EN_EJECUCION";
        }
    }

    public void cambiarPrioridad(String nuevaPrioridad) {
        if ("BAJA".equals(nuevaPrioridad)
                || "MEDIA".equals(nuevaPrioridad)
                || "ALTA".equals(nuevaPrioridad)) {
            prioridad = nuevaPrioridad;
        }
    }

    public String getEstado() {
        return estado;
    }
}
```

## 22.1 Qué representa cada elemento

| Elemento | Concepto |
|---|---|
| `class OrdenTrabajo` | Clase |
| `id`, `descripcion`, `prioridad`, `estado` | Atributos y estado |
| Objeto creado con `new` | Instancia |
| `iniciar()` | Comportamiento |
| `OrdenTrabajo(...)` | Constructor |
| `private` | Encapsulamiento |
| `public` | Interfaz pública |
| `this.id` | Atributo del objeto actual |
| `getEstado()` | Consulta controlada |
| Validación de prioridad | Protección de invariantes |

## 22.2 Identidad

El atributo `id` puede representar la identidad persistente del dominio.

Sin embargo, conceptualmente la identidad del objeto no se reduce solamente a los valores de sus atributos: dos instancias diferentes siguen siendo objetos distintos.

---

# 23. Cómo se conecta Análisis y Diseño con POO

```text
Problema del negocio
        ↓
Requerimientos
        ↓
Casos de uso
        ↓
Modelo de dominio
        ↓
Clases de análisis y diseño
        ↓
Clases Java
        ↓
Pruebas
```

## Ejemplo

### Requerimiento

> El sistema debe permitir iniciar una OT despachada.

### Caso de uso

```text
Iniciar trabajo
```

### Clase

```text
OrdenTrabajo
```

### Comportamiento

```java
iniciar()
```

### Regla implementada

```text
Solo se inicia si la OT está DESPACHADA.
```

### Prueba

```text
Dada una OT DESPACHADA,
cuando se inicia,
entonces pasa a EN_EJECUCION.
```

Esto muestra cómo los casos de uso conducen el diseño, el código y las pruebas.

---

# 24. Aplicación al proyecto SIGO

Una forma correcta de explicar SIGO mediante PUD sería:

## Problema

La cooperativa necesita gestionar órdenes de trabajo, su programación, ejecución, trazabilidad y cierre.

## Casos de uso conductores

- crear OT;
- consultar OT;
- programar;
- despachar;
- ejecutar;
- derivar;
- cerrar;
- consultar trazabilidad.

## Arquitectura

- aplicación web;
- acceso móvil;
- base PostgreSQL;
- Scriptcase;
- integración mediante API;
- automatizaciones;
- módulos documentados;
- reglas de seguridad y concurrencia.

## Iteración

Revisar, corregir, documentar y aprobar CU07.

## Incremento

El producto incorpora una definición completa y validada para crear órdenes de trabajo.

## Fase aproximada

El trabajo documental y de estabilización de arquitectura se aproxima principalmente a **elaboración**, aunque algunas partes ya avanzan sobre construcción.

No es necesario encerrar un proyecto real dentro de una única fase de manera rígida: se debe justificar según el objetivo y los artefactos producidos.

---

# 25. Respuesta oral integrada de cinco minutos

Podés usar esta estructura:

## Minuto 1 — Modelado

> En software modelamos para simplificar la realidad, visualizar el sistema, especificar su estructura o comportamiento, guiar la construcción y documentar decisiones. Como un sistema complejo tiene distintas perspectivas, utilizamos varios modelos complementarios.

## Minuto 2 — Metodología y PUD

> Una metodología organiza fases, actividades, técnicas, herramientas y artefactos. El PUD es un proceso dirigido por casos de uso, centrado en la arquitectura, iterativo e incremental.

## Minuto 3 — Características y fases

> Los casos de uso guían análisis, diseño, implementación y pruebas. La arquitectura define la forma técnica estable. El desarrollo se divide en iteraciones que producen incrementos. Las fases son inicio, elaboración, construcción y transición.

## Minuto 4 — POO

> En POO una clase define atributos y métodos comunes, mientras que un objeto es una instancia con estado, comportamiento e identidad. El constructor inicializa el estado y el encapsulamiento protege la implementación interna mediante atributos privados y servicios públicos.

## Minuto 5 — Aplicación

> En SIGO un caso de uso como iniciar una OT conduce a una clase `OrdenTrabajo` con estado y un método `iniciar()`. La arquitectura define dónde se ejecuta, cómo persiste y cómo se comunica, y las pruebas verifican que el comportamiento cumpla el caso de uso.

---

# 26. Errores que no deben repetirse

| Incorrecto | Correcto |
|---|---|
| Arquitectura es documentación | La documentación representa la arquitectura |
| Iterar es solamente corregir | Una iteración es un miniproyecto planificado |
| Incremento es repetir el trabajo | Incremento es crecimiento del producto |
| Estado es editable o visible | Estado son los valores actuales |
| Objeto es la primera instancia | Objeto es cualquier instancia |
| Agregación es herencia | Agregación es todo/parte débil |
| Composición es clase hija | Composición es todo/parte fuerte |
| Sobrecarga cambia implementación | Sobrecarga cambia parámetros |
| Sobrescritura cambia parámetros | Sobrescritura redefine un método heredado |

---

# 27. Tarjetas de memoria

## Tarjeta 1

**Pregunta:** ¿Qué es un modelo?  
**Respuesta:** Una simplificación de la realidad utilizada para comprender y representar un sistema.

## Tarjeta 2

**Pregunta:** ¿Para qué se modela?  
**Respuesta:** Para visualizar, especificar, guiar la construcción y documentar.

## Tarjeta 3

**Pregunta:** ¿Qué organiza una metodología?  
**Respuesta:** Fases, tareas, reglas, técnicas, herramientas, productos y controles.

## Tarjeta 4

**Pregunta:** ¿Cuáles son las tres características del PUD?  
**Respuesta:** Dirigido por casos de uso, centrado en la arquitectura, iterativo e incremental.

## Tarjeta 5

**Pregunta:** ¿Qué diferencia hay entre iteración e incremento?  
**Respuesta:** La iteración es el trabajo planificado; el incremento es el crecimiento producido.

## Tarjeta 6

**Pregunta:** ¿Qué produce elaboración?  
**Respuesta:** Una línea base estable de arquitectura y la mayoría de los casos de uso detallados.

## Tarjeta 7

**Pregunta:** ¿Qué es una clase?  
**Respuesta:** Una plantilla que define atributos y comportamientos comunes.

## Tarjeta 8

**Pregunta:** ¿Qué es un objeto?  
**Respuesta:** Una instancia concreta con estado, comportamiento e identidad.

## Tarjeta 9

**Pregunta:** ¿Qué es el estado?  
**Respuesta:** Los valores actuales de los atributos.

## Tarjeta 10

**Pregunta:** ¿Qué es encapsulamiento?  
**Respuesta:** Ocultar la implementación interna y controlar el acceso mediante una interfaz pública.

## Tarjeta 11

**Pregunta:** ¿Sobrecarga?  
**Respuesta:** Mismo nombre, parámetros diferentes.

## Tarjeta 12

**Pregunta:** ¿Sobrescritura?  
**Respuesta:** Nueva implementación de un método heredado con la misma signatura.

---

# 28. Autoevaluación rápida

Responder sin mirar:

1. ¿Por qué un solo modelo no alcanza?
2. ¿Qué diferencia existe entre metodología y herramienta?
3. ¿Qué modelo de proceso usarías si los requisitos son poco claros?
4. ¿Por qué los casos de uso son el hilo conductor del PUD?
5. ¿Qué contiene la arquitectura?
6. ¿Qué diferencia hay entre fase e iteración?
7. ¿Qué resultado produce una iteración?
8. ¿Cuál es el objetivo principal de elaboración?
9. ¿Qué diferencia existe entre clase y objeto?
10. ¿Qué diferencia existe entre estado e identidad?
11. ¿Qué hace un constructor?
12. ¿Por qué se usan atributos privados?
13. ¿Por qué no todo atributo necesita un setter?
14. ¿Qué diferencia existe entre abstracción y encapsulamiento?
15. ¿Qué diferencia existe entre sobrecarga y sobrescritura?

## Criterio

- 13–15 correctas: listo para evaluación.
- 10–12: repasar tarjetas.
- 7–9: releer los apartados débiles.
- Menos de 7: rehacer el resumen en palabras propias.

---

# 29. Ejercicios guiados

## Ejercicio 1 — Elegir un modelo de proceso

Un cliente no puede explicar claramente cómo debe ser la pantalla móvil.

### Respuesta esperada

```text
Decisión: prototipado.
Justificación: permite construir una representación temprana,
obtener retroalimentación y precisar los requisitos de interfaz.
```

## Ejercicio 2 — Iteración e incremento

### Situación

Se trabaja una semana para analizar, documentar y aprobar el caso de uso “Derivar OT”.

### Respuesta

```text
Iteración:
El trabajo planificado de análisis, diseño, revisión y validación.

Incremento:
La incorporación de una especificación aprobada de derivación al producto.
```

## Ejercicio 3 — Estado y comportamiento

### Objeto

```text
OT 145
estado = DESPACHADA
prioridad = ALTA
```

### Preguntas

- ¿Cuál es el estado?
- ¿Cuál podría ser un comportamiento?
- ¿Cuál es su identidad?

### Respuesta

```text
Estado: valores DESPACHADA y ALTA, junto con los demás atributos.
Comportamiento: iniciar(), reprogramar(), cancelar().
Identidad: OT 145 como objeto individual.
```

## Ejercicio 4 — Encapsulamiento

### Problema

Cualquier parte del sistema puede asignar un estado inexistente.

### Solución

- atributo `estado` privado;
- métodos que validen transiciones;
- getter para consultar;
- no proporcionar un setter genérico sin reglas.

---

# 30. Hoja final de una página

```text
MODELO
Simplificación de la realidad.
Sirve para visualizar, especificar, construir y documentar.

METODOLOGÍA
Organiza fases, tareas, reglas, técnicas, herramientas y productos.

PROCESOS
Cascada: secuencial.
Incremental: entregas sucesivas.
Prototipado: aclara requisitos.
Espiral: iterativo y orientado a riesgos.

PUD
Dirigido por casos de uso.
Centrado en arquitectura.
Iterativo e incremental.

FASES
Inicio: alcance y viabilidad.
Elaboración: arquitectura estable.
Construcción: producto completo.
Transición: entrega y adopción.

ITERACIÓN / INCREMENTO
Iteración = trabajo planificado.
Incremento = resultado incorporado.

POO
Clase = plantilla.
Objeto = instancia.
Estado = valores actuales.
Comportamiento = métodos.
Identidad = distingue al objeto.

CONSTRUCTOR
Crea e inicializa el objeto.

ENCAPSULAMIENTO
Atributos privados + servicios públicos controlados.

SOBRECARGA / SOBRESCRITURA
Sobrecarga = parámetros distintos.
Sobrescritura = nueva implementación heredada.
```

---

# 31. Fuentes utilizadas

Este resumen fue elaborado únicamente a partir de:

- `PROGRAMA EFIP I - INFORMATICA NUEVO.pdf`
- `Analisis_y_Diseno_de_Software.md`
  - modelos y metodologías;
  - modelos de proceso;
  - PUD;
  - fases, iteraciones, artefactos y flujos.
- `INF382_Programacion_Orientada_a_Objetos.md`
  - objetos;
  - clases;
  - constructor;
  - encapsulamiento;
  - modificadores de acceso.
- `Taller_de_Algoritmos_y_Estructuras_de_Datos_I.md`
  - apoyo para sobrecarga, sobrescritura y fundamentos de POO.
- análisis diagnóstico del Día 1.
- guía operativa del Día 2.

Cuando una formulación fue simplificada para facilitar el estudio, se conservó el sentido y la terminología principal de los materiales.
