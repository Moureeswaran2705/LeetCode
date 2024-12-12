class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans=0;
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        for(int val:gifts){
            max.add(val);
        }
        for(int i=0;i<k&&max.peek()>1;i++){
            int first=max.poll();
            max.add((int)Math.sqrt(first));
        }
        for(int i:max){
            ans+=i;

        }
        return ans;
    }
}