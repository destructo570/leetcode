class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(hm.containsKey(sum - k)) count+=hm.get(sum-k);
            if(sum==k) count++;
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }

        return count;
    }
}