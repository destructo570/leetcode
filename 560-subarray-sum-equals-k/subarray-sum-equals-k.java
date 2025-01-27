class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int prefSum=0;
        int n=nums.length;
        int count=0;
        for(int i=0; i<n; i++){
            prefSum+=nums[i];
            int rem = prefSum-k;
            if(hm.containsKey(rem)) count += hm.get(prefSum-k);
            if(prefSum==k) count++;
            hm.put(prefSum, hm.getOrDefault(prefSum, 0)+1);
        }

        return count;
    }
}