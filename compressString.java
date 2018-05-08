	 /**
     * compressString takes a string of characters and returns a compressed
     * version. It compresses it by taking each sequence of repeating letters
     * and representing it as the letter followed by the number of times that
     * it repeats.
     * @param s The string to compress.
     * @return The compressed string.
     */
public class compressString {

	public static void main(String[] args) {
        String s = "aaaabccddddd";
        System.out.println("Testing compressString");
        System.out.println("Input:");
        System.out.printf("\ts = %s\n", s);
        String res = compressString(s);
        System.out.printf("Output: %s\n", res);
        System.out.println();

	}
    static String compressString(String s) {
        int n = 0;                               // The index of the letter
        char letters[] = new char[s.length()];   // Each letter that appears
        int num_letters[] = new int[s.length()]; // The number of each letter

        char c;                 // Holds the letter we're looking at
        char cur = s.charAt(0); // The current letter

        letters[0] = cur;   // Set the first letter
        num_letters[0] = 1; // Set the number of occurrences (1)

        // Loop through the rest of the string
        for (int i = 1; i < s.length(); i++) {
            c = s.charAt(i);
            // Check if its'a new letter or the one we already have
            if (c == cur) {
                num_letters[n] += 1; // Increment the number of occurrences
            } else {
                cur = c;            // Set the new current letter
                n += 1;             // Move the index up one
                letters[n] = c;     // Set the next letter
                num_letters[n] = 1; // It has occurred once
            }
        }

        // Build the string
        String compressed_s = "";
        for (int i = 0; i <= n; i++) {
           compressed_s += letters[i];                       // Add the letter
           compressed_s += Integer.toString(num_letters[i]); // Number of occurrences
        }

        return compressed_s;
    }
}
