class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        int[] rightmax=new int[n];
        rightmax[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],nums[i]);
        }
        int left=0,right=0,maxVal=0;
        while(right<n){
            while(right<n&&nums[left]<=rightmax[right]){
                right++;
            }
            maxVal=Math.max(maxVal,right-left-1);
            left++;
            right=left+maxVal+1;
        }
        return maxVal;
    }
}