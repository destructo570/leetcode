class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        if(nums[0] < nums[nums.length-1]) count++;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]) count++;
        }
        
        return count <= 1;
    }
    public boolean checkOne(int[] nums) {
        int index = -1;
        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i-1] > nums[i]){
                index = i;
                break;
            }
        }

        //Copy values to new array & sort
        int[] nums2 = new int[nums.length];
        for(int j=0; j<nums2.length; j++){
            nums2[j]=nums[j];
        }
        mergeSort(nums2, 0, nums2.length-1);

        //
        if(index == -1){
            return compareArrays(nums, nums2);
        }else{
            int[] nums3 = getOriginalArray(nums, index);
            return compareArrays(nums3, nums2);
        }
     
    }

    public int[] getOriginalArray(int[] arr, int idx){
        int[] res = new int[arr.length];
        int i=0;
        int j=idx;
        while(j<arr.length){
            res[i++]=arr[j++];
        }
        j=0;
        while(j<idx){
            res[i++]=arr[j++];
        }
        return res;
    }

    public boolean compareArrays(int[] arr1, int[] arr2){
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
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
            if(nums[l1] < nums[l2]){
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