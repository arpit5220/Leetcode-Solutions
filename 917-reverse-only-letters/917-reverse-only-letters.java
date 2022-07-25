class Solution {
    public String reverseOnlyLetters(String S) {
        
        int i=0;
        int j=S.length()-1;
        char ch[]=S.toCharArray();
        while(i<j)
        {
            if(!Character.isLetter(ch[i]))
            {
                i++;
                continue;
            }
            if(!Character.isLetter(ch[j])) 
            {
                j--;
                continue;
            }
           
            char c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;
            i++;
            j--;
        }
        return new String(ch);
    }
}