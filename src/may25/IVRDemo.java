package may25;

import java.util.Scanner;

public class IVRDemo {
    public static void main(String[] args) {
        System.out.println("**************************");
        System.out.println("Welcome to Rogers/Bell");
        System.out.println("**************************");

        System.out.println("1. Press 1 for English");
        System.out.println("2. Press 2 for Spanish");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                System.out.println("English");

                int moreChoice = 1;

                if( moreChoice == 1 ){

                    System.out.println("Tech support..");
                    System.out.println("Do you want to talk to tech support or automatic response ");
                    System.out.println("Press 1 for Tech support and 2 for automatic response ");
                    int response = 1;
                    if(response == 1) {
                        System.out.println("Tech support online..");
                    }else{
                        System.out.println("Automatic response. ");
                    }
                }
                else if (moreChoice == 2){

                }
                else if (moreChoice ==3) {


                }
                else {
                    System.out.println("Invalid input...");
                }

                break;

            case 2 :

                break;
        }


    }
}


// Press 1 : English
// Telecom : Billing, Cancellation,  Tech Support, Customer
// Billing -- pay your bill, make a payment arrangement
// Press 2 : French
