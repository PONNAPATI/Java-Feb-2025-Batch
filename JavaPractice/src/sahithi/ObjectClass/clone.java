package ObjectClass;

public class clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("sahithi",23);
        Student s2 = (Student) s1.clone();
        System.out.println(s1.name.equals(s2.name));
    }
}
gi