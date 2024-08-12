public class searchInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4, 2, 1 };
        System.out.println(search(arr, 2));
    }

    static int search(int arr[], int target) {
        int peak = peakElement(arr);
        int first = oabs(arr, target, 0, peak, true);
        if (first == -1) {
            int second = oabs(arr, target, peak, arr.length - 1, false);
            return second;
        }
        return first;
    }

    static int peakElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int oabs(int[] arr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
