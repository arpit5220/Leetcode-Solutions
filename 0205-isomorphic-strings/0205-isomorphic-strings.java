class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<s.length();i++)
        {
            char tch=t.charAt(i);
            char sch=s.charAt(i);
            if(map.containsKey(sch))
            {
                if(map.get(sch)!=tch)
                    return false;
            }
            else
            {
                if(set.contains(tch))
                    return false;
                
                set.add(tch);
               map.put(sch,tch);  
            }
        }
        
        return true;
        
    }
}