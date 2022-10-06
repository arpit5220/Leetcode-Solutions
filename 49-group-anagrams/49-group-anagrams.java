class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
       HashMap<String, ArrayList<String>> map = new HashMap<>();
       List<List<String>> listOfLists = new ArrayList<>();
       
       for(String str:strs) {
           int count[] = new int[26];
           
           for(int i=0; i<str.length(); i++) {
               count[str.charAt(i)-'a']++;
           }
           
           // build the key in sorted order
           String key="";
           for(int i=0; i<26; i++) {
               key = key + (char)(i+'a') + count[i] + "-";
           }
           
           if(map.containsKey(key)) {
               map.get(key).add(str);
           } else {
               ArrayList<String> newList = new ArrayList<String>();
               newList.add(str);
               map.put(key, newList);
               listOfLists.add(newList);
           }
       }
       return listOfLists;
        
    }
}