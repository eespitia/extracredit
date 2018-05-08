import java.util.Scanner;

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int userYear;
	int userMonth;
	int userDay;
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("Enter a Year >");
	userYear = input.nextInt();
	System.out.println("Enter a Month >");
	userMonth=input.nextInt();
	System.out.println("Enter a Day >");
	userDay = input.nextInt();
	
	Day bDay = new Day(userYear, userMonth, userDay);
	Day today = new Day();
	
	System.out.println("You have been alive for " + today.daysFrom(bDay) + " Days!");
	input.close();
	}

}
