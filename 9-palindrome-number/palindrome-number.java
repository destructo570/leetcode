class Solution {
    public boolean isPalindrome(int x) {
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