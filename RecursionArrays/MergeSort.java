package RecursionArrays;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 5, 1, 6, 23, 56, 28 };
        // int[] sorted = mergeSort(arr);
        // System.out.println(Arrays.toString(sorted));
        mergeSortInplace(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // making copy of the array
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0; // pointer for left array
        int j = 0; // pointer for right array
        int k = 0; // pointer for new array(mix)

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not complete, add all remaining
        // element
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }

    // inplace method(not creating copy of array rather updating the original array)
    static void mergeSortInplace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;

        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid + 1, e);
        mergeInplace(arr, s, mid, e);
    }

    static void mergeInplace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s; // pointer for left array
        int j = m; // pointer for right array
        int k = 0; // pointer for new array(mix)

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not complete, add all remaining
        // element
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
