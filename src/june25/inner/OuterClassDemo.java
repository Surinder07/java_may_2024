package june25.inner;

public class OuterClassDemo {

    // method

    static class InnerClassDemo {

        public void show(){
            System.out.println("Inner class Method...");
        }
    }
}

class Main {
    public static void main(String[] args) {
        /*OuterClassDemo outerClassDemo = new OuterClassDemo();
        OuterClassDemo.InnerClassDemo obj = outerClassDemo.new InnerClassDemo();
        obj.show();*/

        OuterClassDemo.InnerClassDemo obj = new OuterClassDemo.InnerClassDemo();
        obj.show();



    }
}
