class Solution {
    public int numIslands(char[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        
        boolean [][] vis=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]==false)
                {
                    count++;
                    bfs(grid,vis,i,j);
                }
            }
        }
        
        return count;
    }
    
    public void bfs(char [][] grid,boolean [][] vis,int i,int j)
    {
        Queue<Pair> q=new LinkedList<>();
        
        q.add(new Pair(i,j));
        vis[i][j]=true;
        
        int n=grid.length;
        int m=grid[0].length;
        
        int nrow[]={-1,0,1,0};
        int ncol[]={0,1,0,-1};
        while(q.size()>0)    
        {
            Pair temp=q.remove();
            int row=temp.first;
            int col=temp.second;
            
            for(int k=0;k<4;k++)
            {
                int r=nrow[k]+row;
                int c=ncol[k]+col;
                
                if(r>=0 && r<n && c>=0 && c<m && grid[r][c]=='1' && vis[r][c]==false)
                {
                    vis[r][c]=true;
                    q.add(new Pair(r,c));
                }
            }
            
            
        }
        
    }
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