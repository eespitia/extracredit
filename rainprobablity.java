import java.util.Scanner;
import java.util.Random;


public class rainprobablity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random rn = new Random();
        int answer = rn.nextInt(100) + 1;
			System.out.println((double)answer + "%");
			
		if (answer >=60) {
			System.out.println("Definitely bring an umbrella");
		}
		
		else if (answer >=20 && answer <59) {
			System.out.println("Maybe bring an umbrella");
		}
		
		else if (answer <20) {
			System.out.println("Definitely do not bring an umbrella");
		}
		
		//def yes if 60-100
		//maybe if 20-59
		//no if 0-19
		
		
		
	}

}