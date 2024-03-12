class Solution {
   class pair
    {
        int c;
        int i;
        pair(int c,int i)
        {
            this.c=c;
            this.i=i;
        }
    }
    public boolean isBipartite(int[][] graph) 
    {
        int vis[]=new int[graph.length];
        int nov=graph.length;
        for(int i=0;i<nov;i++)
        {
            if(vis[i]==0)
        {
                boolean aa=helper(graph,i,vis);
                  if(aa==false)
                    return false;
            }
        }
        return true;
    }
    public boolean helper(int [][]graph,int vn,int []vis)
    {
        ArrayDeque<pair>queu=new ArrayDeque<>();
        queu.add(new pair(1,vn));
        while(queu.size()>0)
        {
            pair p=queu.remove();//remove
            if(vis[p.i]!=0)         //already visited
            {
                int ol=vis[p.i];
                int nl=p.c;
                if(ol==nl)
                    continue;
                else
                    return false;
            }
            //if not visited
            vis[p.i]=p.c;
            //nbr
            for(int nbr:graph[p.i])
            {
                if(vis[nbr]==0)
                    queu.add(new pair(p.c*-1,nbr));
            }
        }
        return true;       
    }   
}