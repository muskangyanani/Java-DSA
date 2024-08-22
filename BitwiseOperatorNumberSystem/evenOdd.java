package BitwiseOperatorNumberSystem;

public class evenOdd {
    public static void main(String[] args) {
        int n = 99;
        boolean isOdd = isOdd(n);
        if (isOdd) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
