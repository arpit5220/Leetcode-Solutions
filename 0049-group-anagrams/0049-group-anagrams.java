class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         
        // FIRST METHOD
     /*  HashMap<String, ArrayList<String>> map = new HashMap<>();
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
       return listOfLists; */
        
        
        // SECOND METHOD
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String str:strs)
        {
            String code=getcode(str);
            if(map.containsKey(code))
            {
                ArrayList<String> list=map.get(code);
                list.add(str);
                map.put(code,list);
            }
            else
            {
                ArrayList<String> list=new ArrayList<>();
                list.add(str);
                map.put(code,list);
            }
        }
        
        List<List<String>> res=new ArrayList<>();
        for(String code:map.keySet())
        {
            ArrayList<String> list=map.get(code);
            res.add(list);
        }
        return res;
        
    }
    
     /* public static String getcode(String str) 
      {   // DONT USE HASHMAP BECAUSE IN HASHMAP KEY IS NOT IN ORDERED FORM
          HashMap<Character,Integer> fmap=new HashMap<>();
          for(Character ch:str.toCharArray())
          {
              fmap.put(ch,fmap.getOrDefault(ch,0)+1);
          }
          
          String code="";
          for(Character key:fmap.keySet())
          {
              code+=key+""+fmap.get(key);
          }
          return code;
      } */
    
    public static String getcode(String str)
    {
          
           int count[] = new int[26];
           for(int i=0; i<str.length(); i++) {
               count[str.charAt(i)-'a']++;
           }
           // build the key in sorted order
           String key="";
           for(int i=0; i<26; i++) {
               if(count[i]>0){
               key = key + ((char)(i+'a')) + count[i] + "";
               
               //System.out.println("key ->key"+" "+key+" KEY");
               }
               
           }
        
        return key;
      }
    
}