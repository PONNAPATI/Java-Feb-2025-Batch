package dinesh.OOPS.POLYMORPHISM.MethodOverriding;

public class PlayerStats_TNPL extends PlayerStats_DuleepTrophy {
    void Player3(){
        int wickets = 23;
        String name = "ankul";
        boolean AllRounder = true;
        double average_economy = 7.67;
        int BattingAverage = 59;
        if(AllRounder){
            if(wickets>=20 && BattingAverage >= 65 ){
                System.out.println("The IPL teams will bid him at least 0.7 million dollars ");
            }
            else if (wickets <= 17 && average_economy <=8) {
                System.out.println("The Ipl teams bid till 0.58 million dollars");
            }
            else if (BattingAverage >= 50 || average_economy >= 10){
                System.out.println("The teams may not bid for that palyer");
            }
            else {
                System.out.println("No teams will interest to bid that player");
            }
        }
        else {
            System.out.println("The player does not come under AllRounder category catogery");
        }

    }
}
