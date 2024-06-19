class Solution {
    public int minimumPushes(String word) {
        int[] cnt =new int[26];
        for(char c:word.toCharArray()){
            ++cnt[c-'a'];
        }
        Arrays.sort(cnt);
        int ans=0;
        for(int i=0;i<26;i++){
            ans+=cnt[26-i-1]*(i/8+1);
        }
        return ans;
    }
}