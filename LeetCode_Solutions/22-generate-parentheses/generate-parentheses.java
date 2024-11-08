class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lt=new ArrayList<>();
        dfs(0,0,lt,"",n);
        return lt;
    }
    public void dfs(int left,int right,List<String> lt,String s,int n){
        if(s.length()==n*2){
            lt.add(s);
            return;
        }
        if(left<n){
            dfs(left+1,right,lt,s+"(",n);
        }
        if(right<left){
            dfs(left,right+1,lt,s+")",n);
        }
    }
}