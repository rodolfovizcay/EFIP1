# Respuestas del estudiante — Día 5

**Fecha:** 10/08/2026  
**Apuntes utilizados:** no  
**Modalidad:** estudio guiado + respuestas sin apuntes + evaluación escrita/integrada + defensa oral

> Este archivo conserva la evidencia real de la jornada. Se normaliza únicamente el formato Markdown y errores obvios de tipeo cuando no cambian el sentido. Las correcciones académicas se documentan en `EVALUACIONES/2026-08-10_RESULTADOS-DIA-05.md` y en el cierre; no se reemplazan silenciosamente las respuestas originales.

---

# 1. Recuperación inicial — Análisis y Diseño

## Modelo

> Es una representación simplificada de la realidad. No hay un único modelo; en sistemas no triviales la representación se realiza en varios modelos. Los modelos guían el desarrollo del software.

## Arquitectura y documentación

> La arquitectura son las decisiones que tomamos sobre tecnología, RNF, sistemas de almacenamiento de datos, subsistemas e integraciones. La documentación es donde se plasman todas esas decisiones.

## Construcción y Transición

> Construcción: en esta fase se crea el software; al final hay un producto.  
> Transición: es la etapa donde se entrega ese producto al cliente; puede ser una beta, se enseña a usar y se recibe retroalimentación para hacer correcciones.

## Iteración e incremento

> Iteración: es un mini proyecto en el cual tenemos análisis, diseño, desarrollo y entrega, y al final da crecimiento del producto. Ese crecimiento se llama incremento.

---

# 2. Metodología, método, técnica y herramienta

## Metodología

> Es el marco, la guía con la cual se crea un software; contiene fases, tareas, métodos y herramientas.

## Método

> El método indica cómo construir una parte del sistema; tiene requisitos, análisis, desarrollo, implementación y pruebas.

## Técnica

> Una técnica de elicitación, por ejemplo: entrevistas.

## Herramienta

> CASE: son software que ayuda a documentar los proyectos, crear diagramas y documentos.

### Ajuste detectado durante la corrección

En la primera respuesta no quedó expresada explícitamente la diferencia entre método y técnica. Posteriormente se fijó:

```text
Método = cómo construir técnicamente.
Técnica = procedimiento concreto, estructurado y repetible.
```

---

# 3. Características fundamentales del PUD

## Dirigido por casos de uso

> Los casos de uso guían los requerimientos, análisis, diseño, implementación y pruebas. Son las funciones del sistema que salen de los requerimientos solicitados por el usuario.

## Centrado en la arquitectura

> Porque se centra en las decisiones que se toman.

## Casos de uso y arquitectura

> Porque los casos de uso son las funciones y la arquitectura es la estructura técnica que hace que esas funciones puedan ejecutarse.

## Iterativo e incremental

> Iterativo porque se compone de mini proyectos que tienen análisis, desarrollo, implementación y pruebas, y cada ciclo genera un avance en el sistema; ese avance es un incremento.

### Ajuste detectado

Se corrigió la palabra `ciclo`: cada **iteración** produce un incremento; un ciclo completo del PUD termina con una nueva versión del producto.

---

# 4. Aplicación del PUD — `Programar Orden de Trabajo`

## Resultado de valor

> Al presionar un botón o de manera automática, el usuario al finalizar obtiene una lista ordenada por prioridades, fecha y hora de los trabajos que se deben realizar con fechas y horas actuales.

## Decisiones/condicionantes arquitectónicos identificados

1. Usar `crontab` para ejecutar automáticamente cada determinado tiempo.
2. Permitir ejecución manual para obtener rápidamente una reprogramación.
3. Utilizar base de datos relacional para mantener datos estructurados.
4. Ejecutar la función del lado de la base de datos por el volumen de datos.
5. Completar la operación en menos de 20 segundos.

## Iteración propuesta

