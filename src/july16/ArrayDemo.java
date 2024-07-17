package july16;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 30, 40, 340, 50);
        int[] arr = {10, 30, 40, 340, 50};
        Arrays.sort(arr);

        for (int arr1: arr) {
            System.out.println(arr1);
        }




    }


}

