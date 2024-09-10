class Solution {
    public int maxProfit(int[] prices) {
        int lsf = prices[0];
        int maxprofit = 0;

        for(int i=0; i<prices.length ; i++){
            maxprofit = Math.max(prices[i]-lsf, maxprofit);
            lsf = Math.min(lsf, prices[i]);
        }

        return maxprofit;
    }
}