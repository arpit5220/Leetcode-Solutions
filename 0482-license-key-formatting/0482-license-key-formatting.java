class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
      StringBuilder strb =new StringBuilder();
      int p=k;
     for(int i=s.length()-1;i>=0;i--)
     {
        if(p>0)
        {
            if(s.charAt(i)!='-'){
            strb.append(s.charAt(i)+"");
            p--;
            }
        }
         else
         {
              if(s.charAt(i)!='-'){
             strb.append("-");
             p=k;
             i++;
              }
         }
         
     }
      
       return strb.reverse().toString().toUpperCase(); 
        
        
        
        
        
    }
}