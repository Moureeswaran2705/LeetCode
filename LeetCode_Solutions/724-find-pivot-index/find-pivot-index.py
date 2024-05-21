class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        length = len(nums)
        l_sum = [0] * length
        r_sum = [0] * length
        l_sum[0] = nums[0]
        r_sum[length - 1] = nums[length - 1]

        for i in range(1, length):
            l_sum[i] = l_sum[i - 1] + nums[i]

        for i in range(length - 2, -1, -1):
            r_sum[i] = r_sum[i + 1] + nums[i]
        print(l_sum)
        print(r_sum)
        for i in range(length):
            if l_sum[i] == r_sum[i]:
                return i

        return -1
