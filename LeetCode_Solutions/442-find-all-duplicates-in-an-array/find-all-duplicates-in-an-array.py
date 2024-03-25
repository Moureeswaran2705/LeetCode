class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        s=set()
        D=[False]*(len(nums)+1)
        for num in nums:
            if D[num]:
                s.add(num)
            D[num]=True
        return s