class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer>map = new HashMap<>();
        int i = -1;
        int j = -1;
        int ans = 0;
        
        while(j < s.length() - 1) {
            //aquire
            while(j < s.length() - 1) {
                j++;
                
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                
                if(map.get(ch) == 2) {
                    //invalid go for validation by releasing
                    break;
                }
                else {
                    int len = j - i;
                    ans = Math.max(ans, len);
                }
            }
            
            //release
            while(i < j) {
                i++;
                
                char ch = s.charAt(i);
                map.put(ch, map.get(ch) - 1);
                
                if(map.get(ch) == 1) {
                    //valid again go for re-aquiring
                    break;
                }
            }
        }
        return ans;
    }
}
