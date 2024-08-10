public class floor {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 6;
        int ans = floorNum(arr, target);
        System.out.println(ans);
    }

    static int floorNum(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target < arr[start]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}

// floor - largest number, which is <= target;
// {2,3,5,9,14,16,18} target=15, floor=14.
// {2,3,5,9,14,16,18} target=17, floor=16.
// {2,3,5,9,14,16,18} target=13, floor=9.
