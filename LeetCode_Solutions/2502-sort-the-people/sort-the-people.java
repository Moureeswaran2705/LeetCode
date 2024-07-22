class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] sor=new String[names.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Map<Integer,String> mp=new HashMap<>();
        for(int i=0;i<names.length;i++){
            mp.put(heights[i],names[i]);
            pq.add(heights[i]);
        }
        int j=names.length-1;
        for(int i=names.length-1;i>=0;i--){
            sor[i]=mp.get(pq.poll());
        }
        return sor;
    }
}