
import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        // getPermutations("", "142");
        ArrayList<String> ans = getPermutationsArray("", "ass");
        System.out.println(ans);
        System.out.println(getPermutationsCount("", "ass"));
    }

    static void getPermutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            getPermutations(f + ch + s, up.substring(1));
        }

    }   

    // returning a list of permutations
    static ArrayList<String> getPermutationsArray(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            ans.addAll(getPermutationsArray(f + ch + s, up.substring(1)));
        }
        return ans;
    }  

    // return no. of permutatoions
    static int getPermutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            count = count + getPermutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }   
}
