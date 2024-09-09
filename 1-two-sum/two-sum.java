class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(target - nums[i])){
                result[0]=i;
                result[1]=hm.get(target - nums[i]);
                break;
            }
            hm.put(nums[i], i);
        }

        return result;
    }
}