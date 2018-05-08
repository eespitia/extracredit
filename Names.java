import java.util.Scanner;
public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scnr = new Scanner(System.in);
	String firstName;
	String middleName;
	String lastName;
	
	System.out.print("Enter your first name: ");
	firstName = scnr.next( );	

	System.out.print("Enter your middle name: ");
	middleName = scnr.next( );
	
	System.out.print("Enter your last name: ");
	lastName = scnr.next( );
	
	String first= firstName.substring(0,1);
	System.out.println(first);
	String middle= middleName.substring(0,1);
	System.out.println(middle);
	String last= lastName.substring(0,1);
	System.out.println(last);
	
	Integer n = Integer.valueOf (first);
	
	}

}
