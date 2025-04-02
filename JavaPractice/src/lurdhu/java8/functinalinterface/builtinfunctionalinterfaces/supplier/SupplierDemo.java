package src.lurdhu.java8.functinalinterface.builtinfunctionalinterfaces.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

//        List<String> studentNames = Arrays.asList("John", "Thomas", "Vlad");
//
        CollegeConfiguration collegeConfiguration = new CollegeConfiguration();
//
//        for(String studentName : studentNames){
//            System.out.println("Student " + studentName + " is studying in : " + collegeConfiguration.getCollegeName());
//        }

        Supplier<String> getCollegeName = () -> "MIT";

        System.out.println(getCollegeName.get());


    }
}
