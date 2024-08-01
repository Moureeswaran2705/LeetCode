class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        permute1(0,nums,ans);
        Set<List<Integer>>st=new HashSet<>(ans);
        List<List<Integer>>ans1=new ArrayList<>(st);
       return ans1;
    }
    public void permute1(int ind,int[] nums,List<List<Integer>>ans){
        if(ind==nums.length){
            List<Integer>lt=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                lt.add(nums[i]);
            }
            ans.add(new ArrayList<>(lt));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            permute1(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    public void swap(int i,int j,int[] nums){
        int r=nums[i];
        nums[i]=nums[j];
        nums[j]=r;
    }
}