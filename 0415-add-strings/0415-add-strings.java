class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        
        int carry=0;
        int res=0;
        int mul=1;
        
        while(i>=0 || j>=0 || carry>0)
        {
            int a=0;
            int b=0;
            if(i>=0){
             a=(num1.charAt(i)-'0');
            }
            if(j>=0){
             b=(num2.charAt(j)-'0');
            }
            i--;
            j--;
            
            int num=carry+a+b;
            int rem=num%10;
            int que=num/10;
            carry=que;
            
            
            sb.append(rem);
                
        }
      
       
        return sb.reverse().toString();
        
    }
}