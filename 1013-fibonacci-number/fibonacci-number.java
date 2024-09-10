class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        if(n==1) return 1;
        if(n==0) return 0;

        while(n-1 != 0){
            int tmp = b;
            b = a+b;
            a = tmp;
            n--;
        }

        return b;
    }
}