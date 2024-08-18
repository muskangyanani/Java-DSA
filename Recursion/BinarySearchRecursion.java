package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7, 9, 10, 24, 67 };
        System.out.println(search(arr, 0, arr.length - 1, 80));
    }

    static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return search(arr, start, mid - 1, target);
        }
        return search(arr, mid + 1, end, target);
    }
}
