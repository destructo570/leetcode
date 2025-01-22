class Solution {
    public int maxProfit(int[] prices) {
        return maxProfitOpt1(prices);
    }

    public int maxProfitOpt1(int[] prices) {
        int max = 0;
        int currMin=prices[0];
        int n=prices.length;
        for(int i=0; i<n; i++){
            currMin = Math.min(currMin, prices[i]);
            max = Math.max(max, prices[i]-currMin); 
        }

        return max;
    }

    public int maxProfitNaive(int[] prices) {
        int max = 0;
        
        int n=prices.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                max = Math.max(max, prices[j]-prices[i]);        
            }   
        }

        return max;
    }
}