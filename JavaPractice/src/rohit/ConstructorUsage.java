package rohit;

public class ConstructorUsage {

    int number;
    String name;
    int[] arr;
    ConstructorUsage(int number, String name, int[] arr){
        this.number=number;
        this.name=name;
        this.arr= arr;
    }

    void print()
    {
        System.out.println(name+" ,"+number);
        System.out.println(name);
        System.out.println(number);
      //  System.out.println(arr);
        for (int t:arr)
              {
                  System.out.println(t);

        }
    }

}
