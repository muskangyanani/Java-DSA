package Sorting.cyclicSort;

import java.util.Arrays;

// leetcode HARD
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = { -5 };
        System.out.println(findMissingPositiveNum(arr));
    }

    static int findMissingPositiveNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] <= 0) {
                i++;
                continue;
            }
            int correct = arr[i] - 1;
            if (correct < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == index + 1) {
                continue;
            } else {
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
