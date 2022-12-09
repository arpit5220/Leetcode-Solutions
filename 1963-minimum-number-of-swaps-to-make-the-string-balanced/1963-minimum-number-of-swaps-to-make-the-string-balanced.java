class Solution {
    public int minSwaps(String s) {
        
     /*   Stack<Character> stk=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
             char ch=s.charAt(i);
            if(ch=='[')
            stk.push(ch);
            else if(stk.size()>0 && ch==']')
                stk.pop();
            else
                count++;
            }
        }
        
        count=(count+1)/2;
        return count;  */
        
        Stack<Character> stk=new Stack<>();
    
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
        
            if(ch=='[') 
            stk.push(ch);
            else if(stk.size()>0 && stk.peek()=='[' )
                stk.pop();
            else
                stk.push(ch);
        }
        
        return (stk.size()/2+1)/2;
          
    }
}