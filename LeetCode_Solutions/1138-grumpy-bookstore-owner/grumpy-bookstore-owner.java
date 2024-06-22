class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int ans=0;
        int max=0;
        int us=0;
        for(int i=0;i<n;i++){
            int sum=0;
            if(grumpy[i]==0){
                ans+=customers[i];
            }
            else{
                us+=customers[i];
            }
            if(i>=minutes && grumpy[i-minutes]==1){
                us-=customers[i-minutes];
            }
            max=Math.max(max,us);
        }
        
        return ans+max;
    }
}