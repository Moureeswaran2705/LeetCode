class Solution:
    def minPathSum(self, arr: List[List[int]]) -> int:
        n=len(arr)
        m=len(arr[0])
        dp=[[0]*m for i in range(len(arr))]
        for i in range(n-1,-1,-1):
            for j in range(m-1,-1,-1):
                if i==n-1 and j==m-1:
                    dp[i][j]=arr[i][j]
                elif i==n-1:
                    dp[i][j]=dp[i][j+1]+arr[i][j]
                elif j==m-1:
                    dp[i][j]=dp[i+1][j]+arr[i][j]
                else:
                    dp[i][j]=min(dp[i+1][j],dp[i][j+1])+arr[i][j]
        return dp[0][0]