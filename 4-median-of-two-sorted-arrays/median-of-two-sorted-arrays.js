/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    let merged = [...nums1, ...nums2];
    merged.sort((a, b) => a - b);
    if(merged?.length === 1) return merged[0];
    let mid = Math.floor(merged?.length/2);

    if(merged?.length % 2 === 1){
        // let mid = Math.ceil(merged?.length/2) - 1;
        return merged[mid]
    }else{
        // let mid = Math.ceil(merged?.length/2);
        return (merged[mid]+merged[mid-1]) / 2.0
    }
};