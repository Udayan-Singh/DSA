public class CountZeroes {

    public static void main(String[] args) {
        Count(102001);
        System.out.println(count);
        System.out.println(Count2(10201, 0));
    }

    static int count = 0;
    public static void Count(int n){
        if(n==0){
            return;
        }

        int rem = n%10;
        if(rem == 0){
            count++;
        }

        Count(n/10);
        
    }

    public static int Count2(int n, int c){
        if(n==0){
            return c;
        }

        int rem = n%10;
        if(rem==0){
            return Count2(n/10, c+1);
        }
        return Count2(n/10, c);

    }
    
}
