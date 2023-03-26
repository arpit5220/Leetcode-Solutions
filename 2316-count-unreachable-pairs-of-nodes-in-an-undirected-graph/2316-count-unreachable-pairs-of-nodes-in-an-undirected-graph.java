class Solution {
    public long countPairs(int n, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        
         int m=edges.length;
        
        for(int i=0;i<m;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }  
        
        int [] visited=new int[n];
        ArrayList<Integer> cmplist=new ArrayList<>();  // for storing component size
        
        for(int i=0;i<n;i++)
        {
            if(visited[i]!=1)
            {
                int x=dfs(adj,i,visited);
                cmplist.add(x);
            }
        }
        
        long ans=0;
        long t=0;
        for(int val:cmplist)
        {
            t+=val;
            ans+=(n-t)*val;
        }
        
        return ans;
    
    }
    
    public int dfs(ArrayList<ArrayList<Integer>> adj,int src,int [] visited)
    { 
        
        visited[src]=1;
        
        int ans=1;
        for(int nbr:adj.get(src))
        {
            if(visited[nbr]!=1)
            {
                ans+=dfs(adj,nbr,visited);
            }
        }
        
        return ans;
    }
}