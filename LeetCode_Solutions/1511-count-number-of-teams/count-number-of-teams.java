class Solution {
    public int numTeams(int[] ratings) {
       // List<List<Integer>> lt=new ArrayList<>();
       int ans=0;
        for(int i=1;i<ratings.length-1;i++){
            int leftLess=0;
            int leftGreat=0;
            for(int j=0;j<i;j++){
                if(ratings[i]>ratings[j]){
                    leftLess++;
                }
                else{
                    leftGreat++;
                }
            }
            int rightLess=0;
            int rightGreat=0;
            for(int j=i+1;j<ratings.length;j++){
                if(ratings[j]>ratings[i]){
                    rightGreat++;
                }
                else{
                     rightLess++;
                }
            }
            ans+=leftLess*rightGreat+rightLess*leftGreat;
        }
        return ans;
    }
}