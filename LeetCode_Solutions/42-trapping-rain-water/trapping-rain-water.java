class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int []lmax=new int[height.length];
        int []rmax=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                lmax[i]=height[i];
            }
            else{
                lmax[i]=Math.max(lmax[i-1],height[i]);
            }
        }for(int i=n-1;i>=0;i--){
            if(i==n-1){
                rmax[i]=height[i];
            }
            else{
                rmax[i]=Math.max(rmax[i+1],height[i]);
            }
        }
        int tot=0;
        for(int i=0;i<n;i++){
            tot+=Math.min(lmax[i],rmax[i])-height[i];
        }
        return tot;
    }
}