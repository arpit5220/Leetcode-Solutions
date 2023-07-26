//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        
        // USING BFS
        
     /*   boolean [] visited=new boolean[V+1];
        
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                if(detectCycle(adj,visited,i))
                  return true;
            }
        }
        
        return false;
        
    }
    
    public boolean detectCycle(ArrayList<ArrayList<Integer>> adj,boolean [] visited,int src)
    {
        Queue<Pair> pq=new LinkedList<>();
        pq.add(new Pair(src,-1));
        visited[src]=true;
        
        while(!pq.isEmpty())
        {
           Pair temp=pq.remove();
           int  root=temp.node;
           int  paren=temp.parent;
           
           for(int nbr:adj.get(root))
           {
               if(!visited[nbr])
               {
                   visited[nbr]=true;
                   pq.add(new Pair(nbr,root));
               }
               else if(paren!=nbr)
               {
                   return true;
               }
           }
        }
        
        return false;
        
    }
}

class Pair{
    
    int node;
    int parent;
    Pair(int node,int parent)
    {
        this.node=node;
        this.parent=parent;
    }
}      */





        // USING DFS
        
        boolean [] visited=new boolean[V+1];
        
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                if(detectCycle(adj,visited,i,-1))
                  return true;
            }
        }
        
        return false;
        
    }
    
    public boolean detectCycle(ArrayList<ArrayList<Integer>> adj,boolean [] visited,int src,int parent)
    {
          visited[src]=true;
          
          for(int nbr:adj.get(src))
          {
              if(!visited[nbr])
              {
                 
                  if(detectCycle(adj,visited,nbr,src))
                      return true;
              }
              else if(parent !=nbr)
              {
                  return true;
              }
          }
          
          return false;
    }
    
}