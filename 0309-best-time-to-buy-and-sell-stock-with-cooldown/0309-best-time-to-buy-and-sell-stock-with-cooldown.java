class Solution {
    public int maxProfit(int[] prices) {
        
        
        int obsp=-prices[0];
      int ossp=0;
      int ocsp=0;

      for(int i=1;i<prices.length;i++)
      {
          int nbsp=0; // new bought state profit
          int nssp=0;  // new sell state profit 
          int ncsp=0;

          if(ocsp-prices[i]>obsp)  // bcz value is negative
          {
              nbsp=ocsp-prices[i];
          }
          else
          {
              nbsp=obsp;
          }
            
          if(obsp+prices[i] >ossp)
          {
              nssp=obsp+prices[i];
          }
          else
          {
              nssp=ossp;
          }

          if(ossp>ocsp)
          {
              ncsp=ossp;
          }
          else{
              ncsp=ocsp;
          }

          obsp=nbsp; // old bought state profit
          ossp=nssp; // old sell state profit
          ocsp=ncsp;
      }

      return ossp;
    }
}