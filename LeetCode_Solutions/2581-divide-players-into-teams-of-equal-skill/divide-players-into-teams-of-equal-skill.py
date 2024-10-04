class Solution:
    def dividePlayers(self, skill: List[int]) -> int:
        skill.sort()
        n=len(skill)-1
        tot=skill[0]+skill[n]
       # print(tot)
        chm=0
        for i in range(len(skill)//2):
            if(skill[i]+skill[n-i]==tot):
                chm+=skill[i]*skill[n-i]
             #   print(chm)
            else:
                return -1
        return chm
