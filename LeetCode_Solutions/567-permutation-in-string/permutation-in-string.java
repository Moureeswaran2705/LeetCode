class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] c1=new int[26],c2=new int[26];
        for(int i=0;i<s1.length();i++){
           c1[s1.charAt(i)-'a']++;
           c2[s2.charAt(i)-'a']++; 
          // System.out.println(s1.charAt(i)-'a');
          // System.out.println(s2.charAt(i)-'a');
        }
        if(Arrays.equals(c1,c2))return true;
        for(int i=s1.length();i<s2.length();i++){
            c2[s2.charAt(i-s1.length())-'a']--;
            c2[s2.charAt(i)-'a']++;
            if(Arrays.equals(c1,c2)){
                return true;
            }
        }
        return false;
    }
}