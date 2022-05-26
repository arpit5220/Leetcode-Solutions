class Solution {
    public String removeOccurrences(String s, String part) {
        
        int l=part.length();
        while(true){
            int index=s.indexOf(part);
            
            if(index >-1)
                s=s.substring(0,index)+s.substring(index+l);
             else
                 break;
            
        }
        
        return s;
    }
}