class Solution:
    def specialArray(self, nums: List[int]) -> int:
        nums.sort()
        if nums[0]>=len(nums):
            return len(nums)
        for i in range(1,len(nums)):
            cnt=len(nums)-i
            if nums[i-1]<cnt and nums[i]>=cnt:
                return cnt
        return -1