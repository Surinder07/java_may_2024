package june4;

public class Student {
    int id;  // instance variable
    String name;

    public Student() {
        System.out.println("Default const.");
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this(); // its calling default constructor ...
        this.id = id;
        this.name = name;
    }
    public void printStudentDetails(){  // local variables
        //this.id = id;
        System.out.println(this.id);
        System.out.println(name);
        System.out.println();
    }
}

// this - current class variable.
