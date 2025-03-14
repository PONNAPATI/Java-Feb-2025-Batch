package dinesh.OOPS.ABSTRACTION;

public class Team_School_3 implements Sports_meet{
    @Override
    public void football() {

    }

    @Override
    public void Cricket() {

    }

    @Override
    public void athletics() {
        int sprinter_count = 6;
        boolean is_400_sprint_available = true;
        int average_height_of_100m_players = 8;

        switch  (average_height_of_100m_players){
            case 6:
                System.out.println("\n"+"The Team could cross knockouts");

            case 7:
                System.out.println("\n"+"The team could be runners");

            case 8:
                System.out.println("\n"+"possibly they could be winners");


            case 1:
                switch (sprinter_count){

                    case 1:
                        System.out.println("and also they enough sprinters in team: " +sprinter_count);

                    case 2:
                        System.out.println("and also they enough sprinters in team: " +sprinter_count);

                    case 3:
                        System.out.println("and also they enough sprinters in team: " +sprinter_count);

                    case 4:
                        System.out.println("and also they enough sprinters in team: " +sprinter_count);

                    case 5:
                        System.out.println("and also they enough sprinters in team: " +sprinter_count);
                        break;
                    case 6:
                        System.out.println("and also they enough sprinters in team: " +sprinter_count);
                        break;

                    case 7:
                        System.out.println("and also they enough sprinters in team: " +sprinter_count);

                    default:
                        System.out.println("and also they enough sprinters in team: " +sprinter_count);


                }



        }

    }

    @Override
    public void basketball() {
        Sports_meet.super.basketball();
    }
}
