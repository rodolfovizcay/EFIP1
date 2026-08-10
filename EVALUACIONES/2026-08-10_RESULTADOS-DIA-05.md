# Resultados de evaluación — Día 5

**Fecha:** 10/08/2026  
**Materias principales:** Análisis y Diseño + POO + Base de Datos  
**Recuperación transversal:** Algoritmos/Estructuras + Comunicaciones

---

## Resultado general

| Instancia | Nota |
|---|---:|
| Evaluación escrita/integrada | **9,0/10** |
| Defensa oral | **9,0/10** |
| **Resultado global** | **9,0/10** |

**Estado: APROBADO**

---

## Evaluación escrita/integrada

| Pregunta | Tema | Puntaje |
|---|---|---:|
| 1 | Características del PUD | 0,95/1 |
| 2 | Fases del PUD | 0,95/1 |
| 3 | Estado, comportamiento e identidad | 0,95/1 |
| 4 | Encapsulamiento | 0,85/1 |
| 5 | Modelo relacional | 0,90/1 |
| 6 | Claves | 0,90/1 |
| 7 | Integración PUD + POO + BD | 0,75/1 |
| 8 | Iteración aplicada | 0,90/1 |
| 9 | Iteración/incremento + sobrecarga/sobrescritura | 0,95/1 |
| 10 | Recuperación transversal | 0,90/1 |
| **Total** | | **9,0/10** |

### Fortalezas

- PUD aplicado a un caso real.
- Construcción/Transición e iteración/incremento correctamente diferenciados.
- Estado, comportamiento, identidad y encapsulamiento correctamente aplicados.
- Modelo relacional básico y claves recuperados.
- Sobrecarga/sobrescritura recuperada.
- Puerto y síncrona/asíncrona corregidos en recuperación.

### Ajustes

- Encapsulamiento debe formularse como ocultación de datos/detalles de implementación y exposición de una interfaz controlada.
- En integración de Base de Datos conviene modelar más de una relación cuando el caso lo requiere; `ORDEN_TRABAJO` sola no representa todas las asociaciones.
- TDA debe incluir explícitamente la interfaz independiente de implementación.
- PDU debe retenerse como Unidad de Datos de Protocolo y conceptualmente como datos + información de control.

---

## Defensa oral

| Pregunta | Tema | Puntaje |
|---|---|---:|
| 1 | Caso de uso + arquitectura + clase + persistencia | 0,33/0,40 |
| 2 | Estado + comportamiento + encapsulamiento | 0,38/0,40 |
| 3 | Superclave/candidata/primaria/foránea | 0,39/0,40 |
| 4 | Fases del PUD y resultado de cada fase | 0,36/0,40 |
| 5 | Reglas de OT integradas en POO + BD + PUD | 0,34/0,40 |
| **Total** | | **1,80/2,00 = 9,0/10** |

### Fortalezas orales

- Capacidad de relacionar conceptos entre materias.
- Buena aplicación a `OrdenTrabajo` y al dominio real.
- Claves explicadas con ejemplos propios.
- Encapsulamiento justificado desde reglas del negocio.

### Ajustes orales

1. No decir que “los atributos tienen estados”: los valores de los atributos constituyen el estado del objeto.
2. Superclave puede ser uno o más atributos.
3. Una iteración produce un incremento; un ciclo completo produce una versión.
4. Las fases del PUD no son los flujos de trabajo. Requisitos, Análisis, Diseño, Implementación y Prueba se recorren dentro de iteraciones con distinta intensidad según la fase.
5. Una relación del modelo relacional es una tabla; las asociaciones entre relaciones se representan mediante claves cuando corresponde.

---

## Recuperaciones del Día 5

| Tema | Situación inicial | Resultado al cierre |
|---|---|---|
| Arquitectura / documentación | Error histórico | Recuperado y defendido |
| Construcción / Transición | Error histórico | Consolidado |
| Iteración / incremento | Imprecisión histórica | Aplicado y defendido |
| Estado / comportamiento | Error histórico | Consolidado |
| Identidad / ID | Parcial | Recuperado y defendido |
| TDA | Faltaba interfaz/implementación | Comprendido; retención pendiente |
| Sobrecarga / sobrescritura | Definición inestable | Recuperado con ejemplos |
| Clave candidata | No se fijaba minimalidad | Recuperado: superclave mínima |
| Clave foránea | Definición/repetición confusas | Recuperado; repetición 1:N comprendida |
| PDU | Confusión con PUD y sigla incorrecta | Corregido; retención pendiente |
| Puerto | Definición imprecisa | Recuperado |
| Síncrona / asíncrona | Confundida con retransmisión | Corregido; retención pendiente |

---

## Java escrito

La lógica de la clase `OrdenTrabajo` fue correcta en:

- atributos privados;
- tipos de datos;
- uso de `this`;
- getters;
- validación de prioridad con `if` y `&&`;
- cambio de estado mediante `despachar()`.

Error principal:

```java
public void contrictor(...)
```

Corrección:

```java
public OrdenTrabajo(...)
```

El constructor debe tener el mismo nombre de la clase y no declarar tipo de retorno.

---

## Interpretación académica

El Día 5 muestra un cambio cualitativo respecto del diagnóstico inicial: los núcleos de PUD, fundamentos POO y modelo relacional ya no se limitan al reconocimiento de conceptos, sino que se aplican sobre casos concretos y pueden defenderse oralmente dentro del alcance efectivamente trabajado.

No se considera que las asignaturas completas estén en estado `DO`; ese estado se asigna únicamente a los temas defendidos durante esta jornada.

---

## Próxima recuperación obligatoria

- constructor Java;
- fases vs. flujos del PUD;
- TDA incluyendo `interfaz`;
- PDU = datos + información de control;
- síncrona/asíncrona;
- TCP/IP como arquitectura/pila.
