class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        int finalOut = matrix.length*matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int TL=0, TR=col, BL=0, BR=row;
        while(TL<=BR && BL<=TR){
            //Print TL to TR
            for(int i=TL; i<=TR; i++){
                // if(ans.size() == finalOut) return ans;
                ans.add(matrix[TL][i]);
            }
            TL++;
            //Print TL to BL
            for(int i=TL; i<=BR; i++){
                // if(ans.size() == finalOut) return ans;
                ans.add(matrix[i][TR]);
            }
            TR--;
            //Print BL to BR
            if(TL<=BR){

            for(int i=TR; i>=BL; i--){
                // if(ans.size() == finalOut) return ans;
                ans.add(matrix[BR][i]);
            }
            BR--;
            }
            if(BL<=TR){
                //Print BL to TL
            for(int i=BR; i>=TL; i--){
                // if(ans.size() == finalOut) return ans;
                ans.add(matrix[i][BL]);
            }
            BL++;
            }
        }
       return ans;
    }

}