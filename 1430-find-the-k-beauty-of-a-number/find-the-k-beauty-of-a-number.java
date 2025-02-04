class Solution {
    public int divisorSubstrings(int num, int k) {
    String nums = String.valueOf(num);
    int left = 0;
    int count = 0;
    String s = "";
    for(int i = 0; i < nums.length(); i++){
        s = s+nums.charAt(i);
        if(i-left == k-1){
            if(Integer.valueOf(s) == 0){
                if(s.length() != 0){
                    s = s.substring(1);
                    left++;
                }
                else left++;
            }
          else{  
           if(num%Integer.valueOf(s) == 0){
             count++;
       }
               left++;
             s = s.substring(1);
          }
        }
    }    
        return count;
    }
}