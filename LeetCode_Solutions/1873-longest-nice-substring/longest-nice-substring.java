class Solution {
    public String longestNiceSubstring(String s) {
        String lng="";
        int maxL=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(isNice(sub)){
                   if(maxL<sub.length()){
                    maxL=sub.length();
                    lng=sub;
                   } 
                }
            }
        }
        return lng;
    }
    public boolean isNice(String s){
        Set<Character> st=new HashSet<>();
        for(int i=0;i<s.length();i++){
            st.add(s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char dif=c<='Z'?(char)(c+'a'-'A'):(char)(c-'a'+'A');
            if(!st.contains(dif)){
                return false;
            }
        }
        return true;
    }
}