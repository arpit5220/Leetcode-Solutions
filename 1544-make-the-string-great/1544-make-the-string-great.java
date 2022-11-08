class Solution {
    public String makeGood(String s) {
        
        
       Stack<Character> stk= new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(!stk.isEmpty() && (Math.abs(stk.peek()-s.charAt(i))==32))
                stk.pop();
            else
                stk.push(s.charAt(i));
        }
        
       char res[] = new char[stk.size()];
        int index = stk.size()-1;
        while(!stk.isEmpty()){
            res[index--] = stk.pop();
        }
        return new String(res);
    } 
}