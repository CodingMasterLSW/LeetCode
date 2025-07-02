class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i=0; i<prices.length-1; i++) {
            if (prices[i] - prices[i+1] > 0) {
                continue;
            }
            profit += prices[i] - prices[i+1];
        }
        return -(profit);
    }
}