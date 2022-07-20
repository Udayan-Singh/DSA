public class Unique {
    
    public static void main(String[] args) {
        
        int[] arr = {2,1,3,2,3,1,5,4,5,6,6};

        int unique = 0;
        for(int i = 0; i < arr.length; i++){

            unique = unique ^ arr[i];
        }

        System.out.println(unique);
    }
}
