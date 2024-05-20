class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        def dfs(i:int,x:int)->int:
            if i==len(nums):
                return x
            x1=dfs(i+1,x)
            y=dfs(i+1,nums[i]^x)
            return x1+y
        return dfs(0,0)
