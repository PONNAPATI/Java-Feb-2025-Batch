package shivaji.ComparableAndCompareTo;

public class PersonDetails implements Comparable<PersonDetails>{
    private String name ;
    private int Id ;
    private int age;
    private double height ;
    private char gender;

    public PersonDetails(String name, int Id, int age, double height, char gender)
    {
        this.name=name;
        this.Id=Id;
        this.age=age;
        this.height=height;
        this.gender=gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(PersonDetails pd) {
        return this.age - pd.age;
    }

    @Override
    public String toString() {
        return "PersonDetails{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", age=" + age +
                ", height=" + height +
                ", gender=" + gender +
                '}';
    }
}
