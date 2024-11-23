
import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        findSubsets("", "abc");
        // ArrayList<String> ans = findSubset3("", "abc");
        // System.out.println(ans);
    }


    // print subsets
    static void findSubsets(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        findSubsets(p+ch, up.substring(1));
        findSubsets(p, up.substring(1));
    }


    // return an array list of subsets of string
    static ArrayList<String> findSubset2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = findSubset2(p+ch, up.substring(1));
        ArrayList<String> right = findSubset2(p, up.substring(1));
        left.addAll(right);
        return left;
    }


    // return an array list of subsets of string with ascii value
    static ArrayList<String> findSubset3(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = findSubset3(p+ch, up.substring(1));
        ArrayList<String> second = findSubset3(p, up.substring(1));
        ArrayList<String> third = findSubset3(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }

}
