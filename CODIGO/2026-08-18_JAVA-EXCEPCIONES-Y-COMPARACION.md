# Código ejecutable — Java, ArrayList, comparación y excepciones

**Archivo:** `DemoDia11.java`  
**Validación de preparación:** ejecutado correctamente con Java en modo fuente.

## Ejecución

```bash
java DemoDia11.java
```

## Código

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class DemoDia11 {
    static final class TrabajoNoEncontradoException extends Exception {
        TrabajoNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }

    static final class TrabajoPendiente {
        private final int id;
        private String descripcion;

        TrabajoPendiente(int id, String descripcion) {
            if (id <= 0) {
                throw new IllegalArgumentException("El id debe ser positivo");
            }
            if (descripcion == null || descripcion.isBlank()) {
                throw new IllegalArgumentException("La descripción es obligatoria");
            }
            this.id = id;
            this.descripcion = descripcion;
        }

        int getId() {
            return id;
        }

        void cambiarDescripcion(String nuevaDescripcion) {
            if (nuevaDescripcion == null || nuevaDescripcion.isBlank()) {
                throw new IllegalArgumentException("La descripción es obligatoria");
            }
            descripcion = nuevaDescripcion;
        }

        @Override
        public boolean equals(Object otro) {
            if (this == otro) return true;
            if (!(otro instanceof TrabajoPendiente trabajo)) return false;
            return id == trabajo.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "TrabajoPendiente{id=" + id + ", descripcion='" + descripcion + "'}";
        }
    }

    static final class AgendaTrabajos {
        private final List<TrabajoPendiente> trabajos = new ArrayList<>();

        void agregar(TrabajoPendiente trabajo) {
            if (trabajos.contains(trabajo)) {
                throw new IllegalArgumentException("El trabajo ya existe: " + trabajo.getId());
            }
            trabajos.add(trabajo);
        }

        TrabajoPendiente buscar(int id) throws TrabajoNoEncontradoException {
            for (TrabajoPendiente trabajo : trabajos) {
                if (trabajo.getId() == id) {
                    return trabajo;
                }
            }
            throw new TrabajoNoEncontradoException("No existe el trabajo " + id);
        }

        boolean eliminar(int id) {
            Iterator<TrabajoPendiente> iterador = trabajos.iterator();
            while (iterador.hasNext()) {
                if (iterador.next().getId() == id) {
                    iterador.remove();
                    return true;
                }
            }
            return false;
        }

        void mostrar() {
            trabajos.forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        AgendaTrabajos agenda = new AgendaTrabajos();

        try {
            agenda.agregar(new TrabajoPendiente(1, "Revisar enlace rural"));
            agenda.agregar(new TrabajoPendiente(2, "Cambiar equipo"));

            TrabajoPendiente encontrado = agenda.buscar(2);
            encontrado.cambiarDescripcion("Cambiar equipo del abonado");

            agenda.mostrar();
            System.out.println("Eliminado: " + agenda.eliminar(1));
            agenda.buscar(99);
        } catch (TrabajoNoEncontradoException e) {
            System.out.println("Error controlado: " + e.getMessage());
        } finally {
            System.out.println("Fin de la operación");
        }
    }
}
```

## Salida esperada

```text
TrabajoPendiente{id=1, descripcion='Revisar enlace rural'}
TrabajoPendiente{id=2, descripcion='Cambiar equipo del abonado'}
Eliminado: true
Error controlado: No existe el trabajo 99
Fin de la operación
```

## Actividades

1. Señalá el `throw` y el `throws`.
2. Indicá qué excepción es checked y cuál unchecked.
3. Explicá por qué `finally` se ejecuta después del `catch`.
4. Cambiá `equals/hashCode` para usar `id` y verificá que `contains()` detecte duplicados.
5. Agregá una captura separada para `IllegalArgumentException`.
6. Explicá por qué se usa `Iterator.remove()` durante el recorrido.
