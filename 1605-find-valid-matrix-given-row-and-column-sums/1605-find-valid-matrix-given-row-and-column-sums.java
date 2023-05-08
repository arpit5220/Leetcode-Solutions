class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        
        int r=rowSum.length;
        int c=colSum.length;
        
        int [][] res=new int [r][c];
        
        int i=0,j=0;
        
        while(i<r && j<c)
        {
            res[i][j]=Math.min(rowSum[i],colSum[j]);
            rowSum[i]-=res[i][j];
            colSum[j]-=res[i][j];
            
            if(rowSum[i]==0)
                i++;
            if(colSum[j]==0)
                j++;
        }
        
        return res;
    }
}