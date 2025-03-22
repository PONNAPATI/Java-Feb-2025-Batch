package dinesh.OOPS.ABSTRACTION;

public interface Sports_meet {
   int Sprinter_count = 23;
    void football();

    void Cricket();

    public void athletics();

    default void basketball(){
        System.out.println("The Basket ball team is not performing upto the expectations");
    }



}
