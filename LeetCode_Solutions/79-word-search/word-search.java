class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
        }
        public boolean dfs(char[][] board,String word,int i,int j,int s){
            if(i<0||i==board.length||j<0||j==board[0].length){
                return false;
            }
            if(board[i][j]!=word.charAt(s)||board[i][j]=='*'){
                return false;
            }
            if(s==word.length()-1){
                return true;
            }
            char cache=board[i][j];
            board[i][j]='*';
            boolean exist=(dfs(board,word,i+1,j,s+1)||dfs(board,word,i-1,j,s+1)||dfs(board,word,i,j+1,s+1)||dfs(board,word,i,j-1,s+1));
            board[i][j]=cache;
            return exist;
    }
}