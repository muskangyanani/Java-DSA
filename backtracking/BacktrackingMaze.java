package backtracking;

import java.util.Arrays;

public class BacktrackingMaze {
    public static void main(String[] args) {
        boolean[][] board ={
            {true, true, true},
            {true, true, true},
            {true,true,true}
        };

        // allPaths("", board, 0, 0);

        int[][] path= new int[board.length][board[0].length];

        PathMatrix("", board, 0, 0, path, 1);
    }


    static void allPaths(String p, boolean[][] maze, int r, int c){
        if( r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;

        // go down
        if(r < maze.length-1){
            allPaths(p+ "D",maze, r+1, c);
        }

        // go Right
        if(c <  maze[0].length-1){
            allPaths(p+"R",maze, r, c+1);
        }

        //go Up
        if(r>0){
            allPaths(p+"U", maze, r-1, c);
        }
        
        // go Left
        if(c>0){
            allPaths(p+"L", maze, r, c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed,also remove the changes that were made by that function
        maze[r][c] = true;

    }

    // print path matrix
    static void PathMatrix(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if( r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;

        path[r][c] = step;
        
        // go down
        if(r < maze.length-1){
            PathMatrix(p+ "D",maze, r+1, c, path, step+1);
        }
        
        // go Right
        if(c <  maze[0].length-1){
            PathMatrix(p+"R",maze, r, c+1,path, step+1);
        }
        
        //go Up
        if(r>0){
            PathMatrix(p+"U", maze, r-1, c, path, step+1);
        }
        
        // go Left
        if(c>0){
            PathMatrix(p+"L", maze, r, c-1, path, step+1);
        }
        
        // this line is where the function will be over
        // so before the function gets removed,also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
        
    }

}
