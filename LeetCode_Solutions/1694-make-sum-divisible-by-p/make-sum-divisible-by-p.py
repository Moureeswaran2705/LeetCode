class Solution:
    def minSubarray(self, nums: List[int], p: int) -> int:
        tsum=sum(nums)
        rem=tsum%p
        if rem==0:
            return 0
        mp={}
        mp[0]=-1
        cur=0
        ans=len(nums)
        for i in range(len(nums)):
            cur=(cur+nums[i])%p
            need=(cur-rem+p)%p
            if need in mp:
                ans=min(ans,i-mp[need])
            mp[cur]=i
        return -1 if ans==len(nums)  else ans