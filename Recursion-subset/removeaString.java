public class removeaString {
    public static void main(String[] args) {
        // System.out.println(skip2("baccad"));
        System.out.println(skipApple("muskan is eating apple burger!!"));
        System.out.println(skipApp("muskan is using apple app!!"));
    }

    // p - processed, up- unprocessed
    // method 1: by passing 2 args (removing a character)
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        } else{
            skip(p+ch, up.substring(1));
        }
    }


    // method 2 without any extra args (removing a character)
    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip2(up.substring(1));
        } else{
            return ch + skip2(up.substring(1));
        }
    }

    // skipping string apple
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        } else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }


    //skipping string app only when its not equal to apple
    static String skipApp(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipApp(up.substring(3));
        } else{
            return up.charAt(0) + skipApp(up.substring(1));
        }
    }
}
