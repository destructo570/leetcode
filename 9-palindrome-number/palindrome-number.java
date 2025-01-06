class Solution {
    public boolean isPalindrome(int x) {
        int m=0;
        int k = x;
        while(x != 0){
            int num = x%10;
            m = m*10+num;
            x=x/10;
        }

        return m == k && k>=0;
    }

    public boolean isPalindrome2(int x) {
        String num = x+"";
        int i=0;
        int j=num.length()-1;

        while(i<j){
            if(num.charAt(i) != num.charAt(j)) return false;
            i++; j--;
        }

        return true;
    }
}