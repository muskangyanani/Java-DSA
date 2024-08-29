public class t {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i < 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                // space
                for (int s = 0; s < n / 2; s++) {
                    System.out.print("  ");
                }
                // star
                System.out.print("*");
                for (int s = 0; s < n / 2; s++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
