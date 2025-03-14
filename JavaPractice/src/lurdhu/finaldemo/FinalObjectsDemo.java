package src.lurdhu.finaldemo;

public class FinalObjectsDemo {

    public static void main(String[] args) {
        final Car myCar = new Car("TOYOTA");
        System.out.println("Model name is : " + myCar.getModel());

        myCar.setModel("HONDA");
        System.out.println("Updated Model name is : " + myCar.getModel());

//        myCar = new Car("BMW");
//        System.out.println("Model name AFTER reusing the same object : " + myCar.getModel());
    }
}
