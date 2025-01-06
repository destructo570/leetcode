class Solution {
    public int maxFrequency(int[] nums, int k) {
        return maxFreqOpt(nums, k);
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

    // for (int right = 0; right < nums.length; right++) {
    //         long target = nums[right];
    //         curr += target;
            
    //         while ((nums[right]*(right-left+1)) > curr + k) {
    //             curr -= nums[left];
    //             left++;
    //         }
            
    //         ans = Math.max(ans, right - left + 1);
    //     }

    return (int)ans;
}

    public int maxFreqNaive(int[] nums, int k){
        Arrays.sort(nums);
        int maxCount = 0;
        
        for(int i=0; i<nums.length; i++){
            int num=nums[i];
            int count=0;
            int ops = k;
            for(int j=0; j<nums.length; j++){
                if(nums[j]<=num && (num-nums[j]) <= ops) {
                    count++;
                    ops -= (num - nums[j]);
                }else if(nums[j] > num){
                    break;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

        public int maxFrequencyN(int[] nums, int k) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        // Step 2: Initialize variables
        long total = 0; // Sum of the elements in the current window
        int left = 0;   // Left pointer of the sliding window
        int maxFreq = 0; // Maximum frequency
        
        // Step 3: Iterate through the array with the right pointer
        for (int right = 0; right < nums.length; right++) {
            total += nums[right]; // Add current element to the total
            
            // Step 4: Shrink the window if operations exceed `k`
            while (nums[right] * (right - left + 1) > total + k) {
                total -= nums[left]; // Remove the leftmost element
                left++;              // Move the left pointer
            }
            
            // Step 5: Update the maximum frequency
            maxFreq = Math.max(maxFreq, right - left + 1);
        }
        
        return maxFreq;
    }
}