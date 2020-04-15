package sort;

public class QuickSort {
    public static void quickSort(int[] array, int low, int hight) {
        int i, j, tmp, t;
        if (low >= hight) {
            return;
        }
        i = low;
        j = hight;
        tmp = array[low];
        while (i < j) {
            while (tmp <= array[j] && i < j) {
                j--;
            }
            while (tmp >= array[i] && i < j) {
                i++;
            }
            if (i < j) {
                t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        array[low] = array[j];
        array[j] = tmp;
        quickSort(array, low, j-1);
        quickSort(array, j+1, hight);
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,6,7,1,2,2,3};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
