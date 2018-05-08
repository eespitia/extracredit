/**
 * countUniqueChars counts up the number of unique letters in a given
 * string.
 * @param s A string.
 * @return The number of unique letter characters.
 */
public class countUniqueChars {
	public static void main(String[] args) {
		    String s = "the quick brown fox!";
	        System.out.println("Testing countUniqueChars");
	        System.out.println("Input:");
	        System.out.printf("\ts = %s\n", s);
	        int n = countUniqueChars(s);
	        System.out.printf("Output: %d\n", n);
	        System.out.println();
}

static int countUniqueChars(String s) {
    String charsFound = ""; // A string holding the chars we've seen
    char c;                 // A char to hold the current char

    for (int i = 0; i < s.length(); i++) {
        c = s.charAt(i);

        // Make sure the character is a letter and not in the charsFound
        if (Character.isLetter(c) && charsFound.indexOf(c) == -1) {
            charsFound += s.substring(i, i + 1);
        }
    }

    // Return the number of letters we've seen
    return charsFound.length();
}
}

