# Ficha de estudio — Pila

**Fecha:** 11/08/2026  
**Materia:** Algoritmos y Estructuras de Datos

---

## Definición

Una pila es un **Tipo de Dato Abstracto lineal y restrictivo** en el que las inserciones y extracciones se realizan por un único extremo llamado **cima** o **tope**.

```text
LIFO = Last In, First Out
     = último en entrar, primero en salir
```

---

## Interfaz del TDA

```text
push(elemento)  → agrega en la cima
pop()           → extrae y elimina la cima
peek()/primero()→ consulta la cima sin eliminar
esVacia()       → indica si no hay elementos
longitud()      → cantidad de elementos
```

### Regla central

```text
peek = consulta
pop  = consulta + eliminación
```

---

## Representación

Después de:

```text
push(A)
push(B)
push(C)
```

la pila queda:

```text
cima → C
       B
       A
```

El próximo `pop()` devuelve `C`.

---

## Implementación con vector

```text
Estructura interna:
- arreglo de capacidad definida;
- índice top;
- pila vacía: top = -1.
```

### `push`

```text
comprobar capacidad
incrementar top
guardar en elementos[top]
```

### `pop`

```text
comprobar que no esté vacía
guardar elementos[top]
limpiar posición
decrementar top
devolver elemento
```

### Ventajas

- simple;
- cima localizada por índice;
- sin nodo adicional por elemento.

### Limitaciones

- capacidad definida;
- posible desbordamiento;
- puede reservar espacio sin utilizar.

---

## Implementación con lista enlazada

```text
Estructura interna:
- top referencia al primer nodo;
- nodo = elemento + referencia siguiente;
- longitud.
```

### `push`

```text
nuevo.siguiente = top
top = nuevo
longitud++
```

### `pop`

```text
elemento = top.elemento
top = top.siguiente
longitud--
devolver elemento
```

### Ventajas

- tamaño variable;
- no requiere capacidad fija;
- inserción/extracción directa sobre la cima.

### Limitaciones

- memoria adicional por referencias;
- riesgo de errores al actualizar enlaces;
- limitada por memoria disponible.

---

## Comparación

| Criterio | Vector | Lista enlazada |
|---|---|---|
| Cima | índice | referencia |
| Capacidad | fija/definida | variable |
| Almacenamiento | posiciones | nodos |
| Memoria adicional | menor por elemento | referencia por nodo |
| Interfaz | la misma | la misma |
| Riesgo | desbordamiento | referencias/memoria |

---

## Simulación del Día 6

| Operación | Resultado devuelto | Estado de la pila | Cima |
|---|---|---|---|
| Inicio | — | `[]` | — |
| `push(A)` | — | | |
| `push(B)` | — | | |
| `push(C)` | — | | |
| `peek()` | | | |
| `pop()` | | | |
| `push(D)` | — | | |
| `pop()` | | | |
| `pop()` | | | |

---

## Aplicaciones

- pila de llamadas a métodos;
- deshacer acciones;
- historial de navegación;
- evaluación de expresiones;
- procesamiento anidado.

### Ejemplo OT

```text
push(Cambiar prioridad)
push(Cambiar fecha)
push(Agregar observación)
```

`deshacer()` debe retirar primero `Agregar observación`.

---

## No confundir

```text
Pila → LIFO → mismo extremo para entrar y salir.
Cola → FIFO → entra por un extremo y sale por el otro.
```

Una pila con lista enlazada no es infinita: depende de la memoria disponible.

---

## Respuesta oral modelo

> Una pila es un TDA lineal que sigue LIFO: el último elemento insertado es el primero que se extrae. Su interfaz ofrece operaciones como push, pop y peek. Puede implementarse con un vector o con una lista enlazada; cambia la estructura interna, pero no el comportamiento esperado por quien utiliza el TDA.

---

## Preguntas rápidas

1. ¿Qué significa LIFO?
2. ¿Qué es la cima?
3. ¿Qué hace `push`?
4. ¿Qué diferencia existe entre `pop` y `peek`?
5. ¿Cómo se representa una pila vacía con vector?
6. ¿Cómo se actualiza la cima en una pila enlazada?
7. ¿Qué cambia al reemplazar vector por lista?
8. ¿Qué permanece igual?
9. ¿Cuándo puede desbordarse un vector?
10. ¿Qué problema real resolverías con una pila?