> Análisis: documentarnos para saber qué volumen de información se debe alterar, qué campos definen qué se debe reprogramar y cuándo una programación se considera vieja.  
> Diseño: crear relaciones, diagramas de actividad, secuencia y estados.  
> Implementación: programar lo diseñado, crear estructura en base de datos y funciones.  
> Pruebas: comprobar que la programación funcione y que las prioridades queden correctamente programadas.

## Incremento

> Una ejecución que permite mantener los trabajos vivos, haciendo que no se pierdan en el tiempo.

## Riesgos identificados

- no considerar la hora puede alterar el orden;
- no considerar el campo de bloqueo puede programar un trabajo que debía permanecer estático;
- no considerar trabajos estáticos puede alterar la programación porque también ocupan espacio.

---

# 5. Fundamentos POO

## Clase vs. objeto

> Clase: representación abstracta de un objeto; pone las reglas de qué atributos y métodos lo componen.  
> Objeto: es una instancia de la clase, una representación de la realidad —una OT concreta— con estado, comportamiento e identidad.

## Estado

Ejemplos aportados:

- ID;
- detalles;
- estado;
- prioridad.

Durante la corrección se distinguió `ID` como posible representación de identidad persistente y se prefirieron valores de atributos como ejemplos de estado.

## Comportamiento

- `iniciar()`;
- `despachar()`;
- `cambiarPrioridad(nuevaPrioridad)`;
- `anular(motivo)`.

## Identidad

> Dos OT pueden seguir siendo objetos diferentes aunque tengan la misma descripción, prioridad y estado. No solamente porque el ID sea diferente: desde el punto de vista teórico, si son dos instancias, son diferentes.

## Encapsulamiento

> Para proteger el comportamiento de la OT en su conjunto. No puede tener cualquier estado: existe un dominio para estado y prioridad. Si fuera público estaríamos dejando que cambien a cualquier valor, lo que puede generar errores.

---

# 6. Java escrito sin copiar

Respuesta original:

```java
class OrdenTrabajo {

    private int numero;
    private String descripcion;
    private String estado;
    private int prioridad;

    public void contrictor(int numero, String descripcion, String estado, int prioridad) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return this.estado;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public void cambiarPrioridad(int nuevaPrioridad) {
        if (nuevaPrioridad >= 1 && nuevaPrioridad <= 5) {
            this.prioridad = nuevaPrioridad;
        } else {
            System.out.println("La prioridad debe estar entre 1 y 5.");
        }
    }

    public void despachar() {
        this.estado = "DESPACHADA";
    }
}
```

### Autocorrección posterior del estudiante

> Debí llamar a `cambiarPrioridad` en el constructor para que no puedan asignar cualquier prioridad. Lo mismo con estado: tendría que haber sido un valor fijo como `PENDIENTE`.

### Conceptos explicados después de corregir

- `OrdenTrabajo(...)` es constructor porque lleva el mismo nombre de la clase y no debe tener tipo de retorno.
- `this.numero` es el atributo de la instancia y `numero` el parámetro recibido.
- Si no se declara ningún constructor, Java proporciona uno por defecto sin parámetros.

---

# 7. Modelo relacional

Dada la relación:

```text
ORDEN_TRABAJO
id_ot | numero | descripcion | estado | prioridad | id_sector
```

Respuestas:

- **Relación:** `ORDEN_TRABAJO`.
- **Tupla:** una fila, por ejemplo `101 | 1587 | Reparar red | PENDIENTE | 1 | 4`.
- **Cabecera:** `id_ot | numero | descripcion | estado | prioridad | id_sector`.
- **Grado:** `6`.
- **Cardinalidad:** `3` en el ejercicio presentado.
- **Dominio de estado, primera respuesta:** `PENDIENTE, DESPACHADA`.

### Corrección del dominio

Se corrigió que `PENDIENTE` y `DESPACHADA` eran valores observados en el ejemplo; el **dominio** es el conjunto de todos los valores permitidos para el atributo.

---

# 8. Claves — intento y recuperación

## Primer intento

