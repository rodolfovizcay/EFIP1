# Ficha — Lista simplemente enlazada
## Día 10 — 17/08/2026

---

# 1. Concepto

Una lista simplemente enlazada es una estructura lineal dinámica formada por nodos.

Cada nodo contiene:

```text
un dato
+
una referencia al siguiente nodo
```

Representación:

```text
cabeza
  ↓
[A] → [B] → [C] → null
```

La referencia `cabeza` permite acceder al primer nodo. El último nodo apunta a `null`.

---

# 2. Lista frente a arreglo, Pila y Cola

## Arreglo

```text
- posiciones contiguas;
- capacidad definida o redimensionada;
- acceso por índice;
- mover elementos puede ser necesario.
```

## Lista simple

```text
- nodos enlazados;
- tamaño variable según memoria disponible;
- no exige posiciones contiguas;
- acceso secuencial;
- inserciones/eliminaciones modifican referencias.
```

## Pila

```text
- política LIFO;
- entrada y salida por la cima.
```

## Cola

```text
- política FIFO;
- entrada por final y salida por frente.
```

## Lista

```text
- no impone por sí sola LIFO ni FIFO;
- permite insertar, buscar, modificar y eliminar según la interfaz elegida.
```

---

# 3. Nodo

Ejemplo Java:

```java
final class Nodo {
    String dato;
    Nodo siguiente;

    Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
```

Regla:

```text
Nodo actual
→ contiene el dato actual.

actual.siguiente
→ referencia al próximo nodo.
```

---

# 4. Lista vacía

```text
cabeza = null
```

Antes de recorrer o eliminar hay que comprobar:

```java
if (cabeza == null) {
    // lista vacía
}
```

No hacerlo puede provocar acceso a una referencia nula.

---

# 5. Insertar al inicio

Estado inicial:

```text
cabeza
  ↓
[A] → [B] → null
```

Nuevo nodo:

```text
[N]
```

Pasos:

```text
1. nuevo.siguiente = cabeza
2. cabeza = nuevo
```

Resultado:

```text
cabeza
  ↓
[N] → [A] → [B] → null
```

Java:

```java
public void insertarInicio(String dato) {
    Nodo nuevo = new Nodo(dato);
    nuevo.siguiente = cabeza;
    cabeza = nuevo;
}
```

---

# 6. Insertar al final

Casos:

```text
Lista vacía
→ el nuevo nodo se convierte en cabeza.

Lista con elementos
→ recorrer hasta que actual.siguiente == null.
```

Java:

```java
public void insertarFinal(String dato) {
    Nodo nuevo = new Nodo(dato);

    if (cabeza == null) {
        cabeza = nuevo;
        return;
    }

    Nodo actual = cabeza;
    while (actual.siguiente != null) {
        actual = actual.siguiente;
    }

    actual.siguiente = nuevo;
}
```

---

# 7. Recorrer

Patrón básico:

```java
Nodo actual = cabeza;

while (actual != null) {
    // trabajar con actual.dato
    actual = actual.siguiente;
}
```

Error frecuente:

```java
while (actual.siguiente != null)
```

Ese patrón no procesa correctamente el último nodo si se usa sin cuidado.

---

# 8. Buscar

```java
public boolean contiene(String buscado) {
    Nodo actual = cabeza;

    while (actual != null) {
        if (actual.dato.equals(buscado)) {
            return true;
        }
        actual = actual.siguiente;
    }

    return false;
}
```

Para `String`:

```text
usar equals()
no usar == para comparar contenido
```

---

# 9. Modificar

```java
public boolean modificar(String anterior, String nuevo) {
    Nodo actual = cabeza;

    while (actual != null) {
        if (actual.dato.equals(anterior)) {
            actual.dato = nuevo;
            return true;
        }
        actual = actual.siguiente;
    }

    return false;
}
```

La operación devuelve `false` si no encuentra el elemento.

---

# 10. Eliminar

Hay dos casos principales.

## Eliminar cabeza

