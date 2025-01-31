class Solution {
    public int longestConsecutive(int[] nums) {
        return op2(nums);
    }

    public int op2(int[] nums) 
    {
        Set<Integer> numSet = new HashSet<>();
        int n = nums.length;

        // Add all numbers to the set
        for (int i = 0; i < n; i++) 
        {
            numSet.add(nums[i]);
        }

        int maxLen = 0;

        // Find the longest consecutive sequence
        for (int num : numSet) 
        {
            // Check if the current number is the start of a sequence
            if (!numSet.contains(num - 1)) 
            {
                int currNum = num;
                int currLen = 0;

                // Count the length of the consecutive sequence
                while (numSet.contains(currNum)) 
                {
                    currNum++;
                    currLen++;
                    maxLen = Math.max(maxLen, currLen);
                }
            }
        }

        return maxLen;
    }
    public int optimal(int[] nums) {
        int len=0;
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        for(int num:nums){
            
            if(!set.contains(num-1)){
                int tmp=0;
                int next=num;
                while(set.contains(next)){
                    tmp++;
                    next++;
                }
                len = Math.max(tmp, len);
            }
        }
        return len;
    }
    public int naive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int max=1;
        int count=1;
        Arrays.sort(nums);
        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]) continue;
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