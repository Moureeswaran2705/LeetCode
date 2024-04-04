class Solution:
  def maxDepth(self, s: str) -> int:
    res=0
    op=0
    for i in s:
        if i=='(':
            op+=1
            res=max(res,op)
        elif i==')':
            op-=1
    return res