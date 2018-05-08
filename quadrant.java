import java.util.Scanner;
import java.util.Random;

public class quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn = new Random();
        int answer = rn.nextInt(360) + 1;
		
   
		
		if (answer <=90) {
	        
			System.out.print(answer);
			System.out.println(" is in quadrant 1");
		}
		
		else if (answer >90 && answer <=180) {
			System.out.print(answer);
			System.out.println(" is in quadrant 2");
		}
		else if (answer >180 && answer <=270) {
			System.out.print(answer);
			System.out.println(" is in quadrant 3");
		}
		else if (answer >270 && answer <=359) {
			System.out.print(answer);
			System.out.println(" is in quadrant 4");
		}
		
		
			//Quad 1 if 0-90
			//Quad 2 if 91-180
			//Quad 3 if 181- 270
			//Quad 4 if 271-359
	}

}
