/*class Solution {
    public void solve(char[][] board) {
        
        int [][] visited=new int[board.length][board[0].length];
        
        // upper boundary
        for(int j=0;j<board[0].length;j++)
        {
            if(board[0][j]=='O' && visited[0][j]==0)
            {
                dfs(board,0,j,visited);
            }
            
            if(board[board.length-1][j]=='O' && visited[board.length-1][j]==0)
                dfs(board,board.length-1,j,visited);
        }
        
        // left boundary
        for(int i=0;i<board.length;i++)
        {
            if(board[i][0]=='O' && visited[i][0]==0)
            {
                dfs(board,i,0,visited);
            }
            
             if(board[i][board.length-1]=='O' && visited[i][board.length-1]==0)
                dfs(board,i,board.length-1,visited);
        }
        
        // // right boundary
        // for(int i=0;i<board.length;i++)
        // {
        //     if(board[i][board.length-1]=='O' && visited[i][board.length-1]==0)
        //         dfs(board,i,board.length-1,visited);
        // }
        
        // down boundary
        
        // for(int j=0;j<board[0].length;j++)
        // {
        //     if(board[board.length-1][j]=='O' && visited[board.length-1][j]==0)
        //         dfs(board,board.length-1,j,visited);
        // }
        
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='O' && visited[i][j]==0)
                    board[i][j]='X';
            }
        }
        

            
        
    }
    
    public void dfs(char [][] board,int row, int col,int [][] visited)
    {
        // int drow={1,0,-1,0};
        // int dcol={0,1,0,-1};
        
    if(row<0 || col<0 || row>=board.length || col>=board[0].length|| board[row][col]=='X' || visited[row][col]==1)
        return;
    
        visited[row][col]=1;
        
        dfs(board,row+1,col,visited);
        dfs(board,row,col+1,visited);
        dfs(board,row-1,col,visited);
        dfs(board,row,col-1,visited);
        
        
        
    }
}
  */




class Solution {
    private void dfs(int row,int col,char[][] board,int[][] vis){
        int m=board.length;
        int n=board[0].length;
        vis[row][col]=1;
        
        
         int delrow[]={-1,1,0,0};
        int delcol[]={0,0,-1,1};
        
        
        //neighbours
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            //validation
            if(nrow>=0  && ncol>=0 && nrow<m && ncol<n && board[nrow][ncol]=='O' && vis[nrow][ncol]==0 )
                dfs(nrow,ncol,board,vis);
        }
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int[][] vis = new int[m][n];
        // int delrow[]={-1,1,0,0};
        // int delcol[]={0,0,-1,1};
        
        //l&r
        for(int i=0;i<m;i++){
            if(board[i][0]=='O' && vis[i][0]==0)
                dfs(i,0,board,vis);
            
            if(board[i][n-1]=='O' && vis[i][n-1]==0)
                dfs(i,n-1,board,vis);
            
        }
        
        // u&d
        for(int j=0;j<n;j++){
            if(board[0][j]=='O' && vis[0][j]==0)
                dfs(0,j,board,vis);
            
             if(board[m-1][j]=='O' && vis[m-1][j]==0)
                dfs(m-1,j,board,vis);
            
        }
        
        //filling remaining 0's
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && vis[i][j]==0)
                    board[i][j]='X';
            }
        }
        
    }
}