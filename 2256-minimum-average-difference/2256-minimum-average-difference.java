class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        int n=nums.length;
        int ans=-1;
        int diff=Integer.MAX_VALUE;
        long totalsum=0;
        long firstsum=0;
        for(int i=0;i<nums.length;i++)
        {
            totalsum+=nums[i];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            firstsum+=nums[i];
            
            long firstpartAvg=firstsum;
                 firstpartAvg/=(i+1);
            
            long lastpartAvg=totalsum-firstsum;
           
        
            if(i!=n-1)
            {
                 lastpartAvg/=(n-i-1);
            }
            
            int Avgdiff=(int)Math.abs(firstpartAvg-lastpartAvg);
            
          if(Avgdiff<diff)
          {
              diff=Avgdiff;
              ans=i;
          }
            
        }
        return ans;        
    }
}