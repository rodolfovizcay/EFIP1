# Jueves 6/8 — Día 2  
## Análisis y Diseño + Programación Orientada a Objetos

**Duración:** 2 horas y 30 minutos  
**Materias:** Análisis y Diseño de Software + POO  
**Meta de aprobación del día:** 7/10 o más  
**Condición:** estudiar para explicar, aplicar y justificar; no solo para reconocer.

---

# 1. Objetivos

Al terminar la jornada deberías poder:

1. Definir modelo, metodología, método, técnica y herramienta.
2. Comparar cascada, incremental, prototipado y espiral.
3. Explicar las tres características del PUD.
4. Diferenciar fase, iteración e incremento.
5. Identificar el objetivo de inicio, elaboración, construcción y transición.
6. Definir clase, objeto, estado, comportamiento e identidad.
7. Explicar constructor y encapsulamiento.
8. Escribir una clase Java breve con atributos privados, constructor y comportamiento.
9. Recuperar cuatro errores del Día 1.

---

# 2. Fuentes

## Análisis y Diseño

En `Analisis_y_Diseno_de_Software.md`:

- páginas 2–8: modelos, principios y metodología;
- páginas 10–18: modelos de proceso;
- páginas 81–94: PUD, características, fases, artefactos y flujos.

## POO

En `INF382_Programacion_Orientada_a_Objetos.md`:

- secciones `Objetos`;
- `Clases`;
- `Método constructor`;
- `Encapsulamiento`;
- `Modificadores de acceso`.

No hace falta leer el material completo. Usar las síntesis de esta guía y consultar la fuente solo para ampliar.

---

# 3. Cronograma — 2 h 30 min

| Tiempo | Bloque |
|---|---|
| 00:00–00:15 | Recuperación del Día 1 |
| 00:15–00:45 | Modelos y metodología |
| 00:45–01:15 | PUD, fases, iteraciones e incrementos |
| 01:15–01:25 | Descanso |
| 01:25–01:50 | Clase, objeto, estado, comportamiento e identidad |
| 01:50–02:10 | Constructor y encapsulamiento |
| 02:10–02:25 | Práctica integrada |
| 02:25–02:30 | Preparación de la evaluación |

La evaluación puede realizarse inmediatamente después o en un bloque separado de 20–30 minutos.

---

# 4. Bloque 1 — Recuperación del Día 1

Responder sin mirar y después verificar:

## Tarjeta 1

**Arquitectura no es documentación.**

- Arquitectura: decisiones significativas sobre organización, elementos, interfaces, colaboraciones, subsistemas y plataforma.
- Documentación: artefactos usados para representar y comunicar esas decisiones.

## Tarjeta 2

```text
Herencia    = es un
Asociación  = se relaciona con
Agregación  = tiene partes que pueden existir separadas
Composición = tiene partes dependientes del todo
Dependencia = usa temporalmente
```

## Tarjeta 3

```text
Estado      = valores actuales de los atributos
Visibilidad = quién puede acceder a un miembro
```

## Tarjeta 4

```text
Sobrecarga    = mismo nombre, parámetros diferentes
Sobrescritura = mismo método heredado, nueva implementación
```

### Control

- [ ] Respondí las cuatro tarjetas sin mirar.
- [ ] Pude dar un ejemplo propio de cada una.

---

# 5. Bloque 2 — Modelos y metodología

## 5.1 Modelo

> Un modelo es una simplificación de la realidad que permite comprender y representar un sistema desde una perspectiva determinada.

Los modelos pueden destacar:

- estructura;
- comportamiento;
- organización;
- dinámica;
- elementos físicos;
- elementos lógicos.

## 5.2 Para qué se modela

El material establece cuatro finalidades principales:

1. Visualizar cómo es o cómo se desea que sea el sistema.
2. Especificar su estructura o comportamiento.
3. Obtener una guía para construir el programa.
4. Documentar decisiones.

## 5.3 Principios del modelado

