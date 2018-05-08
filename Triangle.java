/**
 * printTriangle prints out a triangle drawn out of astricks with the
 * specified base. Note that the left leg of the triangle is drawn on an
 * angle while the right leg is drawn straight.
 * @param width The width of the base.
 */
public class Triangle {
	public static void main(String[] args) {
		//change input below
		int width = 5;
        System.out.println("Testing printTriangle...");
        System.out.println("Input:");
        System.out.printf("\twidth = %d\n", width);
        System.out.println("Output:");
        printTriangle(width);
        System.out.println();
	}
	 
		  
	    static void printTriangle(int width) {
	        // Print out the top point
	        for (int i = 0; i < width - 1; i++) {
	            System.out.print(" ");
	        }
	        System.out.print("*\n");

	        // Print out mid section
	        for (int i = 0; i < width - 2; i++) {
	            int num_spaces1 = width - 2 - i;
	            int num_spaces2 = i;

	            for (int j = 0; j < num_spaces1; j++) {
	                System.out.print(" ");
	            }

	            System.out.print("*");

	            for (int j = 0; j < num_spaces2; j++) {
	                System.out.print(" ");
	            }
	            System.out.print("*\n");
	        }

	        // Print out base
	        for (int i = 0; i < width; i++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
}
