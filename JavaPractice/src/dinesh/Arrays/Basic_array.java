package dinesh.Arrays;

public class Basic_array {
    public static void main(String[] args) {
        String Student[] = {"Name: Dineh", "Place: trt", "Qualification: MS in IT", "Experience: 5"};

        System.out.println("The Qualification of the Student is: "+ Student[2]);

        System.out.println("Overall Student details: ");
        for (String student : Student){
            System.out.println(student );
        }

        String newstring = "Place: trt_21";
        if(Student[1] == newstring ){
            System.out.println("New String is already in the student array");
        }
        else{
            System.out.println("New String does not match with any string in the student");
        }
        //System.out.println("New String does not match with any string in the student");

        /*int A = 5;
        int[] n = {1,3,6,8,9};
        int X= 6;
        //n[5] = 6;
        n = addX(A ,n, X);*/

        // Multidimensional matrix of array

        int[][] double_matrix = {
                {6,8,9,0},
                {2,2,9,0},
                {2,7,6,1},
                {4,8,3,6}
        };

        for (int i = 0; i < double_matrix.length; i++){
            for (int j = 0; j < double_matrix[i].length; j++){
                System.out.println(double_matrix[i][j]);

            }
        }


    }


}
