class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        
        
        String n1[]=num1.split("\\+|i");
        String n2[]=num2.split("\\+|i");
        
        int a_real=Integer.parseInt(n1[0]);
        int a_img=Integer.parseInt(n1[1]);
        int b_real=Integer.parseInt(n2[0]);
        int b_img=Integer.parseInt(n2[1]);
        
        return (a_real * b_real -a_img*b_img)+"+"+(a_real*b_img + a_img*b_real)+"i";
            
            
        
    }
}