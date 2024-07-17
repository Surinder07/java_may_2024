package july16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {

       // List<Integer> list = List.of(10, 30, 654, 33, 76, 89, 12, 43, 54, 77);


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(20);
        list.add(560);
        list.add(34);

        // sort
        Collections.sort(list);
        System.out.println(list);

        // find maximum
        System.out.println(Collections.max(list));

        // min
        System.out.println(Collections.min(list));

        // unmodifiable
        Collection<Integer> unmodifiableCollection = Collections.unmodifiableCollection(list);
      //  unmodifiableCollection.add(10);
        list.add(10);

        List<Integer> list3 = new ArrayList<>(list);
        list3.add(10);
        System.out.println(list3);



        // Google collection


    }
}
