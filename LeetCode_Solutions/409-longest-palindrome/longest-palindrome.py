class Solution:
    def longestPalindrome(self, s: str) -> int:
        ans=0
        cnt=collections.Counter(s)
        
        for element in cnt.values():
            
            ans+=element if element%2==0 else element-1
            
        
        oddCount=any(c%2==1 for c in cnt.values())
        
        ans+=oddCount
        return ans
