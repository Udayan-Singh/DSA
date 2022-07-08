import java.util.Arrays;

public class SelectionSort{
    
    public static void main(String[] args) {
        
        int[] arr = {65, 32, 21, 13 , 9 ,2};
        Sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void Sort(int[] arr){

        //Pass counter
        for(int i = 0; i < arr.length; i++){

            int end = arr.length - i - 1;
            int max = 0;
            for(int j = 1; j < arr.length-i; j++){

                if(arr[j] > arr[max]){
                    max = j;
                }

                Swap(arr,max,end);

            }
            
        }
    }

    public static void Swap(int[] arr,int first,int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp; 
    }
}