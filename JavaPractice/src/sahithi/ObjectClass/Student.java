package ObjectClass;

public class Student implements Cloneable {
    String name;
    int age;
    Student(String name,int age){
        this.age=age;
        this.name=name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