```text
cabeza contiene el dato buscado
→ cabeza = cabeza.siguiente
```

## Eliminar nodo intermedio o final

Se necesitan dos referencias:

```text
anterior
actual
```

Cuando se encuentra:

```text
anterior.siguiente = actual.siguiente
```

Java:

```java
public boolean eliminar(String dato) {
    if (cabeza == null) {
        return false;
    }

    if (cabeza.dato.equals(dato)) {
        cabeza = cabeza.siguiente;
        return true;
    }

    Nodo anterior = cabeza;
    Nodo actual = cabeza.siguiente;

    while (actual != null) {
        if (actual.dato.equals(dato)) {
            anterior.siguiente = actual.siguiente;
            return true;
        }

        anterior = actual;
        actual = actual.siguiente;
    }

    return false;
}
```

---

# 11. Evolución completa

Inicio:

```text
null
```

Insertar `OT-101`:

```text
cabeza → [OT-101] → null
```

Insertar `OT-050` al inicio:

```text
cabeza → [OT-050] → [OT-101] → null
```

Insertar `OT-205` al final:

```text
cabeza → [OT-050] → [OT-101] → [OT-205] → null
```

Modificar `OT-101` por `OT-102`:

```text
cabeza → [OT-050] → [OT-102] → [OT-205] → null
```

Eliminar `OT-050`:

```text
cabeza → [OT-102] → [OT-205] → null
```

Eliminar `OT-205`:

```text
cabeza → [OT-102] → null
```

---

# 12. Riesgos

## Perder la cabeza

Incorrecto:

```java
cabeza = cabeza.siguiente;
```

si no se pretendía eliminar el primer nodo.

## Perder el resto de la lista

Incorrecto:

```java
actual.siguiente = nuevo;
```

sin conservar la referencia que existía cuando se inserta en el medio.

## Bucle infinito

Ocurre si nunca se ejecuta:

```java
actual = actual.siguiente;
```

## Comparación incorrecta

```java
dato == buscado
```

compara referencias de `String`.

## No tratar lista vacía

Intentar acceder a:

```java
cabeza.dato
```

cuando `cabeza == null`.

---

# 13. Análisis operativo

Para una lista de `n` nodos:

```text
Insertar al inicio
→ no necesita recorrer la lista.

Buscar
→ puede requerir recorrer todos los nodos.

Modificar por valor
→ primero debe buscar.

Eliminar por valor
→ puede requerir recorrer todos los nodos.

Insertar al final sin referencia final
→ requiere recorrido.
```

Si se mantiene una referencia adicional al final, la inserción final puede evitar el recorrido, pero aumenta el estado que debe mantenerse consistente.

---

# 14. TDA frente a implementación

El contrato podría ser:

```text
insertarInicio(dato)
insertarFinal(dato)
contiene(dato)
modificar(anterior, nuevo)
eliminar(dato)
esVacia()
tamanio()
```

La implementación con nodos es una decisión interna.

El usuario del TDA no necesita conocer:

```text
cabeza
Nodo
siguiente
recorridos
referencias
```

---

# 15. Caso SIGO

Lista de puntos de relevamiento:

```text
Punto-01
Punto-02
Punto-03
```

Operaciones:

```text
insertar un nuevo punto
buscar por código
modificar observación
eliminar un punto descartado
mostrar todos
```

Una lista es adecuada porque no se exige una política estricta LIFO o FIFO y el número de puntos puede variar durante el relevamiento.

---

# 16. Preguntas de control

1. ¿Qué contiene un nodo?
2. ¿Qué representa `cabeza`?
3. ¿Cómo se representa una lista vacía?
4. ¿Cómo se inserta al inicio?
5. ¿Por qué buscar requiere recorrido?
6. ¿Qué referencias se usan para eliminar un nodo intermedio?
7. ¿Cómo se elimina la cabeza?
8. ¿Por qué no usar `==` para `String`?
9. ¿Qué riesgo existe al perder una referencia?
10. ¿Qué permanece como contrato del TDA?
