package src.lurdhu;

public class UncheckedExceptionDemo {

    public static void main(String[] args) {
        String name = null;
        int length = getNameLength(name);
        System.out.println("Length of the string is :" + length);
    }

    public static int getNameLength(String name){
        return name.length();
    }


}
