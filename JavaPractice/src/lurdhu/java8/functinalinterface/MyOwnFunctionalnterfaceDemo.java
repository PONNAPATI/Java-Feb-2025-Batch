package src.lurdhu.java8.functinalinterface;

public class MyOwnFunctionalnterfaceDemo {
    public static void main(String[] args) {
//        MyOwnFunctionalInterface mofi = new MyOwnFunctionalInterface() {
//            @Override
//            public void getStudent(int studentId) {
//                System.out.println("This is student : " + studentId);
//            }
//        };

        MyOwnFunctionalInterface mofi = (studentId) -> {
                System.out.println("This is student : " + studentId);
            };


        mofi.getStudent(1001);
    }
}
