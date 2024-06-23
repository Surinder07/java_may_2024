package june22.assignment;

public class MainVehicleDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Honda", "Civic", 2023);

        vehicle.setModel("Accord");

        System.out.println(vehicle);


        Car car = new Car("Honda", "Civic", 2023,4);
        car.displayInfo();

    }
}
