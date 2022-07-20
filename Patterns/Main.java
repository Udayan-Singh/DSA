public class Main{

    public static void main(String[] args) {
        Pattern1(5);
        System.out.println();
        Pattern2(5);
        System.out.println();
        Pattern3(5);
        System.out.println();
        Pattern4(5);
        System.out.println();
        Pattern5(5);
        System.out.println();
        Pattern6(5);
        System.out.println();
        Pattern7(5);
        System.out.println();
        Pattern8(4);
        System.out.println();
        Pattern9(4);
        System.out.println();
        Pattern10(4);
        System.out.println();        
    }

    public static void Pattern1(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
                System.out.print("*");
            }
            System.out.println();
            
        }
    }

    public static void Pattern2(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                
                System.out.print("*");
            }
            System.out.println();
            
        }
    }

    public static void Pattern3(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = n-i+1; j >=  1; j--) {
                
                System.out.print("*");
            }
            System.out.println();
            
        }
    }

    public static void Pattern4(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                
                System.out.print(j);
            }
            System.out.println();
            
        }
    }

    public static void Pattern5(int n){

        for(int i = 1; i < 2*n ; i++){
            int col = i<=n?i:2*n-i;
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern6(int n){

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n; j++ ){

                if(j <= n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern7(int n){

        for(int i = 0; i < n; i++){

            for(int j = 1; j <= n; j++ ){

                if(j <= i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern8(int n){

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= 2*n - 1; j++){

                if(j<=n-i || j>=n+i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern9(int n){

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= 2*n -1; j++){

                if(j < i || j > 2*n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern10(int n){
        for(int i = 0; i < n; i++){

            for(int j = 1; j < 2*n + 1; j++){

                if(j>=n-i && j<=n+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}