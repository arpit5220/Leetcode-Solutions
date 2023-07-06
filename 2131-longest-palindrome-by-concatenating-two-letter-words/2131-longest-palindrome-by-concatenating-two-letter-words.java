class Solution {
    public int longestPalindrome(String[] words) {
        
        HashMap<String,Integer> hm=new HashMap<>();
        
        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            hm.put(str,hm.getOrDefault(str,0)+1);
        }
        
        int count=0;
        int flag=0;
        for(String word:hm.keySet())
        {
            String str=word;
            if(str.charAt(0)!=str.charAt(1))
            { 
                  StringBuilder strb=new StringBuilder(str);
                     strb.reverse();
            
                    String rev=strb+"";
                
                if(hm.containsKey(rev))
                {
                    int len=Math.min(hm.get(rev),hm.get(str));      
                    count+=(len*2);
                }
                
             
            }
            
            else if(str.charAt(0)==str.charAt(1))
            {
               int cnt=hm.get(str);
                
                if(cnt%2==0)
                {
                    count+=(cnt*2);
                }
                else
                {
                    if(flag==0)
                    {
                        count+=(cnt*2);
                        flag=1;
                    }
                    else
                    {
                        count+=(cnt-1)*2;
                    }
                }
            
               
            }
            
        }
        
        return count;
    }
}