import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int o1 = new RemoveElement().removeElement(new int[] {0,1,2,2,3,0,4,2}, 2);
        System.out.println(o1);

        // int o2 = new RemoveElement().removeElement(new int[] {3,2,2,3}, 2);
        // System.out.println(o2);
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

/*
 * int count = 0;
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
 */