//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        HashMap<Long,Long> hm1=new HashMap<>();
        HashMap<Long,Long> hm2=new HashMap<>();
        
        for(int i=0;i<A.length;i++)
        {
            hm1.put(A[i],hm1.getOrDefault(A[i],0L)+1);
        }
        
        for(int i=0;i<B.length;i++)
        {
            hm2.put(B[i],hm2.getOrDefault(B[i],0L)+1);
        }
        
        for(int i=0;i<B.length;i++)
        {
            if(hm1.containsKey(B[i]))
            {
            Long  num1=hm2.get(B[i]);
            Long  num2=hm1.get(B[i]);
            
            if(num1!=num2)
            return false;
            }
            
            if(!hm1.containsKey(B[i])) return false;
        }
        
        
        return true;
    }
}