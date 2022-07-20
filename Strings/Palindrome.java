import java.util.Scanner;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = in.nextLine();

        if(isPalindrome(name)){
            System.out.println("True");
        }
        else{
            System.out.println(false);
        }

        
    }

    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i-1);

            if(start != end){
                return false;
            }
        }

        return true;
    }

}
