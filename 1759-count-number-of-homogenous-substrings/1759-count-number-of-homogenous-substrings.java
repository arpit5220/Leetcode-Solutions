class Solution {
    public int countHomogenous(String s) {
        
        int count=1;
        int result=0;
        int mod=1_000_000_007;
        
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
              count++;
                result=(result+count)%mod;
            }
            
            else{
            count=1;
            
            result=(result+count)%mod;
            }
            
        }
        
        return result+1;
            
    }
}