class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)return "0";
        LinkedList<Character> st=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length();i++){
            while(k>0&&!st.isEmpty()&&st.getLast()>num.charAt(i)){
                st.pollLast();
                k--;
            }
            st.addLast(num.charAt(i));
        }
        while(k-- > 0){
            st.pollLast();
        }
        for(char c:st){
            if(c=='0'&&sb.length()==0){
                continue;
            }
            sb.append(c);
        }
        return sb.length()==0?"0":sb.toString();
    }
}