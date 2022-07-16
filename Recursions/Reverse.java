public class Reverse {
    public static void main(String[] args) {
        System.out.println(Rev(1234));
    }

    static int sum = 0;
    public static int Rev(int n){

        if(n==0){
            return 0;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        Rev(n/10);
        return sum;
    }
}
