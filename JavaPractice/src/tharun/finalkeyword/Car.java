package tharun.finalkeyword;

public class Car {
      final String name;

      Car(String name){

          this.name = name;
      }
      public void printName(){

          System.out.println("Car name : " + name);
      }
//      public void changeName(){
//           name = "tesla";      Cannot change the value of final variable 'name'
//      }

    public static void main(String[] args) {
        Car myCar = new Car("Benz");
        myCar.printName();
    }
}
