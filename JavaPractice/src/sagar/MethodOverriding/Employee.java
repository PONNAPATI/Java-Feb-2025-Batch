package MethodOverriding;

public class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    // Parent method
    public void work() {
        System.out.println(name + "(Employee) is working.");
    }
}

class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    // Overridden method with specialized behavior
    @Override
    public void work() {
        System.out.println(name + "(Developer) is writing code.");
    }
}
class Manager extends Employee {
    public Manager(String name){
        super(name);
    }

    // Overridden method with specialized behavior
    @Override
    public void work(){
        System.out.println(name + " (Manager) is leading a team meeting.");
    }
}