1. La elección del modelo influye en la forma de entender el problema y construir la solución.
2. Un modelo puede expresarse con diferentes niveles de precisión.
3. Los mejores modelos están ligados a la realidad.
4. Un sistema no trivial necesita varios modelos complementarios.

## 5.4 Metodología, método, técnica y herramienta

| Concepto | Definición breve |
|---|---|
| Metodología | Camino sistemático que organiza fases, tareas, reglas, técnicas, herramientas y productos |
| Método | Indica cómo construir técnicamente una parte del sistema |
| Técnica | Procedimiento estructurado y repetible para una tarea concreta |
| Herramienta | Soporte automatizado o semiautomatizado para aplicar métodos y técnicas |

## 5.5 Modelos de proceso

| Modelo | Idea central | Cuándo resulta útil | Limitación principal |
|---|---|---|---|
| Cascada | Etapas secuenciales | Requisitos estables y bien definidos | Cambios tardíos y versión funcional demorada |
| Incremental | Entregas sucesivas que agregan funcionalidad | Necesidad de entregar valor temprano | Requiere planificar integración entre incrementos |
| Prototipado | Construir una representación rápida para aclarar requisitos | Requisitos poco claros | El usuario puede confundir prototipo con producto final |
| Espiral | Desarrollo evolutivo e iterativo con atención a riesgos | Proyectos complejos o riesgosos | Gestión más compleja |

### Pregunta de recuperación activa

Tomando el proyecto SIGO:

- ¿Qué modelos utilizaste?
- ¿Qué parte se aproxima a un desarrollo incremental?
- ¿Dónde utilizaste prototipos o revisiones sucesivas?

---

# 6. Bloque 3 — Proceso Unificado de Desarrollo

## 6.1 Definición

> El PUD es un proceso de desarrollo de software que organiza las actividades necesarias para transformar requisitos de usuario en un sistema de software y utiliza UML para representar sus modelos.

## 6.2 Tres características esenciales

### Dirigido por casos de uso

Los casos de uso:

- representan requisitos funcionales;
- describen resultados de valor;
- guían análisis, diseño, implementación y pruebas;
- constituyen el hilo conductor del desarrollo.

### Centrado en la arquitectura

La arquitectura contiene las decisiones significativas sobre:

- organización del sistema;
- subsistemas;
- elementos estructurales;
- interfaces;
- colaboraciones;
- plataforma;
- base de datos;
- comunicaciones;
- requisitos no funcionales.

Los casos de uso representan la función y la arquitectura representa la forma. Deben evolucionar de manera equilibrada.

### Iterativo e incremental

- **Iteración:** miniproyecto planificado que recorre requisitos, análisis, diseño, implementación y prueba.
- **Incremento:** crecimiento concreto del producto obtenido como resultado de una iteración.

Cada iteración selecciona casos de uso y riesgos importantes.

## 6.3 Fases del PUD

| Fase | Pregunta principal | Resultado esperado |
|---|---|---|
| Inicio | ¿Qué sistema se construirá y es viable? | Alcance, casos críticos, riesgos, arquitectura inicial y plan |
| Elaboración | ¿Cómo se construirá con una arquitectura estable? | Mayoría de casos detallados y línea base arquitectónica |
| Construcción | ¿Cómo completar el producto? | Sistema completo preparado para usuarios |
| Transición | ¿Cómo ponerlo en uso? | Beta, correcciones, formación y entrega |

## 6.4 Fase frente a iteración

Una fase es un período del ciclo con un objetivo mayor. Dentro de una fase puede haber varias iteraciones.

```text
FASE DE ELABORACIÓN
  ├── Iteración 1 → incremento
  ├── Iteración 2 → incremento
  └── Iteración 3 → línea base de arquitectura
```

### Práctica oral

Explicar durante cinco minutos:

1. Qué es el PUD.
2. Sus tres características.
3. Las cuatro fases.
4. Diferencia entre iteración e incremento.
5. Un ejemplo tomado de SIGO.

---

# 7. Bloque 4 — Fundamentos de POO

## 7.1 Clase

> Una clase es una plantilla o abstracción que define atributos, métodos, relaciones y semántica comunes para un conjunto de objetos.

