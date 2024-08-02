class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals,(a,b)->{ return a[0]-b[0];});
         List<List<Integer>>ans=new ArrayList<>();
         for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }
            for(int j=i+1;j<intervals.length;j++){
                if(end>=intervals[j][0]){
                    end=Math.max(end,intervals[j][1]);
                }
                else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
         }
         int[][] ans1=new int[ans.size()][2];
         for(int i=0;i<ans.size();i++){
            for(int j=0;j<2;j++){
                ans1[i][j]=ans.get(i).get(j);
            }
         }
         return ans1;
         }
}