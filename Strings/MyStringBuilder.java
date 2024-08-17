package Strings;

public class MyStringBuilder {
    public static void main(String[] args) {

        // this method will consume much more memory in the heap and its performance
        // will be slower
        String str = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            str += ch;
        }
        System.out.println(str);

        // this method will consume less memory in the heap and its performance will be
        // faster
        // it updates the same string object in the heap
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }
        System.out.println(sb);
    }
}