package july6.collection;


import june4.Student;


import java.util.LinkedList;
import java.util.List;

public class Employee {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list); // 1

        list.add(1, 100);
        System.out.println(list); // 2
        System.out.println(list.size()); // 3


    }
}
class Employee1 {
    int id;

    public Employee1(int id) {
        this.id = id;
    }
}
