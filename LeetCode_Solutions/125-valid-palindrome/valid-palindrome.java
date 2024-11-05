class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        String str=s.replaceAll(" ","");
        for(char c:str.toCharArray()){
            char ch=Character.toLowerCase(c);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }
        StringBuilder rv=new StringBuilder(sb).reverse();
        
         return sb.toString().equals(rv.toString());
    }
}