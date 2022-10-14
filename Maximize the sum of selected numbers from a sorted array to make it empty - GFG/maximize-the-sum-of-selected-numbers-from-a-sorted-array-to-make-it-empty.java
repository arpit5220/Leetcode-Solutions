//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    Arrays.sort(arr);
		    Complete obj = new Complete();
		    int ans = obj.maximizeSum(arr, sizeOfArray);
		    System.out.println(ans);
		}
	}
}




// } Driver Code Ends


//User function Template for Java



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int maximizeSum (int arr[], int n) {
        
        // MY CODE NOT WORKING 
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
                {
                    hm.put(arr[i],hm.get(arr[i])+1);
                }
            else
            {
                hm.put(arr[i],1);
            }
        }
        
        int count=0;
       
        
        for(int i=n-1;i>=0;i--) {
            
        
            int ele=arr[i];
            int ele2=arr[i]-1;
            
            if(hm.containsKey(ele))
            {  
                int value=hm.get(ele);
                if(value>0){
                count+=ele;
                hm.put(ele,hm.get(ele)-1);
                
                if(hm.containsKey(ele2))
                hm.put(ele2,hm.get(ele2)-1);
                }
            }
            
            
            
        }
        
        return count; 
        
    //     int sum=0;
    //     int max=a[0];
        
    //   for(int i=0;i<n;i++)
    //   {
    //       if(a[i]>max)
    //       max=a[i];
    //   }
       
    //   int [] m=new int [max+1];
       
    //     for(int i=0;i<n;i++){
    //         m[a[i]]++;
    //     }
       
    //     for(int i=n-1;i>=0;i--){
    //         if(m[a[i]]>0){
                
    //             m[a[i]]--;
    //             m[a[i]-1]--;
                
    //             sum+=a[i];
    //         }
    //     }
    //     return sum;
    
    
     }
    
    
}


