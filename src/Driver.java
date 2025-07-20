public class Driver {

    public static void main(String[] args) {
//        FloodFill floo = new FloodFill();
//        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
//        floo.floodFill(image, 1, 1, 2);
        MedianTwoSortedArrays clssy = new MedianTwoSortedArrays();
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        System.out.println(clssy.findMedianSortedArrays(nums1, nums2));

    }
}

