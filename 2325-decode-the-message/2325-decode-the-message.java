class Solution {
    public String decodeMessage(String key, String message) {
        
        HashMap<Character,Character> hm=new HashMap<>();
        
        char c='a';
        for(char ch:key.toCharArray())
        {
            if(!hm.containsKey(ch) && ch!=' ')
            {
                hm.put(ch,c++);
            }
        }
        
        StringBuilder strb = new StringBuilder();
        for(char ch:message.toCharArray())
        {
            if(hm.containsKey(ch))
                strb.append(hm.get(ch));
            else if(ch==' ')
                strb.append(" ");
        }
        
        return strb.toString();
    }
}

/* char c = 'a';
        Map<Character, Character> map = new HashMap<>();
        for(char ch : key.toCharArray())
            if (!map.containsKey(ch) && ch != ' ')
                map.put(ch, c++);

        StringBuilder sb = new StringBuilder ();
        for (char ch : message.toCharArray())
            sb.append(ch == ' ' ? ch : map.get(ch));

        return sb.toString();*/