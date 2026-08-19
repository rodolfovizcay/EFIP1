import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class DemoDia12 {

    public static void main(String[] args) {
        Path archivo = Path.of("build", "dia12", "trabajos.txt");
        RepositorioArchivo repositorio = new RepositorioArchivo(archivo);

        try {
            List<TrabajoPendiente> originales = new ArrayList<>();
            originales.add(new TrabajoPendiente(
                    1, "Revisar módem", 2, "PENDIENTE", 1));
            originales.add(new TrabajoPendiente(
                    2, "Cambiar conector", 1, "ASIGNADO", 1));

            repositorio.guardarTodos(originales);

            List<TrabajoPendiente> recuperados = repositorio.leerTodos();
            System.out.println("Recuperados: " + recuperados.size());
            for (TrabajoPendiente trabajo : recuperados) {
                System.out.println(trabajo);
            }

            buscarPorId(recuperados, 99);
        } catch (TrabajoNoEncontradoException e) {
            System.out.println("Error controlado: " + e.getMessage());
        } catch (TrabajoInvalidoException
                | FormatoArchivoException
                | PersistenciaException e) {
            System.err.println("No se pudo completar la operación: "
                    + e.getMessage());
            if (e.getCause() != null) {
                System.err.println("Causa: "
                        + e.getCause().getClass().getSimpleName());
            }
        } finally {
            System.out.println("Fin de la demostración.");
        }
    }

    static TrabajoPendiente buscarPorId(
            List<TrabajoPendiente> trabajos,
            int id) throws TrabajoNoEncontradoException {
        for (TrabajoPendiente trabajo : trabajos) {
            if (trabajo.getId() == id) {
                return trabajo;
            }
        }
        throw new TrabajoNoEncontradoException(
                "No existe el trabajo " + id);
    }

    static final class RepositorioArchivo {
        private final Path archivo;

        RepositorioArchivo(Path archivo) {
            this.archivo = archivo;
        }

        void guardarTodos(List<TrabajoPendiente> trabajos)
                throws PersistenciaException {
            try {
                Path directorio = archivo.getParent();
                if (directorio != null) {
                    Files.createDirectories(directorio);
                }

                try (BufferedWriter escritor = Files.newBufferedWriter(
                        archivo,
                        StandardCharsets.UTF_8,
                        StandardOpenOption.CREATE,
                        StandardOpenOption.TRUNCATE_EXISTING,
                        StandardOpenOption.WRITE)) {
                    for (TrabajoPendiente trabajo : trabajos) {
                        escritor.write(trabajo.aLinea());
                        escritor.newLine();
                    }
                }
            } catch (IOException e) {
                throw new PersistenciaException(
                        "No se pudo guardar en " + archivo, e);
            }
        }

        List<TrabajoPendiente> leerTodos()
                throws PersistenciaException, FormatoArchivoException {
            List<TrabajoPendiente> trabajos = new ArrayList<>();
            if (!Files.exists(archivo)) {
                return trabajos;
            }

            try (BufferedReader lector = Files.newBufferedReader(
                    archivo, StandardCharsets.UTF_8)) {
                String linea;
                int numeroLinea = 0;

                while ((linea = lector.readLine()) != null) {
                    numeroLinea++;
                    if (!linea.isBlank()) {
                        trabajos.add(TrabajoPendiente.desdeLinea(
                                linea, numeroLinea));
                    }
                }
                return trabajos;
            } catch (IOException e) {
                throw new PersistenciaException(
                        "No se pudo leer " + archivo, e);
            }
        }
    }

    static final class TrabajoPendiente {
        private final int id;
        private final String descripcion;
        private final int prioridad;
        private final String estado;
        private final int sector;

        TrabajoPendiente(
                int id,
                String descripcion,
                int prioridad,
                String estado,
                int sector) throws TrabajoInvalidoException {
            if (id <= 0) {
                throw new TrabajoInvalidoException(
                        "El id debe ser positivo");
            }
            validarTexto(descripcion, "descripción", 120);
            if (prioridad < 1 || prioridad > 5) {
                throw new TrabajoInvalidoException(
                        "La prioridad debe estar entre 1 y 5");
            }
            validarTexto(estado, "estado", 20);
            if (sector <= 0) {
                throw new TrabajoInvalidoException(
                        "El sector debe ser positivo");
            }

            this.id = id;
            this.descripcion = descripcion;
            this.prioridad = prioridad;
            this.estado = estado;
            this.sector = sector;
        }

        private static void validarTexto(
                String valor,
                String campo,
                int longitudMaxima) throws TrabajoInvalidoException {
            if (valor == null || valor.isBlank()) {
                throw new TrabajoInvalidoException(
                        "El campo " + campo + " es obligatorio");
            }
            if (valor.length() > longitudMaxima) {
                throw new TrabajoInvalidoException(
                        "El campo " + campo + " supera "
                                + longitudMaxima + " caracteres");
            }
            if (valor.contains("|")
                    || valor.contains("\n")
                    || valor.contains("\r")) {
                throw new TrabajoInvalidoException(
                        "El campo " + campo
                                + " contiene un separador no admitido");
            }
        }

        int getId() {
            return id;
        }

        String aLinea() {
            return id + "|" + descripcion + "|" + prioridad
                    + "|" + estado + "|" + sector;
        }

        static TrabajoPendiente desdeLinea(
                String linea,
                int numeroLinea) throws FormatoArchivoException {
            String[] campos = linea.split("\\|", -1);
            if (campos.length != 5) {
                throw new FormatoArchivoException(
                        "Línea " + numeroLinea
                                + ": se esperaban cinco campos");
            }

            try {
                return new TrabajoPendiente(
                        Integer.parseInt(campos[0]),
                        campos[1],
                        Integer.parseInt(campos[2]),
                        campos[3],
                        Integer.parseInt(campos[4]));
            } catch (NumberFormatException
                    | TrabajoInvalidoException e) {
                throw new FormatoArchivoException(
                        "Línea " + numeroLinea + " inválida", e);
            }
        }

        @Override
        public String toString() {
            return id + " | " + descripcion
                    + " | prioridad " + prioridad
                    + " | " + estado
                    + " | sector " + sector;
        }
    }

    static class TrabajoInvalidoException extends Exception {
        TrabajoInvalidoException(String mensaje) {
            super(mensaje);
        }
    }

    static class TrabajoNoEncontradoException extends Exception {
        TrabajoNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }

    static class FormatoArchivoException extends Exception {
        FormatoArchivoException(String mensaje) {
            super(mensaje);
        }

        FormatoArchivoException(String mensaje, Throwable causa) {
            super(mensaje, causa);
        }
    }

    static class PersistenciaException extends Exception {
        PersistenciaException(String mensaje, Throwable causa) {
            super(mensaje, causa);
        }
    }
}
