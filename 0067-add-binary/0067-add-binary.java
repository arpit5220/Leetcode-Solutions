class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder res=new StringBuilder();
        int carry=0;
        int l1=a.length()-1;
        int l2=b.length()-1;
      
        while(l1>=0 || l2>=0 || carry>0)
        {
            int a1=0;
            int b1=0;
            if(l1>=0){
             a1=(a.charAt(l1)-'0');
            }
            if(l2>=0){
             b1=(b.charAt(l2)-'0');
            }
            l1--;
            l2--;
            
            int num=a1+b1+carry;
             carry=num/2;
            res.append(num%2+"");
              
        }
        
        res.reverse();
        return res.toString();
        
    }
}