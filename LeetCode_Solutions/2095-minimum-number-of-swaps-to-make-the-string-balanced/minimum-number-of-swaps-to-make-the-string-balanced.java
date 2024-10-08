class Solution {
    public int minSwaps(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='['){
                ans++;
            }
            else if(ans>0){
                ans--;
            }
        }
        return (ans+1)/2;
    }
}