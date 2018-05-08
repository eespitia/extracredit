import java.util.Scanner;

public class digitinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ask the user for a 4-digit integer. Then print out, 
		//on separate lines, the thousands digit, the hundreds digit, 
		//the tens digit, and the ones digit. 
		//Hint: use integer division and modulus.
		
		
	

                //Create new scanner
                Scanner input = new Scanner(System.in);

                //Values of each digit
                int hundreds = 0;
                int tens = 0;
                int ones = 0;

                //Prompt user to input 4 digit number           
                System.out.print("Enter a 4 digit number: ");
                int number = input.nextInt();

                //Displays hundreds place digit
                hundreds = number / 1000;
                System.out.println("" + hundreds);


                //Displays hundreds place digit
                hundreds = (number %1000) / 100;
                System.out.println("" + hundreds);

                //Displays tens digit
                tens = (number %100) / 10;
                System.out.println("" + tens);


                //Display ones digit
                 ones = number %10;
                System.out.println("" + ones);   


               
}
}
