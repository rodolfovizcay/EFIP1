import java.util.Arrays;

public class DemoDia13 {

    public static void insercion(int[] datos) {
        for (int i = 1; i < datos.length; i++) {
            int clave = datos[i];
            int j = i - 1;

            while (j >= 0 && datos[j] > clave) {
                datos[j + 1] = datos[j];
                j--;
            }

            datos[j + 1] = clave;
        }
    }

    public static void shellsort(int[] datos) {
        for (int gap = datos.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < datos.length; i++) {
                int temporal = datos[i];
                int j = i;

                while (j >= gap && datos[j - gap] > temporal) {
                    datos[j] = datos[j - gap];
                    j -= gap;
                }

                datos[j] = temporal;
            }
        }
    }

    private static boolean estaOrdenado(int[] datos) {
        for (int i = 1; i < datos.length; i++) {
            if (datos[i - 1] > datos[i]) {
                return false;
            }
        }
        return true;
    }

    private static void verificar(String algoritmo, int[] resultado) {
        if (!estaOrdenado(resultado)) {
            throw new IllegalStateException(
                    algoritmo + " no produjo un orden no decreciente");
        }
    }

    public static void main(String[] args) {
        int[] original = {30, 10, 20, 50, 40, 20};
        int[] porInsercion = Arrays.copyOf(original, original.length);
        int[] porShellsort = Arrays.copyOf(original, original.length);

        insercion(porInsercion);
        shellsort(porShellsort);

        verificar("Inserción", porInsercion);
        verificar("Shellsort", porShellsort);

        System.out.println("Original:   " + Arrays.toString(original));
        System.out.println("Inserción:  " + Arrays.toString(porInsercion));
        System.out.println("Shellsort:  " + Arrays.toString(porShellsort));
        System.out.println("Verificado: ambos resultados están ordenados");
    }
}
