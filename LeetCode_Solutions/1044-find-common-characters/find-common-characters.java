class Solution {
    public List<String> commonChars(String[] words) {
        int[] lcnt=new int[26];
        Arrays.fill(lcnt,Integer.MAX_VALUE);
        for(String str:words){
            int[] currentLetter=new int[26];
            for(int i=0;i<str.length();i++){
                currentLetter[str.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                lcnt[i]=Math.min(lcnt[i],currentLetter[i]);
        }
        }
        List<String> ls=new ArrayList<>();
        for(int i=0;i<26;i++){
            while(lcnt[i]>0){
                ls.add(String.valueOf((char)(i+'a')));
                lcnt[i]--;
            }
        }
        return ls;
    }
}