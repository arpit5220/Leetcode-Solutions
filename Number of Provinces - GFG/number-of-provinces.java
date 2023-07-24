//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        
        for(int i=0;i<V;i++)
        {
            list.add(new ArrayList<Integer>());
        }
        
        
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.size();j++)
            {
                if(adj.get(i).get(j)==1 && i!=j)
                {
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        
          boolean [] visited = new boolean[V+1];
          int count=0;
          for(int i=0;i<V;i++)
          {
              if(visited[i]==false)
              {
                  count++;
                  dfs(i,list,visited);
              }
          }
          
          return count;
          
    }
    
    
    
    public static void dfs(int src,ArrayList<ArrayList<Integer>> list,boolean [] visited)
    {
        visited[src]=true;
        
        for(int nbr:list.get(src))
        {
            if(visited[nbr]==false)
            {
                dfs(nbr,list,visited);
            }
        }
    }
};