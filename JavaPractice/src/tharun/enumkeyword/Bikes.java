package tharun.enumkeyword;

public enum Bikes {
    GT(35000.0),
    HEROHONDA (80000.0),
    ENFIELD(150000.0);

   private final double price;
    Bikes(double price){
        this.price = price;
    }
     public double getPrice(){
        return price;
     }

    public static void main(String[] args) {
        System.out.println(Bikes.ENFIELD.getPrice());
        System.out.println(Bikes.GT.getPrice());
    }
}
