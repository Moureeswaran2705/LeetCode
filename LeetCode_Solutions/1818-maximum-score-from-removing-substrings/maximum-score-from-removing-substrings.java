class Solution {
    public int maximumGain(String s, int x, int y) {
        return x > y ? gain(s, "ab", "ba", x, y) : gain(s, "ba", "ab", y, x);
    }
    public int gain(String s, String fs, String sc, int x1, int y1) {
        int score = 0;
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!st1.isEmpty() && st1.peek() == fs.charAt(0) && c == fs.charAt(1)) {
                st1.pop();
                score += x1;
            } else {
                st1.push(c);
            }
        }
            for(char c:st1){
                if(!st2.isEmpty()&&st2.peek()==sc.charAt(0)&&c==sc.charAt(1)){
                    st2.pop();
                    score+=y1;
                }
                else{
                    st2.push(c);
                }
             }
        return score;
    }
}
