import java.util.ArrayList;

public class LinearSearch {
    
    public static void main(String[] args) {
        int[] arr = {65,23,94,-21,65,54,2,11,65};
        System.out.println(Search(arr, 0, 111));
        Search2(arr, 0, 65);
        System.out.println(list);
        ArrayList<Integer> li = new ArrayList<>();
        System.out.println(Search3(arr, 0, 65, li));
        System.out.println(Search4(arr, 0, 65));
    }

    public static int Search(int[] arr, int i, int target){

        if(i==arr.length){
            return -1;
        }

        if(arr[i] == target){
            return i;
        }

        return Search(arr, i+1, target);
    }

    static ArrayList <Integer> list = new ArrayList<>();
    public static void Search2(int[] arr, int i, int target){        
        if(i==arr.length){
            return;
        }

        if(arr[i] == target){
            list.add(i);
        }

        Search2(arr, i+1, target);
    }

    public static ArrayList<Integer> Search3(int[] arr, int i, int target, ArrayList<Integer> l){        
        if(i==arr.length){
            return l;
        }

        if(arr[i] == target){
            l.add(i);
        }
        return Search3(arr, i+1, target, l);

    }

    public static ArrayList<Integer> Search4(int[] arr, int i, int target){   
        
        ArrayList<Integer> l= new ArrayList<>();
        if(i==arr.length){
            return l;
        }

        if(arr[i] == target){
            l.add(i);
        }

        ArrayList<Integer> Ans = Search4(arr, i+1, target);
        l.addAll(Ans);
        return l;

    }
}
