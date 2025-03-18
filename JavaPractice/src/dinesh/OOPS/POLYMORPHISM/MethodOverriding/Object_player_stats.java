package dinesh.OOPS.POLYMORPHISM.MethodOverriding;

public class Object_player_stats {
    public static void main(String[] args) {
        PlayerStats_DuleepTrophy Tnpl = new PlayerStats_TNPL();
        PlayerStats_DuleepTrophy syedali = new PlayerStatsSyedAliTrophy();
        PlayerStats_DuleepTrophy duleep = new PlayerStats_DuleepTrophy();
        System.out.println("From The stat of the player from SyedAliTrophy");
        syedali.Player3();
        System.out.println("\n"+ "The stat of the player from TNPL");
        Tnpl.Player3();
        System.out.println("\n"+ "The stat of the player from Duleep Trophy");
        duleep.Player3();
    }

}
