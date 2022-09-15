class Solution {
    public String defangIPaddr(String str) {
        
        String str1="[.]";
        String res="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='.')
            res+=str1;
            else
                res+=str.charAt(i)+"";
        }
        
        return res;
    }
}