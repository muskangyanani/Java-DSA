public class orderAgnosticBs {
    public static void main(String[] args) {
        int[] arr = { 155, 98, 87, 65, 43, 21, 2 };
        int target = 155;
        int ans = oabs(arr, target);
        System.out.println(ans);
    }

    static int oabs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
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
