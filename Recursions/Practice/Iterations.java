package Practice;

import java.util.ArrayList;
import java.util.List;
public class Iterations {
    
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(SubsetDuplicate(arr));
    }

    public static List<List<Integer>> Subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }

        } 

        return outer;

    }

    public static List<List<Integer>> SubsetDuplicate(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); //Add an empty set to list
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            int n = outer.size();
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size()-1;
            for(int j = start; j < n; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