> Superclave: uno o más atributos para representar una tupla.  
> Clave candidata: si se quita algún atributo deja de representar la tupla inequívocamente.  
> Candidata propuesta: `numero`.  
> Si elegimos `id_ot`: tanto `numero` como `id_ot` pueden ser primarias; `id_ot` sería autoincremental y `numero` algo visible al usuario.  
> `id_sector` es foránea porque es la clave primaria de otra relación.  
> No es recomendable que una foránea se repita porque pierde el propósito.

## Recuperación inmediata

> `{id_ot, descripcion}` es superclave porque representa inequívocamente a una tupla, pero no es mínima.  
> Si `id_ot` y `numero` son únicos, ambos son claves candidatas.  
> Si elegimos `id_ot` como PK, `numero` sigue siendo clave candidata y puede parametrizarse su unicidad.  
> Cinco órdenes pueden tener `id_sector = 4`; es justamente el propósito de referenciar la clave de otra relación.

## Aplicación final

```text
SECTOR 1:N ORDEN_TRABAJO
FK: ORDEN_TRABAJO.id_sector
Grado ORDEN_TRABAJO: 6
Cardinalidad del ejemplo: 3
PK: id_ot
```

- agregar una OT cambia la cardinalidad;
- agregar `fecha_programada` cambia el grado.

---

# 9. Recuperación transversal

## TDA

Primera respuesta:

> Es un conjunto de datos u objetos, con un comportamiento definido, abstrayéndose de la implementación.

Se corrigió que debe aparecer explícitamente la **interfaz** mediante la cual se usan las operaciones independientemente de la implementación.

## Sobrecarga / sobrescritura

Primera respuesta:

> Sobrecarga = misma función con más parámetros.  
> Sobrescritura = mismo nombre de función con comportamiento cambiado.

Recuperación final:

```text
Sobrecarga = mismo método con diferentes parámetros.
Sobrescritura = función heredada a la cual se le cambia el comportamiento.
```

## PDU

Primera respuesta errónea:

> PDU = Proceso Unificado de Desarrollo...

Segunda respuesta todavía incorrecta en la sigla:

> PDU = Protocolo de Datos Unificado.

Respuesta final correcta:

> PDU = Unidad de Datos de Protocolo.

La definición conceptual a retener es `datos + información de control del protocolo`.

## Puerto

> El puerto identifica la aplicación o el proceso.

Respuesta final:

> Identificador de un proceso o servicio de transporte dentro del host.

## Síncrona / asíncrona

Primera respuesta incorrecta relacionó sincronismo con retransmisión y tolerancia a fallos.

Recuperación:

```text
Asíncrona = carácter + start/stop.
Síncrona = bloque + cabecera/terminación.
```

---

# 10. Evaluación final escrita/integrada

## 1. PUD

> Dirigido por casos de uso: son la representación de los requerimientos del usuario y forman parte del análisis, desarrollo, implementación y prueba.  
> Centrado en arquitectura: se centra en las decisiones para crear el software: subsistemas, almacenamiento, herramientas de desarrollo e integraciones.  
> Iterativo e incremental: una iteración es un mini proyecto donde se trabaja en requisitos, análisis, desarrollo, implementación y prueba; el incremento es el producto que deja esa iteración.

## 2. Fases

> Inicio: analizar el problema, obtener información, investigar y establecer visión y alcance.  
> Elaboración: construir la base arquitectónica, casos de uso y modelos.  
> Construcción: creación del producto.  
> Transición: entrega al usuario, beta, capacitación y retroalimentación.

## 3. Estado, comportamiento e identidad

> Estado: valores de los atributos. Ejemplos: descripción, estado pendiente, prioridad media.  
> Comportamiento: métodos de la clase que puede realizar el objeto; `iniciar`, `despachar`, `cambiarPrioridad`.  
> Identidad: representación inequívoca del objeto; aunque tenga los mismos estados, cada instancia es única.

## 4. Encapsulamiento

> El encapsulamiento es el pilar de POO para proteger los estados y comportamientos de un objeto, para que no cualquier clase pueda editar directamente los atributos.

