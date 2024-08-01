class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(int i=0;i<details.length;i++){
            int ind1=details[i].length()-4;
            int ind2=details[i].length()-3;
            if(details[i].charAt(ind1)>='6'){
                if(details[i].charAt(ind1)=='6'&&details[i].charAt(ind2)>'0'){
                     cnt++;
                }
               else if(details[i].charAt(ind1)>'6'&&details[i].charAt(ind2)>='0'){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}