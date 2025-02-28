package src.lurdhu;

public class ForLoopDemo {
    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++){
//            System.out.println("Hello world..");
//        }

        int sum = 0;
        for(int i = 5; i < 10; i++){
            sum = sum + i;    // 0 + 5 = 5
                              // 5 + 6 = 11
                              // 11 + 7 = 18
                              // 18 + 8 = 26
                              // 26 + 9 = 35
        }

        System.out.println("Sum is : " + sum);
    }
}
