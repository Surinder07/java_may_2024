package may21;

import java.util.Scanner;

public class NumberDemo {
    public static void main(String[] args) {

        // if number is positive or negative

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scanner.nextInt();

        //    -3  -2  - 1 0  1 2 3 4 5
        boolean result = num >= 0;

        if(result) {
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative..");
        }

    }
}
// odd or even ? %

// 1. check if the given number is even/odd
// 2. given number x = 10, y = 20, check which one is greater...
// 3. given 3 numbers x,y,z  check the greater of all...