class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        
      int n=grid.length;
      int m=grid[0].length;
      
      int [][] vis=new int[n][m];
      int cnt=0;
      for(int row=0;row<n;row++)
      {
          for(int col=0;col<m;col++)
          {
              if(vis[row][col]==0 && grid[row][col]=='1')
              {
                  cnt++;
               //   bfs(row,col,vis,grid);
                  dfs(grid, vis, row, col);
              }
          }
      }
      
      return cnt;
    }
    
 /*   public void bfs(int ro,int co,int[][] vis,char [][] grid)
    {
        vis[ro][co]=1;
        
        Queue<Pair> pq=new ArrayDeque<>();
        pq.add(new Pair(ro,co));
        
         int n=grid.length;
         int m=grid[0].length;
        
        while(pq.size()>0)
        {
            Pair temp=pq.remove();
            int row=temp.first;
            int col=temp.second;
             
            for(int delrow=-1;delrow<=1;delrow++)
            {
                for(int delcol=-1;delcol<=1;delcol++)
                {
                    int nrow=row+delrow;
                    int ncol=col+delcol;
                    
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0)
                    {
                        vis[nrow][ncol]=1;
                        pq.add(new Pair(nrow,ncol));
                    }
                }
            }
            
        }
    }  */
    
    void dfs(char[][] grid, int [][] vis, int i, int j)
    {
        if(i<0 || i==grid.length || j<0 || j==grid[0].length || grid[i][j] == '0' || vis[i][j]==1)
        return;
        
        
        vis[i][j] = 1;
        
      // checking all eight directions
        dfs(grid, vis, i+1, j);      //3.
       // dfs(grid, vis, i+1, j+1);
        dfs(grid, vis, i, j+1);       //2.
      //  dfs(grid, vis, i-1, j+1);
        dfs(grid, vis, i-1, j);       //1.
       // dfs(grid, vis, i-1, j-1);
        dfs(grid, vis, i, j-1);       //4.
       // dfs(grid, vis, i+1, j-1);
    }
    
    
    class Pair
    {
        int first;
        int second;
        
        Pair(int first,int second)
        {
            this.first=first;
            this.second=second;
        }
    }
    
}