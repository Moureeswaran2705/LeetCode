class Solution:
    def minOperations(self, logs: List[str]) -> int:
        ans=0
        for s in logs:
            if s=="./":
                continue
            elif s=="../":
                ans=max(0,ans-1)
            else:
                ans+=1
        return ans