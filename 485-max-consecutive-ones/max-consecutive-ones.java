class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int count=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                maxSoFar = Math.max(maxSoFar, count);
                count=0;
            }else{
                count++;
            }
        }

        if(count!=0){
            maxSoFar = Math.max(maxSoFar, count);
        }
        return maxSoFar;
    }

}