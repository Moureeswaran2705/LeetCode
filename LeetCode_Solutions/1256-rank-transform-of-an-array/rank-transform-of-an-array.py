class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        if len(arr)<1:
            return arr
        arr1=sorted(arr)
        map={}
        map[arr1[0]]=1
        cnt=1
        for i in range(1,len(arr1)):
            if arr1[i] not in map:
                cnt+=1
                map[arr1[i]]=cnt
        return [map[i] for i in arr]

