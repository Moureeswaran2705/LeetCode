class Solution:
    def chalkReplacer(self, chalk: List[int], k: int) -> int:
        n=len(chalk)
        sum1=0
        for i in range(n):
            sum1+=chalk[i]
            if sum1>k:
                return i
        return self.chalkReplacer(chalk,k%sum1)