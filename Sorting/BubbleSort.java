package Sorting;

import java.util.Arrays;

// also known as sinking sort or exchange sort
// time complexity :
// best case = O(n) [sorted array]
// worst case = O(n^2) [opposit sorted]
public class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = { 7, 1, -9, 4, 8, 0, -4 };
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        boolean swaped;
        for (int i = 0; i < arr.length; i++) {
            swaped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) { // if in decending just change > to <.
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swaped = true;
                }
            }
            // if you did not swap for partictular value of i, means the array is sorted
            if (!swaped) {
                break;
            }
        }
    }
}
