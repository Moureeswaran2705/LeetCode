class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] hav=new boolean[26];
        int ans=0;
        for(char c:allowed.toCharArray()){
            hav[c-'a']=true;
        }
        for(int i=0;i<words.length;i++){
            if(check(words[i],hav)){
                ans++;
            }
        }
        return ans;
    }
     boolean check(String str,boolean[] hav){
        for(char c:str.toCharArray()){
            if(hav[c-'a']==false) {
                return false;
            }       }
            return true;
    }
}