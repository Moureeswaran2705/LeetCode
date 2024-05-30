class Solution:
    def convert(self, s: str, numRows: int) -> str:
        mat=['']*numRows
        k=0
        dir=(numRows==1)-1
        for i in s:
            mat[k]+=i
            if k==0 or k==numRows-1:
                dir*=-1
            k+=dir
        return ''.join(mat)

