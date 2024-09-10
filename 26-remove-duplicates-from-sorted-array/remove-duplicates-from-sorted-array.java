class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != nums[prev])
                nums[++prev] = nums[i];
        }

        return prev+1;
    }
}