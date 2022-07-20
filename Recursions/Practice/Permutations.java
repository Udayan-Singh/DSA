package Practice;

import java.util.ArrayList;

public class Permutations {

    public static void main(String[] args) {
        Permutation("abc","");
        System.out.println(PermutationList("abc",""));
    }

    public static void Permutation(String og, String ans){

        if(og.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = og.charAt(0);
        for(int i = 0; i <= ans.length(); i++){
            String f = ans.substring(0, i);
            String l = ans.substring(i,ans.length());
            Permutation(og.substring(1), f+ch+l);
        }
    }

    public static ArrayList<String> PermutationList(String og, String ans){

        if(og.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = og.charAt(0);
        ArrayList<String> li = new ArrayList<>();
        for(int i = 0; i <= ans.length(); i++){
            String f = ans.substring(0, i);
            String l = ans.substring(i,ans.length());
            li.addAll(PermutationList(og.substring(1), f+ch+l));
        }

        return li;
    }
    
}
