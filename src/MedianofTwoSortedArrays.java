import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        double median1 = new MedianofTwoSortedArrays().findMedianSortedArrays(new int[]{1,2}, new int[]{3, 4});
        System.out.println(median1);

        double median2 = new MedianofTwoSortedArrays().findMedianSortedArrays(new int[]{1,2}, new int[]{3});
        System.out.println(median2);

        double median3 = new MedianofTwoSortedArrays().findMedianSortedArrays(new int[]{1,2}, new int[]{3, 4});
        System.out.println(median3);
        // System.out.println(5/2);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double output = 0.00000;
        int[] finalArray = new int[nums1.length + nums2.length];
        for(int i=0; i<nums1.length; i++) {
            finalArray[i] = nums1[i];
        }
        int nextArrayIndex=nums1.length;
        for(int i=0; i<nums2.length; i++) {
            finalArray[nextArrayIndex] = nums2[i];
            nextArrayIndex++;
        }
        Arrays.sort(finalArray);
        int median = finalArray.length/2;
        if (finalArray.length%2 == 0) {
            output = (finalArray[median-1] + finalArray[median])/2.0;
        } else {
            output = finalArray[median]/2.0;
        }
        return output;
    }

}
