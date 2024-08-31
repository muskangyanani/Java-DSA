package RecursionLevel1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int n, int index) {
        if (n == 0) {
            return;
        }

        if (index < n) {
            if (arr[index] > arr[index + 1]) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
            sort(arr, n, index + 1);
        } else {
            sort(arr, n - 1, 0);
        }
    }

}
