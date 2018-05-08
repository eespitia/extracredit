	/**
     * rotateMatrix rotates a matrix to the right by 90 degrees.
     * @param m The input matrix.
     * @return The rotated matrix.
     */
public class rotateMatrix {
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
		// TODO Auto-generated method stub
        int[][] m = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        System.out.println("Testing rotateMatrix...");
        System.out.println("Input:");
        System.out.print("\tm = ");
        printMatrix(m, 8, false);
        int[][] m2 = rotateMatrix(m);
        System.out.println("Output:");
        printMatrix(m2, 4, true);
        System.out.println();
	}

    static int[][] rotateMatrix(int[][] m) {
        int[][] m_rotated = new int[m[0].length][m.length]; // Note we swap the dimensions
        int m_height = m.length;   // The height of the input matrix
        int m_width = m[0].length; // The width of the input matrix

        // Loop through the matrix moving them into the new array
        for (int i = 0; i < m_height; i++) {
            for (int j = 0; j < m_width; j++) {
                // In the first matrix, its column number (j) becomes its row
                // number in the second matrix and its row number (i) becomes the
                // opposite column number (last column - i)
                m_rotated[j][m_width - i - 1] = m[i][j];
            }
        }

        return m_rotated;
    }
}
