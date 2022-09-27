class Solution {
    public String longestCommonPrefix(String[] arr) {
//         if(strs.length==0)     ///  THIS IS ARRAY SO USE length in place length()
//             return ""; 
    
        
//         int count=Integer.MAX_VALUE;
//         String s=strs[0];
        
//         for(int i=1;i<strs.length;i++)  //// THIS IS ARRAY SO USE length in place length()
//         {
//             int j=0,k=0,a=0;
            
//             while(j<s.length() && k<strs[i].length())
//             {
//                 if(s.charAt(j)==strs[i].charAt(k))
//                     a++;
//                 else
//                 {
//                     break;
//                 }
                
//                 j++;
//                 k++;
//             }
            
//               count=Math.min(count,a);
//         }
        
//         return s.substring(0,count);
        
        
//         // method 2
//         if(strs.length==0)
//             return "";
        
//         String prefix=strs[0];
//         for(int i=1;i<strs.length;i++)
//         {
//             while(strs[i].indexOf(prefix)!=0)
//             {
//                 prefix=prefix.substring(0,prefix.length()-1);
//             }
//         }
        
//         return prefix;
//     }
// }



 StringBuilder strb=new StringBuilder();
        
      //  if(arr.length==1) return arr[0];
        Arrays.sort(arr);
        char [] first=arr[0].toCharArray();
        char [] last=arr[arr.length-1].toCharArray();
        
        for(int i=0;i<first.length;i++)
        {
            if(first[i]!=last[i])
            break;
            else
            strb.append(first[i]+"");
        }
        
        
        return strb.toString().length() >0 ?strb.toString():"";
    }
}