class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<=nums.length; i++){
            hm.put(i, 0);
        }

        for(int j=0; j<nums.length; j++){
            hm.put(nums[j], 1);
        }

        for(Map.Entry<Integer, Integer> entry : hm.entrySet() ){
            if(entry.getValue() == 0){
                return entry.getKey();
            }
        }

        return -1;
    }
}