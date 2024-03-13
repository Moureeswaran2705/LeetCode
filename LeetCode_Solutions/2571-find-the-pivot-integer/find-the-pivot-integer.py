class Solution:
    def pivotInteger(self, n: int) -> int:
        if n == 1:
            return 1
    
        a = [0] * n
        k = 1
        for i in range(n):
            a[i] = k
            k += 1
        
        for i in range(1, n):
            a[i] = a[i - 1] + a[i]
        
        for i in range(1, n):
            if a[i - 1] + a[i] == a[n - 1]:
                return i + 1
        
        return -1