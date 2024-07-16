class Solution {
    public String getSmallestString(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < sb.length() - 1; i++) {
            int c1 = sb.charAt(i) - '0';
            int c2 = sb.charAt(i + 1) - '0';
            
            // Check if both characters are of the same parity (both odd or both even)
            if (c1>c2&&((c1 % 2 == 1 && c2 % 2 == 1) || (c1 % 2 == 0 && c2 % 2 == 0))) {
                // Swap characters at positions i and i+1
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(i + 1));
                sb.setCharAt(i + 1, temp); 
                break; // Exit the loop after the first swap
            }
        }
        return sb.toString();
    }
}
