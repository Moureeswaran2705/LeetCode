class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        if len(num)==k:
            return '0'
        ans=[]
        st=[]
        for i,digit in enumerate(num):
            while k>0 and st and st[-1]>digit:
                st.pop()
                k-=1
            st.append(digit)
        for i in range(k):
            st.pop()
        for i in st:
            if i=='0' and len(ans)==0:
                continue
            ans.append(i)
        return "".join(ans) if ans else '0'