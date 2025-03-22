package tharun.staticblock;

public class Collage {
    static String CollageName;

    static{
        CollageName = "RLJIT";
        System.out.println("collage Name is :" + CollageName);
    }

    public static void main(String[] args) {
        System.out.println("collage Name is :");
        System.out.println(  CollageName);
    }
}
