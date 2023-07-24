//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        
        //  be solve only using BFS
        
        int n=grid.length;
        int m=grid[0].length;
        
        Queue<Pair> pq=new LinkedList<>();
        int  vis[][] =new int [n][m];
        
        int countfresh=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    vis[i][j]=2;
                    pq.add(new Pair(i,j,0));
                }
                else //if(grid[i][j]==0)
                {
                     vis[i][j]=0;
                }
                
                if(grid[i][j]==1)
                {
                    countfresh++;
                }
            }
        }
        
        
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        int cnt=0;    
        int Maxtime=0;
        while(!pq.isEmpty())
        {
            Pair temp=pq.remove();
            int r=temp.first;
            int c=temp.second;
            int t=temp.third;
            
            Maxtime=Math.max(Maxtime,t);
            
            
            for(int i=0;i<4;i++)
            {
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
                {
                    pq.add(new Pair(nrow,ncol,t+1));
                    //vis[nrow][ncol]=true;
                   // grid[nrow][ncol]=2;  // not a good approach bcz grid values changes
                   
                    vis[nrow][ncol]=2;
                    cnt++;
                    
                }
            }
            
            
        }
        
          
            if(cnt!=countfresh)
             return -1;
             
            
            else
            return Maxtime;
        
    }
}

class Pair{
    
    int first;
    int second;
    int third;
    Pair(int first,int second,int third)
    {
        this.first=first;
        this.second=second;
        this.third=third;
    }
}