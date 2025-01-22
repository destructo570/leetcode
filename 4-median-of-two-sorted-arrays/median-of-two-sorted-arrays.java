class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = mergeArray(nums1, nums2);
        int n = mergedArr.length;
        if(mergedArr.length%2 == 0){
            return (double)(mergedArr[n/2]+mergedArr[n/2 - 1])/2;
        }else{
            return mergedArr[n/2];
        }
    }

    public int[] mergeArray(int[] nums1, int[] nums2){
        int l1=0;
        int l2=0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(l1<nums1.length && l2<nums2.length){
            if(nums1[l1] < nums2[l2]){
                arr.add(nums1[l1++]);
            }else{
                arr.add(nums2[l2++]);
            }
        }

        while(l1 < nums1.length) arr.add(nums1[l1++]);
        while(l2 < nums2.length) arr.add(nums2[l2++]);

        int[] result = new int[arr.size()];

        for(int i=0; i<result.length; i++){
            result[i] = arr.get(i);
        }

        return result;
    }
}