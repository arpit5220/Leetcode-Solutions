//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    int k = Integer.parseInt(br.readLine().trim());
		    
		    Solution ob= new Solution();
		    System.out.println(ob.countKdivPairs(arr, n, k));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static long countKdivPairs(int arr[], int n, int k)
    {
        //code here
      //  HashMap<Integer,Integer> hm=new HashMap<>();
        int [] a=new int[k];
        for(int i=0;i<n;i++)
        {
            int rem=arr[i]%k;
            if(rem<0)
            {
                rem=rem+k;
            }
            
            //hm.put(rem,hm.getOrDefault(rem,0)+1);
            a[rem]++;
        }
        
        long pair=0;
        pair+=count(a[0]);
        int i=1;
        int j=a.length-1;
       while(i<j)
       {
        //   if(i==j)
        //   {
        //       pair+=count(a[i]);
        //       i++;
              
        //   }
          
               pair+=(a[i]*a[j]);
               i++;
               j--;
       }
       
       if(a.length%2!=0)
       return pair;
       else{
       pair+=count(a[a.length/2]);
       return pair;
       }
       
    }
    
    public static long count(int val)
    {
        long m=val*(val-1)/2;
        return m;
    }
    
    
}