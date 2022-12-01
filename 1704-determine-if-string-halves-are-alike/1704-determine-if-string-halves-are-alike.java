class Solution {
    public boolean halvesAreAlike(String s) {
        
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        
        int len=(s.length())/2;
        
        
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(Vowels(ch))
            {
                 map1.put(ch,map1.getOrDefault(ch,0)+1);
            }
        }
        
        int sum1=0;
        for(char val:map1.keySet())
        {
            int sm=map1.get(val);
            sum1+=sm;
        }
        
       for(int j=len;j<s.length();j++)
       {
           char ch=s.charAt(j);
            if(Vowels(ch))
            {
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
       }
        
        int sum2=0;
        for(char val:map2.keySet())
        {
            int sm=map2.get(val);
            sum2+=sm;
        }
        
        return sum1==sum2;
        
        
    }
    
    public static boolean Vowels(char ch)
    {
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        return true;
        else
            return false;
    }
}