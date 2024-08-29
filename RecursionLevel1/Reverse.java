package RecursionLevel1;

public class Reverse {
    // static int sum = 0;

    // static void rev(int n) {
    // if (n == 0) {
    // return;
    // }
    // int rem = n % 10;
    // sum = sum * 10 + rem;
    // rev(n / 10);
    // }

    public static void main(String[] args) {
        System.out.println(rev2(1234));
    }

    static int rev2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
}
