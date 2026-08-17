# Código didáctico — Lista simplemente enlazada
## Día 10 — 17/08/2026

Guardar como:

```text
DemoListaSimpleOT.java
```

El ejemplo utiliza una única clase pública para evitar el error de declarar varios tipos públicos en el mismo archivo.

```java
public final class DemoListaSimpleOT {

    private DemoListaSimpleOT() {
        // Evita crear instancias de la clase de demostración.
    }

    private static final class Nodo {
        private String dato;
        private Nodo siguiente;

        private Nodo(String dato) {
            this.dato = validarTexto(dato, "dato");
            this.siguiente = null;
        }

        @Override
        public String toString() {
            return dato;
        }
    }

    private static final class ListaSimple {
        private Nodo cabeza;
        private int tamanio;

        public ListaSimple() {
            this.cabeza = null;
            this.tamanio = 0;
        }

        public boolean esVacia() {
            return cabeza == null;
        }

        public int getTamanio() {
            return tamanio;
        }

        public void insertarInicio(String dato) {
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            tamanio++;
        }

        public void insertarFinal(String dato) {
            Nodo nuevo = new Nodo(dato);

            if (cabeza == null) {
                cabeza = nuevo;
                tamanio++;
                return;
            }

            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
            tamanio++;
        }

        public boolean contiene(String buscado) {
            String valor = validarTexto(buscado, "buscado");
            Nodo actual = cabeza;

            while (actual != null) {
                if (actual.dato.equals(valor)) {
                    return true;
                }
                actual = actual.siguiente;
            }

            return false;
        }

        public boolean modificar(String anterior, String nuevoDato) {
            String buscado = validarTexto(anterior, "anterior");
            String reemplazo = validarTexto(nuevoDato, "nuevoDato");
            Nodo actual = cabeza;

            while (actual != null) {
                if (actual.dato.equals(buscado)) {
                    actual.dato = reemplazo;
                    return true;
                }
                actual = actual.siguiente;
            }

            return false;
        }

        public boolean eliminar(String dato) {
            String buscado = validarTexto(dato, "dato");

            if (cabeza == null) {
                return false;
            }

            if (cabeza.dato.equals(buscado)) {
                cabeza = cabeza.siguiente;
                tamanio--;
                return true;
            }

            Nodo anterior = cabeza;
            Nodo actual = cabeza.siguiente;

            while (actual != null) {
                if (actual.dato.equals(buscado)) {
                    anterior.siguiente = actual.siguiente;
                    tamanio--;
                    return true;
                }

                anterior = actual;
                actual = actual.siguiente;
            }

            return false;
        }

        public void mostrar() {
            if (cabeza == null) {
                System.out.println("[]");
                return;
            }

            StringBuilder salida = new StringBuilder("[");
            Nodo actual = cabeza;

            while (actual != null) {
                salida.append(actual.dato);
                actual = actual.siguiente;

                if (actual != null) {
                    salida.append(" -> ");
                }
            }

            salida.append(']');
            System.out.println(salida);
        }

        @Override
        public String toString() {
            return "ListaSimple{tamanio=" + tamanio
                    + ", cabeza=" + (cabeza == null ? "null" : cabeza.dato)
                    + '}';
        }
    }

    private static String validarTexto(String valor, String nombreCampo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(
                    nombreCampo + " no puede ser null, vacío ni espacios"
            );
        }

        return valor.trim();
    }

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        System.out.println("Inicio:");
        lista.mostrar();

        lista.insertarInicio("OT-101");
        lista.insertarInicio("OT-050");
        lista.insertarFinal("OT-205");
        lista.insertarFinal("OT-310");

        System.out.println("Después de insertar:");
        lista.mostrar();

        System.out.println(
                "¿Contiene OT-205? " + lista.contiene("OT-205")
        );

        boolean modificada = lista.modificar("OT-205", "OT-206");
        System.out.println("¿Modificada? " + modificada);
        lista.mostrar();

        boolean eliminadaCabeza = lista.eliminar("OT-050");
        System.out.println("¿Cabeza eliminada? " + eliminadaCabeza);
        lista.mostrar();

        boolean eliminadaIntermedia = lista.eliminar("OT-206");
        System.out.println("¿Intermedia eliminada? " + eliminadaIntermedia);
        lista.mostrar();

        System.out.println("Tamaño: " + lista.getTamanio());
        System.out.println(lista);
    }
}
```

---

# Salida esperada aproximada

```text
Inicio:
[]
Después de insertar:
[OT-050 -> OT-101 -> OT-205 -> OT-310]
¿Contiene OT-205? true
¿Modificada? true
[OT-050 -> OT-101 -> OT-206 -> OT-310]
¿Cabeza eliminada? true
[OT-101 -> OT-206 -> OT-310]
¿Intermedia eliminada? true
[OT-101 -> OT-310]
Tamaño: 2
ListaSimple{tamanio=2, cabeza=OT-101}
```

---

# Conceptos demostrados

```text
Nodo
→ dato + siguiente.

Cabeza
→ primer nodo.

Lista vacía
→ cabeza == null.

Inserción al inicio
→ nuevo.siguiente=cabeza; cabeza=nuevo.

Inserción al final
→ recorrer hasta siguiente==null.

Búsqueda/modificación/eliminación
→ recorrido secuencial.

String
→ equals() para contenido; null || isBlank() para validar.

Encapsulamiento
→ cabeza, tamaño y enlaces son privados.

toString()
→ usa valores reales.
```

---

# Preguntas para defender el código

1. ¿Por qué `Nodo` no necesita ser público?
2. ¿Qué sucede al insertar en una lista vacía?
3. ¿Por qué `insertarInicio()` no recorre la lista?
4. ¿Por qué `insertarFinal()` sí la recorre en esta versión?
5. ¿Por qué eliminar la cabeza es un caso especial?
6. ¿Qué función cumple `anterior`?
7. ¿Por qué se usa `equals()`?
8. ¿Qué error evita `null || isBlank()`?
9. ¿Qué pasaría si no se actualizara `tamanio`?
10. ¿Cómo cambiaría el diseño si se guardara una referencia `final`?

---

# Ejercicio de modificación

Agregar:

```java
public String primero()
```

Regla:

```text
- si la lista está vacía, lanzar una excepción controlada;
- si no, devolver el dato de la cabeza;
- no eliminar el nodo.
```

Después agregar:

```java
public void limpiar()
```

La operación debe dejar:

```text
cabeza = null
tamanio = 0
```
