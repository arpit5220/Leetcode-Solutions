class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        int val1[]=new int[26];
        int val2[]=new int[26];
        
        for(int i=0;i<word1.length();i++)
        {
            char ch=word1.charAt(i);
            val1[ch-'a']++;
        }
        
        for(int i=0;i<word2.length();i++)
        {
            char ch=word2.charAt(i);
            val2[ch-'a']++;
            
            if(val1[ch-'a']==0)
                return false;
        }
        
        Arrays.sort(val1);
        Arrays.sort(val2);
        return Arrays.equals(val1,val2);
        
        
    }
}