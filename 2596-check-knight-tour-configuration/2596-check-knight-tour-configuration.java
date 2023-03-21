class Solution {
    public boolean checkValidGrid(int[][] grid) {
        
        int val=0;
        dfs(grid,0,0,0);
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]!=-1)
                    return false;
            }
        }
        
        return true;
        
        
    }
    
    void dfs(int [][] grid,int row,int col,int val)
    {
       int m=grid.length;
       int n=grid[0].length;
     
        
      if(row<0 || col<0 || row>=n || col>=m || val!=grid[row][col])
        return;
        
        grid[row][col]=-1;
        val++;
        dfs(grid,row-2,col-1,val);
        dfs(grid,row-2,col+1,val);
        dfs(grid,row-1,col+2,val);
        dfs(grid,row+1,col+2,val);
        dfs(grid,row+2,col-1,val);
        dfs(grid,row+2,col+1,val);
        dfs(grid,row-1,col-2,val);
        dfs(grid,row+1,col-2,val);
        
        
    }
}


