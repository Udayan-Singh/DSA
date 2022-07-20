package Practice;

import java.util.ArrayList;

public class Subsequence {
    
    public static void main(String[] args) {
        SubSeq("abc", "");
        System.out.println(subSeq("abc", ""));
    }

    public static void SubSeq(String og, String ans){

        if(og.isEmpty()){
            System.out.println(ans);
            return;
        }

        //2 Conditions... Ignore it or Take it
        char ch = og.charAt(0);

        //Taking answer
        SubSeq(og.substring(1),ans+ch);

        //Ignoring answer
        SubSeq(og.substring(1), ans);
    }

    public static ArrayList<String> subSeq(String og, String ans){

        if(og.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = og.charAt(0);

        ArrayList<String> left = subSeq(og.substring(1), ans + ch);
        ArrayList<String> right = subSeq(og.substring(1), ans);

        left.addAll(right);
        return left;
    }
}
