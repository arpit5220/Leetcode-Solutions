class Solution {
    public List<String> commonChars(String[] words) {
     
        int [] array=new int[26];
        Arrays.fill(array,Integer.MAX_VALUE);
        for(String str:words)
        {
            int [] res=new int[26];
            for(char ch:str.toCharArray())
            {
                res[ch-'a']++;
            }
            
            
            for(int i=0;i<26;i++)
            {
                array[i]=Math.min(array[i],res[i]);
            }
            
            
        }
        
        ArrayList<String> ans=new ArrayList<>();
        
        for(int i=0;i<26;i++)
        {
            while(array[i]>0)
            {
                ans.add(""+(char)(i+'a'));
                array[i]--;
            }
        }
        
        return ans;     
    }
}



 