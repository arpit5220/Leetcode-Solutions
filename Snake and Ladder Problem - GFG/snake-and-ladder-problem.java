//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[2*N];
            for(int i = 0;i < 2*N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minThrow(N, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minThrow(int N, int arr[]){
        // code here
        
        int [] A=new int [31];
        boolean [] visited=new boolean[31];
        Arrays.fill(visited,false);
        
        for(int i=0;i<31;i++)
        {
            A[i]=i;
        }
        
        for(int i=0;i<N;i++)
        {
            A[arr[2*i]]=A[arr[2*i+1]];
        }
        
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(1,0));
        visited[1]=true;
   
        while(!q.isEmpty())
        {
            int cn=q.peek().move;
            int steps=q.peek().index;
            q.remove();
            
            for(int i=1;i<=6;i++)
            {
                int nm=cn+i;
                    if(nm<31 && !visited[A[nm]])
                    {
                      visited[A[nm]]=true;
                      q.add(new Pair(A[nm],steps+1));
                      if(A[nm]==30)
                      {
                          return steps+1;
                      }
                    }
                
            }
        }
        
        
        return -1;
        
        
    }
    
}

    class Pair
    {
        int index;
        int move;
        Pair(int move,int index)
        {
            this.index=index;
            this.move=move;
        }
    }