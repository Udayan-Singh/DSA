public class OneToN {
    
    public static void main(String[] args) {
        Print1toN(5);
        System.out.println();
        PrintNto1(5);
    }

    public static void Print1toN(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        
        Print1toN(n-1);
        System.out.print(n + " ");
    }

    public static void PrintNto1(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        
        System.out.print(n + " ");
        PrintNto1(n-1);
    }
}
