package june1;

public class CalculatorDemo {

    // method overloading .....
    // same name but diff parameters

    int sum(int num1, int num2){
        return num1 + num2;
    }

    int sum(int num1, int num2, int num3 ){
        return num1 + num2 + num3;
    }

    int sum(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }


    public static void main(String[] args) {

        // create obj
        // overloading ...

        CalculatorDemo calculatorDemo = new CalculatorDemo();
        System.out.println(calculatorDemo.sum(10, 20, 10, 10));

    }
}

/*

create a method ,
String input(String)  -- name
input(String, String ) -- name, email
input(String, String , String ) -- name, email, password.




 */