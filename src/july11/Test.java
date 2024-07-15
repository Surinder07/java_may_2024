package july11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        // List - interface -- arraylist linkedlist
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);


        /*list.size();
        list.toArray();
        list.get(10);*/
//        System.out.println("Index of "+list.indexOf(new Integer(40)));
        System.out.println(list);
/*

        list.set(4, 100);
        System.out.println(list.indexOf(100));

        System.out.println(list);
*/


    }
}
