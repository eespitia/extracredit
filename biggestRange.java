    /**
     * biggestRange takes the largest number from the first array and the
     * smallest number from the second array and returns the difference.
     * @param nums1 The first array.
     * @param nums2 The second array.
     * @return The range.
     */
public class biggestRange {
	static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums4 = {10, 20, 30};
        int[] nums5 = {15, 5, 35};
        System.out.println("Testing biggestRange");
        System.out.println("Input:");
        System.out.print("\tnums1 = ");
        printArray(nums4);
        System.out.print("\tnums2 = ");
        printArray(nums5);
        int n = biggestRange(nums4, nums5);
        System.out.printf("Output: %d\n", n);
        System.out.println();
	}

    static int biggestRange(int[] nums1, int[] nums2) {
        int max = -10000000; // Start max as a really small number.
        int min = 100000000; // Start min as a really big number

        // Find the max from the first
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] > max) {
                max = nums1[i];
            }
        }

        // Find the min from the second
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] < min) {
                min = nums2[i];
            }
        }

        // Calculate the range
        int range = max - min;

        // Make sure its positive (absolute value)
        if (range < 0) {
            range *= -1;
        }

        return range;
    }
}
