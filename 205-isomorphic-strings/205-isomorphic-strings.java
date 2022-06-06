class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<s.length();i++)
        {
            char wch=t.charAt(i);
            char pch=s.charAt(i);
            if(map.containsKey(pch))
            {
                if(map.get(pch)!=wch)
                    return false;
            }
            else
            {
                if(set.contains(wch))
                    return false;
                
                set.add(wch);
               map.put(pch,wch);  
            }
        }
        
        return true;
        
    }
}