class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        l=[0]*(n)
        r=[0]*(n)
        l[0]=1
        r[n-1]=1
        for i in range(1,n):
            l[i]=l[i-1]*nums[i-1]
            print(l[i])
        for i in range(n-2,-1,-1):
            r[i]=r[i+1]*nums[i+1]
            print(l[i])
        for i in range(0,n):
            nums[i]=l[i]*r[i]
        return nums