class Test1{
    String name;
    Test1(){
        this("sahithi");
    }
    Test1(String n){
        name = n;
        System.out.println(name);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
    }

}
