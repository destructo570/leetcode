class Solution {
    public int reverse(int x) {
        int unsigned = Math.abs(x);
        int ans = 0;
        while(unsigned!=0){
            int num = unsigned % 10;
            unsigned = unsigned / 10;

            if(ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10){
                return 0;
            }

            ans = ans * 10 + num;
        }

        return x < 0 ? -ans : ans;
    }
}