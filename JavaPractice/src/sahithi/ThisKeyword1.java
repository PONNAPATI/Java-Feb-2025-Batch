import java.awt.*;

class Test2{
    String name;
    Test2(){
        System.out.println("This method is also called");
    }
    Test2(String n){
        this();
        name = n;

        System.out.println(name);
    }
}public class ThisKeyword1 {
        public static void main(String[] args) {
            Test2 t2 = new Test2("sahithi");
        }

}
