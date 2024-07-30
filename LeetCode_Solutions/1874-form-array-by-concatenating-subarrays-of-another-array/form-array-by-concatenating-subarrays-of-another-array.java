class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int i=0,j=0;
        while(i<groups.length&&j<nums.length){
            if(match(groups[i],nums,j)){
                j+=groups[i].length;
                i++;
            }
            else{
                j++;
            }
        }
            return i==groups.length;
    }
        public boolean match(int[] groups,int[] nums,int j){
            if(j+groups.length>nums.length){
                return false;
            }
            for(int i=0;i<groups.length;i++){
                if(groups[i]!=nums[i+j]){
                    return false;
                }
            }
            return true;
        }      
}