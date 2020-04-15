package sort;

public class InsertSort {
    public static void insertSort(int[] array) {
        if (array == null ||  array.length <= 1) {
            return;
        }
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = value;
        }
    }

    public static void main(String[] args) {
        int[] array = {4,2,7,3,8,9,1,0};
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
