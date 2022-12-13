class Solution {
    public int minSteps(String s, String t) {
        
        int [] frqs=new int[26];
        for(char ch:s.toCharArray())
        {
            frqs[ch-'a']++;
        }
        int [] frqt=new int[26];
        for(char ch:t.toCharArray())
        {
            frqt[ch-'a']++;
        }
        
        
        
        int ans=0;
        for(int i=0;i<26;i++)
        {
            ans+=(Math.abs(frqs[i]-frqt[i]));
        }
        
        return ans;
    }
}