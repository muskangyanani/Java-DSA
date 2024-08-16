package Sorting;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        sort(arr);
        System.out.println(searchMissing(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
