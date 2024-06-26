package june25.inner;

public interface Device {
   void test();
   void show();
}

class Test {

    public void show(){

        // 2
        Device device = new Device() {
            @Override
            public void test() {

            }

            @Override
            public void show() {

            }
        };

    }
}

class Maintest {
    public static void main(String[] args) {




    }
}
