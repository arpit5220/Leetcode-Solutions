class Solution {
    public int firstUniqChar(String s) {
       
        
           // Using Frequency Array
        // int[] temp = new int[26];
        // for(int i = 0 ; i < s.length(); i++){
        //     temp[s.charAt(i) - 'a']++;
        // }
        // for(int i = 0 ; i < s.length(); i++){
        //     if(temp[s.charAt(i) - 'a'] == 1){
        //         return i;
        //     }
        // }
        // return -1;
        
        // Using HAshMAp
        
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        
       // int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(hm.get(ch)==1)
             return i;      
        }
        
        return -1;
        
    }
}