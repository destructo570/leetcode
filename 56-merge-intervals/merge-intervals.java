class Solution {
    public int[][] merge(int[][] intervals) {
        int m=intervals.length;
        int n=intervals[0].length;
        Arrays.sort((intervals), (a,b) -> Integer.compare(a[0], b[0]));
        int[] prev=intervals[0];
        List<int[]> res = new ArrayList<>();
        res.add(prev);

        for(int[] interval:intervals){
            if(prev[1]>=interval[0]){
                prev[1] = Math.max(prev[1], interval[1]);
            }else{
                prev=interval;
                res.add(prev);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}