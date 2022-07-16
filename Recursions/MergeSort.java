import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
       arr = Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] Sort(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        //Get 2 answer arrays.
        int mid = arr.length/2;
        int[] arr1 = Sort(Arrays.copyOfRange(arr, 0, mid));
        int[] arr2 = Sort(Arrays.copyOfRange(arr, mid, arr.length));

        //Merge two answer arrays
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i<arr1.length && j<arr2.length){

            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                k++;
                i++;
            }
            else{
                ans[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < arr1.length){
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            ans[k] = arr2[j];
            j++;
            k++;
        }

        return ans;
    }
}
