class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int [] arr1=new int[26];
        int [] arr2=new int[26];
        
        if(s1.length()> s2.length())
            return false;
        
        int len1=s1.length();
        for(int i=0;i<s1.length();i++)
        {
            arr1[s1.charAt(i)-'a']++;
        }
       
        int j=0;
        while(j<=s2.length()-len1)
        {
           // int [] arr2=new int[26];
            int k=j;
            for(int i=0;i<len1;i++)
            {
                arr2[s2.charAt(k++)-'a']++;
            }
            
            if(Arrays.equals(arr1,arr2))
            {
                return true;
            }
            else
            {
                j++;
                Arrays.fill(arr2,0);
                
            }
        }
        
        return false;
    }
}