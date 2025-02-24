class Solution {
    public boolean isAnagram(String s, String t) {

        return isAnagram1(s, t);
    }

    public boolean isAnagram1(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        if(s.length() != t.length()) return false;
        
        for(int i=0; i<s.length(); i++){
            hm.put(a[i], hm.getOrDefault(a[i], 0)+1);
        }

        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(b[i])){
                hm.put(b[i], hm.getOrDefault(b[i], 0)-1);
                if(hm.get(b[i]) == 0) hm.remove(b[i]);
            }
        }

        return hm.size()==0;
    }

    public boolean isAnagram2(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(s.length() != t.length()) return false;
        
        for(int i=0; i<s.length(); i++){
            if(a[i] != b[i]){
                return false;
            }
        }

        return true;
    }
}