/**
     * interleave takes two arrays of integers and returns an array such that
     * its values are alternating values from the two input arrays. Note that
     * this function assumes that the arrays are of the same length.
     * @param nums1 The first array.
     * @param nums2 The second array.
     * @return The interleaved array.
     */

public class Interleave {
	static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		
		int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        System.out.println("Testing interleave...");
        System.out.println("Input:");
        System.out.print("\tnums1 = ");
        printArray(nums1);
        System.out.print("\tnums2 = ");
        printArray(nums2);
        int[] nums3 = interleave(nums1, nums2);
        System.out.print("Output: ");
        printArray(nums3);
        System.out.println();
	}
	
    static int[] interleave(int[] nums1, int[] nums2) {
        // Array to hold results
        int[] result = new int[nums1.length + nums2.length];

        // Loop through grabbing elements from both
        for (int i = 0; i < nums1.length; i++) {
            result[i * 2] = nums1[i];
            result[i * 2 + 1] = nums2[i];
        }

        return result;
    }
}
	
