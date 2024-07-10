package july6;

public class Student<T,R> {

    T id;
    R name;

    public Student(T id, R name) {
        this.id = id;
        this.name = name;
    }
}
// Box<Integer,String>
// item1
// item2
//
/*
class Box<T,R> {

  T item1;
  R item2;


 */