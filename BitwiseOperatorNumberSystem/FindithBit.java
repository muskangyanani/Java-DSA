package BitwiseOperatorNumberSystem;

public class FindithBit {
    public static void main(String[] args) {
        int num = 0b10110110;
        System.out.println(findBit(num, 5));
    }

    static int findBit(int num, int n) {
        return (num >> (n - 1)) & 1;
    }
}
