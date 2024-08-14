package Sorting;

import java.util.Arrays;

// time complexity - O(n^2) 
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 4, 1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = max(arr, 0, last);
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }

    static int max(int[] arr, int start, int end) {
        int maxElement = start;
        for (int i = start; i <= end; i++) {
            if (arr[maxElement] < arr[i]) {
                maxElement = i;
            }
        }
        return maxElement;
    }
}
