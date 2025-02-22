class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0, k=n-1;
        int max = Integer.MIN_VALUE;
        while(i<k){
            int area = (k-i)*(Math.min(height[i], height[k]));
            max= Math.max(area, max);
            if(height[i] > height[k]){
                k--;
            }else{
                i++;
            }
        }

        return max;
    }
}