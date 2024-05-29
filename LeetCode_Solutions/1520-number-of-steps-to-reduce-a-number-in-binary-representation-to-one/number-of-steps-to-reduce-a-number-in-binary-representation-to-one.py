class Solution:
    def numSteps(self, s: str) -> int:
        decNumber=int(s,2)
        cnt=0
        while decNumber!=1:
            if decNumber%2==0:
                decNumber=decNumber//2
                cnt+=1
            else:
                decNumber+=1
                cnt+=1
            print(decNumber)
        return cnt