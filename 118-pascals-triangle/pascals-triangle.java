class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            result.add(nthRow(i+1));
        }

        return result;
    }

    public List<Integer> nthRow(int n){
        List<Integer> ans = new ArrayList<>();
        int res = 1;
        ans.add(1);
        for(int i=1; i<n; i++){
            res = res * (n-i);
            res = res / (i);
            ans.add(res);
        }
        return ans;
    }
}