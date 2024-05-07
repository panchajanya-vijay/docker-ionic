
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int o1 = new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1,1,2});
        System.out.println(o1);
        int o2 = new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(o2);
    }

    public int removeDuplicates(int[] nums) {
        // Set<Integer> set = new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
        // System.out.println(set);
        // nums = set.stream().mapToInt(Integer::intValue).toArray();
        // return set.size();

        int count = 0;
        int j = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
