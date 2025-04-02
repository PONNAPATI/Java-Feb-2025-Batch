package dinesh.OOPS.ABSTRACTION;

public class Sports_object {
    public static void main(String[] args) {
        Sports_meet football = new Team_School_1();
        Sports_meet cricket  = new Team_school_2();
        Sports_meet athlect  = new Team_School_3();
        football.football();
         //Cricket_1 = meet.Cricket();
        cricket.Cricket();
        System.out.println("\n");
        athlect.athletics();
    }
}
