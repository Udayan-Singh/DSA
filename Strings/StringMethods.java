import java.util.ArrayList;
import java.util.Arrays;
public class StringMethods {
    
    public static void main(String[] args) {
        
        System.out.println("a" + "b");
        System.out.println("a" + 1);

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Udayan" + new Integer(24));

        String name = "Udayan Singh";
        char a = 'a';
        System.out.println(Arrays.toString(name.toCharArray()));

    }
}
