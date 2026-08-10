# Diagnóstico inicial — 5 de agosto de 2026

## Instrucciones

- Sin apuntes.
- Respuestas breves pero justificadas.
- No se penaliza no recordar una palabra exacta: se registra como necesidad terminológica.
- Tiempo total de resolución: 85 minutos más 10 minutos de integración.
- Cada materia recibe una nota independiente sobre 10.

---

# 0. Autoevaluación

Calificar de 0 a 5:

| Materia | Teoría | Práctica | Defensa oral |
|---|---:|---:|---:|
| Análisis y Diseño |  |  |  |
| POO |  |  |  |
| Algoritmos y Estructuras |  |  |  |
| Base de Datos |  |  |  |
| Comunicaciones |  |  |  |

---

# 1. Análisis y Diseño — 10 puntos

## 1.1 PUD — 3 puntos

Definí el Proceso Unificado de Desarrollo y explicá sus tres características esenciales.

## 1.2 Requerimientos — 2 puntos

Clasificá y justificá:

a. “El sistema debe permitir al encargado programar una orden de trabajo.”

b. “La consulta de una orden debe responder en menos de dos segundos.”

## 1.3 Casos de uso — 2 puntos

Explicá la diferencia entre `include` y `extend`. Agregá un ejemplo de cada uno.

## 1.4 Relaciones de clases — 3 puntos

Explicá la diferencia entre asociación, agregación y composición. Usá un ejemplo.

---

# 2. Programación Orientada a Objetos — 10 puntos

## 2.1 Fundamentos — 2 puntos

Explicá clase, objeto, estado, comportamiento e identidad.

## 2.2 Sobrecarga y sobrescritura — 2 puntos

Explicá la diferencia e incluí un ejemplo conceptual.

## 2.3 Clase abstracta e interfaz — 3 puntos

Indicá cuándo usarías una clase abstracta y cuándo una interfaz.

## 2.4 Lectura de Java — 3 puntos

Analizá este código y explicá qué concepto demuestra y qué se imprimiría:

```java
abstract class Trabajo {
    public abstract String ejecutar();
}

class Reparacion extends Trabajo {
    @Override
    public String ejecutar() {
        return "Reparación ejecutada";
    }
}

public class Principal {
    public static void main(String[] args) {
        Trabajo trabajo = new Reparacion();
        System.out.println(trabajo.ejecutar());
    }
}
```

---

# 3. Algoritmos y Estructuras — 10 puntos

## 3.1 Pila y cola — 3 puntos

Explicá LIFO y FIFO. Proponé un caso de uso para cada estructura.

## 3.2 Arreglo y lista enlazada — 3 puntos

Compará ambas estructuras y explicá cuándo elegirías cada una.

## 3.3 Lista enlazada — 2 puntos

Dibujá o describí una lista con tres nodos y explicá cómo insertar un nodo al inicio.

## 3.4 Ordenación — 2 puntos

Explicá la idea principal de mergesort o quicksort y en qué se diferencia de la ordenación por inserción.

---

# 4. Base de Datos — 10 puntos

## 4.1 Modelo relacional — 2 puntos

Definí relación, tupla, atributo, dominio, grado y cardinalidad.

## 4.2 Normalización — 3 puntos

Analizá esta estructura:

```text
VENTA(
  id_venta,
  fecha,
  id_cliente,
  nombre_cliente,
  id_producto,
  descripcion_producto,
  cantidad,
  precio
)
```

Señalá redundancias y proponé una separación inicial de tablas. No hace falta escribir SQL.

## 4.3 Consulta — 3 puntos

Explicá la diferencia entre `WHERE`, `GROUP BY` y `HAVING`.

## 4.4 Familias SQL — 2 puntos

Clasificá y explicá brevemente: `CREATE`, `INSERT`, `GRANT`, `COMMIT`.

---

# 5. Comunicaciones — 10 puntos

## 5.1 OSI — 3 puntos

Nombrá las siete capas y explicá la función de al menos cuatro.

## 5.2 OSI y TCP/IP — 2 puntos

Explicá cómo se relacionan ambos modelos.

## 5.3 Dispositivos — 2 puntos

Compará switch y router, indicando su función y capa principal.

## 5.4 Transmisión — 3 puntos

Diferenciá:

- transmisión síncrona y asíncrona;
- medio guiado y no guiado.

Incluí un ejemplo de cada uno.

---

# 6. Situación integradora — sin nota independiente

Una cooperativa necesita un sistema web y móvil para registrar y ejecutar órdenes de trabajo. Las órdenes pendientes deben ser atendidas según prioridad y fecha. Los datos se almacenan en una base relacional y los operarios se conectan desde distintos puntos de la ciudad.

En una respuesta de entre 8 y 12 líneas, indicá una decisión de cada materia:

1. Análisis y Diseño.
2. POO.
3. Estructuras de Datos.
4. Base de Datos.
5. Comunicaciones.

Justificá brevemente cada decisión.

---

# 7. Resultado a completar después de la corrección

| Materia | Nota | Estado | Principal fortaleza | Principal brecha |
|---|---:|---|---|---|
| Análisis y Diseño |  |  |  |  |
| POO |  |  |  |  |
| Algoritmos y Estructuras |  |  |  |  |
| Base de Datos |  |  |  |  |
| Comunicaciones |  |  |  |  |

## Prioridades definidas

1. 
2. 
3.
