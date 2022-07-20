package Practice;

import java.util.ArrayList;

public class PhonePad {
    
    public static void main(String[] args) {
        Add("", "12");
        System.out.println(Pad("", "19"));
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
    }

    static void Add(String ans, String og){
        if(og.isEmpty()){
            System.out.println(ans);
            return;
        }
        int digit = og.charAt(0) - '0';
        for(int i = (digit-1)*3; i<digit*3; i++){

            char ch = (char)('a' + i);
            Add(ans +ch, og.substring(1));
        }
    }

    static ArrayList<String> Pad(String ans, String og){
        if(og.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        int digit = og.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1)*3; i<digit*3 && i<26; i++){

            char ch = (char)('a' + i);
            list.addAll(Pad(ans + ch, og.substring(1)));
        }
        return list;
    }
}
