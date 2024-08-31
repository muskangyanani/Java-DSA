package RecursionLevel1;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int n, int i, int max) {
        if (n == 0) {
            return;
        }

        if (i < n) {
            if (arr[i] > arr[max]) {
                sort(arr, n, i + 1, i);
            } else {
                sort(arr, n, i + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[n - 1];
            arr[n - 1] = temp;
            sort(arr, n - 1, 0, 0);
        }
    }
}