## 5. Modelo relacional

> Relación: `ORDEN_TRABAJO`.  
> Tupla: registro de la relación.  
> Atributo: campos de la relación.  
> Dominio: todos los estados posibles de un atributo.  
> Grado: cantidad de atributos = 6.  
> Cardinalidad: cantidad de tuplas.

## 6. Claves

> Superclave = conjunto de atributos que representan inequívocamente una tupla.  
> Clave candidata = superclave mínima.  
> Clave primaria = clave candidata seleccionada.  
> Clave foránea = atributo que referencia la clave de otra relación.

## 7. Integración PUD + POO + BD

> Decisión arquitectónica: base de datos relacional.  
> Clase: `OrdenTrabajo`.  
> Comportamiento: `despachar()`.  
> Relación necesaria: `ordenes_trabajos`.

## 8. Iteración

> Actividades: requisitos, análisis, desarrollo, implementación y pruebas.  
> Incremento: el sistema permite programar OT teniendo en cuenta fecha, hora y prioridad.  
> Riesgo: no considerar el estado/campo de bloqueo de la OT.

## 9. Diferencias

> Iteración: mini proyecto con requisitos, análisis, desarrollo, implementación y prueba. Incremento: producto que deja la iteración.  
> Sobrecarga: mismo método con diferentes parámetros.  
> Sobrescritura: función heredada a la cual se le cambia el comportamiento.

## 10. Recuperación transversal

```text
TDA = Tipo de Dato Abstracto
PDU = Unidad de Datos de Protocolo
Puerto = identificador de un proceso o servicio de transporte dentro del host
Asíncrona = carácter + start/stop
Síncrona = bloque + cabecera/terminación
```

---

# 11. Defensa oral — cinco preguntas

## Pregunta 1 — Caso de uso + arquitectura + clase + persistencia

Puntos principales de la respuesta:

- caso de uso como función derivada de requerimientos;
- arquitectura como base de decisiones que permite realizar esas funciones;
- clase Java como abstracción de objetos que participan en el caso;
- relación/base de datos como persistencia de la información.

**Puntaje:** 0,33/0,40.

## Pregunta 2 — Estado + comportamiento + encapsulamiento

Puntos principales:

- `estado` es atributo;
- `despachar()` es comportamiento/método;
- encapsulamiento evita cambios arbitrarios desde otras clases.

**Puntaje:** 0,38/0,40.

## Pregunta 3 — Claves

Puntos principales:

- superclave identifica inequívocamente;
- candidata = superclave mínima;
- primaria = candidata seleccionada;
- foránea = referencia a otra relación;
- `id_ot` PK, `numero` candidata, `numero + descripcion` superclave y `id_sector` FK.

**Puntaje:** 0,39/0,40.

## Pregunta 4 — Fases y producto de cada fase

Puntos principales:

- Inicio: visión y alcance;
- Elaboración: base arquitectónica y casos de uso;
- Construcción: producto;
- Transición: entrega/beta/retroalimentación.

Se corrigió al final que una iteración produce un incremento y un ciclo completo produce una nueva versión.

**Puntaje:** 0,36/0,40.

## Pregunta 5 — Reglas de OT integradas

Reglas:

- OT nueva = `PENDIENTE`;
- prioridad entre 1 y 5;
- sector obligatorio.

Puntos principales:

- POO: atributos privados, validación mediante métodos, estado inicial desde constructor;
- Base de Datos: persistencia relacional y relación con `SECTOR`;
- PUD: se ubicó inicialmente todo en Elaboración; se corrigió la diferencia entre fase y flujos de Requisitos/Análisis/Diseño/Implementación/Prueba.

**Puntaje:** 0,34/0,40.

### Total oral

**1,80/2,00 = 9,0/10 — APROBADO**

---

# 12. Resultado

- Evaluación escrita/integrada: **9,0/10**.
- Defensa oral: **9,0/10**.
- Resultado global del Día 5: **9,0/10 — APROBADO**.
