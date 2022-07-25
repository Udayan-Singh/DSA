package Backtracking;

import java.util.Arrays;

public class RatInAMaze1 {
    
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}};

        int[][] pmaze = {{0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0}};

        Ans(maze, 0, 0, "",pmaze);
        printSolution(pmaze);
        
    }

    public static void Ans(int[][] maze, int col, int row,String p, int[][] pmaze){
        if(row==maze.length-1 && col==maze[0].length-1){
            pmaze[row][col] = 1;
            System.out.println(p);
            return;
        }

        if(maze[row][col] == 0){
            return;
        }

        pmaze[row][col] = 1;

        if(row<maze.length-1){
            Ans(maze, col, row+1, p+'D',pmaze);
        }
        if(col<maze[0].length-1){
            Ans(maze, col+1, row, p+'R',pmaze);
        }

    }

    public static void printSolution(int sol[][])
    {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[i].length; j++)
                System.out.print(" " + sol[i][j] + " ");
            System.out.println();    
        }
    }
}
