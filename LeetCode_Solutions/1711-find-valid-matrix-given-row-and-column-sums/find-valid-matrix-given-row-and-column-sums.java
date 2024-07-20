class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int r=rowSum.length;
        int c=colSum.length;
        int[][] matrix=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(rowSum[i]<colSum[j]){
                    matrix[i][j]=rowSum[i];
                }
                else if(rowSum[i]>colSum[j]){
                    matrix[i][j]=colSum[j];
                }
                else{
                    matrix[i][j]=colSum[j];
                }
                rowSum[i]-=matrix[i][j];
                colSum[j]-=matrix[i][j];
            }
        }
        return matrix;
    }
}