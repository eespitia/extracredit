	 /**
     * countZeroes counts the number of zeroes in a matrix.
     * @param m The input matrix.
     * @return The number of zeroes.
     */
public class countZeroes {
    static void printMatrix(int[][] m, int indent, boolean first) {
        for (int i = 0; i < m.length; i++) {
            if (i > 0 || first) {
                for (int j = 0; j < indent; ++j) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		// change input here
        int[][] m3 = {{0, 1, 2}, {3, 4, 0}, {6, 7, 8}};
        System.out.println("Testing countZeroes...");
        System.out.println("Input:");
        System.out.print("\tm = ");
        printMatrix(m3, 8, false);
        int n = countZeroes(m3);
        System.out.printf("Output: %d\n", n);
        System.out.println();
	}

    static int countZeroes(int[][] m) {
        int num_zeroes = 0; // Store the number of zeroes.

        // Loop through the matrix.
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                // If the value is zero, count it.
                if (m[i][j] == 0) {
                    num_zeroes += 1;
                }
            }
        }

        return num_zeroes;
    }
}
