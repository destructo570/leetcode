class Solution {
    public int[] twoSum(int[] nums, int target) {
        int k=0;
        int j=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if(hm.containsKey(diff)){
                return new int[] {i, hm.get(diff)};
            }
            hm.put(nums[i], i);
        }
        return new int[2];
    }
}