class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]==0){
                swap(i++,j,nums);
            }
        }
        int l=i;
        for(int k=i; k<nums.length; k++){
            if(nums[k]==1){
                swap(l++,k,nums);
            }
        }
    }

    public void swap(int i, int j, int[] nums){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

    }

    // public void sortByMergeSort(int[] nums, int lm int h){
    //     if(l<h){
    //         int mid = (l+h)/2;
    //         sortByMergeSort(nums, mid, h);
    //         sortByMergeSort(nums, l, mid-1);
    //         mergeArrays(nums, mid, l, h);
    //     }
    // }

    // public void mergeArrays(){
        
    // }
}