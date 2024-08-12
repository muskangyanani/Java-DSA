public class BSinfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 8, 9, 10, 11, 14, 15, 16, 19, 20, 23 };
        int target = 11;
        int result = ans(arr, target);
        System.out.println(result);
    }

    static int ans(int arr[], int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            // newEnd = previous end + previous box size*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int arr[], int target, int start, int end) {
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
