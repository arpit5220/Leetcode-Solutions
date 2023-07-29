class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        
        int n=numCourses;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<n;i++) adj.add(new ArrayList<Integer>());
        
        int[] ind = new int[n];
        
        for(int i=0;i<prerequisites.length;i++)
        {
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            adj.get(v).add(u);

        }
        
       // int [] ind=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int nbr:adj.get(i))
            {
                ind[nbr]++;
            }
        }
        
        
        Queue<Integer> pq=new LinkedList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(ind[i]==0)
             pq.add(i);
        }
        
        
        int [] topo=new int[n];
        int i=0;
        
        while(!pq.isEmpty())
        {
            int node=pq.remove();
            topo[i++]=node;
            
            for(int nbr:adj.get(node))
            {
                ind[nbr]--;
                if(ind[nbr]==0)
                {
                    pq.add(nbr);
                }
            }
        }
        
        if(i==n) return topo;
        
        int [] arr={};
        return arr;
        
        
        
    }
    
}