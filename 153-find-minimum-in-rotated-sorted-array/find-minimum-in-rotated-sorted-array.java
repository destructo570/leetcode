class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0, r=n-1;
        int min = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (l+r)/2;
            int num = nums[mid];

            if(nums[l] <= num){
                min = Math.min(nums[l], min);
                l=mid+1;
            }else{
                min = Math.min(num, min);
                r=mid-1;
            }
        }

        return min;
    }
}