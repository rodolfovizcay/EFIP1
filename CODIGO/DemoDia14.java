import java.util.Arrays;

public class DemoDia14 {

    public static void main(String[] args) {
        int[] original = {38, 27, 43, 3, 9, 82, 10, 5};
        int[] esperado = {3, 5, 9, 10, 27, 38, 43, 82};

        int[] porMezcla = Arrays.copyOf(original, original.length);
        mergeSort(porMezcla);

        int[] porQuick = Arrays.copyOf(original, original.length);
        quickSort(porQuick);

        verificar("Mergesort", porMezcla, esperado);
        verificar("Quicksort", porQuick, esperado);

        System.out.println("Original:  " + Arrays.toString(original));
        System.out.println("Mergesort: " + Arrays.toString(porMezcla));
        System.out.println("Quicksort:  " + Arrays.toString(porQuick));
        System.out.println("Validación: ambos resultados son correctos.");
    }

    static void mergeSort(int[] datos) {
        int[] auxiliar = new int[datos.length];
        mergeSort(datos, auxiliar, 0, datos.length - 1);
    }

    private static void mergeSort(int[] datos, int[] auxiliar, int izquierda, int derecha) {
        if (izquierda >= derecha) {
            return;
        }

        int medio = izquierda + (derecha - izquierda) / 2;
        mergeSort(datos, auxiliar, izquierda, medio);
        mergeSort(datos, auxiliar, medio + 1, derecha);
        mezclar(datos, auxiliar, izquierda, medio, derecha);
    }

    private static void mezclar(
            int[] datos,
            int[] auxiliar,
            int izquierda,
            int medio,
            int derecha) {

        System.arraycopy(datos, izquierda, auxiliar, izquierda, derecha - izquierda + 1);

        int i = izquierda;
        int j = medio + 1;
        int k = izquierda;

        while (i <= medio && j <= derecha) {
            if (auxiliar[i] <= auxiliar[j]) {
                datos[k++] = auxiliar[i++];
            } else {
                datos[k++] = auxiliar[j++];
            }
        }

        while (i <= medio) {
            datos[k++] = auxiliar[i++];
        }
    }

    static void quickSort(int[] datos) {
        quickSort(datos, 0, datos.length - 1);
    }

    private static void quickSort(int[] datos, int izquierda, int derecha) {
        if (izquierda >= derecha) {
            return;
        }

        int posicionPivote = particionarLomuto(datos, izquierda, derecha);
        quickSort(datos, izquierda, posicionPivote - 1);
        quickSort(datos, posicionPivote + 1, derecha);
    }

    private static int particionarLomuto(int[] datos, int izquierda, int derecha) {
        int pivote = datos[derecha];
        int limiteMenores = izquierda;

        for (int actual = izquierda; actual < derecha; actual++) {
            if (datos[actual] <= pivote) {
                intercambiar(datos, limiteMenores, actual);
                limiteMenores++;
            }
        }

        intercambiar(datos, limiteMenores, derecha);
        return limiteMenores;
    }

    private static void intercambiar(int[] datos, int i, int j) {
        int temporal = datos[i];
        datos[i] = datos[j];
        datos[j] = temporal;
    }

    private static void verificar(String algoritmo, int[] obtenido, int[] esperado) {
        if (!Arrays.equals(obtenido, esperado)) {
            throw new IllegalStateException(
                    algoritmo + " produjo " + Arrays.toString(obtenido)
                    + " y se esperaba " + Arrays.toString(esperado));
        }
    }
}
