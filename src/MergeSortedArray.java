import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        new MergeSortedArray().merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        new MergeSortedArray().merge(new int[]{1}, 3, new int[]{}, 3);
        new MergeSortedArray().merge(new int[]{0}, 0, new int[]{1}, 1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0, j = 0; i<nums1.length; i++, j++) {
            if (i >= m) {
                nums1[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
    }
}
