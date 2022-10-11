//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution

{

    char firstRep(String S)

    {

        HashMap<Character , Integer> ha = new HashMap<>();

        

        for(int i=0 ; i<S.length() ; i++)

        {

            ha.put(S.charAt(i) , (ha.getOrDefault(S.charAt(i), 0)) + 1); 

        }

        

        for(int i=0 ; i<ha.size() ; i++)

        {

            if(ha.get(S.charAt(i))>1)

            {

                return S.charAt(i);

            }

        }

        

        return '#' ; 

    }

}