	/**
     * zeroRowCol goes through an array, and every row and column that has a
     * zero in it becomes all zeroes.
     * @param m The input matrix.
     * @return The zeroed matrix.
     */

public class ZeroRowCol {
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
		int[][] m = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        System.out.println("Testing zeroRowCol...");
        System.out.println("Input:");
        System.out.print("\tm = ");
        printMatrix(m, 8, false);
        int[][] m4 = zeroRowCol(m);
        System.out.println("Output:");
        printMatrix(m4, 4, true);
	}
	
	
    static int[][] zeroRowCol(int[][] m) {
        int[][] m2 = new int[m.length][m[0].length];
        // Store whether the row and column is zeroed
        boolean[] rows = new boolean[m.length];
        boolean[] cols = new boolean[m.length];

        // Copy to the new array and check for zeroes
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m2[i][j] = m[i][j];
                if (m[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Zero the correct rows and columns
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (rows[i] || cols[j]) {
                    m2[i][j] = 0;
                }
            }
        }

        return m2;
    }
}
