class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        PriorityQueue<Character> pq=new PriorityQueue<Character> ((a,b) -> hm.get(b)-hm.get(a));
        
        pq.addAll(hm.keySet());
        
        StringBuilder sb=new StringBuilder();
        
        while(!pq.isEmpty())
        {
            char c=pq.remove();
            
            for(int i=0;i<hm.get(c);i++)
            {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}