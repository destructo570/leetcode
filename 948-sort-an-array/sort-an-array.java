class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums, int l, int h){
        if(l<h){
            int mid = (l+h)/2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid+1, h);
            merge(nums, mid, l, h);
        }
    }

    public void merge(int[] nums, int mid, int low, int high){
        int l1 = low;
        int l2 = mid+1;

        ArrayList<Integer> result = new ArrayList<>();

        while(l1 <= mid && l2 <= high){
            if(nums[l1] <= nums[l2]){
                result.add(nums[l1++]);
            }else{
                result.add(nums[l2++]);
            }
        }

        while(l1<=mid){
            result.add(nums[l1++]);
        }
        while(l2<=high){
            result.add(nums[l2++]);
        }
        
        for(int i=low; i<=high; i++){
            nums[i] = result.get(i-low);
        }
    }
}