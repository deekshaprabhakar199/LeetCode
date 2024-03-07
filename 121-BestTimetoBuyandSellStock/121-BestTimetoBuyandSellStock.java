        int profit = 0;
    public int maxProfit(int[] prices) {
class Solution {
        int price=Integer.MAX_VALUE;
        for(int i=0; i< prices.length; i++){
            price = Math.min(price,prices[i]);
        }
    }
            profit= Math.max(profit,prices[i]- price);
        return profit;
}
[
