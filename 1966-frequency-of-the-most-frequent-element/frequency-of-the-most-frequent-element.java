class Solution {
    public int maxFrequency(int[] nums, int k) {
        return maxPot(nums, k);
    }

    public int maxPot(int[] nums, int k){
        int left=0;
        int right=0;
        long total = 0;
        int ans=0;
        Arrays.sort(nums);
        while(right<nums.length){
            long target = nums[right];
            total+=target;

            while(target*(right-left+1) > total+k){
                total-=nums[left];
                left++;
            }
            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;
    }

    public int maxFreqOpt(int[] nums, int k) {
    int left = 0;
    int right = 0;
    long curr = 0;
    int ans = 0;
    Arrays.sort(nums);
    while(right < nums.length){
        long target = nums[right];
        curr += nums[right];
        while((target*(right-left+1)) > curr + k){
            curr -= nums[left];
            left++;
        }
        ans=Math.max(ans, right-left+1);
        right++;
    }

    return (int)ans;
}

}