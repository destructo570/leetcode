class Solution {
    public List<Integer> majorityElement(int[] nums) {
        return majorityElement1(nums);
    }

    public List<Integer> majorityElement1(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);

            if(hm.get(nums[i]) > (nums.length/3)){
                hs.add(nums[i]);
            }
        }

        ans.addAll(hs);
        return ans;
    }
}