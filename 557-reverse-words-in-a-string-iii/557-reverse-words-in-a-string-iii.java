class Solution {
    public String reverseWords(String s) {
        
        StringBuilder strb=new StringBuilder();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                strb.reverse();
                res.append(strb+" ");
                strb.setLength(0);
                
            }
            else
            {
                strb.append(s.charAt(i)+"");
            }
            
        }
        
        strb.reverse();
        res.append(strb);
        return res.toString();
        
        
        
        
    }
}