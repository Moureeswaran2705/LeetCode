class Solution:
    def minIncrementForUnique(self, nums: List[int]) -> int:
        ans=0
        minValue=0
        nums.sort()
        for num in nums:
            ans+=max(minValue-num,0)
            minValue=max(minValue,num)+1
        return ans