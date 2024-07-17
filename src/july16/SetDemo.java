package july16;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(40);
        set.add(230);
        set.add(1343);
        set.add(534);

        System.out.println(set);

        List<Integer> list = List.of(100, 20, 30, 60, 50, 60, 2320, 80, 90);

        TreeSet<Integer> set2 = new TreeSet<>(list);
        System.out.println("Tree set  : "+set2);

        System.out.println(set2.last());
        System.out.println(set2.headSet(90));
        System.out.println(set2.tailSet(35));



        /*
         Use scanner take input for names

         1. print those names in sorted order, alphabatical sort






         */


    }
}
