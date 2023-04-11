class Solution {
    public String removeStars(String s) {
        
        Stack<Character> stk=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(i==0 && ch=='*')
                return "";
            
            if(Character.isLetter(ch))
            {
                stk.push(ch);
            }
            else if(ch=='*')
            {
                stk.pop();
            }
        }
        
        StringBuilder strb=new StringBuilder();
        while(stk.size()>0)
        {
            strb.append(stk.pop());
        }
        
        strb.reverse();
        
        return strb.toString();
    }
}