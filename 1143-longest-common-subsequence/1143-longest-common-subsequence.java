class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int [][] dp=new int[text1.length()+1][text2.length()+1];
        for(int i=dp.length-2;i>=0;i--)
        {
            for(int j=dp[0].length-2;j>=0;j--)
            {
                 char ch1=text1.charAt(i);
                 char ch2=text2.charAt(j);
                
                 if(ch1==ch2)
                 {
                     dp[i][j]= 1 + dp[i+1][j+1]; 
                 }
                else
                {
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        
        return dp[0][0];
        
    }
}