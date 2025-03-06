package src.lurdhu;

public class PentHouse extends House{
    PentHouse(String color, double size) {
        super(color, size);
    }

    public void checkIfWeCanAccessProtectedMethod() {
        test2();
    }
}
