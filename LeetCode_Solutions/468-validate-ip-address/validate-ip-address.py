class Solution:
    def validIPAddress(self, IP: str) -> str:
        if IP.count('.') == 3:
            for digit in IP.split('.'):
                if not self.isIPv4(digit):
                    return "Neither"
            return "IPv4"

        if IP.count(':') == 7:
            for digit in IP.split(':'):
                if not self.isIPv6(digit):
                    return "Neither"
            return "IPv6"

        return "Neither"

    def isIPv4(self, digit: str) -> bool:
        if digit == "" or len(digit) > 3:
            return False
        if len(digit) > 1 and digit[0] == '0':
            return False

        for c in digit:
            if not c.isdigit():
                return False

        num = int(digit)
        return 0 <= num <= 255

    def isIPv6(self, digit: str) -> bool:
        if digit == "" or len(digit) > 4:
            return False

        validIPv6Chars = "0123456789abcdefABCDEF"
        for c in digit:
            if c not in validIPv6Chars:
                return False

        return True
