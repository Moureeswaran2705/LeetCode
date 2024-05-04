class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        cnt=0
        i=0
        j=len(people)-1
        while i <= j:
            remain=limit-people[j]
           # print(remain,'\n')
            print(people[j],"\n")
            j-=1
            print(people[i],"\n")
            if people[i]<=remain:
                i+=1
            cnt+=1
        return cnt

            
