package RecursionLevel1;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumDig(12345));
    }

    static int sumDig(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        return rem + sumDig(n / 10);

    }
}
