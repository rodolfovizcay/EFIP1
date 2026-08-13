# Ficha de estudio — Cola

**Fecha:** 13/08/2026  
**Materia:** Taller de Algoritmos y Estructuras de Datos I  
**Producto del plan:** ficha de cola

---

# 1. Definición

Una Cola o `queue` es un Tipo de Dato Abstracto lineal restrictivo.

```text
Inserción  → final
Extracción → frente
```

Regla:

```text
FIFO = First In, First Out
     = primero en entrar, primero en salir
```

Ejemplo:

```text
Frente → [A][B][C] ← Final
```

A es el próximo elemento que sale.

---

# 2. Elementos principales

```text
Frente / cabecera
→ primer elemento de la cola.
→ extremo de extracción.

Final / cola
→ último elemento de la cola.
→ extremo de inserción.
```

Cuando existe un único elemento:

```text
Frente = Final
```

Cuando queda vacía:

```text
Frente = null
Final  = null
```

en la implementación enlazada del material.

---

# 3. Interfaz del TDA

El material presenta estas operaciones:

```text
longitud()
esVacia()
encolar(elemento)
desencolar()
cabecera()
```

## `longitud()`

Devuelve la cantidad de elementos.

## `esVacia()`

Indica si no existen elementos.

## `encolar(elemento)`

Agrega al final.

## `desencolar()`

Devuelve y elimina el frente.

## `cabecera()`

Devuelve/consulta el frente sin eliminarlo.

---

# 4. Simulación básica

Partimos de una cola vacía.

```text
encolar(A)
encolar(B)
encolar(C)
cabecera()
desencolar()
encolar(D)
desencolar()
```

| Paso | Operación | Devuelve | Estado | Frente | Final |
|---:|---|---|---|---|---|
| 0 | inicio | — | `[]` | — | — |
| 1 | `encolar(A)` | — | `[A]` | A | A |
| 2 | `encolar(B)` | — | `[A,B]` | A | B |
| 3 | `encolar(C)` | — | `[A,B,C]` | A | C |
| 4 | `cabecera()` | A | `[A,B,C]` | A | C |
| 5 | `desencolar()` | A | `[B,C]` | B | C |
| 6 | `encolar(D)` | — | `[B,C,D]` | B | D |
| 7 | `desencolar()` | B | `[C,D]` | C | D |

Resultado final:

```text
Cola   = [C,D]
Frente = C
Final  = D
```

---

# 5. Cola enlazada

## Campos conceptuales

```text
cabecera
cola
longitud
```

```text
cabecera → primer nodo
cola     → último nodo
```

## Nodo

```text
Nodo
- elemento
- siguiente
```

## Encolar

Adaptación didáctica del algoritmo del material:

```text
nuevo = Nodo(elemento, null)

si longitud == 0:
    cabecera = nuevo
si no:
    cola.siguiente = nuevo

cola = nuevo
longitud++
```

### Caso vacío

```text
cabecera → nuevo
cola     → nuevo
```

### Caso no vacío

```text
cola anterior.siguiente → nuevo
cola → nuevo
```

## Desencolar

```text
si está vacía:
    no hay elemento

valor = cabecera.elemento
cabecera = cabecera.siguiente
longitud--

si longitud == 0:
    cola = null

retornar valor
```

## Consultar cabecera

```text
si está vacía:
    no hay elemento
si no:
    retornar cabecera.elemento
```

No modifica la cola.

---

# 6. Cola con vector

## Campos conceptuales

```text
vector[n]
frente
final
cantidad
```

El material señala que se necesitan dos punteros/índices:

```text
f → frente
r → final
```

## Operaciones

```text
encolar
→ colocar elemento en final.

desencolar
→ retirar elemento en frente.

cabecera
→ consultar vector[frente].
```

## Controles

- cola vacía;
- cola llena;
- límites de índices;
- actualización de frente/final;
- cantidad actual.

## Riesgo

```text
capacidad definida
→ posible desbordamiento cuando se llena.
```

Una cola circular puede reutilizar posiciones, pero se considera extensión del núcleo del día.

---

# 7. Vector vs. lista enlazada

