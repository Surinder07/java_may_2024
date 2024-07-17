package july16;

import java.util.Scanner;

public class NamesDemo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the names ");
        String names;
        while (true) {
            names  = scanner.next();
            if(names.equals("done")) {
                break;
            }

        }

    }
}
