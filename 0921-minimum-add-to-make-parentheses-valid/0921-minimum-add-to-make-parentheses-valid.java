class Solution {
    public int minAddToMakeValid(String s) {
        
        if(s.length()==1) return 1;
        Stack<Character> stk=new Stack<>();
    
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
        
            if(ch=='(') 
            stk.push(ch);
            else if(stk.size()>0 && stk.peek()=='(' )
                stk.pop();
            else
                stk.push(ch);
        }
        
        return stk.size();
    }
}