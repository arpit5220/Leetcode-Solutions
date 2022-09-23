class Solution {
    public String reverseStr(String s, int k) {
    
        // My solution space -O(n) , time-> 0(n)
//         int p=k;
//         int j=0;
//         StringBuilder strb=new StringBuilder();
//         StringBuilder str=new StringBuilder();
//         for(int i=0;i<s.length();i++)
//         {
           
//             if(p==0)
//             {
//                 if(j!=1){
//                 strb.reverse();
//                 str.append(strb);
//                 strb.setLength(0);
//                     j=1;
//                 }
//                 else{
//                 j=0;
//                 }
                
//                  p=k;
//             }
            
//                 if(j==0){
//                     strb.append(s.charAt(i)+"");
//                     p--;
//                     }
//                 if(j==1){
//                     str.append(s.charAt(i)+"");
//                     p--;
//                 }    
            
//         }
        
//         strb.reverse();
//         str.append(strb);
//         return str.toString();
        
        
        char [] array =s.toCharArray();
        for(int i=0;i<s.length();i=i+(2*k))
        {
            int start=i;
            int end=Math.min(i+k, s.length()) -1;
            char temp;
            
            while(start<end)
            {
                temp=array[start];
                array[start]=array[end];
                array[end]=temp;
                start++;
                end--;
            }
        }
        
        return new String(array);
        
    }
}