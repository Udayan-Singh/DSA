package Backtracking;

import java.util.ArrayList;

public class NQueens {
    
    public static void main(String[] args) {
        
    }

    public static ArrayList<String> nQueens(boolean[] maze, int r, int c, int n, String p,int count){

        if(r==maze.length){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        //If you have counted in same row more than the times there are columns, just return null
        if(count>n){
            return null;
        }

        // If position cannot be accessed, look in the same row in different column and increment count value
        if(!maze[r][c]){
            nQueens(maze,r,(c+1)%n,n,p+".",count+1);
        }

        //When we find an accessible space
        maze[r][c] = false;

        //Make corresponding rows,columns and diagonals false
        for(int i = r+1; i < maze.length; i++){
            maze[i][c] = false;
        }

        for(int i = c+1; i < maze[r].length; i++){
            maze[r][i] = false;
        }

        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[r].length; j++){
                
            }
        }
    }
}
