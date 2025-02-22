class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int currMin=nums[0];
        int currMax=nums[0];
        int currProduct=1;
        int max = nums[0];
        for(int i=1; i<n; i++){
            int tmp = currMax;
            currMax = Math.max(tmp*nums[i], Math.max(currMin*nums[i], nums[i]));
            currMin = Math.min(tmp*nums[i], Math.min(currMin*nums[i], nums[i]));
            max = Math.max(currMax, max);
        }

        return max;
    }
}