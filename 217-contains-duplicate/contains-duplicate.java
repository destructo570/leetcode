class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int prev=nums[0];
        if(nums.length == 1) return false;
        for(int i=1;i<nums.length;i++){
            if(prev == nums[i]){
                return true;
            }
            prev=nums[i];
        }

        return false;
    }
}