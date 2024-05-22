class Solution:
    def partition(self, s: str) -> List[List[str]]:
        res=[]
        path=[]
        self.partitionHelper(0,s,res,path)
        return res
    def partitionHelper(self,index,s,res,path):
        if index==len(s):
            res.append(path[:])
        for i in range(index,len(s)):
            if self.isPalindrome(s,index,i):
                path.append(s[index:i+1])
                self.partitionHelper(i+1,s,res,path)
                path.pop()
    def isPalindrome(self,s,start,end):
        while start<=end:
            if s[start]!=s[end]:
                return False
            start+=1
            end-=1
        return True