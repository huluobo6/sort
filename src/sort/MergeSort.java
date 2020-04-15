package sort;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] left, int[] right) {
        int result[] = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int index = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] > right[j]) {
                result[index] = right[j++];
            } else {
                result[index] = left[i++];
            }
        }
        return result;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return  array;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        int[] mergeLeft = mergeSort(left);
        int[] mergeRight = mergeSort(right);
        return merge(mergeLeft, mergeRight);
    }

    public static void main(String[] args) {
        int[] array = {3,9,7,8,1,4,2,15,11};
        int[] result = mergeSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
