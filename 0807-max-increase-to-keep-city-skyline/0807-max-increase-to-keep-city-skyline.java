class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int l=grid.length;
        int [] row=new int[l];
        int [] col=new int[l];
        
        int maxrow=0;
        int maxcol=0;
        for(int i=0;i<l;i++)
        {
             for(int j=0;j<l;j++)
             {
                 row[i]=Math.max(grid[i][j],row[i]);
                 col[j]=Math.max(grid[i][j],col[j]);
             }
            
        }
        
        int sum=0;
        
       for(int i=0;i<l;i++)
        {
             for(int j=0;j<l;j++)
             {
                 sum+=(Math.min(row[i],col[j])-grid[i][j]);
             }
       }
        
        return sum;
        
        
    }
}