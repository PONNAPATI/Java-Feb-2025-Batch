package src.lurdhu;

public class Car {

    String name;
    String engineType;
    int speed;

    Car(){
        System.out.println("Hi... I am  car class constructor.....");
    }

//    Car(String nameDetails, String engineTypeDetails, int speedDetails){
//        name = nameDetails;
//        engineType = engineTypeDetails;
//        speed = speedDetails;
//    }

    Car(String name, String engineType, int speed){
        this.name = name;
        this.engineType = engineType;
        this.speed = speed;
    }

    Car(String nameDetails, int speedDetails){
        name = nameDetails;
        speed = speedDetails;
    }

    public void hello(){
        System.out.println("Hi there...");
        //
    }

    public void printVariables () {
        System.out.println("name : " + name);
        System.out.println("engineType : " + engineType);
        System.out.println("speed : " + speed);
    }

    public void setEngineType(String engineTypeDetails){
        engineType = engineTypeDetails;
    }

    public void setName(String nameDetails){
        name = nameDetails;
    }

    public void setSpeed(int speedDetails){
        speed = speedDetails;
    }
}
