class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        cnt=collections.Counter(students)
        for i,san in enumerate(sandwiches):
            print(san)
            print(cnt[san])
            if cnt[san]==0:
                return len(sandwiches)-i
            cnt[san]-=1
        return 0