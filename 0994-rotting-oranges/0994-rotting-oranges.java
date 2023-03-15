class Solution {
    public int orangesRotting(int[][] grid) {
        
        int fresh=0;
        
        Queue<Pair> pq=new ArrayDeque<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                    pq.add(new Pair(i,j));
                else if(grid[i][j]==1)
                    fresh++;
                    
            }
        }
        
        if(fresh==0)
            return 0;
        
        
        int []drow={1,0,-1,0};
        int []dcol={0,1,0,-1};
        int level=-1;
        while(pq.size()>0)
        {
            int counter=pq.size();
            level++;
            while(counter-- >0)
            {
                Pair temp=pq.remove();
                for(int i=0;i<4;i++)
                {
                    int nrow=temp.row+drow[i];
                    int ncol=temp.col+dcol[i];
                    
                    if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]==1){
                        pq.add(new Pair(nrow,ncol));
                        grid[nrow][ncol]=0;
                        fresh--;
                    }
                    
                }
            }
        }
        
        if(fresh==0)
            return level;
        else
            return -1;
        
    }
    
    public class Pair
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