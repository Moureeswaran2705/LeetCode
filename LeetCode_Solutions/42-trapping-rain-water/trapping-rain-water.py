class Solution:
    def trap(self, height: List[int]) -> int:
        n=len(height)
        lmax=[0]*n
        rmax=[0]*n
        tot=0
        for i in range(n):
            if i==0:
                lmax[i]=height[i]
            else:
                lmax[i]=max(lmax[i-1],height[i])
        for i in range(n-1,-1,-1):
            if i == n-1:
                rmax[i]=height[i]
            else:
                rmax[i]=max(rmax[i+1],height[i])
        for i in range(n):
            tot+=min(lmax[i],rmax[i])-height[i]
        return tot