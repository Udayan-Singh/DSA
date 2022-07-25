package Backtracking;

public class CombinationSum {
    
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        Print(arr, 7, 0, "");
    }

    public static void Print(int[] arr,int target, int num,String p){
        if(target==0){
            System.out.println(p);
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= target && arr[i]!=0){
                Print(arr, target-arr[i],arr[i],p+arr[i]);
            }
        }
    }
}
