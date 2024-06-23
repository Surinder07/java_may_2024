package june11;

public class Student {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printStudent(){
        System.out.println(id);
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "" +
                "=" + id +
                ", '" + name + '\'' +
                '}';
    }
}
