class Solution {
    public int[] rearrangeArray(int[] nums) {
        return naive(nums);
    }

    public int[] naive(int[] nums) {
        int n=nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int j=0;
        int k=0;
        for(int i=0; i<n; i++){
            if(nums[i]>=0){
                pos[j++]=nums[i];
            }else{
                neg[k++]=nums[i];
            }
        }
        j=0;
        k=0;
        boolean isPos=true;
        for(int i=0; i<n; i++){
            if(isPos){
                nums[i]=pos[j++];
                isPos=false;
            }else{
                nums[i]=neg[k++];
                isPos=true;
            }
        }

        return nums;
    }
}