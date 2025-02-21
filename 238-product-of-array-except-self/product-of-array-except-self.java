class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res = new int[n];
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        
        int left=1;
        for(int i=0; i<n; i++){
            if(i>0) left*=nums[i-1];
            prefix[i]=left;
        }

        int right=1;
        for(int i=n-1; i>=0; i--){
            if(i < n-1) right*=nums[i+1];
            prefix[i]=right*prefix[i];
        }

        
        // for(int i=0; i<n; i++){
        //     int pre = i == 0 ? 1 : prefix[i-1];
        //     int post = i == n-1 ? 1 : postfix[i+1];
        //     res[i]=pre*post;
        // }
        return prefix;
    }
}