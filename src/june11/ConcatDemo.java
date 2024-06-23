package june11;

public class ConcatDemo {
    public static void main(String[] args) {
        String s1 = "Hello";


        System.out.println(20 + 20 + s1);  // 40Hello
        System.out.println(s1 + 20 + s1); // Hello20Hello
        System.out.println(20 + 20 + s1 + 30 + 50 ); // 40Hello3050

    }
}
