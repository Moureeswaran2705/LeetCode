class Solution {
    public long dividePlayers(int[] skill) {
      Arrays.sort(skill);
      int n=skill.length-1;
      int tot=skill[0]+skill[n];
      long chm=0;
      for(int i=0;i<(n+1)/2;i++){
        if(skill[i]+skill[n-i]==tot){
            chm+=skill[i]*skill[n-i];
        }
        else{
            return -1;
        }
      }
      return chm;
    }
}