class Solution {
    public String baseNeg2(int n) {
        
        if(n==0) return "0";
        StringBuilder str=new StringBuilder();
        
        while(n!=0)
        {
            int rem=n %(-2);
            n=n/(-2);
            
            if(rem<0)
            {
                rem=1;
                n++;
            }
            
             
            str.append(rem);
        }
        
        return str.reverse().toString();
    }
}



        
//         class Solution {
//     public String baseNeg2(int n) {
//         StringBuilder sb = new StringBuilder();
//         int quotient = -1;
//         while(quotient != 0){
//             int rem = n%(-2);
//             quotient = n/-2;
//             if(rem < 0){
//                 rem = 1;
//                 quotient++;
//             }
//             n = quotient;
//             sb.append(rem);
//         }
//         return sb.reverse().toString();
//     }
// }


