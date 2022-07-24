class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        
        HashSet<String> set=new HashSet<>();
        
        for(String dict:dictionary)
        {
            set.add(dict);
        }
        
        StringBuilder ans=new StringBuilder();
        
        String words[]=sentence.split("\\s+");
        
        for(String word:words)
        {
            String prefix="";
            
            for(int i=1;i<=word.length();i++)
            {
                prefix=word.substring(0,i);
                if(set.contains(prefix))
                    break;
            }
            
            if(ans.length()>0)
                ans.append(" ");
            
            ans.append(prefix);
        }
        
        return ans.toString();
    }
}