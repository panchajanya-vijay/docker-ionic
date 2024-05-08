public class SingleNumber {
    public static void main(String[] args) {
        int o1 = new SingleNumber().singleNumber(new int[] {4,1,2,1,2});
        System.out.println(o1);

        int o2 = new SingleNumber().singleNumber(new int[] {2,2,1});
        System.out.println(o2);

        int o3 = new SingleNumber().singleNumber(new int[] {1});
        System.out.println(o3);
    }

    public int singleNumber(int[] nums) {
        int output = 0;
        int length = 0;
        for(int i=0; i<nums.length; i++) {
            length = 0;
            for(int j=0; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    length+=1;
                }
            }
            if(length == 1) return nums[i];
        }
     return output;
    }
}
