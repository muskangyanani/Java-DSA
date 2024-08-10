public class ceiling {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 20;
        int ans = ceilingNum(arr, target);
        System.out.println(ans);
    }

    static int ceilingNum(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
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
        return arr[start];
    }
}

// cieling - smallest element in array, which is >= target.

// {2,3,5,9,14,16,18} target = 15 , ceiling = 16
// {2,3,5,9,14,16,18} target = 14 , ceiling = 14
// {2,3,5,9,14,16,18} target = 4 , ceiling = 5