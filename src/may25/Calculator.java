package may25;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("**************************");
        System.out.println("Welcome to My calculator");
        System.out.println("**************************");

        System.out.println("1. Press 1 for Addition");
        System.out.println("2. Press 2 for Subtraction");
        System.out.println("3. Press 3 for Multiplication");
        System.out.println("4. Press 4 for Division");
        System.out.println("5. Press 5 for Modulus");
        System.out.println("6. Exit");

        // user to enter these input values

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter you rinput ");
        CalDemo calculator =  new CalDemo();

        int input = scanner.nextInt();
        switch (input) {


            case 1:

                int num1 = scanner.nextInt();

               // calculator.sum(num1);
                //sum(); // calling a method
                break;

            case 2 :

                calculator.div();
                break;
        }

    }




}


