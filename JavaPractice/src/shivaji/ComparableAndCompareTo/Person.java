package shivaji.ComparableAndCompareTo;

public class Person {
  //  PersonDetails pdd = new PersonDetails();
    public static void main(String[] args) {
        PersonDetails pd1 = new PersonDetails("Shivaji", 1234, 25, 5.10, 'M');
        PersonDetails pd2 = new PersonDetails("Yashu", 2345, 20, 5.4, 'F') ;
        PersonDetails pd3 = new PersonDetails("Swathi", 3456, 27, 5.5, 'F') ;
        System.out.println(pd1.compareTo(pd2));
        System.out.println(pd2.compareTo(pd3));
    }
}
