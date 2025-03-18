package dinesh.OOPS.POLYMORPHISM.MethodOverriding;

public class PlayerStatsSyedAliTrophy extends PlayerStats_DuleepTrophy{
    void Player3(){
        int wickets = 12;
        String name = "varjith";
        boolean spinbowler = true;
        double average_economy = 7.67;
        if(spinbowler){
            if(wickets>=20 && average_economy <=6 ){
                System.out.println("The IPL teams will bid him at least 0.7 million dollars ");
            } else if (wickets >= 17 && average_economy <=8) {
                System.out.println("The Ipl teams bid till 0.58 million dollars");
            }
            else if (wickets <= 10 || average_economy >= 10){
                System.out.println("The teams may not bid for that palyer");
            }
            else {
                System.out.println("No teams will interest to bid that player");
            }
        }
        else {
            System.out.println("The player does not come under fast bowler catogery");
        }

    }
}

