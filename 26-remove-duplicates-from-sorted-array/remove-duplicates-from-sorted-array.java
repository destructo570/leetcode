class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 0;
        if(nums.length == 1) return 1;

        for(int i=0; i<nums.length; i++){
            if(nums[prev] != nums[i]){
                nums[++prev]=nums[i];
            }
        }
        return prev+1;
    }
}