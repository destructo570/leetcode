class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        for(int i=0; i<n; i++){
            if((i==0 && nums[i+1] < nums[i]) || (i==n-1 && nums[i-1] < nums[i])){
                return i;
            }

            if(nums[i+1] < nums[i] && nums[i-1] < nums[i]){
                return i;
            }
        }
        return -1;
    }

    public int findPeakElementBS(int[] nums) {
        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if((mid==0 || nums[mid-1] < nums[mid]) && (mid == nums.length-1 || nums[mid] > nums[mid+1])){
                return mid;
            }else if(mid>0 && nums[mid-1] > nums[mid]){
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return  -1;
    }
}