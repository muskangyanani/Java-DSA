public class firstAndLastPosition {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 9, 9, 14, 16, 18 };
        int target = 9;
        int ans[] = position(arr, target);
        System.out.println("[" + ans[0] + "," + ans[1] + "]");
    }

    static int[] position(int arr[], int target) {
        int result[] = { -1, -1 };
        result[0] = search(arr, target, true);
        result[1] = search(arr, target, false);
        return result;
    }

    static int search(int arr[], int target, boolean findFirst) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target > arr[mid]) {
                s = mid + 1;
            } else if (target < arr[mid]) {
                e = mid - 1;
            } else {
                ans = mid;
                if (findFirst) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return ans;
    }
}

// {2,3,5,7,7,9,9,9,14,16,18} target=9 [3,4]