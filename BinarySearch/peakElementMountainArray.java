public class peakElementMountainArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 3, 2, 0 };
        int ans = peakElement(arr);
        System.out.println(ans);
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
}
