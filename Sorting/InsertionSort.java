import java.util.Arrays;
public class InsertionSort {
    
    public static void main(String[] args) {
        int[] arr = {65, 32, 21, 13 , 9 ,3};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){

            for(int j = i+1; j > 0; j--){

                if(arr[j] < arr[j-1]){
                    Swap(arr,j,j-1);
                }
                else{
                    break;
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
