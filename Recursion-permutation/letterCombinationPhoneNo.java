import java.util.ArrayList;

public class letterCombinationPhoneNo {
    public static void main(String[] args) {
        // Given a string containing digits from 2-9 inclusive, return all possible
        // letter combinations that the number could represent. Return the answer in any
        // order.A mapping of digits to letters (just like on the telephone buttons) is
        // given below. Note that 1 does not map to any letters.
        // Input: digits = "23"
        // Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

        // printCombination("", "23");
        ArrayList<String> ans = CombinationList("", "9");
        System.out.println(ans);

    }

    // printing combinations
    static void printCombination(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert it into integer ('2' to 2)

        for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
            char chToAdd = (char) ('a' + i);
            printCombination(p + chToAdd, up.substring(1));
        }
    }

    static ArrayList<String> CombinationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert it into integer ('2' to 2)
        ArrayList<String> list = new ArrayList<>();

        if (digit == 7) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                char chToAdd = (char) ('a' + i);
                list.addAll(CombinationList(p + chToAdd, up.substring(1)));
            }
        } else if (digit == 8) {
            for (int i = (digit - 2) * 3 + 1; i <= (digit - 1) * 3; i++) {
                char chToAdd = (char) ('a' + i);
                list.addAll(CombinationList(p + chToAdd, up.substring(1)));
            }
        } else if (digit == 9) {
            for (int i = (digit - 2) * 3 + 1; i <= (digit - 1) * 3 + 1; i++) {
                char chToAdd = (char) ('a' + i);
                list.addAll(CombinationList(p + chToAdd, up.substring(1)));
            }
        } else {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char chToAdd = (char) ('a' + i);
                list.addAll(CombinationList(p + chToAdd, up.substring(1)));
            }

        }

        return list;
    }
}
