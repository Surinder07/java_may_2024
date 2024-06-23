package june22;

public abstract class Vehicle {

    String make;
    String model;
    String engineType;


    // abstract method ,  idea
    public abstract void brake();
    public abstract void accelerate();
    public abstract void stop();
    public abstract void start();

    public void parentTest(){
        System.out.println("parent test ");
    }




}

class Car extends Vehicle {

    @Override
    public void brake() {
        System.out.println("Car brakes...");
    }

    @Override
    public void accelerate() {
        System.out.println("Car can accelrate");
    }

    @Override
    public void stop() {
        System.out.println("Car can stop");
    }

    @Override
    public void start() {
        System.out.println("Car can start");
    }

    public void test(){
        System.out.println("Car class method ");
    }
}

class Main {
    public static void main(String[] args) {

        //Vehicle vehicle = new Vehicle();

        // Upcasting ...
        // Parent class reference can be assigned to child class object
        Vehicle car = new Car();
       // Car car = new Car();
        car.stop();
        car.start();
        //car.test();
        car.parentTest();

    }
}