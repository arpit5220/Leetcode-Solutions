/*class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)
            return 1;
        int [] freq=new int[26];
        int [] freq2=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch>='a' && ch<='z')
            freq[s.charAt(i)-'a']++;
            else
             freq2[s.charAt(i)-'A']++;
        }
        
        int count=0;
        int flag=0;
        for(int i=0;i<26;i++)
        {
            if(freq[i]%2==0)
            {
                count+=freq[i];
            }
            if(freq2[i]%2==0)
            {
                count+=freq2[i];
            }
            else
            {
                if(freq[i]%2!=0 && flag==0)
                {
                    count+=freq[i];
                    flag=1;
                }
                if(freq2[i]%2!=0 && flag==0)
                {
                    count+=freq2[i];
                    flag=1;
                }
            }
        }
        
        return count;
    }
} */

class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}