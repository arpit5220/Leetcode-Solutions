class Solution {
    public int mySqrt(int N) {
        
         if(N==0)
		  return 0;
		 long low=1;
		 long high=N;
         long ans=1;

		 while(low<=high)
		 {
			 long mid=(low+high)/2L;

			 long val=mid*mid;
              
			 if(val<=N)
			 {
                 ans=(int)mid;
				 low=mid+1;
			 }
			 else
			   high=mid-1;

		 }

		 return (int)ans;
    }
}