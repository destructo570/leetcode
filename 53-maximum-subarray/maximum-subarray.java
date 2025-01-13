class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = 0;        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currMax = currMax+nums[i];
            

            if(currMax > max){
                max = currMax;
            }

            if(currMax < 0){
                currMax = 0;
            }
        }

        return max;
    }

    public int kadane(int[] nums) {
        int currMax = 0;        
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            currMax = Math.max(num, currMax+num);
            if(currMax > max){
                max = currMax;
            }
        }

        return max;
    }         
}