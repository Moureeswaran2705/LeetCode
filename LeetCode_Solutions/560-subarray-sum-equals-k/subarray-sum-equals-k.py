class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        result = 0 
        prefix_sum = 0
        d = {0: 1}

        for num in nums:
            prefix_sum += num
           # print("Current prefix_sum:", prefix_sum)
            if prefix_sum - k in d:
            #    print("prefix_sum - k:", prefix_sum - k)
            #    print("d[prefix_sum - k]:", d[prefix_sum - k])
                result += d[prefix_sum - k]
              #  print("result after adding:", result)
            if prefix_sum in d:
                d[prefix_sum] += 1
            else:
                d[prefix_sum] = 1
            #print("Current dictionary d:", d)
        return result