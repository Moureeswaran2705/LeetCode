class Solution {
    public String convert(String s, int numRows) {
        StringBuilder sb=new StringBuilder();
        List<Character>[] row=new List[numRows];
        int k=0;
        int dir=(numRows==1)?0:-1;
        for(int i=0;i<numRows;i++){
            row[i]=new ArrayList<>();
        }
        for(char c:s.toCharArray ()){
            row[k].add(c);
            if(k==0 || k==numRows-1){
                dir*=-1;
            }
            k+=dir;
        }
        for (List<Character> rows : row)
            for (final char c : rows)
                sb.append(c);
        return sb.toString();
    }
}