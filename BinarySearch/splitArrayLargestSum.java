public class splitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };
        System.out.println(splitArray(arr, 2));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the mid as potential ans
            int mid = start + (end - start) / 2; // this is the maximum sum

            // calculate how many pieces you can divide this in with the max sum (mid)
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // you can not add this in the sub array as the max sum is exceded, make new one
                    // say you add this num in new subarray, then sum = num.
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }

        return end; // here start == end
    }
}