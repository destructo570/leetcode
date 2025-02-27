class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        if(nums.length == 1) return true;
        for(int i=0; i<nums.length; i++){
            if(i>max) return false;
            max = Math.max(i+nums[i], max);
        }

        return true;
    }
}