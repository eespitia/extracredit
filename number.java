import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int testGrade = -1 ;
		Scanner input = new Scanner(System.in);
		while (testGrade > 100 || testGrade < 0) 
		{
		   System.out.println("Your input does not match the criteria, please enter a number between 0 and 100");

		   while(!input.hasNextInt())
		   {
		      input.next() ;
		   }
		   testGrade = input.nextInt();
		}
		
		if (testGrade >1 && testGrade <25) {
			System.out.println("all your teeth will fall out except one. And that one will have a cavity.");
		}
		else if (testGrade >25 && testGrade <50) {
			System.out.println( "a unicorn will bring you a kitten, a teddy bear, and a rainbow before next Tuesday."); 
		
		
		}
		
	}
}
