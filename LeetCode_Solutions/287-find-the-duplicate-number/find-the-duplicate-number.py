class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        taken = [False] * len(nums)
        for num in nums:
            if taken[num]:
                return num
            taken[num]=True
        return 0