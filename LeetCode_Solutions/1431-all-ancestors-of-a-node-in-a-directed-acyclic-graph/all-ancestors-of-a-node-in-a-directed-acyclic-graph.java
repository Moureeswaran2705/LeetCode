class Solution {
    public void dfs(int v,int p,List<List<Integer>> res,List<Set<Integer>> set,boolean[] visited){
        visited[v]=true;
        if(v!=p){
            res.get(v).add(p);
        }
        for(int x:set.get(v)){
            if(!visited[x]){
                dfs(x,p,res,set,visited);
            }
        }
    }
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> res=new ArrayList<>();
        List<Set<Integer>> set=new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(new ArrayList<>());
            set.add(new HashSet<>());
        }
        boolean [] visited=new boolean[n];
        for(int[] edge:edges){
            set.get(edge[0]).add(edge[1]);
        }
        for(int i=0;i<n;i++){
            Arrays.fill(visited,false);
            dfs(i,i,res,set,visited);
        }
        return res;
    }
}