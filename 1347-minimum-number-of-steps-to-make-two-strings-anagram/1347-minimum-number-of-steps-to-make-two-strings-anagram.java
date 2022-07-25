// class Solution {
//     public int minSteps(String s, String t) {
        
//         HashMap<Character,Integer> hm =new HashMap<>();
//         for(int i=0;i<s.length();i++)
//         {
//             if(hm.containsKey(s.charAt(i)))
//                 hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
//                 else
//                     hm.put(s.charAt(i),1);
//         }
        
//         HashMap<Character,Integer> tp =new HashMap<>();
//         for(int i=0;i<s.length();i++)
//         {
//             if(tp.containsKey(s.charAt(i)))
//                 tp.put(s.charAt(i),tp.get(s.charAt(i))+1);
//                 else
//                     tp.put(s.charAt(i),1);
//         }
        
//         int count=0;
//         for(Character ch:hm.keySet())
//         {
//             if(hm.get(ch)>tp.get(ch))
//                 count+=(hm.get(ch)-tp.get(ch));
            
//            // else
//             //    count+=(hm.get(ch));
//         }
        
//         return count;
//     }
    
    
    
    class Solution {
    public int minSteps(String s, String t) {
        int n = s.length(), ans = 0;
        int[] arr = new int[26];
        for(int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++) if(arr[i] > 0) ans += arr[i];
        return ans;
    }

}