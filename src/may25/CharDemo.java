package may25;

import java.util.Scanner;

public class CharDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the character ");
        char c = scanner.next().charAt(0);

        System.out.println(c);

    }
}
