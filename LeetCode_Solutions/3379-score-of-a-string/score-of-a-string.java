class Solution {
    public int scoreOfString(String s) {
        char[] ch=s.toCharArray();
        int ans=0;
        for(int i=0;i<ch.length-1;i++){
            int j=i+1;
            ans+=Math.abs(ch[i]-ch[j]);
        }
        return ans;
    }
}