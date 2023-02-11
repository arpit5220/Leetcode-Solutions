class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)
            return 1;
        int [] freq=new int[128];
       
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            freq[s.charAt(i)]++;
        }
        
        int len=0;
 
        for (int i : freq)
        {
            //len += (i % 2 == 0)? i : i - 1;
            if(i%2==0)
                len+=i;
            else
                len+=i-1;
        }

       // return len < s.length() ? len + 1 : len;
        if(s.length() > len)
            return len+1;
        else
            return len;
    
    }
} 

