class Solution {
    public int minPathSum(int[][] arr) {
        
        int n=arr.length;
        int m=arr[0].length;
        int [][] dp=new int[n][m];
        for(int i=arr.length-1;i>=0;i--)
        {
           for(int j=arr[0].length-1;j>=0;j--)
           {
               
               if(i==arr.length-1 && j==arr[0].length-1)
               {
                   dp[i][j]=arr[i][j];
               }
               
               else if(i==arr.length-1)
               {
                   dp[i][j]=dp[i][j+1]+arr[i][j];
               }
               
               else if(j==arr[0].length-1)
               {
                   dp[i][j]=dp[i+1][j]+arr[i][j];
               }
               
               else
               {
                   dp[i][j]=Math.min(dp[i][j+1],dp[i+1][j]) + arr[i][j];
               }
           }
        }
        
        return dp[0][0];
        
        
    }
}