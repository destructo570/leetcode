class Solution {
    public int mostFrequentEven(int[] nums) {
        return majorityElement1(nums);
    }

    public int majorityElement1(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans=Integer.MAX_VALUE;
        int freq=0;
        for(int num:nums){
            if(num % 2 == 0){
                int currFreq = hm.getOrDefault(num, 0)+1;
                hm.put(num, currFreq);

                if(currFreq>freq || (currFreq == freq && num<ans)){
                    freq=currFreq;
                    ans=num;
                }
            }
        }

        return freq == 0 ? -1 : ans;
    }
}