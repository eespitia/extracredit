/**
     * evenlySpaced takes three integers and returns whether they are evenly
     * spaced.
     * @param a The first integer.
     * @param b The second integer.
     * @param c The third integer.
     * @return Whether the space between all three integers is the same.
     */

public class Spaced {

	public static void main(String[] args) {
	//change input below
	int a = 3;
    int b = 7;
    int c = 5;
    System.out.println("Testing evenlySpaced...");
    System.out.println("Input:");
    System.out.printf("\ta = %d\n\tb = %d\n\tc = %d\n",a, b, c);
    System.out.printf("Output: %b\n", evenlySpaced(a, b, c));
    System.out.println();
    
}
	
    static boolean evenlySpaced(int a, int b, int c) {
        int largest = a;
        int middle = b;
        int smallest = c;

        // Figure out the order of the numbers
        if (b >= a && b >= c) {
            largest = b;
            if (a >= c) {
                middle = a;
            } else {
                middle = c;
                smallest = a;
            }
        } else if (c >= a && c >= b) {
            largest = c;
            if (a >= b) {
                middle = a;
                smallest = b;
            } else {
                middle = b;
                smallest = a;
            }
        } else if (c > b) {
            middle = c;
            smallest = b;
        }

        int space1 = middle - smallest; // The space between the first two
        int space2 = largest - middle;  // The space between the second two
        return space1 == space2;
    }
}
