class Solution {
    public int heightChecker(int[] heights) {
        int[] exp=Arrays.copyOf(heights,heights.length);
        int cnt=0;
        Arrays.sort(exp);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=exp[i]){
                cnt++;
            }
        }
        return cnt;
    }
}