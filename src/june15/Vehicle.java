package june15;

public class Vehicle {
     String make;
     String model;
     String year;
     String color;
     String type;


    public Vehicle(String make, String model, String year, String color, String type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.type = type;
    }

    public void printCarDetails(){
        System.out.println("Color " + color);
        System.out.println("Make " + make);
        System.out.println("Model " + model);
        System.out.println("Year " + year);
        System.out.println("Type " + type);
    }

}
