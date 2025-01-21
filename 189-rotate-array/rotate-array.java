class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        if (k == 0) return;
        int[] tmp = new int[k];
        System.arraycopy(nums, n-k, tmp, 0, k);
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        
        System.arraycopy(tmp, 0, nums, 0, k);
    }

    public void rotateNaive(int[] nums, int k) {
        for(int l=0; l<k; l++){
            rotateByOne(nums);
        }
    }

    public void rotateByOne(int[] nums){
        int tmp=nums[nums.length-1];

        for(int i=nums.length-1; i>0; i--){
            nums[i]=nums[i-1];
        }
        nums[0]=tmp;
    }
}