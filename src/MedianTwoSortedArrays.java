import java.util.Arrays;

public class MedianTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = new int[nums2.length + nums1.length];
        int i = 0, j = 0, k = 0;

        // add the smaller of the two numbers
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Moving stragglers
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }

        if (merged.length % 2 == 0) {
            int mid = merged.length / 2;
            return (double) (merged[mid] + merged[mid - 1]) / 2;
        } else {
            return merged[(merged.length / 2)];
        }
    }
}