class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0&&nums[i+1]<=nums[i]){
            i--;
        }
        if(i!=-1){
            int j=nums.length-1;
            while(j>=0&&nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        int st=i+1;
        int end=nums.length-1;
        while(st<end){
            swap(nums,st,end);
            st++;
            end--;
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}