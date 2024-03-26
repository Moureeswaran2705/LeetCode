class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        hd=set(nums)
        i=1
        while i in hd:
            i+=1
        return i