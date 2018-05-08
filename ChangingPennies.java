import java.util.Scanner;

public class ChangingPennies {

	public static void main(String[] args) {
		// Integers, doubles, and arithmetic expressions 
		// Ezequiel Espitia - Version 1? - Feb 22, 2017

	Scanner scnr = new Scanner(System.in);	
	int Pennies;
	double decPennies;
	
	
	System.out.print("Pennies:"); // scanning for amount of pennies
    Pennies = scnr.nextInt();
    System.out.println(Pennies);
    
    System.out.print("Dollars:");
    System.out.println("$" + (double)(Pennies) / 100);
    
    
    
    
    	int q = Pennies/ 25;
    	int d = (Pennies - q*25)/10;
    	int n = (Pennies - q*25 -d*10)/5;
    	int p = (Pennies - q*25 -d*10 -n*5)/1;
    	
    	System.out.println(q + " quarters");
    	System.out.println(d + " dimes");
    	System.out.println(n + " nickels");
    	System.out.println(p + " pennies");
    	System.out.print("Counting only quarters and dimes, you have $");
    	System.out.println( (q*.25)+ (d*.10));
    	
	}

}
