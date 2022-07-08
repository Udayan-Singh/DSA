import java.util.Arrays;
public class BubbleSort {
    
    public static void main(String[] args) {
        int[] arr = {65, 32, 21, 13 , 9 ,3};
        Sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void Sort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 1; j < arr.length-i; j++) {

                if(arr[j] < arr[j-1]){
                    Swap(arr,j,j-1);
                }
                
            }
        }
    }
    
    public static void Swap(int[] arr,int first,int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp; 
    }
}
