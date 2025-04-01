package src.lurdhu.returncomplexttype;

import src.lurdhu.java8.optional.examplewithoutusingoptional.Address;

import java.util.Optional;

public class Student {
    private int id;
    private String name;
    private String email;

    private src.lurdhu.java8.optional.examplewithoutusingoptional.Address address;

    public Student(int id, String name, String email, src.lurdhu.java8.optional.examplewithoutusingoptional.Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public StudentNameAge getStudentNameAge(){
        StudentNameAge studentNameAge = new StudentNameAge();
        studentNameAge.setName("Thomas");
        studentNameAge.setAge(27);

        return studentNameAge;
    }
}
