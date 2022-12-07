
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.replaceAll("[0-9]","").toLowerCase();
        licensePlate = licensePlate.replaceAll("\\s", "") ;
        
        int len = Integer.MAX_VALUE;
        String finalStr = "";
        
        for(int i = 0; i < words.length; i++){
            if(isCheck(licensePlate , words[i])){
                if(words[i].length() < len){
                    len = words[i].length();
                    finalStr = words[i];
                }
            }
        }
        return finalStr;
    }
    
    public boolean isCheck(String s , String word){
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm1 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            hm.put(s.charAt(i) , hm.getOrDefault(s.charAt(i) , 0) + 1);
        }
        
        for(int i = 0; i < word.length(); i++){
            hm1.put(word.charAt(i) , hm1.getOrDefault(word.charAt(i) , 0) + 1);
        }
        
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(hm1.get(s.charAt(i)) != null && hm.get(s.charAt(i)) <= hm1.get(s.charAt(i))){
                count++;
            }
        }
        return count == s.length();
    }
} 