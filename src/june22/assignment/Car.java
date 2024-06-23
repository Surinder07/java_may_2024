package june22.assignment;

public class Car extends Vehicle{

    int numOfDoors;

    public Car(String make, String model, int year, int numOfDoors) {
        super(make, model, year);
        this.numOfDoors = numOfDoors;
    }
}
