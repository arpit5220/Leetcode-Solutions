class Solution {
    public int numSpecialEquivGroups(String[] words) {
        
       HashSet<String> set=new HashSet<>();
        for(String str:words)
        {
            String even="",odd="";
            for(int i=0;i<str.length();i++)
            {
                if(i%2==0)
                {
                    even+=str.charAt(i);
                }
                else
                {
                    odd+=str.charAt(i);
                }
            }
            
            odd=sorted(odd);
            even=sorted(even);
            
            set.add(odd+even);   
        }
        
        return set.size();
        
      }
        
        public static String sorted(String s)
        {
            char [] a=s.toCharArray();
            Arrays.sort(a);
            return String.valueOf(a);
        }
    
}