package Maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors3(36);
    }

    // time: O(n)
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    // time: O(sqrt(n))
    static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.println(i);
                    System.out.println(n / i);
                }
            }
        }
    }

    // Sorted print: both time and space will be now O(sqrt(n)), coz now we are
    // storing it in an arraylist
    static void factors3(int n) {
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.println(i);
                    List.add(n / i);
                }
            }
        }
        for (int i = List.size() - 1; i >= 0; i--) {
            System.out.println(List.get(i));
        }
    }
}
