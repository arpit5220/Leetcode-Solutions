// class Solution {
//     public String reverseWords(String s) {
//        String str=s.trim();
        
//         Stack<String> stk=new Stack<String>();
//         for(int i=0;i<str.length();i++)
//         {
//             String word="";
//             if(str.charAt(i)==32){
//                 continue;
//             }
//             else
//             {
//             while(i<str.length() && str.charAt(i)!=32)
//             {
//                 word+=str.charAt(i);
//                 i++;
//             }
//                 stk.push(word);
                
//             }
            
//         }
        
//           StringBuilder strb=new StringBuilder();
        
//            while(stk.size()>1)
//            {
//                strb.append(stk.pop()+" ");
//            }
//               strb.append(stk.pop());
        
//         return strb.toString();
//     }
// }




class Solution {

public static String reverseWords(String s) {
    StringBuilder res = new StringBuilder();
    for (int start = s.length() - 1; start >= 0; start--) {
        if (s.charAt(start) == ' ') continue;
        int end = start;
        while (start >= 0 && s.charAt(start) != ' ') start--;
        res.append(s.substring(start + 1, end + 1)).append(" ");
    }
    return res.toString().trim();
}
}