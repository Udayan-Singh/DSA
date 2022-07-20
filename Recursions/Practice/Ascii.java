package Practice;

public class Ascii {
    
    public static void main(String[] args) {
        Subset("ab", "");
    }

    public static void Subset(String og, String ans){
        if(og.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = og.charAt(0);
        Subset(og.substring(1), ans);
        Subset(og.substring(1), ans + ch);
        Subset(og.substring(1), ans + (ch + 0));
    }
}
