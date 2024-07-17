package july16;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {


        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(20);
        set.add(40);
        set.add(230);
        set.add(34);
        set.add(66);
        set.add(34);
        System.out.println(set);

    }
}
