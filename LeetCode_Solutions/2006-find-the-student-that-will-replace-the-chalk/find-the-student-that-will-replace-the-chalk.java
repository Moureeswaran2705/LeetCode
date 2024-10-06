class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i=0;
        while(k>=0){
            if(k>=chalk[i]){
                k-=chalk[i];
                i++;
            }
            else{
                return i;
            }
            if(i==chalk.length){
                i=0;
            }
            
           // System.out.print(k+" ");
           // System.out.print(i+" ");
        }
        return k;
    }
}