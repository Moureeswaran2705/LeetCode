class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        s=set()
        D=[False]*max(nums)*1000
        for num in nums:
            if D[num]:
                s.add(num)
            D[num]=True
        return s