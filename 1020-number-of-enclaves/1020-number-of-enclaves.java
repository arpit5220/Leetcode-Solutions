class Solution {
    public int numEnclaves(int[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        
        int [][] visited=new int[n][m];
        
        Queue<Pair> pq=new ArrayDeque<>();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==0 || j==0 || i==n-1 || j==m-1) && grid[i][j]==1)
                {
                    pq.add(new Pair(i,j));
                    visited[i][j]=1;
                }
            }
        }
        

        
        int []drow={1,0,-1,0};
        int []dcol={0,1,0,-1};
      
        while(pq.size()>0)
        {
            Pair temp=pq.remove();
            
           int row =temp.row;
           int col=temp.col;
            
           for(int i=0;i<4;i++)
           {
               int nrow=row+drow[i];
               int ncol=col+dcol[i];
               
               if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && grid[nrow][ncol]==1 && visited[nrow][ncol]==0)
               {
                   pq.add(new Pair(nrow,ncol));
                   visited[nrow][ncol]=1;
               }
           }
               
        }
        
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && visited[i][j]==0)
                {
                    count++;
                }
            }
        }
        
        return count;
        
        
    }
    
    class Pair
    {
        int row;
        int col;
        
        Pair(int row,int col)
        {
            this.row=row;
            this.col=col;
        }
        
    }
}