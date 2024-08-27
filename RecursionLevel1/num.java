package RecursionLevel1;

public class num {
    public static void main(String[] args) {
        // fun(5);
        // funRev(5);
        // funBoth(5);
        concept(5);
    }

    // 5 4 3 2 1
    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    // 1 2 3 4 5
    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.println(n);
    }

    // 5 4 3 2 1 1 2 3 4 5
    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);
    }

    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        concept(--n);
    }
}
