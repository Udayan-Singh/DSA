import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,22,1};
        Sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr, int i, int j, int max){

        if(i==0){
            return;
        }

        if(j==i){
            // Swap(arr,max,i-1);
            int temp = arr[max];
            arr[max] = arr[i-1];
            arr[i-1] = temp;
            Sort(arr, i-1, 0, 0);
        }
        else{
            if(arr[j] > arr[max]){
                Sort(arr, i, j+1, j);
            }
            else{
                Sort(arr, i, j+1, max);
            }
        }
    }

    public static void Swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
