class Solution {
    public int jump(int[] nums) {
        // return greedy(nums);
        return recursiveGreedy(nums, 0, 0, 0);
    }

    public int naive(int end, int idx, int jumps){
        if(idx >= end) return jumps;
        int min = Integer.MAX_VALUE;
        for(int i=1; i<=jumps; i++){
            min = Math.min(min, naive(end, idx+i, jumps+1));
        }
        return min;
    }

    public int greedy(int[] nums){
        int l=0, r=0;
        int res=0;

        while(r<nums.length-1){
            int max = 0;
            for(int i=l; i<r+1; i++){
                max = Math.max(nums[i]+i, max);
            }
            l=r+1;
            r=max;
            res++;
        }

        return res;
    }

    public int recursiveGreedy(int[] nums, int l, int r, int res) {
    if (r >= nums.length - 1) {
        return res; // Base case: If we've reached or exceeded the last index
    }

    int max = 0;
    for (int i = l; i <= r; i++) {
        max = Math.max(nums[i] + i, max); // Calculate the farthest reach
    }

    // Recursive call with updated range and incremented result
    return recursiveGreedy(nums, r + 1, max, res + 1);
}
}