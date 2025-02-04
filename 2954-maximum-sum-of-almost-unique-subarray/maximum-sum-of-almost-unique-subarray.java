class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long currSum=0;
        long currMax=0;
        int n = nums.size();
        int left=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int right=0; right<n; right++){
            int currEl = nums.get(right);
            hm.put(currEl, hm.getOrDefault(currEl,0)+1);

            currSum+=currEl;

            while(right - left + 1 > k){
                int leftEl = nums.get(left);
                hm.put(leftEl, hm.get(leftEl)-1);

                if(hm.get(leftEl) == 0){
                    hm.remove(leftEl);
                }
                currSum-=leftEl;
                left++;
            }

            if(hm.size() >=m){
                currMax = Math.max(currSum, currMax);
            }
        }

        return currMax;
    }
}