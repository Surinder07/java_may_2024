package june22;

import java.util.Scanner;


public class Animal {

    Scanner scanner = new Scanner(System.in);
    public void makeSound(){
        System.out.println("Animal Making sound");
    }
}

class Dog extends Animal {


}

class MainTest {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.makeSound();
    }
}