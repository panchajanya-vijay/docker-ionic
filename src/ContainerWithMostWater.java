public class ContainerWithMostWater {
    public static void main(String[] args) {
        int output1 = new ContainerWithMostWater().maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(output1);

        int output2 = new ContainerWithMostWater().maxArea(new int[]{6, 2, 5, 8, 3, 7});
        System.out.println(output2);

        int output3 = new ContainerWithMostWater().maxArea(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        System.out.println(output3);
    }

    public int maxArea(int[] height) {
        int maxHeight = 0;
        int i = 0;
        int j = height.length-1;
        while(i<=j) {
            int calclation = (j-i)*Math.min(height[i], height[j]);
            maxHeight = Math.max(maxHeight, calclation);
            if(height[i] >= height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxHeight;
    }
}
