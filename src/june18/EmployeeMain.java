package june18;

public class EmployeeMain {
    public static void main(String[] args) {

        Address address = new Address("110 Matheson blvd", "Mississauga", "ON","CA", "L1K W3K");
        Employee employee1 = new Employee(101, "Jashan,", 100000.00, "FSD", address);
        Employee employee2 = new Employee(102, "Navjot,", 100001.00, "Senior dev", new Address("110 Matheson blvd", "Mississauga", "ON","CA", "L1K W3K"));
        Employee employee3 = new Employee(103, "Ankush,", 100001.00, "Product owner", new Address("110 Matheson blvd", "Mississauga", "ON","CA", "L1K W3K"));
        Employee employee4 = new Employee(104, "Sonal,", 100003.00, "FE", new Address("110 Matheson blvd", "Mississauga", "ON","CA", "L1K W3K"));

        employee1.address.city = "Toronto";

        System.out.println(employee1.toString());

        // Practice
        // Car --- > Music Player
        // Laptop ---> Keybaord
        // Country -> cities


    }
}
