public class Patterns {
    
    public static void main(String[] args) {
        Pattern1(4,0);
    }

    public static void Pattern1(int row, int col){
        if(row==0){
            return;
        }

        //If number of columns is equal to row, we take a line gap and start printing for next r
        if(col == row){
            System.out.println();
            Pattern1(row-1, 0);
        }
        else{
            System.out.print("*");
            Pattern1(row, col+1);
        }
    }
}
