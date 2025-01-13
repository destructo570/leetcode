class Solution {
    public void sortColors(int[] nums) {
        int l=0, m=0, h=nums.length-1;

            while(m<=h){
                if(nums[m]==0){
                    swap(m++, l++, nums);
                }else if(nums[m]==1){
                    m++;
                }else{
                    swap(m, h--, nums);
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