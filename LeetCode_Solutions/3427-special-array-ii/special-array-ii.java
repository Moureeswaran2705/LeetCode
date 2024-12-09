class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=queries.length;
        int l=nums.length;
        int[] prefix=new int[l];
        boolean[] res=new boolean[n];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1];
            if((nums[i]%2==0&&nums[i-1]%2==0)||(nums[i]%2!=0&&nums[i-1]%2!=0)){
                prefix[i]++;
            }
        }
        int k=0;
        for(int[] query:queries){
            int i=query[0];
            int j=query[1];
            int special=prefix[j]-(i>0?prefix[i]:0);
            res[k]=(special==0);
            k++;
        }
        return res;
    }
}