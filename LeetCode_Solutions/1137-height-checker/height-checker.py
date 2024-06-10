class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        num=sorted(heights)
        cnt=0
        for i in range(len(heights)):
            if num[i]!=heights[i]:
                cnt+=1
        return cnt