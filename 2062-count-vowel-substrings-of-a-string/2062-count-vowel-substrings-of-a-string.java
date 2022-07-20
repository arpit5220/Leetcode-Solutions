class Solution {
    public int countVowelSubstrings(String word) {
        
        int count=0;
        
        for(int i=0;i<word.length();i++)
        {
            HashSet<Character> st=new HashSet<>();
            
            for(int j=i;j<word.length();j++)
            {
                if(!isVowel(word.charAt(j)))
                    break;
                st.add(word.charAt(j));
                
                if(st.size()==5)
                count++;
            }
        }
        
        return count;
    }
    
    public static boolean isVowel(char ch)
    {
        return ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u';
    }
    
}