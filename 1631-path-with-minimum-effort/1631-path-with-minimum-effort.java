class Solution {
    public int minimumEffortPath(int[][] heights) {
        
        
        int n=heights.length;
        int m=heights[0].length;
        
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((x,y) -> x.diffr -y.diffr);
       
        pq.add(new Pair(0,0,0));
        
        int [][] dist=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        
        dist[0][0]=0;
        
        int [] srow={-1,0,1,0};
        int [] scol={0,1,0,-1};
        while(pq.size()>0)
        {
            Pair temp=pq.remove();
            
            int r=temp.row;
            int c=temp.col;
            int diff=temp.diffr;
            
            if(r==n-1 && c==m-1)
                return diff;
            
            for(int i=0;i<4;i++)
            {
                int nrow=r+srow[i];
                int ncol=c+scol[i];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m){
                    int newEffort=Math.max(Math.abs(heights[r][c] - heights[nrow][ncol]),diff);
                    
                    if(newEffort<dist[nrow][ncol]){
                        pq.add(new Pair(newEffort,nrow,ncol));
                        dist[nrow][ncol]=newEffort;
                    }
                }
            }
            
        }
        
        return -1;
        
        
        
    }
}

class Pair
{

    int diffr;
    int row;
    int col;
    
    Pair(int diffr,int row,int col)
    {
        
        this.diffr=diffr;
        this.row=row;
        this.col=col;
    }
}