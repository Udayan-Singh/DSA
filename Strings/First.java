public class First {

    public static void main(String[] args) {

        String a = "Kunal";
        String b = "Kunal";

        //Value of object b is not changed, b starts pointing to someone else
        // b = "Udayan";
        System.out.println(a.equals(b));
    }
}
