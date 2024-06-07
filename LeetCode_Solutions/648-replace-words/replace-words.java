class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String [] str=sentence.split(" ");
        for(int i=0;i<str.length;i++){
            for(String ls:dictionary){
                if(str[i].startsWith(ls)){
                    str[i]=ls;
                }
            }
        }
        // for(String ls:dictionary){
        //     for(String s:str){
        //         if(s.contains(ls)){
        //             s.replace(ls);
        //         }
        //     }
        // }
        //String ans="";
        // for(String s:str){
        //     ans+=s+" ";
        // }
        return String.join(" ",str);
    }
}