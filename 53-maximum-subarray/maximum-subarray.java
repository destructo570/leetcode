class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int ansStart=0, ansEnd=0;
        int currSum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            currSum+=nums[i];
            max = Math.max(currSum, max);
            if(currSum < 0){
                currSum=0;
            }
        }

        return max;
    }
}