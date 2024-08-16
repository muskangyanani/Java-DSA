package Sorting;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class FindMultipleMissingNumbers {

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (correctIndex != i) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(j + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
