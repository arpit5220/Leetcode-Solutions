class Solution {
    public int balancedStringSplit(String s) {
        
        int right=0;
        int left=0;
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='R')
                right++;
            else
                left++;
            
            if(right==left)
            {
                count++;
                right=0;
                left=0;
            }
        }
        
        return count+1;
    }
}