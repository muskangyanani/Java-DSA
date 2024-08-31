package RecursionArrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 2, 3, 4 };
        System.out.println(rotatedBS(arr, 0, arr.length - 1, 5));

    }

    static int rotatedBS(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // if start is less than mid
        if (arr[start] <= arr[mid]) {
            // if portion between start and mid is sorted
            if (target <= arr[mid] && target >= arr[start]) {
                return rotatedBS(arr, start, mid - 1, target);
            } else {
                return rotatedBS(arr, mid + 1, end, target);
            }
        }
        if (target >= arr[mid] && target <= arr[end]) {
            return rotatedBS(arr, mid + 1, end, target);
        }
        return rotatedBS(arr, start, mid - 1, target);
    }
}
