public class SetAndFind {

    public static void main(String[] args) {
        
        int n = 5;
        int i = 2;
        System.out.println(Find(n,i));
        System.out.println(Set(n,i));
    }

    private static int Set(int n, int i) {
        return (n | (1 << n-1));
    }

    private static int Find(int n, int i) {
        return (n & (1 << n-1));
    }


    
}
