class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int pos = 0;
        long result = 0; // Change int to long to handle overflow
        int sign = 1;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(pos++) == '-') ? -1 : 1;
        }
        while (pos < s.length() && Character.isDigit(s.charAt(pos))) {
            int cur = s.charAt(pos++) - '0';
            result = result * 10 + cur;
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) (sign * result);
    }
}
