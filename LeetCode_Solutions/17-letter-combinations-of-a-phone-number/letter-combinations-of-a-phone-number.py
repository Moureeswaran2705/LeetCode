class Solution:
    def letterCombinations1(self, digits: str, idx: int, codes: List[str], ans: List[str], psf: str):      
        if idx==len(digits):
            ans.append(psf)
            return
        val=int(digits[idx])
        s=codes[val]
        for i in range(len(s)):
            self.letterCombinations1(digits,idx+1,codes,ans,psf+s[i])
        
    
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        codes=["","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"]
        ans=[]
        self.letterCombinations1(digits,0,codes,ans,"")
        return ans