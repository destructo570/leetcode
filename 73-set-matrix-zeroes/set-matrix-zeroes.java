class Solution {
    public void setZeroes(int[][] matrix) {
        setZeroesOpt2(matrix);
    }
    public void setZeroesOpt2(int[][] matrix) {

        boolean firstRow=false;
        boolean firstCol=false;
        for(int i=0; i<matrix.length; i++){ 
            if(matrix[i][0]==0) firstCol=true;
        }
        for(int i=0; i<matrix[0].length; i++){
            if(matrix[0][i]==0) firstRow=true;
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }   
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j]=0;
                }
            }   
        }

        if(firstCol){
            for(int i=0; i<matrix.length; i++){ 
                matrix[i][0]=0;
            }
        }
        if(firstRow){
            for(int i=0; i<matrix[0].length; i++){
                matrix[0][i]=0;
            }
        }

    }
    public void setZeroesOpt1(int[][] matrix) {
        HashSet<Integer> hsr = new HashSet<>();
        HashSet<Integer> hsc = new HashSet<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    hsr.add(i);
                    hsc.add(j);
                }
            }   
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(hsr.contains(i) || hsc.contains(j)){
                    matrix[i][j]=0;
                }
            }   
        }

    }
}