class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] sort=new String[names.length];
        List<Pair<String,Integer>> mp= new ArrayList<>();
        for(int i=0;i<names.length;i++){
            mp.add(new Pair<>(names[i],heights[i]));
        }
        Collections.sort(mp,(l1,l2)->l2.getValue().compareTo(l1.getValue()));
        for(int i=0;i<sort.length;i++){
            sort[i]=mp.get(i).getKey();
        }
        return sort;
    }
}