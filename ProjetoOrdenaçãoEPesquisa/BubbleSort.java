package ProjetoOrdenaçãoEPesquisa;

public class BubbleSort {
    public static void sort(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
