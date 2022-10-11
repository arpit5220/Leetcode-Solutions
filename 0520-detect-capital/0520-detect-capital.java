class Solution {
    public boolean detectCapitalUse(String word) {
        
        char ch = word.charAt(0);
        for(int i = 1; i < word.length(); i++){
            if(Character.isLowerCase(ch) && !Character.isLowerCase(word.charAt(i))){
                return false;
                
            }
            else if(Character.isUpperCase(ch)){
                if(Character.isLowerCase(word.charAt(1))){
                    if(Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
                else{
                    if(Character.isLowerCase(word.charAt(i))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}