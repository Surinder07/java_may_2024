package jul9;

import june25.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(1000);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(60);
        list.add(null);
        System.out.println(list);

        // 0  1  2  3  4   5   6  7   8  9
        // 10 20 30 40 50 60  70  80 90 100

        // Iterator
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        /*
        // create a list of Employee
1. Id , firstName, lastName, email, city, age

1. city = Toronto

find the employee who is from Toronto
find the employee over age 30


Create a list of Employee and print out those.
         */









   /*     for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        // for each

        for (Integer i : list) {
            System.out.println(i);
        }
*/







      /*  List<Integer> list2 = new ArrayList<>(list);
        list2.add(100);
        list2.add(200);

        System.out.println(list2);*/

        /*
        for loop
        for each loop
        iterator


         */


    }

}
