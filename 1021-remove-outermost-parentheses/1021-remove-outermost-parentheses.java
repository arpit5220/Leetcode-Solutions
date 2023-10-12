class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> stk=new Stack<>();
        
        StringBuilder strb=new StringBuilder();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='(')
            {
                if(stk.size()>0)
                {
                    strb.append(ch);
                }
                stk.push(ch);
            }
            else
            {
                stk.pop();
                if(stk.size()>0)
                {
                    strb.append(ch);
                }
            }
        }
        
        return strb.toString();
    }
}