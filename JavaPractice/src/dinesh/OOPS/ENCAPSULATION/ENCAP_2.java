package dinesh.OOPS.ENCAPSULATION;

public class ENCAP_2 {
    private int Length; // encapsulated variable called through other methods and constructors to objects from other class
    private int Breadth;
    int Area;

    int assign (int l, int b){
        this.Length = l;
        this.Breadth = b;
        this.Area = Area;
        return Area = l * b;
    }
    protected int area(){
        return Area;
    }
}
