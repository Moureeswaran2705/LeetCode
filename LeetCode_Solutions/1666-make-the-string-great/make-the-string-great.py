class Solution:
    def makeGood(self, s: str) -> str:
        st=[]
        for i in s:
            if not st or abs(ord(st[-1])-ord(i))!=32:
                print(i)
                st.append(i)
            else:
                st.pop()
        return "".join(st)