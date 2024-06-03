class Solution:
    def reverseString(self, s: List[str]) -> None:
        n=len(s)
        res=[]
        for i in range(n-1,-1,-1):
            s.append(s.pop(i))
            #print(s)
        return s
        