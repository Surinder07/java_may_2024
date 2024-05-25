package may25;

import java.util.Scanner;

public class CountryDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input ");
        String country = scanner.next();

        switch (country){

            case "Canada" :
                System.out.println("Ottawa");
                break;

            case "India":
                System.out.println("New Delhi");
                break;

            case "USA":
                System.out.println("Washington DC");
                break;

            case "Australia":
                System.out.println("Canberra");
                break;

            default:
                System.out.println("Nothing found!!!");

        }
    }
}
