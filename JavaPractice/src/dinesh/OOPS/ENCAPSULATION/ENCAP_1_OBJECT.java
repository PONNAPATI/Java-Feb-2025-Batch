package dinesh.OOPS.ENCAPSULATION;

public class ENCAP_1_OBJECT {
    //ENCAP_1 lengthofnumber = new ENCAP_1(); need to call object inside the main() method.

    public static void main(String[] args) {
        ENCAP_1 lengthofnumber = new ENCAP_1();
        lengthofnumber.length_of_string(633733887);
        System.out.println("The phone number " +lengthofnumber.getPhone_number()+"\n");

        lengthofnumber.setPhone_number(336376389);
        System.out.println("The phone number "+lengthofnumber.getPhone_number());
    }

}
