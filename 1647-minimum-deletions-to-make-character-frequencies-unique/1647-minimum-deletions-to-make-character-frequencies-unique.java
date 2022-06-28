class Solution {
    public int minDeletions(String s) {
        
        int [] freq=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        
        
        HashSet<Integer> hs=new HashSet<>();
        int currfreq=0;
        int ans=0;
        for(int i=0;i<26;i++)
        {
            currfreq=freq[i];
            
            while(currfreq>0)
            {
                if(hs.contains(currfreq))
                {
                    currfreq--;
                    ans++;
                }
                
                else
                    break;
            }
            
            if(currfreq!=0)
            {
                hs.add(currfreq);
            }
        }
        
        return ans;
        
    }
}