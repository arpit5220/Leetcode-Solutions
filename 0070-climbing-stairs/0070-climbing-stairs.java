class Solution {
    public int climbStairs(int n) {
        
        int [] dp=new int[n+1];  // just like fibonacci
        Arrays.fill(dp,-1);
        dp[0]=1;
        dp[1]=1;
        return climb(n,dp);
    }
    
    public static int climb(int n,int []dp)
    {
        if(n==0 || n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        
        // int a=(n-1>=0) ? climb(n-1,dp):0;
        // int b=(n-2>=0) ? climb(n-2,dp):0;
        
        int val=climb(n-1,dp)+climb(n-2,dp);
          dp[n]=val;
        
        return dp[n];
    }
}