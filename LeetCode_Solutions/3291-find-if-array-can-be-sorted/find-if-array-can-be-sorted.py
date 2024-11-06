class Solution:
    def canSortArray(self, nums: List[int]) -> bool:
        bitcnt=bin(nums[0]).count('1')
        prev=-1
        cur=nums[0]
        for i in range(1,len(nums)):
            if bin(nums[i]).count('1')!=bitcnt:
                bitcnt=bin(nums[i]).count('1')
                prev=max(prev,cur)
                cur=nums[i]
            else:
                cur=max(nums[i],cur)
            if prev>nums[i]:
                return False
        return True