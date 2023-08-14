// class Solution {
//     public int fib(int n) {
//         if(n==1)
//             return 1;        // USING RECURSION
//         if(n==0)
//             return 0;
        
//         return fib(n-1)+fib(n-2);
        
        //Using memoization;
        
//       int [] dp=new int[n+1];
//         Arrays.fill(dp,-1);
//         int ans=fibmem(n,dp);
//         return ans;
        
//     }
    
    
    
//     public static int fibmem(int n,int []dp)
//     {
//         if(n==0 || n==1)
//             return n;
//         if(dp[n]!=-1)
//         {
//             return dp[n];
//         }
        
//         int fib1=fibmem(n-1,dp);
//         int fib2=fibmem(n-2,dp);
//         dp[n]=fib1+fib2;
//         return dp[n];
//     }
// }
        
        
        
//         // USING TABULATION
//         if(n==0)
//             return 0;
//         int [] dp=new int[n+1];
//         dp[0]=0;
//         dp[1]=1;
//         for(int i=2;i<=n;i++)
//         {
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         return dp[n];
//     }
// }


// USING RECURSION -->  Method 1
// class Solution {
//     public int fib(int n) {
        
//         // USING RECURSION
//         if(n==0) return 0;
//         if(n==1) return 1;
        
//         return fib(n-1)+fib(n-2);      
//     }
// }



// USING MEMOIZATION  -->  Method 2
// class Solution {

//    public int fib ( int n , int [ ]dp ) {
//        if (n==0) return 0;
//        if (n==1) return 1;
//        if (dp[n]!=-1) return dp[n];
//        // Already Calculated Value should be returned
       
//        int prev1 =fib(n - 1,dp);
//        int prev2 =fib(n - 2,dp);
//        dp [n]= prev1+prev2;
//        // Before returning the calculated value , store it somewhere
//         return prev1 + prev2;
//                                                     I
//    }
    
//    public int fib(int n) {
//        int dp =new int [n + 1];
//        Arrays.fill(dp,-1);
//         return fib(n,dp);
//    }
// }



// USING TABULATION  --> Method 3
/*class Solution {
   public int fib ( int n ) {
       if ( n<=1 ) return n;

      int [] dp=new int [n + 1];
       
       dp[0]=0;dp[1]=1;
       for (int i=2;i<=n;i++) {
       
           dp [ i ]=dp [ i - 1 ] + dp [ i - 2 ];
       }
       return dp [ n ]; 
   }
} */


// USING SPACE OPTIMAIZATION  --> Method 4

/*class Solution {
   public int fib ( int n ) {
       
       if (n<=1) return n;

       int prev1=0 , prev2 =1 ;
       for (int i=2;i<=n;i++) {
           int curr=prev1+prev2;
           prev1 = prev2;
           prev2 = curr;
       }
       return prev2;
   }
} */


// USING RECURSION
/*class Solution {
   public int fib ( int n ) {
                                  // using recursion
       if(n<=1)
           return n;
       return fib(n-1)+fib(n-2);
       
       
   }
} */

// USING MEMOIZATION

/*class Solution {
   public int fib ( int n ) {
       
       int [] dp=new int[n+1];
       Arrays.fill(dp,-1);
       return fibo(n,dp);
      
       
   }
    
  public int fibo(int n,int[] dp)
  {
      if(n<=1)
          return n;
      if(dp[n]!=-1)
          return dp[n];
      
      int fib1=fibo(n-1,dp);
      int fib2=fibo(n-2,dp);
      dp[n]=fib1+fib2;
      
      return dp[n];
  }
    
}*/

// USING TABULATION

// class Solution {
//    public int fib ( int n ) {
       
//        if(n<=1) return n;
       
//        int dp[]=new int[n+1];
       
//        dp[0]=0;
//        dp[1]=1;
       
//        for(int i=2;i<=n;i++)
//        {
//            dp[i]=dp[i-1]+dp[i-2];
//        }
       
//        return dp[n];
//    }
// }

class Solution {
   public int fib ( int n ) {
       
       // Using Memoization
       int [] dp=new int[n+1];
       Arrays.fill(dp,-1);
       int cal=solve(n,dp);
       return cal;
   }
    
    public int solve(int n,int [] dp)
    {
        if(n==1)
            return 1;
        if(n==0)
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        
        int prev1=solve(n-1,dp);
        int prev2=solve(n-2,dp);
        dp[n]=prev1+prev2;
        return dp[n];
    }
}


                     


