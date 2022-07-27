class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
     
      int[] val1 = new int[26];
      int[] val2 = new int[26];
      int count = 0;
      for(int i = 0;i<s1.length();i++){
         char s = s1.charAt(i);
         char ss = s2.charAt(i);
         if(s != ss)
            count++;
          
         if(count > 2)
            return false;
          
          val1[s -'a']++;
         val2[ss -'a']++;
      }
      return Arrays.equals(val1,val2);
    }
}