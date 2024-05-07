public class SearchInsertPosition {
    public static void main(String[] args) {
        int o1 = new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 5);
        System.out.println(o1);

        int o2 = new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 2);
        System.out.println(o2);

        int o3 = new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 7);
        System.out.println(o3);
    }

    public int searchInsert(int[] nums, int target) {
        int position = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target || target < nums[i] ) {
                position = i;
                break;
            }
        }
        return position >= 0 ? position : nums.length;
    }
}
