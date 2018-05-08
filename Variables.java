import java.util.Scanner;

public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt;
      double userDouble;
      char User;
      

      
      // FIXME Define char and string variables similarly
      
      System.out.println("Enter integer:"); // scanning for 1st variable
      userInt = scnr.nextInt();
      System.out.println(userInt);
      
      
      System.out.println("Enter double:");
      userDouble = scnr.nextDouble();
      System.out.println(userDouble);
      
      System.out.println("Enter Character:");
      User= scnr.next().charAt(0);
      System.out.println(User);
      
      // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space
   
      // FIXME (2): Output the four values in reverse
      
      // FIXME (3): Cast the double to an integer, and output that integer
   }
}