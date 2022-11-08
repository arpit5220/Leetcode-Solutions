class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        int obsp=-prices[0];
      int ossp=0;

      for(int i=1;i<prices.length;i++)
      {
          int nbsp=0; // new bought state profit
          int nssp=0;  // new sell state profit 

          if(ossp-prices[i]>obsp)  // bcz value is negative
          {
              nbsp=ossp-prices[i];
          }
          else
          {
              nbsp=obsp;
          }
            
          if(obsp+prices[i]-fee >ossp)
          {
              nssp=obsp+prices[i]-fee;
          }
          else
          {
              nssp=ossp;
          }

          obsp=nbsp; // old bought state profit
          ossp=nssp; // old sell state profit

      }
     
         return ossp;
    }
}