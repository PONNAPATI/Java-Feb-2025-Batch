package dinesh.OOPS.POLYMORPHISM.METHODOVERLOADING;

public class MethodOverloading {
    // Qualification of the player
    int wickets = 45;
    private void player1(){
        System.out.println("Just started to learn cricket and still in initial stage");
    }
    private void player1(String batting, int score){

    }
    private int player1(boolean bowl, int wickets){
        bowl = true;
        this.wickets = wickets;
        System.out.println("Can the player1 can bowl " +bowl);
        if(bowl){
            System.out.println("The players has wickets");
            System.out.println("The no of wickets took by player1: " +wickets);
        }
        return wickets;
    }

    private String player1(int wickets, boolean goodfielder){
    //wickets = 23;
    if (goodfielder && wickets == 12){
        System.out.println("He is an perfect all rounder");
    }
    else{
        System.out.println("He is not all rounder");
        }
        return "He is good bowler";
    }

    public static void main(String[] args) {
        MethodOverloading player_1 = new MethodOverloading();
        player_1.player1(true,23);
        player_1.player1(12,true);

    }

    // We can also do method overloading

}
