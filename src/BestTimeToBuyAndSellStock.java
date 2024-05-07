public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        // int o1 = new BestTimeToBuyAndSellStock().maxProfit(new int[] {7,1,5,3,6,4});
        // System.out.println(o1);

        // int o2 = new BestTimeToBuyAndSellStock().maxProfit(new int[] {7,6,4,3,1});
        // System.out.println(o2);

        // int o3 = new BestTimeToBuyAndSellStock().maxProfit(new int[] {7,3,5,1,2,4});
        // System.out.println(o3);

        // int o4 = new BestTimeToBuyAndSellStock().maxProfit(new int[] {1});
        // System.out.println(o4);

        // int o5 = new BestTimeToBuyAndSellStock().maxProfit(new int[] {1,2});
        // System.out.println(o5);
        
        // int o6 = new BestTimeToBuyAndSellStock().maxProfit(new int[] {2,4,1});
        // System.out.println(o6);
    }

    public int maxProfit(int[] prices) {
        int left = prices[0];
        int right = 0;
        int diff = 0;
        for(int i=1; i<prices.length; i++) {
            if(left>prices[i]) {
                left = prices[i];
                right = prices[i];
            }
            if(right<prices[i]) {
                right = prices[i];
            }
            diff = diff>right-left? diff: right-left;
        }
        return diff;
    }
}
