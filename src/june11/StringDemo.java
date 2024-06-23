package june11;

public class StringDemo {
    public static void main(String[] args) {

// primitive == int char float
        // non primitive ==== class , Arrays, String

         String s1 = "pragra";
        System.out.println(s1);   //  s1 s2 s3  --------> pragra
                                    // s3 -------> mouse
        // heap --- string constant pools

         String s2 = "pragra";
        System.out.println(s2);

         String s3 = "pragra";
        System.out.println(s3);

         s3 = "mouse";
        System.out.println(s3);

        // if strings are mutable - assumption
        System.out.println(s1);
        System.out.println(s2);

        char[] chars = s3.toCharArray();
        // revsese this array


    }
}


// String s1 = "pragra";
// String s2 = "pragra";
// String s3 = new String("pragra");


//  String s1 = "pragra";
// reverse this string















