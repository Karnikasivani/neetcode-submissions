class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0,profit = 0, curr = 0;
        for(int i=1;i<prices.length;i++) {
            curr = prices[i];
            if(curr < minPrice) minPrice = curr;
            else profit = curr - minPrice;
            if(profit > maxProfit) maxProfit = profit;
        }
        return maxProfit; 
    }
}
