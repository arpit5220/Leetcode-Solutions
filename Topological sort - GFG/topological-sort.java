//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);

            for (int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edg; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(u).add(v);
            }

            int[] res = new Solution().topoSort(nov, list);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        
        if(V!=res.length)
        return false;
        
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        
          // USING BFS (KHAN'S ALGO)
          
          int [] indegree=new int[V];
          for(int i=0;i<V;i++)
          {
              for(int nbr:adj.get(i))
              {
                  indegree[nbr]++;
              }
          }
          
          Queue<Integer> pq=new LinkedList<>();
          for(int i=0;i<V;i++)
          {
              if(indegree[i]==0)
                pq.add(i);
          }
          
          
          int [] topo=new int[V];
          int i=0;
          while(!pq.isEmpty())
          {
              int node=pq.remove();
              topo[i++]=node;
              
              for(int nbr:adj.get(node))
              {
                  indegree[nbr]--;
                  
                  if(indegree[nbr]==0)
                  {
                      pq.add(nbr);
                  }
              }
              
          }
          
          
          return topo;
    }
}
          
        
        
        
        
        
     
     /*   
        // USING STACK
        boolean [] visited=new boolean[V];
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                dfs(adj,visited,stk,i);
            }
        }
        
        int ans[] =new int[V];
        int i=0;
        while(!stk.isEmpty())
        {
            ans[i++]=stk.peek();
            stk.pop();
        }
        
        return ans;
    }
    
    public static void dfs(ArrayList<ArrayList<Integer>> adj,boolean [] visited,Stack<Integer> stk,int src)
    {
        visited[src]=true;
        
        for(int nbr:adj.get(src))
        {
            if(!visited[nbr])
                dfs(adj,visited,stk,nbr);
        }
        stk.push(src);
    }
 } */
