package june4;

public class Employee {
    int id;
    String name;
    static String company = "Pragra"; // memory assigned once.

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDetails(){
        System.out.println();
        System.out.println(id);
        System.out.println(name);
        System.out.println(company);
    }

}

class EmpMain {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Pankaj"); // get memory
        Employee e2 = new Employee(102, "Mathumitha");
        Employee e3 = new Employee(103, "Kiran");
        Employee e4 = new Employee(104, "Vikas");
        Employee e5 = new Employee(105, "Vivek");

        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
        e4.printDetails();
        e5.printDetails();
    }
}
