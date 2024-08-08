package july16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceDemo {
    public static void main(String[] args) {

// people names - age

        Map<String, Integer> map = new HashMap<>();
        map.put("Mark", 25); //  entry
        map.put("Peter", 34);
        map.put("Parker", 55);
        map.put("John", 47);
        map.put("Mike", 36);
        map.put("Mike", 34);

        System.out.println(map);

        System.out.println(map.get("Mike"));
        System.out.println(map.getOrDefault("Divyesh", 25));

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        Set<String> set = map.keySet();
        System.out.println("set of keys in the map " + sls -lrtet);
        Collection<Integer> values = map.values();
        System.out.println("set of values in the map " + values);

        // 5 mins.

        // Queue, Stack

        /*

        Key-value

        Name of country - capital
        Canada - Ottawa
        Us - Washington
        PersonName - 120



1. Key should unique
2. 1 null key
3. keys are stored in random order







         */



    }
}
