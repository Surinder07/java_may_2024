package june4;

public class Person {

    public static void printName(){
        System.out.println("Pragra");
    }

    public void printNothing(){
        System.out.println("Something");
    }

    public static void main(String[] args) {
        printName();
    }

    static {
        System.out.println("inside static block ");
    }

    {
        System.out.println("Instance block....");
    }
}


