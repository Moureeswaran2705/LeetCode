class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        lst=[2**31 for _ in range(26)]
        for str1 in words:
            cnt=Counter(str1)
            for i in range(26):
                lst[i]=min(lst[i],cnt[chr(i+ord('a'))])
        res=[]
        for i in range(26):
            while lst[i]>0:
                res.append(chr(i+ord('a')))
                lst[i]-=1
        return res