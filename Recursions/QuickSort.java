import java.util.Arrays;

public class QuickSort {
    
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        Sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr, int low, int high){

        if(low>=high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e - s)/2;
        int pivot = arr[mid];

        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }

            if(s<=e){
                Swap(arr,s,e);
                s++;
                e--;
            }
        }

        Sort(arr, low, e);
        Sort(arr, s, high);
    }
    public static void Swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
