//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        // My Code
       /*  ArrayList<Integer> list=new ArrayList<>();
         int j=k-1;
         HashMap<Integer,Integer> hm=new HashMap<>();
         for(int i=0;i<k;i++)
         {
             hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
         }
         
         list.add(hm.size());
         j++;
         for(int i=1;i<=n-k;i++,j++)
         {

            int val=hm.get(arr[i-1]);
            if(val==1)
            {
                hm.remove(arr[i-1]);
            }
            else
             hm.put(arr[i-1],hm.getOrDefault(arr[i-1],0)-1);
            
             hm.put(arr[j],hm.getOrDefault(arr[j],0)+1);
             list.add(hm.size());
         }
         
        return list; */
        
        
        // Second easy Code
         ArrayList<Integer> list=new ArrayList<>();
         HashMap<Integer,Integer> hm=new HashMap<>();
         for(int i=0;i<k;i++)
         {
             hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
         }
         
         list.add(hm.size());
         
         int j=0; // start point
         for(int i=k;i<arr.length;i++)
         {
             hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
              
            int val=hm.get(arr[j]);
            if(val==1)
            {
                hm.remove(arr[j]);
            }
            else
             hm.put(arr[j],hm.getOrDefault(arr[j],0)-1);
            j++;
             list.add(hm.size());
         }
         
        return list;
         
        
    }
}

