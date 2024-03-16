class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)
        dp = [[False] * n for _ in range(n)]
        count = 0
        MaxLen = 0
        si = 0
        for gap in range(n):
            for i in range(n - gap):
                j = i + gap
                if gap == 0:
                    dp[i][j] = True
                elif gap == 1 and s[i] == s[j]:
                    dp[i][j] = True
                else:
                    dp[i][j] = s[i] == s[j] and dp[i + 1][j - 1]
                if dp[i][j]:
                    count += 1
                    if j - i + 1 > MaxLen:
                        MaxLen = j - i + 1
                        si = i
        return s[si:si + MaxLen]
                    
                