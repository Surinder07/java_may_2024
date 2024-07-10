package jul9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        Student student1 = new Student(101, "Pragra", "Test","pragra@gmail.com", 50);
        Student student2 = new Student(102, "Peter", "Test","pragra@gmail.com", 20);
        Student student3 = new Student(103, "Makr", "Test","pragra@gmail.com", 40);
        Student student4 = new Student(104, "Mike", "Test","pragra@gmail.com", 23);
        Student student5 = new Student(105, "Alpha", "Test","pragra@gmail.com", 34);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);


        //

        System.out.println(list);

        // find the student with specific name - Mike
        // find all the students with age greater than 25



    }
}
