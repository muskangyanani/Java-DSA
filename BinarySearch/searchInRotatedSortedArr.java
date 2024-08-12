public class searchInRotatedSortedArr {
    // will not work with duplicate values
    public static void main(String[] args) {
        int[] arr = { 6, 7, 1, 2, 3, 4, 5 };
        System.out.println(ans(arr, 6));
    }

    static int ans(int[] arr, int target) {
        int pivotElement = pivot(arr);
        if (pivotElement == -1) {
            return bs(arr, target, 0, arr.length - 1);
        }
        if (arr[pivotElement] == target) {
            return pivotElement;
        }
        if (target >= arr[0]) {
            return bs(arr, target, 0, pivotElement - 1);
        }
        return bs(arr, target, pivotElement + 1, arr.length - 1);
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int bs(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
