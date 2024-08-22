package BitwiseOperatorNumberSystem;

public class FindUniqueInArray {
    // a ^ a == 0 (XOR)

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 2, 1, 6, 3, 4 };
        System.out.println(findUnique(arr));
    }

    static int findUnique(int[] arr) {
        int unique = 0;

        for (int i : arr) {
            unique ^= i;
        }

        return unique;
    }
}
