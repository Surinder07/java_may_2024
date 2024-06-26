package june25;

import static june25.Animal.x;

public interface Animal {

     int x = 10;

     void eat();
     void run();
}


class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating..");
        System.out.println(x);
    }

    @Override
    public void run() {
        System.out.println("Dog can run...");
    }
}
class Main1 {
    public static void main(String[] args) {



        Animal dog = new Dog(); //Upcasting...
        System.out.println(x);

        dog.eat();
        dog.run();
    }
}
