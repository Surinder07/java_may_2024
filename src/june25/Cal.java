package june25;

public class Cal {

    void sum(int a, String b){

    }


}
class ScientifiCal  extends Cal {


    void sum(int a, int b) {
        System.out.println("sum ");
    }

    @Override
    void sum(int a, String b) {
        super.sum(a, b);
    }
}

class Main {
    public static void main(String[] args) {
        Cal scientifiCal = new ScientifiCal();


    }
}
