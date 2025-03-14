package dinesh.OOPS.ABSTRACTION;

public class Team_school_2 implements Sports_meet{
    @Override
    public void football() {

    }

    @Override
    public void Cricket() {
        int players_squad_count = 17;
        String Caption_name = "Vikas";
        long coach_phone_number = 262782822;
        float Average_economy_of_bowlers = 7.68f;
        double Average_strike_Of_batsman = 140.98;
        System.out.println("\n"+"Cricket winning prediction:");
        if(Average_strike_Of_batsman>=150 && Average_economy_of_bowlers<=7.50){
            System.out.print("The winning predictor is 80%");
        } else if (Average_strike_Of_batsman<=140 || Average_economy_of_bowlers >= 8.89) {
            System.out.print("Winning Changes are poor");
        } else  {
            System.out.print("Teams winning percentage is 50%");
        }

    }

    @Override
    public void athletics() {

    }

    @Override
    public void basketball() {
        Sports_meet.super.basketball();
    }
}