## 7.2 Objeto

> Un objeto es una instancia concreta de una clase y posee estado, comportamiento e identidad.

## 7.3 Estado

> El estado es el conjunto de valores actuales de los atributos de un objeto.

Ejemplo:

```text
OrdenTrabajo 145
prioridad = ALTA
estado = DESPACHADA
sector = ENERGÍA
```

## 7.4 Comportamiento

> Es la forma en que el objeto actúa y reacciona; se expresa mediante métodos.

Ejemplos:

- programar;
- asignar;
- iniciar;
- finalizar;
- cancelar.

## 7.5 Identidad

> Es la propiedad que permite diferenciar un objeto de todos los demás, aun cuando tengan valores similares.

Dos OT pueden tener igual fecha, prioridad y tarea, pero siguen siendo objetos distintos.

---

# 8. Bloque 5 — Constructor y encapsulamiento

## 8.1 Constructor

Es una operación especial utilizada para crear un objeto e inicializar su estado.

Características básicas en Java:

- tiene el mismo nombre de la clase;
- no declara tipo de retorno;
- puede recibir parámetros;
- puede existir más de un constructor con distintos parámetros;
- si no se declara ninguno, Java puede proporcionar uno por defecto.

## 8.2 Encapsulamiento

> Consiste en ocultar la implementación interna y exponer una interfaz controlada.

Aplicación habitual:

- atributos privados;
- métodos públicos;
- validaciones dentro de constructores o métodos;
- acceso mediante getters cuando corresponde;
- setters solo cuando la modificación es válida para el modelo.

## 8.3 Modificadores

| Modificador | Acceso general |
|---|---|
| `private` | Solo la propia clase |
| sin modificador | La clase y el mismo paquete |
| `protected` | Clase, paquete y subclases |
| `public` | Desde cualquier clase con visibilidad |

## 8.4 Clase modelo

```java
public class OrdenTrabajo {

    private int id;
    private String tarea;
    private String estado;

    public OrdenTrabajo(int id, String tarea) {
        this.id = id;
        this.tarea = tarea;
        this.estado = "PENDIENTE";
    }

    public void iniciar() {
        this.estado = "EN_EJECUCION";
    }

    public String getEstado() {
        return estado;
    }
}
```

### Qué demuestra

- `id`, `tarea` y `estado`: estado del objeto.
- `iniciar()`: comportamiento.
- `OrdenTrabajo(...)`: constructor.
- `private`: encapsulamiento.
- `this`: referencia al objeto actual.

---

# 9. Práctica integrada

## Ejercicio A — Proyecto propio y PUD

Elegir una parte del proyecto SIGO y responder entre 10 y 15 líneas:

1. ¿Qué problema representa?
2. ¿Qué modelos se utilizaron?
3. ¿Qué casos de uso funcionan como hilo conductor?
4. ¿Qué decisiones pertenecen a la arquitectura?
5. ¿En qué fase del PUD ubicarías el trabajo actual?
6. Mencionar una iteración y el incremento que produjo.

## Ejercicio B — Clase Java

Escribir una clase `OrdenTrabajo` de entre 15 y 25 líneas que incluya:

- `id`;
- `descripcion`;
- `prioridad`;
- `estado`;
- constructor;
- método `iniciar()`;
- método `cambiarPrioridad(...)`;
- un getter;
- atributos privados.

No agregar funciones que no puedas justificar desde el dominio.

---

# 10. Evaluación del Día 2

La evaluación se encuentra en:

`EVALUACIONES/2026-08-06_EVALUACION-DIA-02.md`

Incluye:

- recuperación de errores;
- conceptos de modelado;
- PUD;
- POO;
- ejercicio Java;
- defensa oral.

---

# 11. Cierre esperado

Al cerrar el día deben quedar:

- nota de Análisis y Diseño;
- nota de POO;
- errores recuperados o aún abiertos;
- una explicación oral del PUD;
- una clase Java corregida;
- resumen de una página.

## Comando de inicio

> **Iniciar EFIP — 2026-08-06**
