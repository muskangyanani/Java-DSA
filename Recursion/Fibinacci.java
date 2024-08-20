package Recursion;

public class Fibinacci {
    public static void main(String[] args) {
        // for input 50 or any larger value this will not give any output because its
        // time complexiti is exponential.
        // System.out.println(fiboExponentialTime(50));
        // for (int i = 0; i < 20; i++) {
        // System.out.println(fiboFormula(i));
        // }

        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n) {
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int fiboExponentialTime(int n) {

        // base condition
        if (n < 2) {
            return n;
        }

        return fiboExponentialTime(n - 1) + fiboExponentialTime(n - 2);
    }
}
