class Solution:
    def letterCombinations1(self, digits: str, idx: int, codes: List[str], ans: List[str], psf: str):
        if idx == len(digits):
            ans.append(psf)
            return 1
        count = 0  # Corrected variable name
        val = int(digits[idx])
        code = codes[val]
        for i in range(len(code)):
            count += self.letterCombinations1(digits, idx + 1, codes, ans, psf + code[i])
        return count
    
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        codes = ['', '', 'abc', 'def', 'ghi', 'jkl', 'mno', 'pqrs', 'tuv', 'wxyz']
        ans = []
        self.letterCombinations1(digits, 0, codes, ans, "")
        return ans