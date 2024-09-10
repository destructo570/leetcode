class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        int[] prev = intervals[0];
        List<int[]> result = new ArrayList<>();
        result.add(prev);
        for(int[] interval:intervals){
            if(prev[1] >= interval[0]){
                prev[1] = Math.max(interval[1], prev[1]);
            }else{
                prev=interval;
                result.add(prev);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}