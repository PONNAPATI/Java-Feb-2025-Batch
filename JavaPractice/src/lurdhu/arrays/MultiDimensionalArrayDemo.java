package src.lurdhu.arrays;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},  //(0,0), (0,1), (0,2)
                {4,5,6},  //(1,0), (1,1), (1,2)
                {7,8,9}   //(2,0), (2,1), (2,2)
        };


        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
