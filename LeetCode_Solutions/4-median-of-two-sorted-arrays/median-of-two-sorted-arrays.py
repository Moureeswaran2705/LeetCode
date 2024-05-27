class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        merge=[]
        i,j=0,0
        while i<len(nums1) and j<len(nums2):
            if nums1[i]<nums2[j]:
                merge.append(nums1[i])
                i+=1
            else:
                merge.append(nums2[j])
                j+=1
        while i<len(nums1):
            merge.append(nums1[i])
            i+=1
        while j<len(nums2):
            merge.append(nums2[j])
            j+=1
        #print(merge)
        n=len(merge)
        if n%2!=0:
            return merge[n//2]
        else:
            mid=n//2
            ans=(merge[mid-1]+merge[mid])/2
            return ans