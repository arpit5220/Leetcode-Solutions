class Solution {
    
      String codes[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     public List<String> letterCombinations(String str) {
    
          List<String> ans=new ArrayList<>();
         if(str.length()==0)
             return ans;
         
        List<String> myans=getkpc(str);
         return myans;   
         
     }
    
       public  ArrayList<String> getkpc(String str)
       {
               if(str.length()==0)
               {
                     ArrayList<String> base=new ArrayList<>();
                     base.add("");
                     return base;    
               }

                  char ch=str.charAt(0);
                  String ros=str.substring(1);
                  List<String> rres=getkpc(ros);
                  ArrayList<String> mres=new ArrayList<>();
                  String codeforch=codes[(ch-'0')-2];
           
               for(int i=0;i<codeforch.length();i++)
               {
                   char chcode=codeforch.charAt(i);
                   for(String rstr:rres)
                   {
                       mres.add(chcode+rstr);
                   }
               }


             return mres;
       }
    
}