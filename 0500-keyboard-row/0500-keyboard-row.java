class Solution {
    public String[] findWords(String[] words) {
        
        HashMap<Character,Integer> hm=new HashMap<>();
        
        String str1="qwertyuiopQWERTYUIOP";
        String str2="asdfghjklASDFGHJKL";
        String str3="zxcvbnmZXCVBNM";
        
        
//         for(int i=0;i<str1.length();i++)
//         {
//             char ch=str1.charAt(i);
//             hm.put(ch,hm.getOrDefault(ch,0)+1);
//         }
        
        
        ArrayList<String> l=new ArrayList<>();
       
        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            int m=0;
            int n=0;
            int p=0;
            for(int j=0;j<str.length();j++)
            { 
                char ch=str.charAt(j);
                if(str1.contains(ch+""))
                {
                    m++;
                }
                else if(str2.contains(ch+""))
                {
                    n++;
                }
                
                else
                    p++;
            }
            
            if(m==str.length() || n==str.length() || p==str.length())
            {
                l.add(words[i]);
            }
        }
        
        
        return l.toArray(new String[l.size()]);
            
    }
}