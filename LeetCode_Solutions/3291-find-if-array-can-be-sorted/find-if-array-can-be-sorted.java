class Solution {
    public boolean canSortArray(int[] nums) {
        int bitcnt=Integer.bitCount(nums[0]);
        int prev=-1;
        int cur=nums[0];
        for(int i=1;i<nums.length;i++){
            if(Integer.bitCount(nums[i])!=bitcnt){
                bitcnt=Integer.bitCount(nums[i]);
                prev=Math.max(cur,prev);
                cur=nums[i];
            }
            else{
                cur=Math.max(cur,nums[i]);
            }
            if(nums[i]<prev){
                return false;
            }
        }
        return true;
    }
}