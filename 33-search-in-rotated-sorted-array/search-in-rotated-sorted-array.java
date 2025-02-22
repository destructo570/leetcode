class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0, r=n-1;
        while(l<=r){
            int mid = (l+r)/2;
            int num = nums[mid];
            if(num == target){
                return mid;
            }else if(nums[l] <= num){
                if(target>=nums[l] && target<num){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(target>num && target<= nums[r]){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }

        return -1;
    }
}