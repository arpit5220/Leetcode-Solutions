class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
      
           StringBuilder str=new StringBuilder();
           if(numerator==0) return "0";
           if(numerator<0 && denominator>0 || numerator>0 && denominator<0)
              str.append("-");
            
            long numeratorL = Math.abs((long) numerator);
            long denominatorL = Math.abs((long) denominator);
           long q=(numeratorL/denominatorL);
           long r=(numeratorL%denominatorL);
            str.append(q);
           if(r==0)
               return str.toString();
           else{
               str.append(".");
               HashMap<Long,Integer> hm=new HashMap<>();
           while(r!=0)
           {
               if(hm.containsKey(r))
               {
                   int len=hm.get(r);
                   str.insert(len,"(");
                   str.append(")");
                   break;
               }
               else
               {
                   hm.put(r,str.length());
                   r*=10;
                   q=r/denominatorL;
                   r=r%denominatorL;
                   str.append(q);
               }  
               
           }
        
           }
        return str.toString();
    }
}