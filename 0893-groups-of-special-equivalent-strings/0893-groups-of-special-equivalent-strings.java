/*class Solution {
    
    // 1st method   time--> 46ms
   /* public int numSpecialEquivGroups(String[] words) {
        
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
    
} */

       // 2nd Method
/*public int numSpecialEquivGroups(String[] words) {
    HashSet<String> set = new HashSet<>();
	StringBuilder evenSb = new StringBuilder();
    StringBuilder oddSb = new StringBuilder();
    
    // if input is 'dbca'
    // evenSb will have {dc}
    // oddSb will have {ba}
    // Then sort each string.
    // evenSb will be {cd}
    // oddSb will be {ab}
    // Then merge those evenSb and oddSb which will be {cdab};
    // This will make all the special-equivalent to same string sequence.
	// Add sorted string of {cdab} to the hashset.
    // So that size of HashSet will be the 'answer'

    for (String word : words) {
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) { // even
                evenSb.append(word.charAt(i));
            } else {
                oddSb.append(word.charAt(i));
            }    
        }
        
        char[] evenChars = evenSb.toString().toCharArray();
        Arrays.sort(evenChars);
        char[] oddChars = oddSb.toString().toCharArray();
        Arrays.sort(oddChars);
        
        
        set.add(new String(evenChars) + new String(oddChars));
        evenSb = new StringBuilder();
        oddSb = new StringBuilder();
    }
    
    return set.size();
}
}   
   */
  
// 3rd Method less complexity
class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> record = new HashSet<>();
        for (String str: words) {
            int[] even = new int[26];
            int[] odd = new int[26];
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    even[str.charAt(i) - 'a']++;
                } else {
                    odd[str.charAt(i) - 'a']++;
                }
            }
            record.add(Arrays.toString(even) + Arrays.toString(odd));
        }
        
        return record.size();
    }
}
