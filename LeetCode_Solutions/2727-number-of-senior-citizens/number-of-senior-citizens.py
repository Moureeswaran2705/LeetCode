class Solution:
    def countSeniors(self, details: List[str]) -> int:
        cnt=0
        for i in range(len(details)):
            if details[i][-4]>='6':
                if details[i][-4]=='6' and details[i][-3]>'0':
                    cnt+=1
                elif details[i][-4]>'6':
                    cnt+=1
        return cnt