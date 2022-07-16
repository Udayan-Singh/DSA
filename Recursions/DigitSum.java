public class DigitSum {
    public static void main(String[] args) {
        System.out.println(Sum(1234));
    }

    public static int Sum(int n){
        if(n==0){
            return 0;
        }

        int rem = n%10;
        return Sum(n/10) + rem;
    }
}
