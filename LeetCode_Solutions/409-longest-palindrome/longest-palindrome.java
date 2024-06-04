class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        int[] cnt=new int[128];
        int ans=0;
        for(char c:s.toCharArray()){
            ++cnt[c];
        }
        for(int freq:cnt){
            ans+=freq%2==0?freq:freq-1;
        }
        boolean oddCnt=Arrays.stream(cnt).anyMatch(freq->freq%2==1);
        ans+=oddCnt?1:0;
        // for(int c:cnt){
        //     System.out.println(c);
        // }
        return ans;
    }
}