class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        ArrayList<Integer> list=new ArrayList<>();
        if(p.length()>s.length()) return list;
        int [] pmap=new int[26];
        for(int i=0;i<p.length();i++)
        {
              pmap[p.charAt(i)-'a']++;
        }
        
        int [] smap=new int[26];
        for(int i=0;i<p.length();i++)
        {
              char ch=s.charAt(i);
              smap[ch-'a']++;
        }
         
       // ArrayList<Integer> list=new ArrayList<>();
         if(anagram(smap,pmap)==true)
         {
             list.add(0);
         }
            
          int i=p.length();
          int j=0;
         while(i<s.length())
         {
             char chi=s.charAt(i);  // for acquireing
             smap[chi-'a']++;
             
            
             char chj=s.charAt(j); // for release
             if(smap[chj-'a']>0)
             {
                 smap[chj-'a']--;
             }
            
             if(anagram(smap,pmap)==true)
             {
               list.add(j+1);
             }
              
             i++;j++;
         }
           
       return list;
    }
        
    
     public static boolean anagram(int []map1,int []map2)
      {
          for(int i=0;i<26;i++)
          {
              if(map1[i]!=map2[i])
                  return false;
          }
          
          return true;
      }
    
}