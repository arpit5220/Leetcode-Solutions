class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        int [] frq=new int [26];
        int idx=0;
        
        for(char ch:order.toCharArray())
        {
            frq[ch-'a']=idx++;
        }
        
        for(int i=0;i<words.length-1;i++)
        {
            String first=words[i];
            String second =words[i+1];
            
            if(!helper(first,second,frq))
            {
                return false;
            } 
        }
        
        return true;
    }
    
    private boolean helper(String s1,String s2,int [] frq)
    {
        int i1=0;
        int i2=0;
       
//         if(s1.length()>s2.length())
//             return false;
        
        while(i1<s1.length() && i2<s2.length())
        {
            if(s1.charAt(i1)!=s2.charAt(i2))
            {
                if(frq[s1.charAt(i1)-'a'] < frq[s2.charAt(i2) -'a'])
                    return true;
                else
                    return false;
            }
            
            i1++;
            i2++;
        }
        
        if(s1.length()>s2.length())
            return false;
        
        return true;
    }
}