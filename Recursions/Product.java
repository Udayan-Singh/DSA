public class Product {
    
    public static void main(String[] args) {
        System.out.print(Prod(5));
    }

    public static int Prod(int n){

        if(n==1){
            return 1;
        }

        return n * Prod(n-1);
    }
}
