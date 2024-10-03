class Solution {
    public int minSubarray(int[] nums, int p) {
        //int sum=Arrays.stream(nums).sum();
        int sum=0;
        for(int x:nums){
            sum=(sum+x)%p;
        }
        int rem=sum%p;
        if(rem==0){
            return 0;
        }
        int ans=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,-1);
        int cur=0;
        for(int i=0;i<nums.length;i++){
            cur=(cur+nums[i])%p;
            int need=(cur-rem+p)%p;
            if(hm.containsKey(need)){
                ans=Math.min(ans,i-hm.get(need));

            }
            hm.put(cur,i);
        }
        //System.out.println(hm);
        return ans==nums.length?-1:ans;
    }
}