class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for(int day = 1; day < prices.length; day++) {
            if(prices[day] < minPrice) {
                minPrice = prices[day];
            } else {
                maxProfit = Math.max(maxProfit, prices[day] - minPrice);
            }
        }
        
        return maxProfit;
    }
}