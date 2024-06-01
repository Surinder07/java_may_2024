package may25;

import java.util.Scanner;

public class CalDemo {

    Scanner scanner = new Scanner(System.in);

    public void sum() {

        System.out.println("Enter the first Number ");
        int a = scanner.nextInt();

        System.out.println("Enter the second  Number ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("Sum is : "+sum);

    }

    public void div(){}
}
