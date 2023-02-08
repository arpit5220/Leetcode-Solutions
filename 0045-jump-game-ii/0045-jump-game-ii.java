// class Solution {
   
//     public int jump(int[] nums) {
       
//         return (int)recursion(0,nums);   
//     }
    
//     // Recursion
//     public static long recursion(int src,int []nums)
//     {
//         if(src==nums.length-1) return 0;;
        
//         long min=Integer.MAX_VALUE;
//         for(int jump=1;jump<=nums[src];jump++)
//         {
//             if(src+jump <nums.length)
//             {
//                 min=Math.min(min,recursion(src+jump,nums)+1);
//             }
//         }
        
//         return min;         
//     } 
// }



// MEMOIZATION
class Solution{
   public int jump(int[] nums) {
        long [] dp=new long[nums.length+1];
         Arrays.fill(dp,-1);
        return (int)memo(0,nums,dp);  
    }
    
     public static long memo(int src,int []nums,long[] dp)
    {
        if(src==nums.length-1) return 0;;
        if(dp[src]!=-1) return dp[src];
         long min=Integer.MAX_VALUE;
        for(int jump=1;jump<=nums[src];jump++)
        {
            if(src+jump <nums.length)
            {
                min=Math.min(min,memo(src+jump,nums,dp)+1);
            }
        }
         
         dp[src]=min;
        
        return min;         
    }       
    
}


