package Sorting;

// import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        sort(arr);
        System.out.println(searchMissing(arr));
    }

    static int searchMissing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
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
