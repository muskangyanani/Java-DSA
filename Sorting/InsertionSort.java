package Sorting;

import java.util.Arrays;

// time complexity - 
// worst case = O(n^2)
// best case = O(n)
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}