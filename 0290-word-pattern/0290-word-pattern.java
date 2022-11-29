class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String [] word=s.split(" ");
        if(word.length!=pattern.length())
            return false;
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Boolean> used=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            String  wch=word[i];
            char pch=pattern.charAt(i);
            if(map.containsKey(pch)==false)
            {
                if(used.containsKey(wch)==true)
                    return false;
                else
                {
                    used.put(wch,true);
                    map.put(pch,wch);
                }
            }
            else
            {
                if(map.get(pch).equals(wch)==false)
                    return false;
           }
            
        }
        
        return true;
    }
}