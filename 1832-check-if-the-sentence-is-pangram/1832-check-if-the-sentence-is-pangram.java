class Solution {
    public boolean checkIfPangram(String s) {
        
        int [] alpha=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int index=s.charAt(i)-'a';
            alpha[index]++;
        }
        
        for(int x:alpha)
        {
            if(x==0)
                return false;
                
        }
        
        return true;
    }
}