package PrettyPrinting;

public class prettyPrinting {
    public static void main(String[] args) {
        float a = 234.345656f;
        // prints the number with 2 decimal places and rounds it off
        System.out.printf("Formated number : %.2f", a);
        System.out.println();
        System.out.printf("%.3f", Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and I am %s", "Muskan", "cool");

        // There are many format specifiers we can use. Here are some common ones:

        // %c - Character
        // %d - Decimal number (base 10)
        // %e - Exponential floating-point number
        // %f - Floating-point number
        // %i - Integer (base 10)
        // %o - Octal number (base 8)
        // %s - String
        // %u - Unsigned decimal (integer) number
        // %x - Hexadecimal number (base 16)
        // %t - Date/time
        // %n - Newline
    }
}
