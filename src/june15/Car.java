package june15;

public class Car extends Vehicle{
    int numOfSeats;

    public Car(String make, String model, String year, String color, String type) {
        super(make, model, year, color, type);
    }

    public void brake(){
        System.out.println("Car brake");
        System.out.println(super.color);
        System.out.println(this.numOfSeats);
    }

}
