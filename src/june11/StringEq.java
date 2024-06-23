package june11;

public class StringEq {
    public static void main(String[] args) {

        // ==     to check equality

        String s1 = "Keyboard";  // SCP
        String s2 = "Keyboard"; // SCP
        String s3 = new String("Keyboard"); // non scp , normal heap area

       // System.out.println(s1 == s2); // ref

       //  System.out.println(s1.equals(s2)); // content

        System.out.println(s1.equals(s3)); // true
        System.out.println(s1 == s3); // false

        System.out.println(s3);


        // + ------ overloaded operator
        // String + something ===== string
        // integer + integer + string =
        // 10 + 10 + "something" + 20  + 20  == 20something2020









    }
}
