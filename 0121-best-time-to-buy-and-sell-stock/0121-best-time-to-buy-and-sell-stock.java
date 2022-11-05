class Solution {
    public int maxProfit(int[] prices) {
        
        int least=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(i==0)
            {
                least=prices[i];
                maxprofit=prices[i]-least;
            }
            
            else
            {
                least=Math.min(least,prices[i]);
                int t=Math.abs(prices[i]-least);
                maxprofit=Math.max(maxprofit,t);
            }
        }
        
       return maxprofit;
        
        
        
        
    }
}