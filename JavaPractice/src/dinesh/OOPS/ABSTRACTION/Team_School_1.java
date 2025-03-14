package dinesh.OOPS.ABSTRACTION;

public class Team_School_1 implements Sports_meet {

    private int players_average_age;
    String Coach_name;
    Double average_height_players;



    @Override
    public void football() {
        int players_average_age = 16;
        String Coach_name = "Tharun";
        Double average_height_players = 7.78d;
        System.out.println("players_average_age " +players_average_age +"\n"+ "Coach_name is " +Coach_name +"\n"+ "average_height_players"+average_height_players);
    }

    @Override
    public void Cricket() {

    }

//    @Override
//    public void Cricket(int players_average_age) {
//
//    }

    @Override
    public void athletics() {

    }
}
