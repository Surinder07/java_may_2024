package may25;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input... ");
        int input = scanner.nextInt();
        // String input = scanner.next();

        switch (input){
            case 1:
                System.out.println("Switch on the fan.");
                break;
            case 2 :
                System.out.println("Switch on the Bulb 1 .");
                break;
            case 3 :
                System.out.println("Switch on the Bulb 2. ");
                break;
            default:
                System.out.println("default... ");
        }


    }
}



// type ?  int float double...
// switch case



//         S1    S2       S2       S2
//      Fan     Bulb1     Bulb2   Powersocket
