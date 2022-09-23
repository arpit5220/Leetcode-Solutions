class Solution {
    public String reverseStr(String s, int k) {
        
        
        int p=k;
        int j=0;
        StringBuilder strb=new StringBuilder();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
           
            if(p==0)
            {
                if(j!=1){
                strb.reverse();
                str.append(strb);
                strb.setLength(0);
                    j=1;
                }
                else{
                j=0;
                }
                
                 p=k;
            }
            
                if(j==0){
                    strb.append(s.charAt(i)+"");
                    p--;
                    }
                if(j==1){
                    str.append(s.charAt(i)+"");
                    p--;
                }    
            
        }
        
        
        
        strb.reverse();
        str.append(strb);
        
        return str.toString();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}