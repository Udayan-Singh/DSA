package Backtracking;

public class AllPathsMaze {
    
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        PrintAllPaths("", maze, 0, 0);

    }

    public static void PrintAllPaths(String p, boolean[][] maze, int r, int c){

        //If position reached, return processed string.
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        //If base condition is not reached and the path we are currently on has been travelled
        //in previous calls, do not go back at it again, else it can cause an infinite loop.

        if(!maze[r][c]){
            return;
        }

        //Now since we are on currently unvisited cell, we can mark it as false to avoid future 
        //recursion call to go back at it again
        maze[r][c] = false;

        //Provide conditions to go left,right,up,down
        if(r<maze.length-1){
            PrintAllPaths(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            PrintAllPaths(p+'R', maze, r, c+1);
        }
        if(r>0){
            PrintAllPaths(p+'U', maze, r-1, c);
        }
        if(c>0){
            PrintAllPaths(p+'L', maze, r, c-1);
        }

        //Now the function has to return and since many rows and columns are marked false
        //Revert the changes made by the current recursive call
        maze[r][c] = true;
    }
}
