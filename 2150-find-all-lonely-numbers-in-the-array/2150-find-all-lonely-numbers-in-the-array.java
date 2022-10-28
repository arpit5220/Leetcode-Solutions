class Solution {
    public List<Integer> findLonely(int[] nums) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int val:nums)
        {
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int key:hm.keySet())
        {
            int val=hm.get(key);
            
            if(val>1 || hm.containsKey(key-1) || hm.containsKey(key+1))
                continue;
            else
                list.add(key);
        }
         
        return list;
    }
}