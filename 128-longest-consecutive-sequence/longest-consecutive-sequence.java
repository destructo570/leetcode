class Solution {
    public int longestConsecutive(int[] nums) {
        return naive(nums);
    }
    public int naive(int[] nums) {
        int max=1;
        int n = nums.length;
        Arrays.sort(nums);

        int count=1;
        if(n == 0) return 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1])continue;
            if(nums[i] == nums[i-1]+1){
                count++;
            }else{
                count=1;
            }
            max = Math.max(max, count);
        }

        return max;
    }
}