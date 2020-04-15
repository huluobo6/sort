package sort;

public class BubbleSort {
    public static void bubbleSort (int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int arrayLength = array.length;
        int temp = 0;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength - i - 1 ; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main (String[] args) {
        int[] array = {3,6,2,4,1,7,9};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
