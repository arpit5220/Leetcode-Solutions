// class Solution {
//     public boolean isSubsequence(String s, String t) {
        
//         int count=0;
//         int j;
//         int k=0;
//         for(int i=0;i<s.length();i++)
//         {
//             for(j=k;j<t.length();j++)
//             {
//                 if(t.charAt(j)==s.charAt(i))
//                 {
//                     count++;
//                     k=j+1;
//                     break;
//                 }
//                 else
//                 {
//                     if(j==t.length()-1)
//                         return false;
//                 }
//             }
//         }
        
//         if(s.length()==count)
//             return true;
//         else
//             return false;
        
//     }
// }


// Two pointer approach

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int indexS = 0, indexT = 0;
        while (indexT < t.length()) {
            if (t.charAt(indexT) == s.charAt(indexS)) {
                indexS++;
                if (indexS == s.length()) return true;
            }
            indexT++;
        }
        return false;
    }
}