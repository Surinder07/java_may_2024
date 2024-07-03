package jul2;

import java.util.Scanner;

public class CalcualtorDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first Number ");
        int x = scanner.nextInt();

        System.out.println("Enter the second Number ");
        int y = scanner.nextInt();

        int div = 0;

        try {
            div = x /y ;

            String s = "pragra";
            s = null;
            s.toUpperCase();

        }catch ( NullPointerException e  ) {
            e.getMessage();
        }
        catch (Exception e ) {
            System.out.println(e);
        }
        finally {
            System.out.println("Test finally block ");
        }


        System.out.println("Div of two nos. " + div);
    }
}

// create an array of size 5 and insert 6 elements.
