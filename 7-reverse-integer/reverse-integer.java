class Solution {
    public int reverse(int x) {
        int result = 0;
        while(x != 0){
            int num = x %10;
            if(result > Integer.MAX_VALUE/10 || result < Integer.MIN_VALUE/10){
                return 0;
            }
            result = result*10+num;
            x=x/10;
        }
        return result;
    }
}