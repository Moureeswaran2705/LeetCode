class Solution {
    public boolean isMatch(String s, String p) {
        int r=s.length();
        int c=p.length();
        // if(c==0&&r==0){
        //     return true;
        // }
        if(p.length()==0){
            return false;
        }

        boolean[][] dp=new boolean[r+1][c+1];
        dp[0][0]=true;
        for(int i=2;i<c+1;i++){
            if(p.charAt(i-1)=='*'){
                dp[0][i]=dp[0][i-2];
            }
        }
        for(int i=1;i<r+1;i++){
            for(int j=1;j<c+1;j++){
                if((s.charAt(i-1)==p.charAt(j-1))||p.charAt(j-1)=='.'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(j>1&&p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i][j-2];
                    if(p.charAt(j-2)=='.'||p.charAt(j-2)==s.charAt(i-1)){
                        dp[i][j]=dp[i][j]|dp[i-1][j];
                    }
                }
            }
        }
        return dp[r][c];
    }
}