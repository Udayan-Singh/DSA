package Practice;

public class Strings1 {

    public static void main(String[] args) {
        Skip("Udayan Singh", "");
        System.out.println(Skip2("Udayan"));
        SkipApple("UdayanappleSingh", "");
    }
    
    public static void Skip(String og, String ans){
        if(og.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = og.charAt(0);
        if(ch=='a'){
            Skip(og.substring(1),ans);
        }
        else{
            Skip(og.substring(1), ans + ch);
        }
    }

    public static String Skip2(String og){
        if(og.isEmpty()){
            return "";
        }

        char ch = og.charAt(0);
        if(ch=='a'){
            return "" + Skip2(og.substring(1));
        }
        else{
            return ch +Skip2(og.substring(1));
        }
    }

    public static void SkipApple(String og, String ans){
        
        if(og.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = og.charAt(0);
        if(og.startsWith("apple")){
            SkipApple(og.substring(5), ans);
        }
        else{
            SkipApple(og.substring(1), ans + ch);
        }
    }
}
