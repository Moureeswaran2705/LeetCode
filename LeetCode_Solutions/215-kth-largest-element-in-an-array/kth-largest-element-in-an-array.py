class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        nums1=sorted(nums)
        return nums1[len(nums)-k]