package dinesh.Collections.SET;

/*Implementation classes of List interface
HashSet – Fast access, unordered
LinkedHashSet – Maintains insertion order
TreeSet – Sorted order*/

import java.util.Iterator;
import java.util.Set;

//A TreeSet stores elements in sorted order and does not allow duplicates
public class treeSet implements Comparable<treeSet>{
    String Company_name;
    Integer    Employee_ID;
    Double EmployeeHeight; // In Comparable we should not use primitive data types like int,double instead String,INteger,Double
    Boolean IsItMale;

//    public void EmployeeID(){
//        this.Employee_ID = 2345;
//    }



   public treeSet(String Company_name, double EmployeeHeight, int Employee_ID){
        this.Company_name = Company_name;
        this.EmployeeHeight = EmployeeHeight;
        this.Employee_ID = Employee_ID;
    }
    @Override
    public int compareTo(treeSet o) {
        return this.Employee_ID.compareTo(o.Employee_ID);
    }
    @Override
    public String toString() {
        return "TreeSet{" +
                "Company_name='" + Company_name + '\'' +
                ", Employee_ID=" + Employee_ID +
                ", EmployeeHeight=" + EmployeeHeight +
                ", IsItMale=" + IsItMale +
                '}';
    }

    public static void main(String[] args) {
        Set<treeSet> Employee_Identity = new java.util.TreeSet<>();

        Employee_Identity.add(new treeSet("Yamaha",6.58,3445));
        Employee_Identity.add(new treeSet("Pulsar",6.78,2345)); //Here it compared the Identity as alphabetically
        Employee_Identity.add(new treeSet("Honda",5.98,4545));

        System.out.println("Employee roster in alphabetical order:");
        Iterator<treeSet> iterator = Employee_Identity.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
