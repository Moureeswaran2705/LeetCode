class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        mp = {}
        tmp = set()
        for i in range(len(s)):
            if s[i] not in mp:
                if t[i] not in tmp:
                    mp[s[i]] = t[i]
                    tmp.add(t[i])
                else:
                    return False
            elif mp[s[i]] != t[i]:
                return False
        return True