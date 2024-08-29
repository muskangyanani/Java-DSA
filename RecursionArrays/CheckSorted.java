package RecursionArrays;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 40, 5 };
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] n, int i) {
        if (i == n.length - 1) {
            return true;
        }
        return n[i] < n[i + 1] && isSorted(n, i + 1);
    }
}