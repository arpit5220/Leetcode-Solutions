class Solution {
    public String countAndSay(int n) {
     
        if(n==1)
        {
            return "1";
        }
       
        
        // recursion
        String s=countAndSay(n-1);
        StringBuilder str=new StringBuilder();
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            count++;
            if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1))  //--> this code logic is very good
            {
                str.append(count).append(s.charAt(i));
                count=0;
            }
        }
        
        
        return str.toString();
        

        
        
    }
}



//   StringBuilder str=new StringBuilder("11");
        
//         for(int i=3;i<=n;i++)
//         {
//             StringBuilder res=new StringBuilder();
//              int count=1;
//             for(int j=1;j<str.length();j++)
//             {
//                 if(str.charAt(j)!=str.charAt(j-1)){
//                    res.append(count+"");
//                     res.append(str.charAt(j-1));
//                     count=1;
//                     System.out.println(str);
//                 }
//                 else
//                 {
//                   count++;
//                 }
                
//                 //k=j;
//             }
            
// //                     res+=count+"";
// //                     res+=str.charAt(k);
// //                    // count=1;
            
//             str=res;  
            
//         }
        
//         return str.toString();


// Added Java Solution  using Recursion
class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        if(n==2){
            return "11";
        }
        char[] pre = countAndSay(n-1).toCharArray();
        int c=1;
        StringBuilder res=new StringBuilder();
        for(int i=1;i<pre.length;i++){
            if(pre[i-1]==pre[i]){
                c++;
            }
            else{
                res.append(c);
                res.append(pre[i-1]);
                c=1;
            }
        }
        res.append(c);
        res.append(pre[pre.length-1]);
        return new String(res);
    }
}
