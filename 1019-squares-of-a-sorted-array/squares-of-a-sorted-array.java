class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int ptr = nums.length-1;

        while(ptr>=0){
            int a = nums[i]*nums[i];
            int b = nums[j]*nums[j];
            if(a > b){
                result[ptr--]=a;
                i++;
            }else{
                result[ptr--]=b;
                j--;
            }
        }
        return result;
    }
}