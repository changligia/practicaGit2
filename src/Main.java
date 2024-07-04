import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final var array = RandomUtilities.generarRandomArrayInt(30, 30, 1, new Random());
        System.out.printf("El array es: %s%n", Arrays.toString(array));
        ordenarArray(array);
        System.out.printf("El array ordenado es: %s%n", Arrays.toString(array));
    }

    static void ordenarArray(int[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) { //condición de desordenado
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
