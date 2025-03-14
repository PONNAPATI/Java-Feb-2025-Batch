
 class Test{
    int random;
    public void display(){
        System.out.println("Hello default constructor assigned your variable to:"+ random);
    }
}


public class ConstructorPractice {
    public static void main(String[] args){
        Test test = new Test();
        test.display();
    }
}
