class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!stk.isEmpty())
            {
                if(ch==stk.peek())
                {
                    stk.pop();
                }
                else
                    stk.push(ch);
            }
            else
                stk.push(ch);    
        }
        
        char res[] = new char[stk.size()];
        int index = stk.size()-1;
        while(!stk.isEmpty()){
            res[index--] = stk.pop();
        }
        return new String(res);
    }
}