class Solution {
    public int majorityElement(int[] nums) {
        return majorityElementTwo(nums);
    }

    public int majorityElementTwo(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public int majorityElementOne(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);

            if(hm.getOrDefault(nums[i], 0) > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}