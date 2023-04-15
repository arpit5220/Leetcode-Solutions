class Solution {
    public String reverseParentheses(String s) {
        
        Stack<Character> stk=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch!=')')
            {
                stk.push(ch);
                continue;
            }
            
            String popped="";
            while(stk.size()>0 && stk.peek()!='(')
            {
                popped+=stk.pop();
            }
            if(stk.size()>0)
            stk.pop();
            
            if(popped.length()>0)
            {
                for(int j=0;j<popped.length();j++)
                {
                    stk.push(popped.charAt(j));
                }
            }  
        }
        
        StringBuilder res = new StringBuilder();
        while (!stk.isEmpty()){
            res.append(stk.pop());
        }
        return res.reverse().toString();
    }
}


/*Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            //if it's not a closing parenthesis push it to stack
            char ch = str.charAt(i);
            if(ch != ')'){
                stack.push(ch);
                continue;
            }
            //when ever we get a closing bracket
            //pop out all the elements until we get opening
            String popped = "";
            while (!stack.isEmpty() && stack.peek() != '('){
                popped += stack.pop();
            }
            if(!stack.isEmpty()){
                stack.pop();
            }
            if(popped.length() > 0){
                //push the character back to stack
                //one by one
                for (int j = 0; j < popped.length(); j++) {
                    stack.push(popped.charAt(j));
                }
            }
        }
        //now pop out all the characters from stack
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString(); */