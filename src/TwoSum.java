import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TwoSum {
    public static void main(String[] args) {
        int[] o1 = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] o2 = new TwoSum().twoSum(new int[]{3, 2, 4}, 6);
        int[] o3 = new TwoSum().twoSum(new int[]{3, 3}, 6);
        int[] o4 = new TwoSum().twoSum(new int[]{3, 2, 3}, 6);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i=1; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                if (nums[j] + nums[j-i] == target) {
                    return new int[]{j, j-1};
                }
            }
        }
        return null;
    }
}
