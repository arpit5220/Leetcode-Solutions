class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        
        int N=numCourses;
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        
        int n=prerequisites.length;
         
        for(int i=0;i<n;i++)
        {
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            
            adj.get(u).add(v);
        }
        
        int [] ind=new int[N];
        for(int i=0;i<N;i++)
        {
            for(int nbr:adj.get(i))
            {
                ind[nbr]++;
            }
        }
        
        
        Queue<Integer> pq=new LinkedList<Integer>();
        for(int i=0;i<ind.length;i++)
        {
            if(ind[i]==0)
             pq.add(i);
        }
        
        
       ArrayList<Integer> topo=new ArrayList<>();

        while(!pq.isEmpty())
        {
            int node=pq.remove();
            topo.add(node);
            
            for(int nbr:adj.get(node))
            {
                ind[nbr]--;
                if(ind[nbr]==0)
                {
                    pq.add(nbr);
                }
            }
        }
        
        if(topo.size()==N)
          return true;
        else
         return false;
    }
}