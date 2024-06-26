package june25.test;

public interface Furniture {

    void seating();

}

/*class Table implements Furniture {
    @Override
    public void seating() {
        System.out.println("Comforatble seating... ");
    }
}*/

// Annoymous inner
class Main {
    public static void main(String[] args) {

        Furniture table = new Furniture () {

            @Override
            public void seating() {
                System.out.println("Comfortable seating..");
            }
        };

        table.seating();

    }
}