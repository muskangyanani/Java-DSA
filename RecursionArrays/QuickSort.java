package RecursionArrays;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 6, 7, 9, 10 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // Pivot - choose any element, after first pass all the elements < pivot will be
    // on left of pivot and all elements > pivot will be at the right of the pivot
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort other 2 halfs
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
