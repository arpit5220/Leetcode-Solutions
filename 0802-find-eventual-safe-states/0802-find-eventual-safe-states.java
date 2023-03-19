class Solution {
    public List<Integer> eventualSafeNodes(int[][] adj) {
        
        List<Integer> list=new ArrayList<>();
        int V=adj.length;
        int [] visited=new int[V];
        int [] path=new int[V];
        int [] check=new int[V];
        
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
            {
                dfs(i,adj,visited,path,check);
            }
        }
        
        for(int i=0;i<V;i++)
        {
            if(check[i]==1)
             list.add(i);
        }
        
        return list;
    }
    
    public boolean dfs(int src,int [][] adj,int[] visited, int [] path,int[] check)
    {
        visited[src]=1;
        path[src]=1;
        check[src]=0;
       
        for(int nbr:adj[src])
        {
            if(visited[nbr]==0)
            {
              if(dfs(nbr,adj,visited,path,check)==true)
              {
                  check[nbr]=0;
                  return true;
              }
              
            }
            
            else if(path[nbr]==1)
            {
                check[nbr]=0;
                 return true;
            }
            
        }
        
        check[src]=1;
        path[src]=0;
        return false;
    }
}