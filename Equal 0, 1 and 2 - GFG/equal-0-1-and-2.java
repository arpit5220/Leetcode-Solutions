//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.getSubstringWithEqual012(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long getSubstringWithEqual012(String str) 
    { 
        // code here
        int count0=0;
        int count1=0;
        int count2=0;
        long ans=0;
        String key="0#0";
        
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put(key,1);
        for(char ch:str.toCharArray())
        {
            if(ch=='0') count0++;
            if(ch=='1') count1++;
            if(ch=='2') count2++;
            
            key=(count1-count0)+"#"+(count2-count1);
            if(hm.containsKey(key))
            {
                ans+=hm.get(key);
                hm.put(key,hm.get(key)+1);
            }
            else
            {
                hm.put(key,1);
            }
            
        }
        
        return ans;
    }
} 