    /**
     * interleaveStrings takes two strings and builds a new one by taking
     * alternating letters from them.
     * @param s1 The first input string.
     * @param s2 The second input string.
     * @return The interleaved string.
     */
public class interleaveStrings {

	public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "efgh";
        System.out.println("Testing interleaveStrings...");
        System.out.println("Input:");
        System.out.printf("\ts1 = %s\n\ts2 = %s\n", s1, s2);
        String s3 = interleaveStrings(s1, s2);
        System.out.printf("Output: %s\n", s3);
        System.out.println();

	}

    static String interleaveStrings(String s1, String s2) {
        // Empty result string
        String result = "";

        // Loop through grabbing elements from both
        for (int i = 0; i < s1.length(); i++) {
            result += s1.substring(i, i + 1) + s2.substring(i, i + 1);
        }

        return result;
    }	
}
