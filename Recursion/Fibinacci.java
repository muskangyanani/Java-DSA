package Recursion;

public class Fibinacci {
    public static void main(String[] args) {
        System.out.println(fibinacci(4));
    }

    static int fibinacci(int n) {

        // base condition
        if (n < 2) {
            return n;
        }

        return fibinacci(n - 1) + fibinacci(n - 2);
    }
}
