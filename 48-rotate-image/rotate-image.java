class Solution {
    public void rotate(int[][] matrix) {
        reverseMatrix(matrix);
        transposeMatrix(matrix);
    }

    public void transposeMatrix(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(i>j){
                    int tmp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=tmp;
                }
            }
        }
    }

    public void reverseMatrix(int[][] matrix){
        int i=0, j=matrix.length-1;
        while(i<j){
            int[] tmp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = tmp;
            i++; j--;
        }
    }
}