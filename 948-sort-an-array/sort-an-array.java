class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
   }

   public void mergeSort(int arr[], int l, int r) {
        if(l<r){
            int mid = (l+r)/2;
            
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, mid, l, r);
        }
    }

    public void merge(int[] arr, int mid, int l, int h){
        int l1 = l;
        int l2 = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(l1 <= mid && l2 <= h){
            if(arr[l1] <= arr[l2] ) {
                temp.add(arr[l1++]);
            }else {
                temp.add(arr[l2++]);
            };
        }
        
        
        while(l1 <= mid) temp.add(arr[l1++]);
        while(l2 <= h) temp.add(arr[l2++]);
        
        for(int i=l;i<=h;i++){
            arr[i] = temp.get(i-l);
        }

    }
}