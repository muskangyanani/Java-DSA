public class findRotation {
    public static void main(String[] args) {
        int[] arr = { 9, 1, 5, 6, 7 };
        System.out.println(pivot(arr));
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int pivot = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                pivot = mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                pivot = mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return pivot + 1;
    }
}