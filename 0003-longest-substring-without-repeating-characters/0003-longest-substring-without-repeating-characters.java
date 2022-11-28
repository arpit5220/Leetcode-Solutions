class Solution {
    public int lengthOfLongestSubstring(String str) {
        
        //String ans="";
        
        int length=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=-1;
        int j=-1;
        while(true)
        {
            boolean f1=false;
            boolean f2=false;
            // Acquire
            while(i<str.length()-1)
            {
                f1=true;
                i++;
                char ch=str.charAt(i);
                hm.put(ch,hm.getOrDefault(ch,0)+1);
                
                if(hm.get(ch)==2)
                {
                    break;
                }
                else
                {
                    int ans=i-j;
                    if(ans>length)
                    {
                        length=ans;
                    }
                }
            
            }
            
            // Release
            while(j<i)
            {
                f2=true;
                j++;
                char ch=str.charAt(j);
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==1)
                    break;
            }
            
            if(f1==false && f2==false)
            {
                 break;
            }
            
        }
        
        return length;
    }
}