| Criterio | Vector | Lista enlazada |
|---|---|---|
| Tamaño | Definido | Variable |
| Frente/final | Índices | Referencias |
| Elementos | Posiciones contiguas | Nodos enlazados |
| Memoria | Puede reservar espacios vacíos | Cada nodo agrega enlace |
| Encolar | Índice final | Nodo nuevo al final |
| Desencolar | Índice frente | Mover cabecera |
| Riesgo | Capacidad/desbordamiento | Referencias/memoria |
| Elección | Máximo conocido | Volumen incierto |

La interfaz permanece:

```text
encolar
desencolar
cabecera
esVacia
longitud
```

---

# 8. Pila vs. Cola

| Criterio | Pila | Cola |
|---|---|---|
| Política | LIFO | FIFO |
| Inserción | Cima | Final |
| Extracción | Cima | Frente |
| Próximo en salir | Último agregado | Primero agregado |
| Consulta | `peek()` | `cabecera()` |
| Ejemplo | Deshacer | Turnos/peticiones |

```text
Pila
→ última modificación no confirmada.

Cola
→ primera solicitud pendiente.
```

---

# 9. Aplicaciones

El material menciona:

- programas o peticiones que esperan procesador;
- documentos de impresión;
- usuarios esperando atención;
- reparto de recursos por turno.

Aplicación didáctica en SIGO:

```text
Solicitudes de sincronización de OT
→ se atienden según orden de llegada
→ Cola FIFO
```

---

# 10. Elección según el problema

## Elegir Cola cuando

- debe respetarse orden de llegada;
- la primera petición es la primera atendida;
- se administran turnos o solicitudes pendientes.

## No elegir Cola cuando

- se necesita revertir primero la última acción;
- se necesita prioridad distinta del orden de llegada;
- se necesita acceso arbitrario como operación principal.

Una cola de prioridad existe en el material, pero no es una Cola FIFO convencional pura; su orden depende de prioridad.

---

# 11. Errores frecuentes

| Error | Corrección |
|---|---|
| Encolar por frente | Se encola por final |
| Desencolar por final | Se desencola por frente |
| FIFO = último primero | FIFO = primero primero |
| `cabecera()` elimina | Solo consulta |
| Vector y lista cambian la interfaz | Cambia la implementación, no el TDA |
| Lista enlazada se desborda por tamaño fijo | Se limita por memoria/referencias |
| Al vaciar no limpiar final | Frente y final deben quedar vacíos/null |
| Cola = Pila | Tienen políticas opuestas |

---

# 12. Ejercicio de simulación

Resolver sin apuntes:

```text
encolar(10)
encolar(20)
desencolar()
encolar(30)
encolar(40)
cabecera()
desencolar()
```

Completar:

| Operación | Devuelve | Cola | Frente | Final |
|---|---|---|---|---|
| `encolar(10)` | | | | |
| `encolar(20)` | | | | |
| `desencolar()` | | | | |
| `encolar(30)` | | | | |
| `encolar(40)` | | | | |
| `cabecera()` | | | | |
| `desencolar()` | | | | |

---

# 13. Ejercicio de elección

Clasificar:

```text
Historial Deshacer →
Solicitudes de impresión →
Turnos de atención →
Navegación Atrás →
Peticiones al servidor por llegada →
```

Usar:

```text
Pila
Cola
```

Justificar por LIFO o FIFO.

---

# 14. Respuesta oral modelo

> Una cola es un TDA lineal restrictivo FIFO. Los elementos se insertan por el final y se eliminan por el frente, por lo que el primero en entrar es el primero en salir. Sus operaciones principales son encolar, desencolar, consultar cabecera, verificar si está vacía y consultar longitud. Puede implementarse mediante un vector con índices de frente y final o mediante una lista enlazada con referencias a cabecera y cola. La interfaz permanece igual aunque cambie la implementación.

---

# 15. Control

- [ ] Puedo definir Cola y FIFO.
- [ ] Puedo señalar frente y final.
- [ ] Puedo diferenciar encolar/desencolar/cabecera.
- [ ] Puedo simular operaciones.
- [ ] Puedo explicar una cola enlazada.
- [ ] Puedo explicar una cola con vector.
- [ ] Puedo comparar memoria y riesgos.
- [ ] Puedo diferenciar Pila y Cola.
- [ ] Puedo elegir estructura según la operación dominante.
