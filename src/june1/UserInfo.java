package june1;

import java.util.Scanner;

public class UserInfo {

    public String input(String name){

        input("Pankaj", "@gmaill.com");
        String result = "Hello " + name;
        System.out.println(result);
        return result;
    }

    public String input(String name, String email){
        String result = "Hello " + name + email;
        return result;
    }

    public void test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name ");
        String name = scanner.next();

        System.out.println("Enter the email ");
        String email = scanner.next();

        UserInfo nameInput = new UserInfo();

        String printName = nameInput.input(name);
        String printNameAndEmail = nameInput.input(name, email);

        System.out.println(printName);
        System.out.println(printNameAndEmail);
    }

}

/*

create a method ,
String input(String)  -- name
input(String, String ) -- name, email
input(String, String , String ) -- name, email, password.

 /* public String input(String name ){

        // ask use to enter the name and return the name
        // hello name
        return "name ";
    }*/





