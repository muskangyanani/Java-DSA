public class searchInRotatedSortedArrWithDuplicate {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1 };
        System.out.println(ans(arr, 3));
    }

    static boolean ans(int[] arr, int target) {
        int pivotElement = pivot(arr);
        int result = -1;
        if (pivotElement == -1) {
            result = bs(arr, target, 0, arr.length - 1);
        } else {
            if (arr[pivotElement] == target) {
                return true;
            }
            if (target >= arr[0]) {
                result = bs(arr, target, 0, pivotElement - 1);
            }
            result = bs(arr, target, pivotElement + 1, arr.length - 1);
        }
        return (result != -1);
    }

    static int pivot(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }
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
            // if elements at mid, start, end are equal then skip duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // check if start or end element is pivot
                if (start < end && start + 1 < arr.length && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (end > start && end - 1 >= 0 && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
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
