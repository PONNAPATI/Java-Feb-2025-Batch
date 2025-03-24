package tharun.exceptionhandling;

public class Throws {
    public static void main(String[] args) {
        try {
            readFile("file.txt");
        }
        catch( Exception e){
            System.out.println("error reading  file " + e.getMessage());

        }
    }
    public static void readFile(String filename) throws Exception{
           if(filename.equals("file.txt")){
               throw new Exception("File Not found");
           }
           else {
               System.out.println("Reading file...");
           }
    }
}


/* Syntax for Throws Keyword

      returnType MethodName() throws ExceptionType1, ExceptionType2,....{
               Method body
           }
 */
