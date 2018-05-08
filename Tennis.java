import java.util.Scanner;
public class Tennis {

	public static void main(String[] args) {
		String day = "Wednesday";
        double temp = 69.0;
        int rain = 0;
        System.out.println("Testing playTennis...");
        System.out.println("Input:");
        System.out.printf("\tday = %s\n\ttemp = %f\n\train = %d\n", day, temp, rain);
        System.out.printf("Output: %b\n", playTennis(day, temp, rain));
        System.out.println();
	}
		
		static boolean playTennis(String day, double temp, int rain) {
	        if ((day == "Saturday" || day == "Sunday") && rain < 20 && temp > 50.0 && temp < 90.0) {
	            return true;
	        } else if (day == "Wednesday" && rain == 0 && temp > 60.0) {
	            return true;
	        }

	        return false;
	    }
}

