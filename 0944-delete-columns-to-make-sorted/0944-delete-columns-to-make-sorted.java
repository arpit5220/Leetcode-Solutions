class Solution {
    public int minDeletionSize(String[] strs) {
        
        if(strs.length==0)
            return 0;
        
        int count=0; 
        int len=strs[0].length();
        int var=-1;
        char ch='a';
        for(int i=0;i<len;i++)
        {
               var++;
            for(int j=0;j<strs.length;j++)
            {
                if(j==0){
                   ch=strs[j].charAt(var);   
                }
               
                else
                {
                    char ch1=strs[j].charAt(var);
                    if(ch1>=ch)
                    {
                        ch=ch1;
                        continue;
                    }
                    else
                    {
                        count++;
                        break;
                    }
                        
                }
                    
                
            }
        }
        
        return count;
    }
}