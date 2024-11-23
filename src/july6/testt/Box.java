package july6.testt;

public class Box<T,R> {

    T length;
    R width;

    public Box(T length, R width) {
        this.length = length;
        this.width = width;
    }
}
class Boxing{
    public static void main(String[] args) {
        // Box box = new Box(12,"we");
        Box<String, String> box = new Box<>("12","we");
        
    }
}
