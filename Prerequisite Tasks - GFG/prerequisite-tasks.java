//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String args[]) throws IOException
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t>0)
		{
		    int N = sc.nextInt();
		    int P = sc.nextInt();
		    int prerequisites[][] = new int[P][2];
		    for(int i=0;i<P;i++)
		    {
		        for(int j=0;j<2;j++)
		        {
		            prerequisites[i][j] = sc.nextInt();
		        }
		    }
			Solution ob = new Solution();
			if(ob.isPossible(N,P,prerequisites))
			{
			    System.out.println("Yes");
			}
			else{
			    System.out.println("No");
			}
			t--;
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public boolean isPossible(int N,int P, int[][] prerequisites)
    {
        // Your Code goes here
        
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