package Backtracking;

import java.util.ArrayList;

public class Maze {
    
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        // System.out.println(Count(3, 3));
        PrintPathObstacle("", maze,0, 0);
        // System.out.println(PrintPathList2("", 3, 3));
    }

    public static int Count(int row, int col){
        if(row==1 || col==1){
            return 1;
        }

        int right = Count(row,col-1);
        int left = Count(row-1,col);

        return left + right;
    }

    public static void PrintPath(String p, int row, int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        else if(row==1 && col!=1){
            PrintPath(p+'R', row, col-1);
        }
        else if(row!=1 && col==1){
            PrintPath(p+'D', row-1, col);
        }
        else{
            PrintPath(p+'R', row, col-1);
            PrintPath(p+'D', row-1, col);
        }
    }

    public static ArrayList<String> PrintPathList(String p, int row, int col){
        
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> list = new ArrayList<>();
        if(row>1){
            list.addAll(PrintPathList(p+'D', row-1, col));
        }
        if(col>1){
            list.addAll(PrintPathList(p+'R', row, col-1));
        }
        return list;
    }

    public static ArrayList<String> PrintPathList2(String p, int row, int col){
        
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> list = new ArrayList<>();
        if(row>1){
            list.addAll(PrintPathList2(p+'D', row-1, col));
        }
        if(col>1){
            list.addAll(PrintPathList2(p+'R', row, col-1));
        }
        if(row>1 && col>1){
            list.addAll(PrintPathList2(p+'T',row-1,col-1));
        }
        return list;
    }
    
    public static void PrintPathObstacle(String p,boolean[][] maze ,int row, int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        if(row<maze.length-1){
            PrintPathObstacle(p+'D',maze, row+1, col);
        }
        if(col<maze[0].length-1){
            PrintPathObstacle(p+'R',maze, row, col+1);
        }
        
    }
}
