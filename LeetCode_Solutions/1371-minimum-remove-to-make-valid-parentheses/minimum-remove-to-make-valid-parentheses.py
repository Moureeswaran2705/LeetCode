class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        st=[]
        char=[c for c in s]
        for i, c in enumerate(char):
            if c=='(':
                st.append(i)
            elif c==')':
                if st:
                    st.pop()
                else:
                    char[i]='*'
        while st:
            char[st.pop()]='*'
        return "".join(char).replace('*','')

            