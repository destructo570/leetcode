class Solution {
    public int mostFrequentEven(int[] nums) {
        return majorityElement1(nums);
    }

    public int majorityElement1(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans=-1;
        int ansOccur=0;
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if(entry.getKey() % 2 == 0){
                if(entry.getValue() > ansOccur){
                    ans = entry.getKey();
                    ansOccur = entry.getValue();
                }else if(entry.getValue() == hm.get(ans) && entry.getKey() < ans){
                    ans = entry.getKey();
                }
            }
        }

        return ans;
    }
}