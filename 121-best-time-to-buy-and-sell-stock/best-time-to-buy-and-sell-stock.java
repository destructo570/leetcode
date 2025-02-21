class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int result = 0;
        for(int price:prices){
            result = Math.max(result, price-min);
            min = Math.min(price, min);
        }
        return result;
    }
}