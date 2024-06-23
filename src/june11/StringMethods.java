package june11;

import june8.Student;

public class StringMethods {
    public static void main(String[] args) {

        String s1 = "Hello";  // He   llo
        String upperCase = s1.toUpperCase();
        System.out.println(upperCase);


        String s2 = "Hello";

        char[] chars = s2.toCharArray();

        for (char ch: chars) {
            System.out.println(ch);
        }


      /*  char c = s1.charAt(1);
        System.out.println(c);


        String concat = s1.concat(" Java");
        System.out.println(concat);


        int length = s1.length();

        System.out.println(length);

        String trim = s1.trim();
        System.out.println(trim);

        s1.trim();*/



        //



    }
}
