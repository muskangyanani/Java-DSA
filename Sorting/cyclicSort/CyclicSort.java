package Sorting.cyclicSort;

import java.util.Arrays;

// for 0-n
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 0 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != i) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}