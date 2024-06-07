class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        s=sentence.split(" ")
        for i in range(len(s)):
            for word in dictionary:
                if s[i].startswith(word):
                    s[i]=word
        return ' '.join(s)