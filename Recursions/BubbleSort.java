import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Sort(arr, arr.length-1, 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr, int i, int j){

        if(i==0){
            return;
        }

        if(j==i){
            Swap(arr, j-1, j);
            Sort(arr,i-1,1);
        }
        else{
            if(arr[j] < arr[j-1]){
                Swap(arr,j,j-1);
                Sort(arr, i, j+1);
            }
        }
    }

    public static void Swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
