class Solution {
    public String nearestPalindromic(String n) {
         int len=n.length();
         Set<String> set=new HashSet<>();
         if(n.equals("1")){
            return "0";
         }
         String prefix=n.substring(0,(len+1)/2);
         long prefixNum=Long.parseLong(prefix);
         for(long i:new long[] {-1,0,1}){
            String newprefix=Long.toString(prefixNum+i);
            String candidate;
            if(len%2==0){
                candidate=newprefix+new StringBuilder(newprefix).reverse().toString();
            }else{
                candidate=newprefix+new StringBuilder(newprefix.substring(0,newprefix.length()-1)).reverse().toString();
            }
            set.add(candidate);
         }
         set.add(Long.toString((long)Math.pow(10,len-1)-1));
        set.add(Long.toString((long)Math.pow(10,len)+1));
         set.remove(n);
         
         String palin="";
         long min=Long.MAX_VALUE;
         long num=Long.parseLong(n);
         for(String str:set){
            long can=Long.parseLong(str);
            long diff=Math.abs(can-num);
            if(diff<min||diff==min&&can<Long.parseLong(palin)){
                min=diff;
                palin=str;
            }
         }
         return palin;
    }
}