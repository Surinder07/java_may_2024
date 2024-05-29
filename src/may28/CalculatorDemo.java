package may28;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        char c;

        do {


            System.out.println("**************************");
            System.out.println("Welcome to My calculator");
            System.out.println("**************************");

            System.out.println("1. Press 1 for Addition");
            System.out.println("2. Press 2 for Subtraction");
            System.out.println("3. Press 3 for Multiplication");
            System.out.println("4. Press 4 for Division");
            System.out.println("5. Press 5 for Modulus");
            System.out.println("6. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your input ....");
            int input = scanner.nextInt();
            int x;
            int y;

            switch (input) {
                case 1:

                    x = 10;
                    y = 20;
                    int sum = x + y;
                    System.out.println(sum);

                    break;
                case 2:
                    x = 10;
                    y = 5;
                    int sub = x - y;
                    System.out.println(sub);
                    break;
            }

            System.out.println("Do you still want to continue ???");
            System.out.println("Press 'Y'for yes , n for no");
            // expecting user to enter the input...
             c = scanner.next().charAt(0);

        }while (c == 'Y' || c == 'y');
    }
     }

