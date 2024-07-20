class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        // if(nums.length==1){
        //     return nums[0];
        // }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
           
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}