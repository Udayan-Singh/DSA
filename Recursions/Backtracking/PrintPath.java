package Backtracking;

public class PrintPath {
    
    public static void main(String[] args) {
        int[][] maze = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };

        Print(maze, 0, 0, 1);
    }

    public static void Print(int[][] maze, int r, int c, int count){

        if(r==maze.length-1 && c==maze[0].length-1){
            maze[r][c] = count;
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[0].length; j++) {
                    System.out.print(maze[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println(count);
            System.out.println();
            System.out.println();
            return;
        }

        //If we reach a numbered square, it means we cant go there again
        if(maze[r][c]!=0){
            return;
        }

        maze[r][c] = count;

        if(r<maze.length-1){
            Print(maze, r+1, c, count+1);
        }
        if(c<maze[0].length-1){
            Print(maze, r, c+1, count+1);
        }
        if(r>0){
            Print(maze, r-1, c, count+1);
        }
        if(c>0){
            Print(maze, r, c-1, count+1);
        }

        //Revert the changes you made at the beginning
        maze[r][c] = 0;
    }
}
