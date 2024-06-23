package june22;

import java.util.ArrayList;
import java.util.List;

public  class Laptop {


    int memorySize = 100;

    public   void calcualte(){

        memorySize = 256;
        System.out.println("Memory : "+memorySize);
    }
}

class Dell extends Laptop {

    public void calcualte(int a) {
        super.calcualte();
    }
}

class Main1 {
    public static void main(String[] args) {

       Laptop laptop = new Laptop();




    }
}

/*

Generics

Data str
Interfaces --- > List - ArrayList LinkedList


  Set - HashSet TreeSet LinkedHashSet SortedSet

   Queue           Map


 */
