public class SortedArray {
    
    public static void main(String[] args) {
        int[] arr = {21,2,3,4,5};
        System.out.println(CheckSorted(arr, 0));
    }

    public static Boolean CheckSorted(int[] arr, int i){

        //Base condition
        if(i==arr.length-1){
            return true;
        }

        return (arr[i] < arr[i+1] && CheckSorted(arr, i+1));
    }
}
