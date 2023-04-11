class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Character> stk1=new Stack<>();
        Stack<Integer> stk2=new Stack<>();
        stk2.push(-1);
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='(')
            {
                stk1.push('(');
                stk2.push(i);
            }
            else if(ch==')')
            {
                if(!stk1.isEmpty() && stk1.peek()=='(')
                {
                    stk1.pop();
                    stk2.pop();
                    len=Math.max(len,i-stk2.peek());
                }
                else
                    stk2.push(i);
            }
                
        }
        
        return len;
    }
}