package backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(paths(4, 4));
        // pathsName("",3,3);
        // System.out.println(pathsNameArr("",3,3));
        System.out.println(pathsNameArrDiagonal("",3,3));
    }


    // no of paths.
    static int paths(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = paths(r-1,c);
        int right = paths(r,c-1);

        return left +right;
    }

    // printing path names
    static void pathsName(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            pathsName(p+ "D", r-1, c);
        }
        if(c>1){
            pathsName(p+"R", r, c-1);
        }
    }

    // returning arraylist of path names
    static ArrayList<String> pathsNameArr(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1){
            ans.addAll(pathsNameArr(p+ "D", r-1, c));
        }
        if(c>1){
            ans.addAll(pathsNameArr(p+"R", r, c-1));
        }

        return ans;
    }


    // For diagonal movement
    static ArrayList<String> pathsNameArrDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1){
            ans.addAll(pathsNameArrDiagonal(p+ "D", r-1, c));
        }
        if(c>1){
            ans.addAll(pathsNameArrDiagonal(p+"R", r, c-1));
        }
        if(r>1 && c>1){
            ans.addAll(pathsNameArrDiagonal(p + "d", r-1, c-1));
        }

        return ans;
    }
}
