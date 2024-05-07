import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        for (int index1=0; index1<nums.length; index1++) {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(nums[index1]);
            for (int index2=0; index2<nums.length; index2++) {
                if (index1 != index2) {
                    innerList.add(nums[index2]);
                    // System.out.println(nums[index1] + " - " + nums[index2]);
                }
            }
            output.add(innerList);
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(new Permutations().permute(new int[]{1, 2, 3}));
        // new Permutations().permute(new int[]{0, 1});
        // new Permutations().permute(new int[]{1});
    }
}
