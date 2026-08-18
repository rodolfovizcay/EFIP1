# Código ejecutable — Listas doble, circular y ordenada

**Archivo:** `DemoListasAvanzadas.java`  
**Validación de preparación:** ejecutado correctamente con Java en modo fuente.

## Ejecución

```bash
java DemoListasAvanzadas.java
```

## Código

```java
public class DemoListasAvanzadas {
    static final class NodoDoble {
        int dato;
        NodoDoble anterior;
        NodoDoble siguiente;

        NodoDoble(int dato) {
            this.dato = dato;
        }
    }

    static final class ListaDoble {
        private NodoDoble cabeza;
        private NodoDoble cola;

        void agregarFinal(int dato) {
            NodoDoble nuevo = new NodoDoble(dato);
            if (cabeza == null) {
                cabeza = cola = nuevo;
                return;
            }
            nuevo.anterior = cola;
            cola.siguiente = nuevo;
            cola = nuevo;
        }

        String haciaAdelante() {
            StringBuilder salida = new StringBuilder();
            for (NodoDoble actual = cabeza; actual != null; actual = actual.siguiente) {
                if (!salida.isEmpty()) salida.append(" -> ");
                salida.append(actual.dato);
            }
            return salida.toString();
        }

        String haciaAtras() {
            StringBuilder salida = new StringBuilder();
            for (NodoDoble actual = cola; actual != null; actual = actual.anterior) {
                if (!salida.isEmpty()) salida.append(" -> ");
                salida.append(actual.dato);
            }
            return salida.toString();
        }
    }

    static final class NodoSimple {
        int dato;
        NodoSimple siguiente;

        NodoSimple(int dato) {
            this.dato = dato;
        }
    }

    static final class ListaCircular {
        private NodoSimple ultimo;

        void agregar(int dato) {
            NodoSimple nuevo = new NodoSimple(dato);
            if (ultimo == null) {
                ultimo = nuevo;
                nuevo.siguiente = nuevo;
                return;
            }
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }

        String unaVuelta() {
            if (ultimo == null) return "";
            StringBuilder salida = new StringBuilder();
            NodoSimple primero = ultimo.siguiente;
            NodoSimple actual = primero;
            do {
                if (!salida.isEmpty()) salida.append(" -> ");
                salida.append(actual.dato);
                actual = actual.siguiente;
            } while (actual != primero);
            return salida.toString();
        }
    }

    static final class ListaOrdenada {
        private NodoSimple cabeza;

        void insertar(int dato) {
            NodoSimple nuevo = new NodoSimple(dato);
            if (cabeza == null || dato <= cabeza.dato) {
                nuevo.siguiente = cabeza;
                cabeza = nuevo;
                return;
            }
            NodoSimple actual = cabeza;
            while (actual.siguiente != null && actual.siguiente.dato < dato) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }

        String mostrar() {
            StringBuilder salida = new StringBuilder();
            for (NodoSimple actual = cabeza; actual != null; actual = actual.siguiente) {
                if (!salida.isEmpty()) salida.append(" -> ");
                salida.append(actual.dato);
            }
            return salida.toString();
        }
    }

    public static void main(String[] args) {
        ListaDoble doble = new ListaDoble();
        doble.agregarFinal(10);
        doble.agregarFinal(20);
        doble.agregarFinal(30);
        System.out.println("Doble adelante: " + doble.haciaAdelante());
        System.out.println("Doble atrás: " + doble.haciaAtras());

        ListaCircular circular = new ListaCircular();
        circular.agregar(10);
        circular.agregar(20);
        circular.agregar(30);
        System.out.println("Circular, una vuelta: " + circular.unaVuelta());

        ListaOrdenada ordenada = new ListaOrdenada();
        ordenada.insertar(30);
        ordenada.insertar(10);
        ordenada.insertar(20);
        ordenada.insertar(20);
        System.out.println("Ordenada: " + ordenada.mostrar());
    }
}
```

## Salida esperada

```text
Doble adelante: 10 -> 20 -> 30
Doble atrás: 30 -> 20 -> 10
Circular, una vuelta: 10 -> 20 -> 30
Ordenada: 10 -> 20 -> 20 -> 30
```

## Actividades

1. Dibujá cada estructura después de cada inserción.
2. Identificá la cabeza y la cola en la lista doble.
3. Explicá por qué `ultimo.siguiente` funciona como primer nodo circular.
4. Cambiá la lista ordenada para ubicar duplicados después de los iguales.
5. Agregá una eliminación intermedia a la lista doble y actualizá ambos sentidos.
