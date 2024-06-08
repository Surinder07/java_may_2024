package june8;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        int[] rollNumbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of array : ");


        for (int i = 0; i <rollNumbers.length ; i++) {
             rollNumbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < rollNumbers.length ; i++) {
            System.out.println("Roll Number : "+rollNumbers[i]);
        }

      /*  rollNumbers[0] = 201;
        rollNumbers[1] = 202;
        rollNumbers[2] = 203;
        rollNumbers[3] = 204;
        rollNumbers[4] = 205;*/




        /*System.out.println("Roll numbers : " + rollNumbers[0]);
        System.out.println("Roll numbers : " + rollNumbers[1]);
        System.out.println("Roll numbers : " + rollNumbers[2]);
        System.out.println("Roll numbers : " + rollNumbers[3]);
        System.out.println("Roll numbers : " + rollNumbers[4]);*/
    }
}

// create a String array - take input for names and print those names